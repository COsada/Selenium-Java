$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/selenium.feature");
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
  "location": "Background.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Selenium homepage",
  "keyword": "And "
});
formatter.match({
  "location": "Background.goToSelenium()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The different Selenium logos should be visible",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The different Selenium logos should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.logosLoaded()"
});
formatter.result({
  "status": "passed"
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
  "location": "Background.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Selenium homepage",
  "keyword": "And "
});
formatter.match({
  "location": "Background.goToSelenium()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: invalid session id\nBuild info: version: \u00274.21.0\u0027, revision: \u002779ed462ef4\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002722.0.1\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCommand: [b374753f115a4a126de0404e7fbea537, get {url\u003dhttps://www.selenium.dev/}]\nCapabilities {acceptInsecureCerts: false, browserName: MicrosoftEdge, browserVersion: 126.0.2592.68, fedcm:accounts: true, ms:edgeOptions: {debuggerAddress: localhost:63324}, msedge: {msedgedriverVersion: 126.0.2592.68 (30e1b6cc72a8..., userDataDir: C:\\Users\\cosad\\AppData\\Loca...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:63324/devtoo..., se:cdpVersion: 126.0.2592.68, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: b374753f115a4a126de0404e7fbea537\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:300)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:1063)\r\n\tat stepDefinitions.Background.goToSelenium(Background.java:26)\r\n\tat ✽.I navigate to the Selenium homepage(src/test/resources/features/selenium.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Can navigate to the \u0027About Selenium\u0027 page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I can open the \u0027About\u0027 dropdown menu",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepage.aboutDropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I can choose the \u0027About Selenium\u0027 option",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage.aboutSelenium()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The \u0027About Selenium\u0027 page should load",
  "keyword": "Then "
});
formatter.match({
  "location": "AboutSelenium.logosLoaded()"
});
formatter.result({
  "status": "skipped"
});
});