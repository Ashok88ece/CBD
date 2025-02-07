$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/OpenGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "This is to test IPIGS search",
  "description": "",
  "id": "this-is-to-test-ipigs-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OpenGoogle"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Google search scenario",
  "description": "",
  "id": "this-is-to-test-ipigs-search;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is enetering IPIGS.in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is typing the search term \"IPIGS\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter the return key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should see the search results",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});