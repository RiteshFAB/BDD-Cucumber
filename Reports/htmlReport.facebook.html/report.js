$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Facebook.feature");
formatter.feature({
  "name": "Validation of Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of Login Functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User launch Url",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStepDef.user_launch_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the Credentials",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookStepDef.user_enters_the_Credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Validate Home Page of the Application",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDef.user_Validate_Home_Page_of_the_Application()"
});
formatter.result({
  "status": "passed"
});
});