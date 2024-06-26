Feature: Update Company PT. Baratie

  Background: Admin Logged in and in the testimonial page
    Given admin on the login page
    When admin login with correct credentials
    Then admin must be directed to the admin dashboard

  Scenario: Update Company
    Given admin in the company page
    When admin clicks button edit company
    Then admin must be directed to the edit company page
    When admin enters company data to update
    And admin clicks update company button
    Then admin must be directed again to the company page
    And the data must been updated

