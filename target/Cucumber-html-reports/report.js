$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add Customer",
  "description": "  User creating new account",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "Hardcoded",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@karthi"
    }
  ]
});
formatter.step({
  "name": "User launch telecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariffplanSteps.user_launch_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates into add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_navigates_into_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the feilds",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_feilds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});