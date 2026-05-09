Feature: Testing different Text boxes
  Scenario: Filling in text boxes with valid inputs and submitting the form
    Given the User is on the Text box page
    When The user fills in Full Name textbox with "amine"
    And The user fills in Email textbox with "test@gmail.com"
    And The user fills in Current Address textarea with "23 , rabat Morocco"
    And The user fills in Permanent Address textarea with "23 , rabat Morocco"
    And The user clicks on submit
    Then The output should show the Full Name as "amine"
    And The Email output should show "test@gmail.com"
    And The Current Address output should show "23 , rabat Morocco"
    And The Permanent Address output should show "23 , rabat Morocco"