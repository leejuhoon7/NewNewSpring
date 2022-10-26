package com.yedam.java.rent.mapper;

import java.util.List;

import com.yedam.java.rent.service.RentVO;

public interface RentMapper {
	
	List<RentVO> selectRentList();
}
