$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleCustomSearchApi.feature");
formatter.feature({
  "line": 2,
  "name": "The JSON/Atom Custom Search API lets you develop websites and applications to retrieve and",
  "description": "display search results from Google Custom Search programmatically.",
  "id": "the-json/atom-custom-search-api-lets-you-develop-websites-and-applications-to-retrieve-and",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Service-GoogleCustomSearchApi"
    }
  ]
});
formatter.before({
  "duration": 556443292,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "To verify access to Google api",
  "description": "",
  "id": "the-json/atom-custom-search-api-lets-you-develop-websites-and-applications-to-retrieve-and;to-verify-access-to-google-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@heartbeat"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the service api",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I initiate the call",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should get a success in response",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonImpl.setServiceApi()"
});
formatter.result({
  "duration": 103282928,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.initiateCall()"
});
formatter.result({
  "duration": 561181750,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.verifySuccessfulResponse()"
});
formatter.result({
  "duration": 1513691,
  "status": "passed"
});
formatter.after({
  "duration": 17278,
  "status": "passed"
});
formatter.uri("GoogleMapsApi.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Setup:"
    },
    {
      "line": 2,
      "value": "# a. Need Google Api Key"
    },
    {
      "line": 3,
      "value": "# b. Enable GoogleMapsApi for Google Api Key via https://console.developers.google.com/apis/api/directions_backend?project\u003d_"
    }
  ],
  "line": 6,
  "name": "The Google Maps web services are a collection of HTTP interfaces to Google services",
  "description": "providing geographic data for your maps applications",
  "id": "the-google-maps-web-services-are-a-collection-of-http-interfaces-to-google-services",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@Service-GoogleMapsApi"
    }
  ]
});
formatter.before({
  "duration": 46751648,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to get driving directions between two location",
  "description": "",
  "id": "the-google-maps-web-services-are-a-collection-of-http-interfaces-to-google-services;user-should-be-able-to-get-driving-directions-between-two-location",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    },
    {
      "line": 10,
      "name": "@Operation-directions"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the service api",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "from Disneyland to Universal Studios Hollywood",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I initiate the call for directions",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should get a success in response",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonImpl.setServiceApi()"
});
formatter.result({
  "duration": 159579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Disneyland",
      "offset": 5
    },
    {
      "val": "Universal Studios Hollywood",
      "offset": 19
    }
  ],
  "location": "GoogleMapsApi.setSourceDestination(String,String)"
});
formatter.result({
  "duration": 5112504,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.initiateCall()"
});
formatter.result({
  "duration": 1828836346,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.verifySuccessfulResponse()"
});
formatter.result({
  "duration": 16686,
  "status": "passed"
});
formatter.after({
  "duration": 6657,
  "status": "passed"
});
});