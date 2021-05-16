#Author: vishalsolanki@in.ibm.com
#Feature: Test signup functionality of new application My Organisation - My Education
@signup
Feature: Test sign up functionality of new application from different browsers

  @functional
  Scenario Outline: Complete registration in new application
    Given User should signup the new application from "<browser>"
    When User should enter firstname "<firstname>" and lastname "<lastname>"
    And User should enter email "<email>"
    And User should enter username "<username>"
    And User should enter and confirm "<password>"
    And User should submit registration form>
    Then User should verify the registration confirmation message
    And User should validate email in userprofile

    Examples: 
      | browser | firstname | lastname | email                     | username       | password         |
    #  | firefox | Vishal    | Solanki  | vishalsolanki96@gmail.com | VishalSolanki20 | vishal0123456789 |
     | chrome  | Vishal    | Solanki  | vishalsolanki1812@in.ibm.com | VishalSolanki22 | vishal987654321  |
