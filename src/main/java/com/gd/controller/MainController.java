package com.gd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gd.dao.ArtistsDaoImpl;
import com.gd.dao.SongsDaoImpl;
import com.gd.model.Songs;

@Controller
public class MainController {

	@Autowired
	private SongsDaoImpl songsDaoImpl;
	
	@Autowired
	private ArtistsDaoImpl artistsDaoImpl;
	

	@RequestMapping(value = "/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/insertSong")
	public ModelAndView showform() {
		return new ModelAndView("insertSong", "command", new Songs());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Songs gd) {
		songsDaoImpl.save(gd);
		return new ModelAndView("redirect:/viewSong");
	}

	@RequestMapping("/viewSong")
	public ModelAndView viewemp() {
		List<Songs> list = songsDaoImpl.list();
		return new ModelAndView("viewSong", "list", list);
	}
}
