package com.fis.training.caseStudy.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.training.caseStudy.repository.Books;
import com.fis.training.caseStudy.repository.BooksRepo;
import com.fis.training.caseStudy.repository.booksDto;

@Service
@Transactional
public class BookService {
	
	@Autowired
	private BooksRepo bRepo;
	
	public List<booksDto> listAll(){
		List<Books> dtoCon= bRepo.findAll();
		booksDto dto = new booksDto();
		List<booksDto> out= new ArrayList<booksDto>();
		for(int i=0;i<dtoCon.size();i++) {
			dto.setAuthor(dtoCon.get(i).getAuthor());
			dto.setAvail_copies(dtoCon.get(i).getAvail_copies());
			dto.setBookId(dtoCon.get(i).getBook_id());
			dto.setBookName(dtoCon.get(i).getBook_name());
			dto.setTotal_copies(dtoCon.get(i).getTotal_copies());
			out.add(dto);
		}
		return out;
	}

}
