Feature: Feature to test compose and schedule a new email in Gmail

	Scenario: Compose a new email and schedule it for sending

		Given a person is logged into Gmail
		When the person clicks on the compose button
		And a new mail dialog box is open
		And the person composes a new email
		And the person clicks on the down arrow button next to the send button
		And the person selects a date and time to schedule the email for sending
		Then the email is scheduled for sending