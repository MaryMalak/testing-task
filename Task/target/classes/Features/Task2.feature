@Task2
@allTasks
Feature: KSRTC Website
  Scenario: User could book a tour successfully
    When User choose CHIKKAMAGALURU to BENGALURU from the popular routes
    And click the arrival date only
    And click Search for bus
    And select a seat
    And Choose available seat( row"8" column "3")
    And Choose the boarding point and dropping point
    And Fill the Customer details (phone number:"6789125987" & email "mmmmm@gmail.com")
    And Fill the Passenger details

