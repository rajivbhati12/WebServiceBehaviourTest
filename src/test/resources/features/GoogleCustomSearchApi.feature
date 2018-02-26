@Service:GoogleCustomSearchApi
Feature: The JSON/Atom Custom Search API lets you develop websites and applications to retrieve and
  display search results from Google Custom Search programmatically.

@heartbeat
Scenario: To verify access to Google api
  Given the service api
  When I initiate the call
  Then I should get a success in response