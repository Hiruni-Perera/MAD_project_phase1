package com.example.easyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class view_task extends AppCompatActivity {
    Button markAsDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_task);
        markAsDone = findViewById(R.id.button6);

        final Intent intent = new Intent(this, progress_task.class);
        markAsDone.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
