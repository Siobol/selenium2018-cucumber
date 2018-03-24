Feature: login
  Scenario: Admin user successfull login
    Given I open login page
    When I enter email "administrator@testarena.pl"
    And I enter password "sumXQQ72$L"
    And I click login button
    Then I am logged in
    And I wait 5 seconds

    Scenario: Admin user unsuccessfull login without credentials
      Given I open login page
      When I click login button
      Then I'm not logged in
      And I wait 3 seconds seconds