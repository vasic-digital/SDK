#!/bin/bash

./gradlew assembleProductionRelease appDistributionUploadProductionRelease

#firebase appdistribution:distribute --app "1:655267848300:android:1ed59e1d29690ad60c7849" --groups "Dev" \
#  --release-notes "The production test build" Application/build/outputs/apk/production/release/Application-production-release.apk