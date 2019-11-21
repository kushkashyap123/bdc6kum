Feature: Singup feature
  Scenario: TestmeApp Registration process
    Given Signup link is available
    When User enter username as kumari
    And User enter firstname as ku and
    And User enter lastname as  khu
    And User enter password as kum@12345
    And user enter conform password as kum@12345
    And Select gender as Female
    And user enter email as kushkashyap11@gmail.com
    And enter mobile no as "9934287464"
    And enter dob as "11/23/2019"
    And address as "mokama"
    And enter selects "What is your Pet Name?" as security question
    And user enter "dog" as answer
    And User clicks on Register
    Then TestMeApp home page open
