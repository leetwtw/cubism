package com.kpu.cubism.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kpu.cubism.service.CanvasjsChartService;
import com.kpu.cubism.service.MemoryService;
import com.kpu.cubism.vo.MemoryVo;



@Controller
public class MemoryController {
 
	@Autowired
	private CanvasjsChartService canvasjsChartService;
	
	@Autowired
	private MemoryService service;
	/*
	@RequestMapping(value="/chart")
	public String springMVC(ModelMap modelMap) {
		MemoryVo vo = new MemoryVo();
		
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData(vo);
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		
		return "chartdb2";
		
	}
	*/
	@RequestMapping(value = "/listtest", method = RequestMethod.GET)
	public String list(ModelMap modelMap, @ModelAttribute MemoryVo vo) {

		List<MemoryVo> Memorylist = service.getMemoryList(vo);
		modelMap.addAttribute("list", Memorylist);
		
		return "listtest";
		
	}
 
}     