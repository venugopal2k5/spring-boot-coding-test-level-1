package com.codejam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejam.demo.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {

}
