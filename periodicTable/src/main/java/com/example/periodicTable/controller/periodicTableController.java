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
import org.springframework.web.bind.annotation.RequestBody;


@Slf4j
@Controller
public class periodicTableController {
	
	@Autowired
	private periodicTableService periodicTableService;
	
	// http://localhost:8080
	@GetMapping("/")
    public ModelAndView defaultPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index.html");
        return mav;
    }
	
	// http://localhost:8080/periodic
	@GetMapping("/periodic")
    public ModelAndView showPeriodicTable() {
        ModelAndView mav = new ModelAndView();

        List<String> periodicSt =  periodicTableService.getDistinctPeriodicSt();
        mav.addObject("periodicSt", periodicSt);       
        mav.setViewName("periodicTable.html");
        return mav;
    }
	
	@GetMapping("/info")
	@ResponseBody
	public List<periodicTable> mtrl() {	
		log.info("인포{}",periodicTableService.gets());
		periodicTableService.gets();
		
		return periodicTableService.gets();
	}
	
	
	@PostMapping("/periodic/save")
	@ResponseBody
	public void mtrlSave(@RequestBody String entity) {
	    System.out.println("hello");
	}

	

}
