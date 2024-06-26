Feature: Create Testimonial PT. Baratie

  Background: Admin Logged in and in the testimonial page
    Given admin on the login page
    When admin login with correct credentials
    Then admin must be directed to the admin dashboard
    When admin clicks testimonial menu
    Then admin must be directed to the testimonial page

  Scenario: Create testimonial
    Given admin in the testimonial page
    When admin clicks button create testimonial
    Then admin must be directed to the create testimonial page
    When admin enters testimonial data
    And admin clicks add testimonial button
    Then admin must be directed again to the testimonial page
    And the data must appear in table
