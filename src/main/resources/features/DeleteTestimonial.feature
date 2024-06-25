Feature: Create Testimonial PT. Baratie

  Background: Admin Logged in and in the testimonial page
    Given admin on the login page
    When admin login with correct credentials
    Then admin must be directed to the admin dashboard
    When admin clicks testimonial menu
    Then admin must be directed to the testimonial page

  Scenario: Delete testimonial
    Given admin in the testimonial page
    When admin clicks button delete testimonial
    And admin clicks button yes, im sure
    Then the data must deleted from table
