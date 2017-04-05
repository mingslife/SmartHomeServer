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

import com.mingslife.dto.AlertDTO;
import com.mingslife.model.Alert;
import com.mingslife.service.IAlertService;
import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping("/alerts")
public class AlertController extends BaseController {
	@Autowired
	private IAlertService alertService;

	public String index(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
		List<Alert> alerts = alertService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		model.addAttribute("alerts", alerts);
		return "alerts/index";
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> list(@RequestParam(value = "page", defaultValue = "1") int page) {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		List<Alert> alerts = alertService.load(new String[] {"id"}, "id", "asc", page, LIMIT);
		long count = alertService.count();
		
		jsonMap.put("rows", alerts);
		jsonMap.put("total", count);
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Alert show(@PathVariable("id") Integer id) {
		Alert alert = alertService.find(id, new String[] {"id"});
		return alert;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void create(@Valid @ModelAttribute AlertDTO alertDTO) {
		alertService.save(alertDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @Valid @ModelAttribute AlertDTO alertDTO, Model model) {
		alertService.update(alertDTO.toModel());
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void destory(@PathVariable("id") Integer id) {
		alertService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/deletes", method = RequestMethod.DELETE)
	public void deletes(@RequestParam("ids[]") List<Integer> ids) {
		for (Integer id : ids) {
			alertService.delete(id);
		}
	}
}