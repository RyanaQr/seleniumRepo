Feature: Starred Mail Management
  As a user
  I want to mark an email with a star
  So that I can easily find it later in the starred mail section

  Scenario: User marks an email and verifies it appears in starred mail
    Given the user is logged into the gmail application
    And the user has at least one email in the inbox
    When the user marks an email with a star
    Then the email should be visible in the starred mail section
    And the email should remain accessible from the inbox