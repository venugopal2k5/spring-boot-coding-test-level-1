package com.codejam.demo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.codejam.demo.entity.PersonalInfo;
import com.codejam.demo.repository.PersonalInfoRepository;
import com.codejam.demo.service.PersonalInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private PersonalInfoService personalInfoService;
	
	@MockBean
	private PersonalInfoRepository  personalInfoRepository;
	
	@Test
	public void getIdolInactive() {
		PersonalInfo personalInfo = new PersonalInfo(2,"VENU","GOPAL","MALAYSIA","INACTIVE");
//		List<PersonalInfo> personalInfoList = new ArrayList<PersonalInfo>();
//		personalInfoList.add(personalInfo);
		
		
		when(personalInfoService.findByPersonalInfoById(2)).thenReturn((PersonalInfo) Stream.of(new PersonalInfo(2,"VENU","GOPAL","MALAYSIA","INACTIVE")).collect(Collectors.toList()));
		assertEquals("INACTIVE",personalInfoService.findByPersonalInfoById(2).getIdolStatus());
	}
	
	
}
