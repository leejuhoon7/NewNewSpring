package com.yedam.java.emp.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;
import com.yedam.java.rent.service.RentVO;

@Controller
public class BookController {

	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService bookservice;
	
	// 홈가기
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
		
	
	// 전체조회

	@GetMapping("list") // required = true가 기본값이라 필수로 들어가야 함.
	public String selectBookList(Model model, @RequestParam(required = false) String msg) {
		model.addAttribute("bookList", bookservice.selectBookList());
		return "book/bookList";
	}
	
	// 대여현황조회
	@GetMapping("rent")
	public String selectRentList(Model model, @RequestParam(required = false) String msg) {
		//model.addAllAttributes("rentList", )
		return "book/rentList";
	}
	

	// 단건조회
	@GetMapping("book")
	public String selectBoardInfo(BookVO bvo, Model model) {
		model.addAttribute("book", bookservice.selectBookInfo(bvo));
		return "book/bookInfo";
	}

	// 등록 폼
	@GetMapping("insertForm")
	public String InsertForm(Model mo) {
	//	mo.addAttribute("no","check");
		return "book/insertForm";
	}

	// 등록
	@PostMapping("insert")
	public String insertBookInfo(BookVO bvo, RedirectAttributes ratt) {
		int result = bookservice.insertBookInfo(bvo);

		if (result == 1) {
			ratt.addAttribute("msg", "정상등록 되었습니다");
		} else {
			ratt.addAttribute("msg", "등록에 실패했습니다.");
		}
		return "redirect:list";
	}

	// 수정 폼

	@GetMapping("updateFrom")
	public String updateForm(BookVO bvo, Model model) {
		model.addAttribute("book", bookservice.selectBookInfo(bvo));
		return "freeBoard/updateForm";
	}

	// 수정

	@PostMapping("update")
	public String updateBookInfo(BookVO bvo, RedirectAttributes ratt) {
		int result = bookservice.updateBookInfo(bvo);
		
		if(result == 1) {
			ratt.addAttribute("msg", "수정 되었습니다.");
		}else {
			ratt.addAttribute("msg", "수정에 실패하였습니다.");
			
		}
		
		return "redirect:list";
	}
	
	// 삭제
	
	@GetMapping("delete")
	public String deleteBookInfo(BookVO bvo, RedirectAttributes ratt) {
		int result = bookservice.deleteBookInfo(bvo);
		
		if(result == 1) {
			ratt.addAttribute("msg", "삭제 되었습니다.");
		}else {
			ratt.addAttribute("msg", "삭제에 실패하였습니다.");
			
		}
		
		return "redirect:list";
	}
}