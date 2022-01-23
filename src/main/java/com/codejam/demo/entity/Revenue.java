package com.codejam.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="REVENUE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Revenue {
	
	@Id
	@GeneratedValue
	Integer id;
	
	@Column(name="MONTHLY_RATE")
	String monthlyRate;
	
	@Column(name="EVENT_NAME")
	String eventName;
	
	@Column(name="DATE_TIME")
	String dateTime;
	
}
