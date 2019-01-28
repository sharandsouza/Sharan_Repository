package com.tech.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	
  @Test(dependsOnMethods= {"secondTest","thirdTest"})
  public void firstTest() {
	  System.out.println("3");
  }
  
  
  
  @Test
  public void secondTest() {
	  System.out.println("5");
  }
  
  @Test
  public void thirdTest() {
	  System.out.println("6");
  }
  
  @Test
  public void fourthTest() {
	  System.out.println("7");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("2");
  }

}
