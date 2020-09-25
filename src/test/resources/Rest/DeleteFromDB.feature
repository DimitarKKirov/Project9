Feature: delete entry from DB

  Scenario Outline:
    Given user have access to "http://dummy.restapiexample.com"
    When user gives "<ID>" of the emplyee
    Then the emplyees who are with this IDs are deleted
    Examples:
      | ID |
      |7744|
      |7743|