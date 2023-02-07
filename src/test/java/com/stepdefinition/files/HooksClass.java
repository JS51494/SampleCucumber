package com.stepdefinition.files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {

	@Before
	public void beforeSceanario() {
		System.out.println("This will run before the Scenario");
	}
	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}
}
