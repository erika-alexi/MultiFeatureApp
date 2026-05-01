# MultiFeatureApp - Android Mobile Application

## Project Overview
MultiFeatureApp is an Android application built using Android Studio that integrates multiple essential mobile functions into a single platform. It uses Intents, runtime permissions, and Material Design to provide a simple and efficient user experience.

The app includes features such as camera access, contacts, messaging, web redirections, and media viewing. It also contains an in-app FruitMart section, currently implemented as a scrollable UI without full functionality.

## Purpose
The application is designed to combine frequently used mobile features into one app, reducing the need to switch between multiple applications. It serves as an all-in-one tool for communication, entertainment, and basic device utilities.

## Features
- Camera access for capturing photos  
- Play Store redirection for games  
- Contacts app integration  
- Messaging (SMS intent)  
- YouTube and Facebook web redirection  
- Custom gallery activity  
- FruitMart in-app section  

## Permissions
- Camera access  
- Storage access  
- Internet access  

## Project Structure
- MainActivity.java – Handles navigation and feature intents  
- activity_main.xml – Defines the user interface layout  
- AndroidManifest.xml – Declares permissions and app components  
- GalleryActivity.java – Custom gallery feature  
- FruitMartActivity.java – In-app FruitMart section  

## Core Functionality
The app uses Android Intents to launch system apps and external services. It also implements runtime permission handling for Android 6.0 and above to ensure secure access to device features.

## How to Run
1. Clone the repository  
2. Open the project in Android Studio  
3. Sync Gradle files  
4. Run the app on an emulator or physical device  

## Conclusion
MultiFeatureApp demonstrates the integration of multiple Android components into a single application. It applies core Android development concepts such as Intents, permissions, and UI design to create a functional and user-friendly mobile application.
