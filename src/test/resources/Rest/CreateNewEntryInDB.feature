@Show
Feature: adding employ data to DB

  Scenario Outline: Create an entry in the DB,Retrieve information from the DB

    Given user have access to "http://dummy.restapiexample.com"
    When user enter "<employee name>","<employee salary>","<employee age>"
    Then the user will create new entry in DB
    Examples:
      | employee name        | employee salary | employee age |
      | Abigail Grater       | 2600.35         | 22           |
      | Augusta Wind         | 2650            | 24           |
      | Anita Letterback     | 2543            | 35           |
      | Con Staninterupshuns | 2762            | 29           |
      | Ivan Notheridiya     | 2968            | 30           |
      | Mustafa Leek         | 3987            | 38           |

