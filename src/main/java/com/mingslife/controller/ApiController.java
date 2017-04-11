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
import com.mingslife.dto.HumitureDTO;
import com.mingslife.dto.LampDTO;
import com.mingslife.dto.WindowDTO;
import com.mingslife.model.Alert;
import com.mingslife.model.Card;
import com.mingslife.model.Door;
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

	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Map<String, Object> test() {
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		
		return jsonMap;
	}



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
	public Integer createAlert(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute AlertDTO alertDTO) {
		Alert alert = alertDTO.toModel();
		alert.setFamilyId(familyId);
		alertService.save(alert);
		return alert.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/alert/modify", method = RequestMethod.POST)
	public void modifyAlert(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute AlertDTO alertDTO) {
		if (alertService.findByFamilyIdAndId(familyId, id) != null) {
			Alert alert = alertDTO.toModel();
			alertService.update(alert);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/alert/destroy", method = RequestMethod.POST)
	public void destroyAlert(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (alertService.findByFamilyIdAndId(familyId, id) != null) {
			alertService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}



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
	public Integer createCard(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute CardDTO cardDTO) {
		Card card = cardDTO.toModel();
		card.setFamilyId(familyId);
		cardService.save(card);
		return card.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/card/modify", method = RequestMethod.POST)
	public void modifyCard(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute CardDTO cardDTO) {
		if (cardService.findByFamilyIdAndId(familyId, id) != null) {
			Card card = cardDTO.toModel();
			cardService.update(card);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/card/destroy", method = RequestMethod.POST)
	public void destroyCard(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (cardService.findByFamilyIdAndId(familyId, id) != null) {
			cardService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}



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
	public Integer createDoor(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute DoorDTO doorDTO) {
		Door door = doorDTO.toModel();
		door.setFamilyId(familyId);
		doorService.save(door);
		return door.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/door/modify", method = RequestMethod.POST)
	public void modifyDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute DoorDTO doorDTO) {
		if (doorService.findByFamilyIdAndId(familyId, id) != null) {
			Door door = doorDTO.toModel();
			doorService.update(door);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/door/destroy", method = RequestMethod.POST)
	public void destroyDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (doorService.findByFamilyIdAndId(familyId, id) != null) {
			doorService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/door/open", method = RequestMethod.POST)
	public void openDoor(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @RequestParam("cardNumber") String cardNumber) {
		if (doorService.findByFamilyIdAndId(familyId, id) != null && cardService.findByFamilyIdAndCardNumber(familyId, cardNumber) != null) {
			Door door = new Door();
			door.setId(id);
			door.setStatus((byte) 1);
			doorService.update(door);
		} else {
			throw new WebException("无数据！");
		}
	}



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
	public Integer createHumiture(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute HumitureDTO humitureDTO) {
		Humiture humiture = humitureDTO.toModel();
		humiture.setFamilyId(familyId);
		humiture.setRecordDate(new Date());
		humitureService.save(humiture);
		return humiture.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/modify", method = RequestMethod.POST)
	public void modifyHumiture(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute HumitureDTO humitureDTO) {
		if (humitureService.findByFamilyIdAndId(familyId, id) != null) {
			Humiture humiture = humitureDTO.toModel();
			humitureService.update(humiture);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/destroy", method = RequestMethod.POST)
	public void destroyHumiture(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (humitureService.findByFamilyIdAndId(familyId, id) != null) {
			humitureService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/humiture/last", method = RequestMethod.POST)
	public Humiture lastestHumiture(@RequestParam("familyId") Integer familyId) {
		Humiture humiture = humitureService.findLastestByFamilyId(familyId);
		return humiture;
	}



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
	public Integer createLamp(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute LampDTO lampDTO) {
		Lamp lamp = lampDTO.toModel();
		lamp.setFamilyId(familyId);
		lampService.save(lamp);
		return lamp.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/modify", method = RequestMethod.POST)
	public void modifyLamp(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute LampDTO lampDTO) {
		if (lampService.findByFamilyIdAndId(familyId, id) != null) {
			Lamp lamp = lampDTO.toModel();
			lampService.update(lamp);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/lamp/destroy", method = RequestMethod.POST)
	public void destroyLamp(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (lampService.findByFamilyIdAndId(familyId, id) != null) {
			lampService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}



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
	public Integer createWindow(@RequestParam("familyId") Integer familyId, @Valid @ModelAttribute WindowDTO windowDTO) {
		Window window = windowDTO.toModel();
		window.setFamilyId(familyId);
		windowService.save(window);
		return window.getId();
	}

	@ResponseBody
	@RequestMapping(value = "/window/modify", method = RequestMethod.POST)
	public void modifyWindow(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id, @Valid @ModelAttribute WindowDTO windowDTO) {
		if (windowService.findByFamilyIdAndId(familyId, id) != null) {
			Window window = windowDTO.toModel();
			windowService.update(window);
		} else {
			throw new WebException("无数据！");
		}
	}

	@ResponseBody
	@RequestMapping(value = "/window/destroy", method = RequestMethod.POST)
	public void destroyWindow(@RequestParam("familyId") Integer familyId, @RequestParam("id") Integer id) {
		if (windowService.findByFamilyIdAndId(familyId, id) != null) {
			windowService.delete(id);
		} else {
			throw new WebException("无数据！");
		}
	}



	@ModelAttribute
	public void validate(@RequestParam("familyId") Integer familyId, @RequestParam("token") String token) {
		if (familyService.findByIdAndToken(familyId, token) == null) {
			throw new WebException("无效家庭组！");
		}
	}
}
