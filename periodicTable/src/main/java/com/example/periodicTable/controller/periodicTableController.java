package com.example.periodicTable.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.periodicTable.domain.periodicTable.periodicTable;
import com.example.periodicTable.domain.periodicTable.periodicTableService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/periodic")
public class periodicTableController {
	
	@Autowired
	private periodicTableService periodicTableService;
	

	
	@GetMapping("/info")
	@ResponseBody
	public List<periodicTable> mtrl() {	
		log.info("인포{}",periodicTableService.gets());
		periodicTableService.gets();
		
		return periodicTableService.gets();
	}

}
