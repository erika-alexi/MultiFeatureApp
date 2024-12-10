package com.example.multifeatureapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    // Declare all CardViews
    private CardView cardCamera, cardGame, cardContacts, cardMessages, cardYouTube, cardFacebook, cardGallery, cardFruitMart;

    private static final int PERMISSION_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all CardViews
        cardCamera = findViewById(R.id.card_camera);
        cardGame = findViewById(R.id.card_game);
        cardContacts = findViewById(R.id.card_contacts);
        cardMessages = findViewById(R.id.card_messages);
        cardYouTube = findViewById(R.id.card_youtube);
        cardFacebook = findViewById(R.id.card_facebook);
        cardGallery = findViewById(R.id.card_gallery);
        cardFruitMart = findViewById(R.id.card_fruitmart);

        // Check and request permission for storage access if needed
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE);
            }
        }

        // Camera card action
        cardCamera.setOnClickListener(v -> {
            Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });

        // Game card action
        cardGame.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.riotgames.league.wildrift"));
            startActivity(intent);
        });

        // Contacts card action
        cardContacts.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
            startActivity(intent);
        });

        // Messages card action
        cardMessages.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"));
            startActivity(intent);
        });

        // YouTube card action
        cardYouTube.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(intent);
        });

        // Facebook card action
        cardFacebook.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
            startActivity(intent);
        });

        // Gallery card action
        cardGallery.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
            startActivity(intent);
        });

        // FruitMart card action
        cardFruitMart.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FruitMartActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
