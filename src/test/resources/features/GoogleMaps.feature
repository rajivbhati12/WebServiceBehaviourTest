@Service:GoogleMaps
Feature: The Google Maps web services are a collection of HTTP interfaces to Google services
  providing geographic data for your maps applications

@heartbeat
Scenario: To verify access to Google Maps Api
  Given the service api
  When I initiate the call
  Then I should get a success in response