Feature: Contains Test cases regarding Deal Zone Page

Background:
Given Open urbanLadder
When hover on Deal Zone

Scenario: Check if Irresistibly Good Deals page is launched
Given Click on Irresistibly Good Deals
And Click on Exclude Out Of Stock
Then Check If In Stock Option is Displayed

