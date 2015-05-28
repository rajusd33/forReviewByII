Feature: Navigation and verify Size, Width Selection controls
 
Scenario: Navigatioin and Verify if size and width selection are displayed
	Given User has Navigated to Zappos home page
	When User selects shoes from mens menu
	Then New page should appear with mens Item
	When User selects boots from shoes menu
	Then a new page should appear with all boots
	When user select Keen Utility brand from sort menu
	And Select Keep Utility Pitts burgh boots
	Then Browser should navigate to Add to cart page
	When user select Add to cart without selecting size/width
	Then Please select a Size and Please select a width appear
	
