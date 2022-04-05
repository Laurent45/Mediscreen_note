#!/bin/sh

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr James",
    "patientId": "1",
    "report": "Patient states that they are feeling terrific Weight at or below recommended level"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Parker",
    "patientId": "2",
    "report": "Patient states that they are feeling a great deal of stress at work Patient also complains that their hearing seems Abnormal as of late"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Clark",
    "patientId": "2",
    "report": "Patient states that they have had a Reaction to medication within last 3 months. Patient also complains that their hearing continues to be problematic"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr MacDonald",
    "patientId": "3",
    "report": "Patient states that they are short term Smoker"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr MacDonald",
    "patientId": "3",
    "report": "Patient states that they quit within last year Patient also complains that of abnormal breathing spells Lab reports Cholesterol LDL high"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Clark",
    "patientId": "4",
    "report": "Patient states that walking up stairs has become difficult Patient also complains that they are having shortness of breath Lab results indicate Antibodies present elevated Reaction to medication"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Parker",
    "patientId": "4",
    "report": "Patient states that they are experiencing back pain when seated for a long time"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Parker",
    "patientId": "4",
    "report": "Patient states that they a short term Smoker Hemoglobin A1C above recommended level"
}'

curl --location --request POST 'localhost:8080/api/v1/notePatient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "practitionerName": "Dr Doe",
    "patientId": "4",
    "report": "Patient states that Body Height, Cholesterol, Dizziness and Reaction."
}'
