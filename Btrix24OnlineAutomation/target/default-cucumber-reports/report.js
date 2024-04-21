$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/navigation/Navigation.feature");
formatter.feature({
  "name": "navigate module options",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify module title",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I log in as a \"\u003cuser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click a \"\u003cmodule\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the title should be \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "hr",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "module",
        "title"
      ]
    },
    {
      "cells": [
        "hr",
        "Company",
        "Company"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify module title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.step({
  "name": "I log in as a \"hr\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationStepDefinitions.i_log_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click a \"Company\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationStepDefinitions.i_click_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be \"Company\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationStepDefinitions.the_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.examples({
  "name": "marketing",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "module",
        "title"
      ]
    },
    {
      "cells": [
        "marketing",
        "Company",
        "Company"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify module title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@navigation"
    }
  ]
});
formatter.step({
  "name": "I log in as a \"marketing\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationStepDefinitions.i_log_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click a \"Company\"",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationStepDefinitions.i_click_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be \"Company\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationStepDefinitions.the_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});