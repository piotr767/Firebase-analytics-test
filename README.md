# FirebaseAnalyticsTest
A simple Android TV app to test firebase-analytics.

The app consists of 2 activities which enable the user
to test the option to disable automatic screen reporting.

The AnotherActivity contains 2 buttons
that allow user to log a screen view in 2 different ways:
1. using the (deprecated) setCurrentScreen method.
2. manually logging screen_view with logEvent(...).

AndroidManifest.xml contains the
google_analytics_automatic_screen_reporting_enabled
set to false, so neither setCurrentScreen nor moving between activities
should be logged as screen_view events in Firebase console.

To use the app you need to replace the app/google-services.json file
with a configuration file for your Firebase project.
