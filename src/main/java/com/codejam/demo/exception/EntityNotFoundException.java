package com.codejam.demo.exception;

public class EntityNotFoundException extends CompanyGlobalException{
	
	public EntityNotFoundException() {
		
		super(GlobalErrorCode.ERROR_ENTITY_NOT_FOUND,"Requested Entity not present in the DB.");
	}

}
