package com.hfad.juisinyourpocket;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private FirebaseAuth mAuth;
    private EditText mEmail;
    private EditText mPass;
    private Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        toolbar = findViewById(R.id.signUpToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Create User");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mAuth = FirebaseAuth.getInstance();
        mEmail = findViewById(R.id.userET);
        mPass = findViewById(R.id.passET);
        signupBtn = findViewById(R.id.SignUpBtn);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = mEmail.getText().toString();
                String pass = mPass.getText().toString();

                if (user.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter Your Mail/UserName", Toast.LENGTH_SHORT).show();
                }
                if (pass.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Enter Your PASSWORD", Toast.LENGTH_SHORT).show();
                } else {
                    register_user(user, pass);
                }


            }
        });
    }

    //TODO:CREATE A NEW ACCOUNT
    private void register_user(String user, String pass) {

        mAuth.createUserWithEmailAndPassword(user, pass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                            startActivity(intent);
                            Toast.makeText(SignUpActivity.this, "Account Created!", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                        else{
                            Toast.makeText(SignUpActivity.this, "Authentication failed!!!" + task.getException(),
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}
