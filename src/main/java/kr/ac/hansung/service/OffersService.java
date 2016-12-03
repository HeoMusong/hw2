package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.OfferDAO;
import kr.ac.hansung.model.Offer;

@Service
public class OffersService {

	private OfferDAO offerDao;

	@Autowired
	public void setOfferDao(OfferDAO offerDao) {
		this.offerDao = offerDao;
	}
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}
	
	public List<Offer> getCurrent2(int year, int semester){
		return offerDao.getOffers2(year, semester);
	}

	public void insert(Offer offer) {
		offerDao.insert(offer);
	}
	
}
