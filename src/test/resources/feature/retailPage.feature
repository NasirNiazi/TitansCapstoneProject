Feature: Retail Test Environment
  @run
  Background: 
    Given User is on Retail page
    And User click on MyAccount
    When User Click on login
    And User enter userName "cali.titans@tekschool.us" and password "cali123"
    And User click to login button
    Then User should be logged in to MyAccount dashbourd

  @register
  Scenario: Register as an Affiliate user with Cheue Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affliate form with below information
      | Company | website       | taxID | PaymentMethod | payename |
      | Afghan  | Afghan123.com |  3232 | cheque        | paypal   |
    And User check on About us check box
    And User click on Continue button
    Then User should see a seccess massege
#
  #@information
  #Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    #When User click on ‘Edit your affiliate informationlink
    #And user click on Bank Transfer radio button
    #And User fill Bank information with below information|bankName|abaNumber|swiftCode|accountName|accountNumber|
    #And User click on Continue button
    #Then User should see a success message
#
  #@AccountInfo
  #Scenario: Edit your account Information
    #When User click on ‘Edit your account information’ link
    #And User modify below information |firstname|lastName|email|telephone|
    #And User click on continue button
    #Then User should see a message ‘Success: Your account has been successfully updated.’
