package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

import lombok.Data;

@Embeddable
@Data
public class Level implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Enumerated
	private Levels level;
	
	public enum Levels{
	Basic,
	Intermediate,
	Advance
	}
}
