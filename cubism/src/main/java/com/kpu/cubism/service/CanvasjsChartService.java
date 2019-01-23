package com.kpu.cubism.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpu.cubism.dao.CanvasjsChartDao;
import com.kpu.cubism.vo.CanvasjsChartVo;


@Service
public class CanvasjsChartService {

	@Autowired
	private CanvasjsChartDao canvasjsChartDao;
 
	public void setCanvasjsChartDao(CanvasjsChartDao canvasjsChartDao) {
		this.canvasjsChartDao = canvasjsChartDao;
	}
 
	public List<List<Map<Object, Object>>> getCanvasjsChartData(CanvasjsChartVo vo) {
		
		return canvasjsChartDao.getCanvasjsChartData(vo);
		
	}
	

}
