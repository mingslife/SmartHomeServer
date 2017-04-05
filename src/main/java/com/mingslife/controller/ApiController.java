package com.mingslife.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.model.Window;
import com.mingslife.service.IAlertService;
import com.mingslife.service.ICardService;
import com.mingslife.service.IDoorService;
import com.mingslife.service.IFamilyService;
import com.mingslife.service.IHumitureService;
import com.mingslife.service.ILampService;
import com.mingslife.service.IWindowService;
import com.mingslife.web.controller.BaseController;
import com.mingslife.web.exception.WebException;

@Controller
@RequestMapping(value = "/api")
public class ApiController extends BaseController {
	@Autowired
	private IAlertService alertService;
	@Autowired
	private ICardService cardService;
	@Autowired
	private IDoorService doorService;
	@Autowired
	private IFamilyService familyService;
	@Autowired
	private IHumitureService humitureService;
	@Autowired
	private ILampService lampService;
	@Autowired
	private IWindowService windowService;

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Map<String, Object> test() {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		return jsonMap;
	}

	@ResponseBody
	@RequestMapping(value = "/windows", method = RequestMethod.GET)
	public List<Window> getWindowsStatus(@RequestParam("family_id") Integer familyId) {
		return null;
	}

	@ModelAttribute
	public void validate(@RequestParam("family_id") Integer familyId, @RequestParam("token") String token) {
		if (familyService.findByIdAndToken(familyId, token) == null) {
			throw new WebException("无此家庭组！");
		}
	}
}
