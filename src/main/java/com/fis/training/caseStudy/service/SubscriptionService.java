package com.fis.training.caseStudy.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.training.caseStudy.repository.Books;
import com.fis.training.caseStudy.repository.BooksRepo;
import com.fis.training.caseStudy.repository.SubDto;
import com.fis.training.caseStudy.repository.Subscriptions;
import com.fis.training.caseStudy.repository.SubscriptionsRepo;

@Service
@Transactional
public class SubscriptionService {
	
	@Autowired
	private SubscriptionsRepo sRepo;
	
	@Autowired
	private BooksRepo bRepo;
	
	public List<Subscriptions> listAll(){
		return sRepo.findAll();
	}

	public void save( SubDto input) {
		Subscriptions sub= new Subscriptions();
//		Optional<Books> book = bRepo.findById(input.getBookId());
		sub.setId(input.getBookId());
		sub.setSubscriber_name(input.getSubscriberName());
		sub.setDate_subscribed(input.getDateSubscribed());	
		sRepo.save(sub);
	}
}
