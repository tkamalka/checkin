package com.cg.checkin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.checkin.entity.CheckIn;

@Repository
public interface ICheckinDao extends JpaRepository<CheckIn, Integer> {

}
