package com.example.easyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class create_task extends AppCompatActivity {
    Button addTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
        addTask = findViewById(R.id.button3);

        final Intent intent = new Intent(this, view_task.class);
        addTask.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}