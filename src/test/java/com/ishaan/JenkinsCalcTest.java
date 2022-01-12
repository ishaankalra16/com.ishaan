package com.ishaan;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {
	@Test
	public void addtest(){
	    JenkinsCalculator mycalc = new JenkinsCalculator();
	    assertEquals(10,mycalc.addNumbers(5, 5));
	}
	public void subtracttest(){
	    JenkinsCalculator mycalc = new JenkinsCalculator();
	    assertEquals(5,mycalc.subtractNumbers(10, 5));
	} 
}
