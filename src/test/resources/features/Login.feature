Feature:Login Admin PT. Baratie
  Scenario:Success Login Admin
    Given admin on the login page
    When admin sign in with correct credentials
    And admin clicks login button
    Then admin should redirected to the dashboard Company page
