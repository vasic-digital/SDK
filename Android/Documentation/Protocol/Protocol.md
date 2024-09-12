# The IPC SDK Protocol

The IPC SDK Protocol makes possible to extend the Android application with additional functionality 
dynamically using the IPC communication and 3rd party apps.

The Client application is the main application, and the Extension application is the provider of 
the additional functionality. Communication goes in both directions and both apps have to incorporate the
SDK means.

## Permissions

In order to be able to communicate the Client and the Extension SDK IPC apps have to define its Android permission.

### Defining the permission

Tbd.

## Registering the IPC SDK application

Since the Client and Extension SDK IPC apps must be 'aware' of each other, we have to 'register' them.

### Registering an Extension

The following steps are required so the applications could recognize themselves:

Tbd.

## Protocol specs

The following steps represent the communication protocol:

- Client app sends request
- SDK app receives it
- Data is obtained and passed to SDK processor
- Data is processed
- Result is sent back

### SDK IPC Request

Tbd.

#### SDK IPC Request data

Tbd.

### SDK IPC Response

Tbd.