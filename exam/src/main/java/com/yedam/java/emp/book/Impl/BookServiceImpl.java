package com.yedam.java.emp.book.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.rent.service.RentVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper bookmapper;

	@Override
	public List<BookVO> selectBookList() {
		return bookmapper.selectBookList();
	}

	@Override
	public BookVO selectBookInfo(BookVO bvo) {
		return bookmapper.selectBookInfo(bvo);
	}

	@Override
	public int insertBookInfo(BookVO bvo) {
		return bookmapper.insertBookInfo(bvo);
	}

	@Override
	public int updateBookInfo(BookVO bvo) {
		return bookmapper.updateBookInfo(bvo);
	}

	@Override
	public int deleteBookInfo(BookVO bvo) {
		return bookmapper.deleteBookInfo(bvo);
	}

	

}
