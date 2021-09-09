Feature: Search cruises to The Bahamas

  As a user
  I want to search cruises with duration between 6 and 9 days
  To choose one sale and learn more about the trip

  @UserStory1
  Scenario: Search cruises to The Bahamas between 6 and 9 days
    Given the user is in the page
    When they search a cruise
    Then they should see the result grid
    Then all the results must have a duration between 6 and 9 days
    Then they should see prices sorted in increasing order

  Scenario: Apply pricing filter
    Given the user is in the page
    When they search a cruise
    And they displayed pricing filter
    Then they should see that the results collection is adjusted by the filter values
