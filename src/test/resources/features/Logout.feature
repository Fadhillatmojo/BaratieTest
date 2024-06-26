Feature: Logout Admin PT. Baratie

  Background: Login Admin PT. Baratie
    Given admin is on the login page
    When admin log in with correct credentials
    Then admin must be directed to the company dashboard

  Scenario: Logout from admin dashboard
    Given admin logged in as admin
    When admin clicks the logout button
    And admin clicks sure logout
    Then admin must be directed to the login page
