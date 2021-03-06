package com.liferay.gs.test.functional.selenium;

import com.liferay.gs.test.functional.selenium.suite.SeleniumSuiteTest1;
import com.liferay.gs.test.functional.selenium.suite.SeleniumSuiteTest2;
import com.liferay.gs.test.functional.selenium.suite.SeleniumSuiteTest3;
import com.liferay.gs.test.functional.selenium.runner.Browsers;
import com.liferay.gs.test.functional.selenium.runner.LiferaySeleniumSuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Andrew Betts
 */
@RunWith(LiferaySeleniumSuiteRunner.class)
@Suite.SuiteClasses(
	value = {
		SeleniumSuiteTest1.class,
		SeleniumSuiteTest2.class,
		SeleniumSuiteTest3.class
	}
)
@Browsers
public class LiferaySeleniumSuiteRunnerTest {
}
