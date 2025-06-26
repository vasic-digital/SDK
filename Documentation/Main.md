# IPC SDK Technical Documentation

The IPC SDK makes possible to extend the Android application with the additional functionality 
dynamically using the IPC and the 3rd party apps as the means of the extensibility.

The Client application is the main application, and the Extension application is the provider of 
the additional functionality. Communication goes in both directions and both application have to 
incorporate the SDK means.

## Application Permissions

In order to be able to communicate the Client and the Extension IPC applications have to define
the Android permissions.

### Defining the applications permissions

SDK depends on the [Android Toolkit](https://github.com/red-elf/Android-Toolkit) which is the Git 
submodule of the SDK. If you clone the SDk repository it is also required to initialize and clone 
its Git submodule(s). 

To define the permission for the Client or Extension application main (root) `build.gradle` file has 
to define the `interprocess_permission` property. The following snippet shows example of such configuration 
which defines the permission of the application and other [Android Toolkit](https://github.com/red-elf/Android-Toolkit) 
required properties:

```groovy
buildscript {

    ext {

        kotlin_version = '2.2.0'

        interprocess_permission = "com.example.extensions.hello" // <--- HERE!

        toolkit_version = '2.0.2'
        toolkit_context = ':Toolkit'
        toolkit_project_name = 'EXAMPLE'
    }

    // ... etc.
}
```

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

## Application file data format

- Served as structured JSON (with custom extension .boba) registered by the SDK / Application
- The following properties will be contained:

```json
{
  "file_version": 1,
  "protocol": "http / magnet / torrent / etc",
  "protocol_information": "string",
  "content": [
    "url / magnet link / torrent file / etc",
    "url / magnet link / torrent file / etc",
    "..."
  ],
  "author": "string",
  "date_created": "date_time",
  "date_modified": "date_time",
  "version": 1,
  "description": "string",
  "short_description": "string",
  "media_type": "music / video / application / game / document / file / etc_tbd",
  "media_subtype": "mp3 / flac / pdf / epub / etc_tbd",
  "platform": "none / all / macos / windows / ps / ps2 / ps3 / ps4 / nsw / linux / etc_tbd",
  "thumb": "string",
  "cover": "string",
  "large_cover": "string",
  "protected": false,
  "expires": "date_time"
}
```

## Supported content

- HTTP urls
- Torrent / Magnet
- UseNext
- Tbd.