@Task1
@allTasks
Feature:User could add any product from the discount part to shopping cart
  Scenario: User could add any product from the discount part to shopping cart
    When User opens today's deals
    And  User selects "Headphones" and "Grocery" from filters
    And User choose "10% off or more" from the discount part
    And User add item number "2" to the cart
    Then "Added to Cart" message is displayed