Feature: Feature to test Gmail to compose and send a new email.

	Scenario: Compose a new mail and send it

		Given a user is logged into Gmail
		When the user clicks on the compose button
		And a new mail dialog box is displayed
		And the user composes a new email
		And the user clicks on the send button
		Then the email is sent