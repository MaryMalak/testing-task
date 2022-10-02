@Task1
@allTasks

Feature:User could search and add any product to shopping cart

  Scenario: User could add products shopping cart
    When User types "car accessories" in the search
    And User Selects the first Item from the results
    And If this item is available in stock user Adds it to the cart
    Then "Added to Cart" message is displayed
