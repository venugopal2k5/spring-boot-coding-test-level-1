package com.codejam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejam.demo.entity.PersonalInfo;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo,Integer> {

}
