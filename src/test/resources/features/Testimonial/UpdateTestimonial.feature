Feature: Update Testimonial PT. Baratie

  Background: Admin Logged in and in the testimonial page
    Given admin on the login page
    When admin login with correct credentials
    Then admin must be directed to the admin dashboard
    When admin clicks testimonial menu
    Then admin must be directed to the testimonial page

  Scenario: Update testimonial
    Given admin in the testimonial page
    When admin clicks button edit testimonial
    Then admin must be directed to the edit testimonial page
    When admin enters testimonial data to update
    And admin clicks update testimonial button
    Then admin must be directed again to the testimonial page
    And the data must been updated in table
