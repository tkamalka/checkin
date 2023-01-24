package com.cg.checkin.services;

import org.springframework.stereotype.Service;

import com.cg.checkin.entity.CheckIn;

@Service
public interface ICheckinService {

	public CheckIn getCheckInById(int id);

	public CheckIn addCheckin(CheckIn chk);

}
