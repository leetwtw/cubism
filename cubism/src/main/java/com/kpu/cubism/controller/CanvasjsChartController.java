package com.kpu.cubism.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kpu.cubism.service.CanvasjsChartService;
import com.kpu.cubism.vo.CanvasjsChartVo;
 
@Controller
@RequestMapping("/canvasjschart")
public class CanvasjsChartController {
 
	@Autowired
	private CanvasjsChartService canvasjsChartService;
 
	@RequestMapping(method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		CanvasjsChartVo vo = new CanvasjsChartVo();
		
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService.getCanvasjsChartData(vo);
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		return "chart";
		
	}
 
}     