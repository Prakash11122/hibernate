package com.pradhan.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentCompositeKey implements Serializable{ // Serializable a marker interface
	@Column(name = "ROLLNO")
	private Integer rollNumber;
	
	@Column(name = "SECTION")
	private String section;
	
	public StudentCompositeKey(Integer rollNumber, String section) {
		super();
		this.rollNumber = rollNumber;
		this.section = section;
	}
	
	public StudentCompositeKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	// Overriding equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCompositeKey that = (StudentCompositeKey) o;
        return Objects.equals(rollNumber, that.rollNumber) && Objects.equals(section, that.section);
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, section);
    }
	
	

}
