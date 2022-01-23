package com.codejam.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codejam.demo.entity.PersonalInfo;
import com.codejam.demo.exception.EntityNotFoundException;
import com.codejam.demo.repository.PersonalInfoRepository;

@Service
public class PersonalInfoService {
	
	@Autowired
	private PersonalInfoRepository personalInfoRepository;
	
	public PersonalInfo findByPersonalInfoById(int id) {
		Optional<PersonalInfo> list =Optional.of(personalInfoRepository.findById(id).orElseThrow(EntityNotFoundException::new));
		PersonalInfo personalInfo=null;
		if(list.isPresent()) {
			personalInfo = list.get();
		}
		return personalInfo;
	}
	
	public PersonalInfo save(PersonalInfo personalInfo) {
		PersonalInfo pInfo = personalInfoRepository.save(personalInfo);
		return pInfo;
	}

	public void delete(PersonalInfo personalInfo) {
		personalInfoRepository.delete(personalInfo);
	}
}
