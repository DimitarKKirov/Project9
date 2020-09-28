@Show
Feature: using http://www.dneonline.com/calculator.asmx?WSDL for calculation operations

  Scenario Outline: addition

    Given user have access to the calculator at "http://www.dneonline.com/calculator.asmx?WSDL" and "<action>"
    When user enters integer <one> and <tow> to be added
    Then the two numbers are calculated correctly
    Examples:
      | one | tow |action|
      | 23  | 24  |Add   |
      | 32  | 37  |Add   |

  Scenario Outline: subtraction
    Given user have access to the calculator at "http://www.dneonline.com/calculator.asmx?WSDL" and "<action>"
    When user enters integer <one> and <tow> that are to be subtracted
    Then the two numbers are calculated correctly by the function
    Examples:
      | one | tow |action|
      | 33  | 24  |Subtract|
      | 42  | 37  |Subtract|


  Scenario Outline: multiplication
    Given user have access to the calculator at "http://www.dneonline.com/calculator.asmx?WSDL" and "<action>"
    When user enters integer <one> and <tow> that are to be multiplied
    Then the two numbers are calculated correctly by the multiply function
    Examples:
      | one | tow |action|
      | 2  | 24  |Multiply|
      | 3  | 37  |Multiply|