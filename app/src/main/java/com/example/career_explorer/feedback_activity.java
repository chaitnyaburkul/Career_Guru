package com.example.career_explorer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;

import android.content.Intent;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.HashMap;

public class feedback_activity extends AppCompatActivity
{

    private EditText editTextFeedback,getName;
    private Button buttonSubmit;
    private DatabaseReference feedbackRef;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.nav_feedback);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {

                int id=item.getItemId();
                if( id == R.id.nav_home) {
                    startActivity(new Intent(getApplicationContext(), homepage.class));
                    overridePendingTransition(0,0);
                    return true;
                }
                if( id == R.id.nav_feedback) {

                    return true;
                }
                if( id == R.id.nav_aboutus) {
                    startActivity(new Intent(getApplicationContext(), AboutUs.class));
                    overridePendingTransition(0, 0);
                    return true;
                }



                return false;
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        feedbackRef = database.getReference("feedback");

        // Initialize views
        editTextFeedback = findViewById(R.id.editTextFeedback);
        getName = findViewById(R.id.getName);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Set click listener for submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitFeedback();
            }
        });
    }

    private void submitFeedback() {
        String feedbackText = editTextFeedback.getText().toString().trim();

        if (!feedbackText.isEmpty()) {
            // Generate a unique key for the feedback
            String feedbackId = feedbackRef.push().getKey();

            // Create a feedback object
            Feedback feedback = new Feedback(feedbackId, feedbackText);

            // Save the feedback to the database
            feedbackRef.child(feedbackId).setValue(feedback);

            // Clear the input field
            editTextFeedback.setText("");

            // Show success message
            Toast.makeText(this, "Feedback submitted successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Please enter your feedback", Toast.LENGTH_SHORT).show();
        }
    }


}

