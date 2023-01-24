package com.cg.checkin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.checkin.entity.CheckIn;
import com.cg.checkin.repository.ICheckinDao;

@Service
public class CheckinServiceImpl implements ICheckinService {

	@Autowired
	ICheckinDao checkinDao;

	@Override
	public CheckIn getCheckInById(int id) {
		return checkinDao.findById(id).get();
	}

	@Override
	public CheckIn addCheckin(CheckIn chk) {
		return checkinDao.save(chk);
	}

}
