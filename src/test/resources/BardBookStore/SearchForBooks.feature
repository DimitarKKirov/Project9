Feature: search for books, choose some books,put in basket,edit the basket,add to favourites

  Scenario:
    Given user is loged in "https://www.emag.bg/" webshop
    When user enter search keyword in the search field
    And pres the search button
    Then the user is redirected to the result page
    And the user chooses an item to add in favourites
