$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add Customer",
  "description": "  User creating new account",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Hardcoded",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch telecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddTariffplanSteps.user_launch_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates into add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_navigates_into_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the feilds",
  "keyword": "When "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_enters_all_the_feilds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "one dimensional list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch telecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddTariffplanSteps.user_launch_telecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates into add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_navigates_into_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters all the feilds by using 1dim list",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_enters_all_the_feilds_by_using_1dim_list(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "com.telecom.stepdefinition.AddCustomerSteps.user_should_be_displayed_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});