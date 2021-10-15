package com.hs.meetme.coursecreate.service;

import java.util.List;

import com.hs.meetme.coursecreate.domain.TagNumAddrYearVO;
import com.hs.meetme.coursecreate.domain.TensorCauseVO;
import com.hs.meetme.coursecreate.domain.TensorResultVO;
import com.hs.meetme.coursecreate.domain.TensorVO;

public interface TensorService {
	
	// tensor를 이용하기 위한 데이터를 가져오는 것
	List<TensorVO> createTensorData();
	
	List<TensorCauseVO> createTensorCauseData();
	
	List<TensorResultVO> createTensorResultData();
	
	List<TagNumAddrYearVO> getDataOfTensor(String userId);
	
}
