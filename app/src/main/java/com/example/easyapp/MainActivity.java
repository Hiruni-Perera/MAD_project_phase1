package com.example.easyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button createTask;
    Button showTaskCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createTask = findViewById(R.id.button1);
        showTaskCategory = findViewById(R.id.button2);

        final Intent intent = new Intent(this, create_task.class);
        final Intent intent1 = new Intent(this, task_category.class);

        createTask.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                startActivity(intent);
            }
        });
        showTaskCategory.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}