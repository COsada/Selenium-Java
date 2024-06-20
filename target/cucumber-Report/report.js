$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/facebook.feature");
formatter.feature({
  "name": "stepDefinitions.CucumberJava",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "background.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the websites homepage",
  "keyword": "And "
});
formatter.match({
  "location": "background.goToFacebook()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login functionality exists",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.loginButton()"
});
formatter.result({
  "status": "passed"
});
});