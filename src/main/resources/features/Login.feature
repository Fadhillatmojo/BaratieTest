Feature:Login Admin PT. Baratie
  Scenario:Successful login with valid credentials
    Given admin on the login page
    When admin sign in with correct credentials
    Then admin should redirected to the admin Perusahaan page