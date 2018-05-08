package com.liferay.gs.test.functional.selenium;

import com.liferay.gs.test.functional.selenium.SeleniumJavaTestCase;

import org.junit.Assert;

/**
 * @author Andrew Betts
 */
public class JavaTestCaseTest extends SeleniumJavaTestCase {

	public void testGoogleSearch() throws Exception {
		webDriver.navigate().to("https://www.google.com");

		Assert.assertEquals("Google", webDriver.getTitle());
	}

}