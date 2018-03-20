# Setup:
# a. Need Google Api Key
# b. Enable GoogleMapsApi for Google Api Key via https://console.developers.google.com/apis/api/directions_backend?project=_

@Service-GoogleMapsApi
Feature: The Google Maps web services are a collection of HTTP interfaces to Google services
  providing geographic data for your maps applications

@Smoke
@Operation-directions
Scenario: User should be able to get driving directions between two location
  Given the service api
  And from Disneyland to Universal Studios Hollywood
  When I initiate the call for directions
  Then I should get a success in response

