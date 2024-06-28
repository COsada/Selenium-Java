Feature: stepDefinitions.CucumberJava

Background:
	Given I open the browser
	And I navigate to the Selenium homepage

Scenario: The different Selenium logos should be visible
Then The different Selenium logos should be visible

Scenario: Can navigate to the 'About Selenium' page
Given I can open the 'About' dropdown menu
And I can choose the 'About Selenium' option
Then The 'About Selenium' page should load