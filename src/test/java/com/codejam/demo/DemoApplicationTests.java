package com.codejam.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.codejam.demo.entity.PersonalInfo;
import com.codejam.demo.repository.PersonalInfoRepository;
import com.codejam.demo.service.PersonalInfoService;

@SpringBootTest
class DemoApplicationTests {

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
	@Test
	void contextLoads() {
	}

}
