// File generated by FlutterFire CLI.
// ignore_for_file: type=lint
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] for use with your Firebase apps.
///
/// Example:
/// ```dart
/// import 'firebase_options.dart';
/// // ...
/// await Firebase.initializeApp(
///   options: DefaultFirebaseOptions.currentPlatform,
/// );
/// ```
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        return windows;
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyBQQTfMIoAbLaed5J6YhymGu6oFaT-YyjU',
    appId: '1:516374316450:web:7a26954e14e5959116defb',
    messagingSenderId: '516374316450',
    projectId: 'plant-care-ebbf8',
    authDomain: 'plant-care-ebbf8.firebaseapp.com',
    storageBucket: 'plant-care-ebbf8.firebasestorage.app',
    measurementId: 'G-ZHRV2BGJXL',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyDLSpoKOexzmZjxhp0r8BpYtXRI1iBWdQ4',
    appId: '1:516374316450:android:1f43f679ae11a10e16defb',
    messagingSenderId: '516374316450',
    projectId: 'plant-care-ebbf8',
    storageBucket: 'plant-care-ebbf8.firebasestorage.app',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyBE-SDYgUtYL82hm0Z8-GT-7Hu_XvVU_e0',
    appId: '1:516374316450:ios:1764bb8fa94ad21c16defb',
    messagingSenderId: '516374316450',
    projectId: 'plant-care-ebbf8',
    storageBucket: 'plant-care-ebbf8.firebasestorage.app',
    iosBundleId: 'com.example.plantCareApp',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'AIzaSyBE-SDYgUtYL82hm0Z8-GT-7Hu_XvVU_e0',
    appId: '1:516374316450:ios:1764bb8fa94ad21c16defb',
    messagingSenderId: '516374316450',
    projectId: 'plant-care-ebbf8',
    storageBucket: 'plant-care-ebbf8.firebasestorage.app',
    iosBundleId: 'com.example.plantCareApp',
  );

  static const FirebaseOptions windows = FirebaseOptions(
    apiKey: 'AIzaSyBQQTfMIoAbLaed5J6YhymGu6oFaT-YyjU',
    appId: '1:516374316450:web:c406b79173de823e16defb',
    messagingSenderId: '516374316450',
    projectId: 'plant-care-ebbf8',
    authDomain: 'plant-care-ebbf8.firebaseapp.com',
    storageBucket: 'plant-care-ebbf8.firebasestorage.app',
    measurementId: 'G-W660RWBCZH',
  );
}
