package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

import lombok.Data;

@Data
@Embeddable
public class Days implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	@Enumerated
	private Day days;
	
	public enum Day{
		MON,
		TUE,
		WED,
		THU,
		FRI,
		SAT,
		SUN
	}
}
