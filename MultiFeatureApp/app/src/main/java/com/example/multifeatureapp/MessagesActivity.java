package com.example.multifeatureapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MessagesActivity extends AppCompatActivity {

    ListView listViewMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        listViewMessages = findViewById(R.id.listViewMessages);

        String[] messages = {"Alex: Hello!", "John: What's up?", "Mary: See you soon!"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, messages);
        listViewMessages.setAdapter(adapter);
    }
}
