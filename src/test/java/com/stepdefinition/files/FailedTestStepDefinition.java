package com.stepdefinition.files;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class FailedTestStepDefinition {
	@Given("Sample Method One")
	public void sample_method_one() {
		 System.out.println("Method One");
	}

	@Given("Sample Method Two")
	public void sample_method_two() {
		 System.out.println("Method Two");
		 Assert.assertTrue(false);
	}

	@Given("Sample Method Three")
	public void sample_method_three() {
	    System.out.println("Method Three");
	}

	@Given("Sample Method Four")
	public void sample_method_four() {
		 System.out.println("Method Four");
		 Assert.assertTrue(false);
	}
}
