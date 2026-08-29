package org.example

/* To create a coroutine in Kotlin you need:
*  SUSPENDING FUNCTION: that suspend and resume long operation Function
*  COROUTINE SCOPE: the environment like withContext() in which it can run
*  COROUTINE BUILDERS: like CoroutineScope.launch{} to start it
*  A DISPATCHER: to control which thread it uses
* */