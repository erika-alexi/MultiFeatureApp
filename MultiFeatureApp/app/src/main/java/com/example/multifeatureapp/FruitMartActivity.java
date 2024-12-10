package com.example.multifeatureapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class FruitMartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Scrollable layout for the snapshot
        ScrollView scrollView = new ScrollView(this);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
        ));

        // Add the ImageView with the FruitMart snapshot
        ImageView fruitMartSnapshot = new ImageView(this);
        fruitMartSnapshot.setImageResource(R.drawable.fruitmart); // Replace with your snapshot resource
        fruitMartSnapshot.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT
        ));
        fruitMartSnapshot.setAdjustViewBounds(true);

        // Add the ImageView to the layout
        layout.addView(fruitMartSnapshot);
        scrollView.addView(layout);

        // Set the content view to the scrollable layout
        setContentView(scrollView);
    }
}