# **📱 MultiFeatureApp: Android Mobile Application**  

---

## **🎯 Project Overview**  
**MultiApp** is an advanced Android mobile application that provides quick access to essential functionalities such as Camera, Games, Contacts, Messages, YouTube, Facebook, and Gallery. Built with Android Studio, it uses **Intents**, **Permissions**, and **Material Design** to ensure seamless and professional user interaction.  

**What the project does:**

The MultiFeatureApp is an Android application that offers users easy access to a variety of features through a simple and intuitive interface. It includes functions such as taking photos, browsing games, managing contacts, sending messages, and viewing galleries. Additionally, it provides links to external websites like YouTube and Facebook. The app also features a unique "FruitMart" activity, dedicated to fruit-related content, which is currently displayed as a scrollable snapshot with no functionality.

**Why the project is useful:**

This project is valuable because it combines multiple frequently used features into a single app, streamlining tasks and reducing the need for users to switch between different applications. It acts as an all-in-one platform for entertainment, communication, and productivity.

**How users can get started with the project:**

Users can begin by installing the app and granting the necessary permissions (such as access to external storage). After launching the app, they can navigate through the various cards, each representing a different feature (e.g., camera, game, contacts, messages). Tapping on a card will lead to the corresponding functionality, providing a smooth and convenient user experience.

---

## **✨ Key Features Summary**  
1. **📸 Camera Access:** Captures real-time photos using the device’s camera.  
2. **🎮 Game Redirection:** Links to the "League of Legends: Wild Rift" Play Store page.  
3. **📇 Contacts Access:** Opens the phone's contact list.  
4. **💬 Messages Launcher:** Launches the messaging app.  
5. **▶️ YouTube Access:** Redirects to the YouTube homepage.  
6. **📘 Facebook Access:** Opens the official Facebook page.  
7. **🖼️ Gallery Access:** Opens a custom-built gallery feature.  
8. **🍇 FruitMart Feature:** Redirects to the in-app FruitMart section.

---

## **🔒 Permissions Required**  
- **📷 Camera Access:** For capturing photos.  
- **📂 Storage Access:** For media file access.  
- **🌐 Internet Access:** For web-based functionalities.  

---

## **🏗️ Application Structure**  
1. **📜 MainActivity.java:** Core logic for app navigation.  
2. **📐 activity_main.xml:** Defines the UI layout.  
3. **🗂️ AndroidManifest.xml:** Declares permissions and app components.  

---

## **🚀 Core Functionalities Explained**

### **📸 1. Camera Access**  
The app uses **Intent** to launch the system camera for capturing photos.  

```java
cardCamera.setOnClickListener(v -> {
    Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivity(intent);
});
```

---

### **🎮 2. Game Redirection**  
Redirects to the Play Store page for "League of Legends: Wild Rift" using a **Web Intent**.  

```java
cardGame.setOnClickListener(v -> {
    Intent intent = new Intent(Intent.ACTION_VIEW, 
        Uri.parse("https://play.google.com/store/apps/details?id=com.riotgames.league.wildrift"));
    startActivity(intent);
});
```

---

### **📇 3. Contacts Access**  
Launches the device's contacts app using **ContactsContract API**.  

```java
cardContacts.setOnClickListener(v -> {
    Intent intent = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
    startActivity(intent);
});
```

---

### **💬 4. Messages Launcher**  
Opens the default messaging app using **Intent.ACTION_VIEW** with "sms:" URI.  

```java
cardMessages.setOnClickListener(v -> {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"));
    startActivity(intent);
});
```

---

### **▶️ 5. YouTube Redirection**  
Redirects to YouTube’s homepage through a **Web Intent**.  

```java
cardYouTube.setOnClickListener(v -> {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
    startActivity(intent);
});
```

---

### **📘 6. Facebook Redirection**  
Launches the Facebook homepage through a **Web Intent**.  

```java
cardFacebook.setOnClickListener(v -> {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
    startActivity(intent);
});
```

---

### **🖼️ 7. Gallery Access**  
Opens the custom-built gallery activity inside the app.  

```java
cardGallery.setOnClickListener(v -> {
    Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
    startActivity(intent);
});
```

---

### **🍇 8. FruitMart Access**  
Launches the in-app **FruitMart** section.  

```java
cardFruitMart.setOnClickListener(v -> {
    Intent intent = new Intent(MainActivity.this, FruitMartActivity.class);
    startActivity(intent);
});
```

---

### **🔒 9. Permissions Handling**  
The app checks and requests permissions at runtime for devices running Android 6.0+ (API 23). If denied, a notification is displayed using **Toast messages**.  

```java
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
    if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) 
        != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(this, 
            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
    }
}
```

**Permission Result Handler:**  

```java
@Override
public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    if (requestCode == PERMISSION_REQUEST_CODE) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Permission Granted ✅", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Permission Denied ❌", Toast.LENGTH_SHORT).show();
        }
    }
}
```

---

## **📝 Conclusion**  
The **MultiApp** project successfully integrates Android **Intents**, **Permissions**, and **UI Design** principles using **Material Design**. It ensures seamless access to mobile functions and external services while offering a clean, modern interface.  
