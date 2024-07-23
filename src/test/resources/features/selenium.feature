Feature: stepDefinitions.CucumberJava

Background:
	Given I open the browser
	And I navigate to the Selenium homepage

Scenario: The different Selenium logos should be visible
Then The different Selenium logos should be visible

Scenario: Can navigate to the 'About Selenium' page and titles display
Given I can open the 'About' dropdown menu
And I can choose the 'About Selenium' option
Then The 'About Selenium' page should load
And The different 'About Selenium' titles should be displayed

Scenario: Can navigate to the 'Download' page and the titles have the right text
Given I click the 'Downloads' option from the navbar
Then The 'Downloads' page should load
And The different 'Downloads' titles should have the right text

Scenario: Can navigate to the 'Documentation' page and access the different subsections
Given I click the 'Documentation' option from the navbar
Then The 'Documentation' page should load
And The different subsection should be accessible
	| Selenium Overview |
	| WebDriver         | 
	| Selenium Manager  |
	| Grid              |
	| IE Driver Server  |
	| Selenium IDE      |
	| Test Practices    |
	| Legacy            |
	| About             |
	
Scenario: Can navigate to the 'Documentation' page and change the selected language
Given I click the 'Documentation' option from the navbar
Then The 'Documentation' page should load
And The language used for the documentation can be changed to "<Language>"
Example:
  | Language               |
	| Português (Brasileiro) |
	| 中文简体                |
	| 日本語                  |