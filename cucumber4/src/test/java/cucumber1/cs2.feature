
Feature: Login feature
  Scenario Outline: Test Me App login
    Given Login page is available
    When User enter  "<username>" and  "<password>"
    When User click on login button
    Then TestMeApp Homepage is open
Examples:
|username           |password|
|lalitha            |password123|
