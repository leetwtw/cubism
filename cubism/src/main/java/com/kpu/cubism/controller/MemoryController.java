package com.kpu.cubism.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	/*
	 * Chart 출력
	 * 
	 * */
	@RequestMapping(value = "/chart", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject getBbsSearch(HttpServletRequest request, HttpServletResponse response, @ModelAttribute MemoryVo vo){
		
		JSONObject responseObj = new JSONObject();
        JSONObject lineObj = null;
        List<MemoryVo> memorylist = service.getMemoryList(vo);
        JSONArray memorylist_json = new JSONArray();
        
        try {
			for(int i = 0; i < memorylist.size(); i++) {
				int memoryIdx = memorylist.get(i).getMemoryIdx();
				String memoryflag = memorylist.get(i).getMemoryflag();
				int memoryRank = memorylist.get(i).getMemoryRank();
				int memorySec = memorylist.get(i).getMemorySec();
				int memorymaxSec = memorylist.get(i).getMemorymaxSec();
				int memoryminSec = memorylist.get(i).getMemoryminSec();
				String memoryDate = memorylist.get(i).getMemoryDate();
				
				lineObj = new JSONObject();
	        	lineObj.put("memoryIdx", memoryIdx);
	        	lineObj.put("memoryFlag", memoryflag);
	        	lineObj.put("memoryRank", memoryRank);
	        	lineObj.put("memorySec", memorySec);
	        	lineObj.put("memorymaxSec", memorymaxSec);
	        	lineObj.put("memoryminSec", memoryminSec);
	        	lineObj.put("memoryDate", memoryDate);
	        	memorylist_json.add(lineObj);
			}
		    responseObj.put("memorylist", memorylist_json);
		    	
		    //System.out.println(responseObj.toString());
		    //System.out.println();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		return responseObj;
	}

	@RequestMapping(value = "/listtest", method = RequestMethod.GET)
	public String list(ModelMap modelMap, @ModelAttribute MemoryVo vo) {

		List<MemoryVo> Memorylist = service.getMemoryList(vo);
		modelMap.addAttribute("list", Memorylist);
		
		return "/test/listtest";
		
	}
	/* TEST code
	 * 
	 * 
	@RequestMapping(value = "/chart2", method = RequestMethod.POST)
	public String MemoryChart(ModelMap modelMap, @ModelAttribute MemoryVo vo) {
		
		//ajax에 반환할 JSON 생성
        JSONObject responseObj = new JSONObject();
        JSONObject lineObj = null;
        
		List<MemoryVo> memorylist = service.getMemoryList(vo);
		JSONArray memorylist_json = new JSONArray();

		try {
			for(int i = 0; i < memorylist.size(); i++) {
				int memoryIdx = memorylist.get(i).getMemoryIdx();
				String memoryflag = memorylist.get(i).getMemoryflag();
				int memoryRank = memorylist.get(i).getMemoryRank();
				int memorySec = memorylist.get(i).getMemorySec();
				int memorymaxSec = memorylist.get(i).getMemorymaxSec();
				int memoryminSec = memorylist.get(i).getMemoryminSec();
				String memoryDate = memorylist.get(i).getMemoryDate();
				
				lineObj = new JSONObject();
	        	lineObj.put("memoryIdx", memoryIdx);
	        	lineObj.put("memoryFlag", memoryflag);
	        	lineObj.put("memoryRank", memoryRank);
	        	lineObj.put("memorySec", memorySec);
	        	lineObj.put("memorymaxSec", memorymaxSec);
	        	lineObj.put("memoryminSec", memoryminSec);
	        	lineObj.put("memoryDate", memoryDate);
	        	memorylist_json.add(lineObj);
			}
		    responseObj.put("memorylist", memorylist_json);
		    System.out.println(responseObj.toString());
		    System.out.println();
		    
		}catch (Exception e) {
			e.printStackTrace();
		}
		//modelMap.addAttribute("memorylist", memoryarray);
		
		for(int i = 0; i < memorylist.size(); i++) {
		memoryMap.put("memoryIdx", memorylist.get(i).getMemoryIdx());
		memoryMap.put("memoryFlag", memorylist.get(i).getMemoryflag());
		memoryMap.put("memoryRank", memorylist.get(i).getMemoryRank());
		memoryMap.put("memorySec", memorylist.get(i).getMemorySec());
        memoryMap.put("memorymaxSec", memorylist.get(i).getMemorymaxSec());
        memoryMap.put("memoryminSec", memorylist.get(i).getMemoryminSec());
        memoryMap.put("memoryDate", memorylist.get(i).getMemoryDate());
        memorylist.add((MemoryVo) memoryMap);
		}
		
		memoryMap.put("memorylist", memorylist);
		
		System.out.println(memoryMap);
		
		try {
			JSONArray array = new JSONArray();
			for(int i = 0; i < memorylist.size(); i++) {
				
				JSONObject lineObj = new JSONObject();
				
				lineObj.put("memoryIdx", memorylist.get(i).getMemoryIdx());
	            lineObj.put("memoryFlag", memorylist.get(i).getMemoryflag());
	            lineObj.put("memoryRank", memorylist.get(i).getMemoryRank());
	            lineObj.put("memorySec", memorylist.get(i).getMemorySec());
	            lineObj.put("memorymaxSec", memorylist.get(i).getMemorymaxSec());
	            lineObj.put("memoryminSec", memorylist.get(i).getMemoryminSec());
	            lineObj.put("memoryDate", memorylist.get(i).getMemoryDate());
	            array.add(lineObj);
		}*/
		//modelMap.addAttribute("memorylist", memorylist);
		//responseObj.put("memorylist", memorylist);
		/*
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		 
		return "/chart/mychart";
		
	}
		 */
}     