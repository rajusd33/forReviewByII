Feature: Verify "Dont See your Size" link and complete popup Window

Scenario: Verify "Dont See your Size" link and complete popup Window
	Given User has navigated to  Zappos Keen Utility Pitts Burgh Boot purchase page
	When user click on "Don't see your size" link
	Then a New window appears and user move to new window
	And enter email address in email text box as myemail@yahoo.com
	And choose color from menu
	And choose size from size menu
	And choose Width from Width Menu
	And click on Notify me button
	Then Thank You message displayed