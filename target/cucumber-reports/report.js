$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/demo.feature");
formatter.feature({
  "name": "Affiliate",
  "description": "  Admin want to use this template for Affiliates.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Filter out search results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "fills up the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "Admin moves to the affiliates page",
  "keyword": "Given "
});
formatter.step({
  "name": "fills the required fields \"\u003caffiliate_name\u003e\", \"\u003cdate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "clicks on Filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Expected results should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "affiliate_name",
        "date"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin@123",
        "abx",
        "2022-03-08"
      ]
    }
  ]
});
formatter.background({
  "name": "Signin with admin account",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filter out search results",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "fills up the \"admin\" and \"Admin@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.fills_up_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin moves to the affiliates page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.admin_moves_to_the_affiliates_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills the required fields \"abx\", \"2022-03-08\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.fills_the_required_fields(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.clicks_on_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Expected results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.Expected_results_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add Affiliates",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "admin fills up the \"\u003cusername\u003e\" and \"\u003cpass\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "admin clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "moves to the affiliates page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin moves to Add Affiliates page",
  "keyword": "Then "
});
formatter.step({
  "name": "Enters all the required fields \"\u003cfirstname\u003e\", \"\u003clastname\u003e\", \"\u003ctelephone\u003e\", \"\u003cpassword\u003e\", \"\u003cconfirm\u003e\", \"\u003caddress1\u003e\", \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "select country and Region",
  "keyword": "And "
});
formatter.step({
  "name": "Move to Payment Details",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter \"\u003cCheque_Payee_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on save button",
  "keyword": "Then "
});
formatter.step({
  "name": "the above entered information should be added check by email",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "pass",
        "firstname",
        "lastname",
        "telephone",
        "password",
        "confirm",
        "address1",
        "city",
        "Cheque_Payee_Name"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin@123",
        "abc",
        "xyz",
        "543452",
        "qwert",
        "qwert",
        "adsshg",
        "wetgsd",
        "mnop"
      ]
    }
  ]
});
formatter.background({
  "name": "Signin with admin account",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Affiliates",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "admin fills up the \"admin\" and \"Admin@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.admin_fills_up_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.admin_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moves to the affiliates page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.moves_to_the_affiliates_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin moves to Add Affiliates page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.admin_moves_to_Add_Affiliates_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters all the required fields \"abc\", \"xyz\", \"543452\", \"qwert\", \"qwert\", \"adsshg\", \"wetgsd\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.enters_all_the_required_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select country and Region",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.select_country_and_Region()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move to Payment Details",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.move_to_Payment_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter \"mnop\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.enter(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the above entered information should be added check by email",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.the_above_entered_information_should_be_added_check_by_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/demo1.feature");
formatter.feature({
  "name": "Customer Orders Report",
  "description": "  Admin want to use this template for Customer Orders Report",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Filter out search results in Customer Orders Report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "fills up the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "Admin moves to the Customer Orders Report page",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin fills the required fields \"\u003cDate_Start\u003e\", \"\u003cdate_end\u003e\", \"\u003cCustomer\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "clicks on Filter button",
  "keyword": "And "
});
formatter.step({
  "name": "Expected Customer results should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Date_Start",
        "date_end",
        "Customer"
      ]
    },
    {
      "cells": [
        "admin",
        "Admin@123",
        "2022-01-08",
        "2022-03-08",
        "Krishna Mohan"
      ]
    }
  ]
});
formatter.background({
  "name": "Signin with admin account",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.user_is_on_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filter out search results in Customer Orders Report",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "fills up the \"admin\" and \"Admin@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.fills_up_the_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin moves to the Customer Orders Report page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.admin_moves_to_the_Customer_Orders_Report_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin fills the required fields \"2022-01-08\", \"2022-03-08\", \"Krishna Mohan\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.admin_fills_the_required_fields(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.clicks_on_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Expected Customer results should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.expected_Customer_results_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});