package com.spring.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	
	@NotNull(message = "Last Name is required")
	@Size(min = 1,max = 10)
	private String lastName;
	private String country;
	
	@NotNull(message = "PostCode is required")
	@Pattern(regexp ="^[a-zA-Z0-9]{6}",message = "only six characters/numbers")
	private String postCode;
	
	@Min(value = 1)
	@Max(value = 10)
	private int freePass;
	
	@CourseCode(value ="Y15ACS" ,message = "must start with Y15ACS" )
	private String courseCode;

	public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	private String language;
	private String system;
	
	private LinkedHashMap<String,String> countryOptions;
	private LinkedHashMap<String,String> programmingLanguage;
	private LinkedHashMap<String,String> operatingSystem;
	
	public Student() {
		
		countryOptions=new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IND", "India");
		countryOptions.put("USA", "America");
		
		programmingLanguage=new LinkedHashMap<>();
		
		programmingLanguage.put("Java", "Java");
		programmingLanguage.put("C#", "C#");
		programmingLanguage.put("PHP", "PHP");
		programmingLanguage.put("RUBY", "RUBY");
		
		operatingSystem=new LinkedHashMap<>();
		
		operatingSystem.put("Windows", "Windows");
		operatingSystem.put("Linux", "Linux");
		operatingSystem.put("Mac", "Mac");
		
	}



	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public LinkedHashMap<String, String> getOperatingSystem() {
		return operatingSystem;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public LinkedHashMap<String, String> getProgrammingLanguage() {
		return programmingLanguage;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public int getFreePass() {
		return freePass;
	}

	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}

}
