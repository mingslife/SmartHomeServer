package com.mingslife.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.dto.LampDTO;
import com.mingslife.model.Lamp;
import com.mingslife.service.ILampService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/lamps")
public class LampController extends BaseController {
	@Autowired
	private ILampService lampService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Lamp> lamps = lampService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("lamps", lamps);
		return "lamps/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Lamp> lamps = lampService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = lampService.count();
		
		jsonMap.put("rows", lamps);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Lamp show(@PathVariable("id") Integer id) {
		Lamp lamp = lampService.find(id, new String[] {"id"});
		return lamp;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute LampDTO lampDTO) {
		lampService.save(lampDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute LampDTO lampDTO, Model model) {
		lampService.update(lampDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		lampService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			lampService.delete(id);
		}
	}
}
