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

import com.mingslife.dto.WindowDTO;
import com.mingslife.model.Window;
import com.mingslife.service.IWindowService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/windows")
public class WindowController extends BaseController {
	@Autowired
	private IWindowService windowService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Window> windows = windowService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("windows", windows);
		return "windows/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Window> windows = windowService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = windowService.count();
		
		jsonMap.put("rows", windows);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Window show(@PathVariable("id") Integer id) {
		Window window = windowService.find(id, new String[] {"id"});
		return window;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute WindowDTO windowDTO) {
		windowService.save(windowDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute WindowDTO windowDTO, Model model) {
		windowService.update(windowDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		windowService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			windowService.delete(id);
		}
	}
}
