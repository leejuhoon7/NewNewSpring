package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {
		// 전체조회
		public List<BookVO> selectBookList();
		
		// 단건조회
		public BookVO selectBookInfo(BookVO bvo);
		
		// 등록
		public int insertBookInfo(BookVO bvo);
		
		// 수정
		public int updateBookInfo(BookVO bvo);
		
		// 삭제
		public int deleteBookInfo(BookVO bvo);
}
