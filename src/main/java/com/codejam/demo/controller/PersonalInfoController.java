package com.codejam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codejam.demo.entity.PersonalInfo;
import com.codejam.demo.service.PersonalInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/personalInfo")
public class PersonalInfoController {
	
	@Autowired
	private PersonalInfoService personalInfoService;
	
	@GetMapping(value="/getPersonalInfo")
	public PersonalInfo getPersonalInfo(@RequestParam (name="id") int id) throws JsonProcessingException {
		PersonalInfo personalInfo = personalInfoService.findByPersonalInfoById(id);
		ObjectMapper mapper = new ObjectMapper();
//		PersonalInfoDto personalInfoDto = mapper.convertValue(personalInfo,PersonalInfoDto.class);
//		System.out.println(mapper.writeValueAsString(personalInfo));
		return personalInfo;
	}
	
	@PostMapping(value="/save")
	public PersonalInfo savePersonalInfo(@RequestBody PersonalInfo personalInfo) {
		return personalInfoService.save(personalInfo);
	}
	
	@PostMapping(value="/delete")
	public void deletePersonalInfo(@RequestBody PersonalInfo personalInfo) {
		personalInfoService.delete(personalInfo);
	}

}
