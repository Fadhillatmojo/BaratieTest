#Feature: cok
#
#  Background: Admin logged in
#    Given admin is on the login page
#    When admin sign in with correct credentials
#    Then admin must be directed to the admin dashboard
#
#  Background: Admin on the testimonial page
#    When admin clicks testimonial menu
#    Then admin must be directed to the testimonial page
#
#  Scenario: Create testimonial
#    Given admin in the testimonial page
#    When admin clicks button create testimonial
#    Then admin must be directed to the create testimonial page
#    When admin enters testimonial data
#    And admin clicks add testimonial button
#    Then admin must be directed again to the testimonial page
#    And the data must appear in table
