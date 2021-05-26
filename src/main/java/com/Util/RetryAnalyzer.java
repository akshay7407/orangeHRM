package com.Util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter=0;
	int RetryMaxLimit=4;
	
	
	public boolean retry(ITestResult result) {
	
		if(counter<RetryMaxLimit) 
		{
			counter++;
			return true;
		}
		
		
		return false;
	}

}
