Feature: Logout Admin PT. Baratie

  Background: Login Admin PT. Baratie
    Given admin is on the login page
    When admin enters username "admin" and password "rahasia123"
    Then admin must be directed to the admin dashboard

  Scenario: Logout from admin dashboard
    Given admin logged in as admin
    When admin clicks the logout button
    Then admin must be directed to the login page
