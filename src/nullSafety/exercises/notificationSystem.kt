package nullSafety.exercises

/*
Exercise 1
You are developing a notification system for an app where users can enable or disable
different types of notifications. Complete the getNotificationPreferences()
function so that:

1. The validUser variable uses the as? operator to check if user is an instance of the User class.
If it isn't, return an empty list.

2. The userName variable uses the Elvis ?: operator to ensure that the user's name
defaults to "Guest" if it is null .

3. The final return statement uses the .takeIf() function to include email and
SMS notification preferences only if they are enabled.

4. The main() function runs successfully and prints the expected output.

The takeIf() function returns the original value if the given condition is true, otherwise it returns
null . For example:*/


