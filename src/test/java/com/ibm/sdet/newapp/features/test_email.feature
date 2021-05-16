#Author: vishalsolanki@in.ibm.com
#Feature: Test email functionality of new application My Organisation - My Education
@sendemail
Feature: Test email functionality of new application from different browsers

  @functional
  Scenario Outline: Login and send email through new application
    Given User should open the new application from "<browser>"
    And User should login into with "<username>" and "<password>"
    When User should verify login confirmation.
    And User should verify user profile and click to send mail.
    And User should select "<receiptant>"
    And User should compose body "<body>" and subject "<subject>"
    And User should send mail
    Then User should verify the confirmation message.

    Examples: 
      | browser | username       | password         | receiptant | subject        | body                                                         |
      | firefox | VishalSolanki1 | vishal0123456789 | Vishal     |Hi For Testing  | Hello Vishal, This is for testing Thanks and Regards: Vishal|
 #     | chrome  | VishalSolanki1 | vishal0123456789 | Vishal     | Hi For Testing | Hello Vishal, This is for testing Thanks and Regards: Vishal |
