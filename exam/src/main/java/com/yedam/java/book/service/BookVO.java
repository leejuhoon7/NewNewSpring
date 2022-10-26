package com.yedam.java.book.service;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BookVO {
	private int bookNo;
	private String bookName;
	private String bookCoverimg;
	private String bookDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;

}
