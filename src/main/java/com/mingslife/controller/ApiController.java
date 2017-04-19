package com.mingslife.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingslife.dto.AlertDTO;
import com.mingslife.dto.CardDTO;
import com.mingslife.dto.DoorDTO;
import com.mingslife.dto.FamilyDTO;
import com.mingslife.dto.HumitureDTO;
import com.mingslife.dto.LampDTO;
import com.mingslife.dto.WindowDTO;
import com.mingslife.model.Alert;
import com.mingslife.model.Card;
import com.mingslife.model.Door;
import com.mingslife.model.Family;
import com.mingslife.model.Humiture;
import com.mingslife.model.Lamp;
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

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Map<String, Object> test() {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		return jsonMap;
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/alert/list", method = RequestMethod.POST)
	public List<Alert> showAlerts(@RequestParam("familyId") Integer familyId) {
		List<Alert> alerts = alertService.loadByFamilyId(familyId);
		return alerts;
	}

	@ResponseBody
	@RequestMapping(value = "/alert/show", method = RequestMethod.POST)
	public Alert showAlert(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Alert alert = alertService.findByFamilyIdAndId(familyId, id);
		return alert;
	}

	@ResponseBody
	@RequestMapping(value = "/alert/create", method = RequestMethod.POST)
	public Alert createAlert(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute AlertDTO alertDTO) {
		Alert alert = alertDTO.toModel();
		alert.setFamilyId(familyId);
		alert.setRecordDate(new Date());
		alertService.save(alert);
		return alert;
	}

	@ResponseBody
	@RequestMapping(value = "/alert/modify", method = RequestMethod.POST)
	public Alert modifyAlert(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute AlertDTO alertDTO) {
		if (alertService.findByFamilyIdAndId(familyId, id) != null) {
			Alert alert = alertDTO.toModel();
			alert.setId(id);
			alertService.update(alert);
			return alertService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/alert/destroy", method = RequestMethod.POST)
	public Alert destroyAlert(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Alert alert = alertService.findByFamilyIdAndId(familyId, id);
		if (alert != null) {
			alertService.delete(id);
			return alert;
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/alert/lastest", method = RequestMethod.POST)
	public Alert lastestAlert(@RequestParam("familyId") Integer familyId) {
		Alert alert = alertService.findLastestByFamilyId(familyId);
		return alert;
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/card/list", method = RequestMethod.POST)
	public List<Card> showCards(@RequestParam("familyId") Integer familyId) {
		List<Card> cards = cardService.loadByFamilyId(familyId);
		return cards;
	}

	@ResponseBody
	@RequestMapping(value = "/card/show", method = RequestMethod.POST)
	public Card showCard(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Card card = cardService.findByFamilyIdAndId(familyId, id);
		return card;
	}

	@ResponseBody
	@RequestMapping(value = "/card/create", method = RequestMethod.POST)
	public Card createCard(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute CardDTO cardDTO) {
		Card card = cardDTO.toModel();
		card.setFamilyId(familyId);
		cardService.save(card);
		return card;
	}

	@ResponseBody
	@RequestMapping(value = "/card/modify", method = RequestMethod.POST)
	public Card modifyCard(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute CardDTO cardDTO) {
		if (cardService.findByFamilyIdAndId(familyId, id) != null) {
			Card card = cardDTO.toModel();
			card.setId(id);
			cardService.update(card);
			return cardService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/card/destroy", method = RequestMethod.POST)
	public Card destroyCard(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Card card = cardService.findByFamilyIdAndId(familyId, id);
		if (card != null) {
			cardService.delete(id);
			return card;
		} else {
			throw new WebException("无数据！");
		}
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/door/list", method = RequestMethod.POST)
	public List<Door> showDoors(@RequestParam("familyId") Integer familyId) {
		List<Door> doors = doorService.loadByFamilyId(familyId);
		return doors;
	}

	@ResponseBody
	@RequestMapping(value = "/door/show", method = RequestMethod.POST)
	public Door showDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Door door = doorService.findByFamilyIdAndId(familyId, id);
		return door;
	}

	@ResponseBody
	@RequestMapping(value = "/door/create", method = RequestMethod.POST)
	public Door createDoor(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute DoorDTO doorDTO) {
		Door door = doorDTO.toModel();
		door.setFamilyId(familyId);
		doorService.save(door);
		return door;
	}

	@ResponseBody
	@RequestMapping(value = "/door/modify", method = RequestMethod.POST)
	public Door modifyDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute DoorDTO doorDTO) {
		if (doorService.findByFamilyIdAndId(familyId, id) != null) {
			Door door = doorDTO.toModel();
			door.setId(id);
			doorService.update(door);
			return doorService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/door/destroy", method = RequestMethod.POST)
	public Door destroyDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Door door = doorService.findByFamilyIdAndId(familyId, id);
		if (door != null) {
			doorService.delete(id);
			return door;
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/door/open", method = RequestMethod.POST)
	public Door openDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @RequestParam("cardNumber") String cardNumber) {
		Door door = doorService.findByFamilyIdAndId(familyId, id);
		if (door != null && cardService.findByFamilyIdAndCardNumber(familyId, cardNumber) != null) {
			door.setStatus((byte) 1);
			doorService.update(door);
			return door;
		} else {
			throw new WebException("无数据！");
		}
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/humiture/list", method = RequestMethod.POST)
	public List<Humiture> showHumitures(@RequestParam("familyId") Integer familyId) {
		List<Humiture> humitures = humitureService.loadByFamilyId(familyId);
		return humitures;
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/show", method = RequestMethod.POST)
	public Humiture showHumiture(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Humiture humiture = humitureService.findByFamilyIdAndId(familyId, id);
		return humiture;
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/create", method = RequestMethod.POST)
	public Humiture createHumiture(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute HumitureDTO humitureDTO) {
		Humiture humiture = humitureDTO.toModel();
		humiture.setFamilyId(familyId);
		humiture.setRecordDate(new Date());
		humitureService.save(humiture);
		return humiture;
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/modify", method = RequestMethod.POST)
	public Humiture modifyHumiture(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute HumitureDTO humitureDTO) {
		if (humitureService.findByFamilyIdAndId(familyId, id) != null) {
			Humiture humiture = humitureDTO.toModel();
			humiture.setId(id);
			humitureService.update(humiture);
			return humitureService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/destroy", method = RequestMethod.POST)
	public Humiture destroyHumiture(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Humiture humiture = humitureService.findByFamilyIdAndId(familyId, id);
		if (humiture != null) {
			humitureService.delete(id);
			return humiture;
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/lastest", method = RequestMethod.POST)
	public Humiture lastestHumiture(@RequestParam("familyId") Integer familyId) {
		Humiture humiture = humitureService.findLastestByFamilyId(familyId);
		return humiture;
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/lamp/list", method = RequestMethod.POST)
	public List<Lamp> showLamps(@RequestParam("familyId") Integer familyId) {
		List<Lamp> lamps = lampService.loadByFamilyId(familyId);
		return lamps;
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/show", method = RequestMethod.POST)
	public Lamp showLamp(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Lamp lamp = lampService.findByFamilyIdAndId(familyId, id);
		return lamp;
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/create", method = RequestMethod.POST)
	public Lamp createLamp(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute LampDTO lampDTO) {
		Lamp lamp = lampDTO.toModel();
		lamp.setFamilyId(familyId);
		lampService.save(lamp);
		return lamp;
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/modify", method = RequestMethod.POST)
	public Lamp modifyLamp(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute LampDTO lampDTO) {
		if (lampService.findByFamilyIdAndId(familyId, id) != null) {
			Lamp lamp = lampDTO.toModel();
			lamp.setId(id);
			lampService.update(lamp);
			return lampService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/destroy", method = RequestMethod.POST)
	public Lamp destroyLamp(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Lamp lamp = lampService.findByFamilyIdAndId(familyId, id);
		if (lamp != null) {
			lampService.delete(id);
			return lamp;
		} else {
			throw new WebException("无数据！");
		}
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/window/list", method = RequestMethod.POST)
	public List<Window> showWindows(@RequestParam("familyId") Integer familyId) {
		List<Window> windows = windowService.loadByFamilyId(familyId);
		return windows;
	}

	@ResponseBody
	@RequestMapping(value = "/window/show", method = RequestMethod.POST)
	public Window showWindow(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Window window = windowService.findByFamilyIdAndId(familyId, id);
		return window;
	}

	@ResponseBody
	@RequestMapping(value = "/window/create", method = RequestMethod.POST)
	public Window createWindow(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute WindowDTO windowDTO) {
		Window window = windowDTO.toModel();
		window.setFamilyId(familyId);
		windowService.save(window);
		return window;
	}

	@ResponseBody
	@RequestMapping(value = "/window/modify", method = RequestMethod.POST)
	public Window modifyWindow(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute WindowDTO windowDTO) {
		if (windowService.findByFamilyIdAndId(familyId, id) != null) {
			Window window = windowDTO.toModel();
			window.setId(id);
			windowService.update(window);
			return windowService.findByFamilyIdAndId(familyId, id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/window/destroy", method = RequestMethod.POST)
	public Window destroyWindow(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		Window window = windowService.findByFamilyIdAndId(familyId, id);
		if (window != null) {
			windowService.delete(id);
			return window;
		} else {
			throw new WebException("无数据！");
		}
	}

	// ==============================

	@ResponseBody
	@RequestMapping(value = "/family/new", method = RequestMethod.POST)
	public Family newFamily(@RequestParam("appToken") String appToken, @Valid @ModelAttribute FamilyDTO familyDTO) {
		@SuppressWarnings("unchecked")
		Map<String, String> applicationMap = (Map<String, String>) application.getAttribute("application");
		String allowAppToken = applicationMap.get("appToken");
		if (appToken.equals(allowAppToken)) {
			Family family = familyDTO.toModel();
			family.setIsActive(true);
			familyService.save(family);
			return family;
		} else {
			throw new WebException("无效AppToken！");
		}
	}

	// ==============================

	@ModelAttribute
	public void validate(@RequestParam(value = "familyId", required = false) Integer familyId, @RequestParam("token") String token) {
		String requestURI = request.getRequestURI();
		if (requestURI.indexOf("/api/family/new") != -1) {
			return;
		}
		if (familyId == null || familyService.findByIdAndToken(familyId, token) == null) {
			throw new WebException("无效家庭组！");
		}
	}
}
