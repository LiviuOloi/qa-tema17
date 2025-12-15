Feature: Create post on feed
In order to share content
As a logged in user
I want to create posts on the feed


Scenario: User adds a new post on feed using DataTable
Given I am logged on the feed page as "liviu.oloi@yahoo.com" with password "Poli1993!"
When I create a new post with the following details:
| description | My first post |
Then the post should appear on the feed