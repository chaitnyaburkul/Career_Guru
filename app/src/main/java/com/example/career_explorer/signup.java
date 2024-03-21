package com.example.career_explorer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {

    TextView switchloginpage;

    Button signup;

    EditText signupemail,signuppassword;

    FirebaseAuth mauth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.signupbtn);
        switchloginpage=findViewById(R.id.newsignup);
        switchloginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.career_explorer.signup.this, signin.class);
                startActivity(intent);
            }
        });

        signupemail=findViewById(R.id.email);
        signuppassword=findViewById(R.id.pass);
        mauth=FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createuser();
            }



            private void createuser() {

                String useremail = signupemail.getText().toString();
                String userpass = signuppassword.getText().toString();
                mauth.createUserWithEmailAndPassword(useremail,userpass).addOnCompleteListener(com.example.career_explorer.signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signup.this, "successfully created", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(signup.this, "Failed", Toast.LENGTH_SHORT).show();
                        }
            }
        });














    }
});
    }
}