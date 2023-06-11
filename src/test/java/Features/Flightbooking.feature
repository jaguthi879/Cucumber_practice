Feature: User should book a flight

  @p200
  Scenario: Successful flight booking with valid data
    Given User should navigate to Mercury tours page
    When user click on flights
    Then fill the flight details
    And select the prefernces
    Then click on continue
    Then Flight Reservation message should display
