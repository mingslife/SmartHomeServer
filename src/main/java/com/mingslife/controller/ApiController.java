package com.mingslife.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.web.controller.BaseController;

@Controller
@RequestMapping(value = "/api")
public class ApiController extends BaseController {
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Map<String, Object> test() {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		return jsonMap;
	}
}
