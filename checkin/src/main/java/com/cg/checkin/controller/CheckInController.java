package com.cg.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.checkin.entity.CheckIn;
import com.cg.checkin.services.ICheckinService;

@RestController
@RequestMapping(value = "/checkin")
public class CheckInController {

	@Autowired
	ICheckinService checkinService;


	// Display checkIn based on "id"
	@GetMapping("/{id}")
	ResponseEntity<CheckIn> getCheckInById(@PathVariable("id") int id) {
		CheckIn ck = checkinService.getCheckInById(id);
		System.out.println(ck);
		return new ResponseEntity<>(checkinService.getCheckInById(id), HttpStatus.OK);
	}

	// "ADD" a new checkIn
	@PostMapping(value = "/addCheckin")
	ResponseEntity<CheckIn> addCheckIn(@RequestBody CheckIn checkin) {
		CheckIn chk = checkinService.addCheckin(checkin);
		return new ResponseEntity<>(chk, HttpStatus.CREATED);
	}

}
