# candidate

Usage

Run the application and go on http://localhost:8080/

Use the following urls to invoke controllers methods and see the interactions with the database:

candidate/create?email=[email]&name=[name]: create a new candidate with an auto-generated id and email and name as passed values.

candidate/delete?id=[id]: delete the candidate with the passed id.

candidate/get-by-email?email=[email]: retrieve the id for the candidate with the passed email address.

candidate/update?id=[id]&email=[email]&name=[name]: update the email and the name for the candidate indentified by the passed id.
