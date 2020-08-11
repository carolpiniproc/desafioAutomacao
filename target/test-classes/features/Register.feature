#language:en

Feature: Validate form for new registration
I want to full fill the form and complete my registration.

  @validaForm
  Scenario: Validate the form
    Given Im on a register form as "Automation Demo Site"
    When I type my first name as "Carol"
    And I complete the form with my valid data
    And I click on submit button
    Then I have completed my registration
