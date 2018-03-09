$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleMapsApi.feature");
formatter.feature({
  "line": 2,
  "name": "The Google Maps web services are a collection of HTTP interfaces to Google services",
  "description": "providing geographic data for your maps applications",
  "id": "the-google-maps-web-services-are-a-collection-of-http-interfaces-to-google-services",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Service-GoogleMapsApi"
    }
  ]
});
formatter.before({
  "duration": 451719310,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "To verify access to Google Maps Api",
  "description": "",
  "id": "the-google-maps-web-services-are-a-collection-of-http-interfaces-to-google-services;to-verify-access-to-google-maps-api",
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
  "duration": 82058207,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.initiateCall()"
});
formatter.result({
  "duration": 1390343299,
  "status": "passed"
});
formatter.match({
  "location": "CommonImpl.verifySuccessfulResponse()"
});
formatter.result({
  "duration": 1730922,
  "error_message": "java.lang.AssertionError: expected:\u003c404\u003e but was:\u003c200\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat test.java.steps.CommonImpl.verifySuccessfulResponse(CommonImpl.java:37)\n\tat ✽.Then I should get a success in response(GoogleMapsApi.feature:9)\n",
  "status": "failed"
});
formatter.after({
  "duration": 29838,
  "status": "passed"
});
});