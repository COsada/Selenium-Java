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

Scenario Outline: Can navigate to the 'Documentation' page and access the various sections
Given I click the 'Documentation' option from the navbar
Then The 'Documentation' page should load
And The "<sectionName>" section should be accessible through the index
Examples:
| sectionName       |
| Overview          |
| WebDriver         |
| Selenium Manager  |
| Grid              |
| IE Driver Server  |
| Selenium IDE      |
| Test Practices    |
| Legacy            |
| About             |

Scenario Outline: Can navigate to the 'Documentation' page and change the selected language
Given I click the 'Documentation' option from the navbar
Then The 'Documentation' page should load
And The language used for the documentation can be changed to "<languageSelect>"
And Displays the new header "<newHeader>"
Examples:
  | languageSelect         | newHeader |
	| Português (Brasileiro) | O Projeto Selenium de Automação de Navegadores    |
	| 中文简体                | Selenium 浏览器自动化项目                            |
	| 日本語                  | Seleniumブラウザー自動化プロジェクト                       |