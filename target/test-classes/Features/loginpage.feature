Feature: Test login functionality

  Scenario Outline: login with valid and Invalid credentials
    Given user opens the browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "<email>" and password as "<password>"
    And user click on login button
    Then the page with title should be "Dashboard / nopCommerce administration" is displayed
    When user clicks on the logout lik
    Then the page title should be "Your store. Login"
    And close the browser

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | dcr      |
      | dcr@gmail.com       | admin    |
      | dcr@gmail.com       | dcr      |