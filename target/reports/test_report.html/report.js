$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test_email.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: vishalsolanki@in.ibm.com"
    },
    {
      "line": 2,
      "value": "#Feature: Test email functionality of new application My Organisation - My Education"
    }
  ],
  "line": 4,
  "name": "Test email functionality of new application from different browsers",
  "description": "",
  "id": "test-email-functionality-of-new-application-from-different-browsers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@sendemail"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login and send email through new application",
  "description": "",
  "id": "test-email-functionality-of-new-application-from-different-browsers;login-and-send-email-through-new-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User should open the new application from \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should login into with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should verify login confirmation.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should verify user profile and click to send mail.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should select \"\u003creceiptant\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should compose body \"\u003cbody\u003e\" and subject \"\u003csubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should send mail",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should verify the confirmation message.",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test-email-functionality-of-new-application-from-different-browsers;login-and-send-email-through-new-application;",
  "rows": [
    {
      "cells": [
        "browser",
        "username",
        "password",
        "receiptant",
        "subject",
        "body"
      ],
      "line": 18,
      "id": "test-email-functionality-of-new-application-from-different-browsers;login-and-send-email-through-new-application;;1"
    },
    {
      "cells": [
        "firefox",
        "VishalSolanki1",
        "vishal0123456789",
        "Vishal",
        "Hi For Testing",
        "Hello Vishal, This is for testing Thanks and Regards: Vishal"
      ],
      "line": 19,
      "id": "test-email-functionality-of-new-application-from-different-browsers;login-and-send-email-through-new-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Login and send email through new application",
  "description": "",
  "id": "test-email-functionality-of-new-application-from-different-browsers;login-and-send-email-through-new-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@sendemail"
    },
    {
      "line": 6,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User should open the new application from \"firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should login into with \"VishalSolanki1\" and \"vishal0123456789\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should verify login confirmation.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should verify user profile and click to send mail.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should select \"Vishal\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should compose body \"Hello Vishal, This is for testing Thanks and Regards: Vishal\" and subject \"Hi For Testing\"",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should send mail",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should verify the confirmation message.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 43
    }
  ],
  "location": "StepDefinitionEmail.user_should_open_the_new_application_from(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VishalSolanki1",
      "offset": 29
    },
    {
      "val": "vishal0123456789",
      "offset": 50
    }
  ],
  "location": "StepDefinitionEmail.user_should_login_into_with_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionEmail.user_should_verify_login_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionEmail.user_should_verify_user_profile_and_click_to_send_mail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Vishal",
      "offset": 20
    }
  ],
  "location": "StepDefinitionEmail.user_should_select(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Vishal, This is for testing Thanks and Regards: Vishal",
      "offset": 26
    },
    {
      "val": "Hi For Testing",
      "offset": 101
    }
  ],
  "location": "StepDefinitionEmail.user_should_compose_body_and_subject(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionEmail.user_should_send_mail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionEmail.user_should_verify_the_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("test_signup.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: vishalsolanki@in.ibm.com"
    },
    {
      "line": 2,
      "value": "#Feature: Test signup functionality of new application My Organisation - My Education"
    }
  ],
  "line": 4,
  "name": "Test sign up functionality of new application from different browsers",
  "description": "",
  "id": "test-sign-up-functionality-of-new-application-from-different-browsers",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@signup"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Complete registration in new application",
  "description": "",
  "id": "test-sign-up-functionality-of-new-application-from-different-browsers;complete-registration-in-new-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User should signup the new application from \"\u003cbrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should enter firstname \"\u003cfirstname\u003e\" and lastname \"\u003clastname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should enter username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should enter and confirm \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should submit registration form\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should verify the registration confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User should validate email in userprofile",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test-sign-up-functionality-of-new-application-from-different-browsers;complete-registration-in-new-application;",
  "rows": [
    {
      "cells": [
        "browser",
        "firstname",
        "lastname",
        "email",
        "username",
        "password"
      ],
      "line": 18,
      "id": "test-sign-up-functionality-of-new-application-from-different-browsers;complete-registration-in-new-application;;1"
    },
    {
      "comments": [
        {
          "line": 19,
          "value": "#  | firefox | Vishal    | Solanki  | vishalsolanki96@gmail.com | VishalSolanki20 | vishal0123456789 |"
        }
      ],
      "cells": [
        "chrome",
        "Vishal",
        "Solanki",
        "vishalsolanki1812@in.ibm.com",
        "VishalSolanki22",
        "vishal987654321"
      ],
      "line": 20,
      "id": "test-sign-up-functionality-of-new-application-from-different-browsers;complete-registration-in-new-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "comments": [
    {
      "line": 19,
      "value": "#  | firefox | Vishal    | Solanki  | vishalsolanki96@gmail.com | VishalSolanki20 | vishal0123456789 |"
    }
  ],
  "line": 20,
  "name": "Complete registration in new application",
  "description": "",
  "id": "test-sign-up-functionality-of-new-application-from-different-browsers;complete-registration-in-new-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@signup"
    },
    {
      "line": 6,
      "name": "@functional"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User should signup the new application from \"chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should enter firstname \"Vishal\" and lastname \"Solanki\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should enter email \"vishalsolanki1812@in.ibm.com\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should enter username \"VishalSolanki22\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should enter and confirm \"vishal987654321\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should submit registration form\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should verify the registration confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User should validate email in userprofile",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 45
    }
  ],
  "location": "StepDefinitionSignUp.user_should_signup_the_new_application_from(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Vishal",
      "offset": 29
    },
    {
      "val": "Solanki",
      "offset": 51
    }
  ],
  "location": "StepDefinitionSignUp.user_should_enter_firstname_and_lastname(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "vishalsolanki1812@in.ibm.com",
      "offset": 25
    }
  ],
  "location": "StepDefinitionSignUp.user_should_enter_email(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VishalSolanki22",
      "offset": 28
    }
  ],
  "location": "StepDefinitionSignUp.user_should_enter_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "vishal987654321",
      "offset": 31
    }
  ],
  "location": "StepDefinitionSignUp.user_should_enter_and_confirm(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionSignUp.user_should_submit_registration_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionSignUp.user_should_verify_the_registration_confirmation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitionSignUp.user_should_validate_email_in_userprofile()"
});
formatter.result({
  "status": "skipped"
});
});