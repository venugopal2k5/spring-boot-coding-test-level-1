package com.codejam.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyGlobalException extends RuntimeException{
	
	private String code;
	private String message;
	
	public CompanyGlobalException(String message) {
		super(message);
	}

}
