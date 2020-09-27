@Show
Feature: delete entry from DB

  Scenario Outline:
    Given user have access to "http://dummy.restapiexample.com"
    When user gives "<ID>" of the employees
    Then the employees who are with this "<ID>" are deleted
    Examples:
      | ID |
      |7746|
      |7745|