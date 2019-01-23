package com.kpu.cubism.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.kpu.cubism.vo.CanvasjsChartVo;

@Repository
public class CanvasjsChartDao {
	

	public List<List<Map<Object, Object>>> getCanvasjsChartData(CanvasjsChartVo vo) {
		return vo.getCanvasjsDataList();
	}

}
