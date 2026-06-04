Feature: SauceDemo Automation Suite

  Background:
    Given I am on the login page

  @Smoke
  Scenario: Successful login with standard user
    When I enter username "standard_user" and password "secret_sauce"
    And I click the login button
    Then I should be redirected to the inventory page

  @Negative
  Scenario: Login with locked out user
    When I enter username "locked_out_user" and password "secret_sauce"
    And I click the login button
    Then I should see an error message containing "Sorry, this user has been locked out"

  @CSVLogin
  Scenario: Login using data from CSV file
    When I login using credentials from "src/test/resources/data/users.csv"
    Then I should be redirected to the inventory page

  @Regression
  Scenario Outline: Test different user roles
    When I enter username "<username>" and password "<password>"
    And I click the login button
    Then I should be redirected to the inventory page

    Examples:
      | username                | password     |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |