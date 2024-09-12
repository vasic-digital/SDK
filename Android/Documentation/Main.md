# IPC SDK Technical Documentation

The IPC SDK makes possible to extend the Android application with the additional functionality 
dynamically using the IPC and the 3rd party apps as the means of the extensibility.

The Client application is the main application, and the Extension application is the provider of 
the additional functionality. Communication goes in both directions and both application have to 
incorporate the SDK means.

## Application Permissions

In order to be able to communicate the Client and the Extension IPC applications have to define
the Android permissions.

### Defining the application permission(s)

Tbd.

## Registering the IPC SDK application

Since the Client and Extension IPC applications must be 'aware' of each other, we have to 
'register' them. Reregistration is performed in a couple of simple steps:

- Tbd.

## The IPC Protocol

The following steps represent the communication protocol:

- Client app sends request
- SDK app receives it
- Data is obtained and passed to SDK processor
- Data is processed
- Result is sent back

### IPC Request

Tbd.

#### IPC Request data

Tbd.

### IPC Response

Tbd.