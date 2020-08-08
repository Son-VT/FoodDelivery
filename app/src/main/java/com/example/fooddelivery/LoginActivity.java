package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    Button btnLogin;
    TextView txtSignUp;
    TextInputLayout inputEmail,inputPass;
    TextInputEditText edtemail, edtpassword;
    ProgressBar pb;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        mAuth = FirebaseAuth.getInstance();
        btnLogin = findViewById(R.id.btnSignIn);
        txtSignUp = findViewById(R.id.txtSignUp);
        edtemail = findViewById(R.id.edtEmail);
        edtpassword = findViewById(R.id.edtPassword);
        inputEmail = findViewById(R.id.inputEmail);
        inputPass = findViewById(R.id.inputPass);
        edtemail.addTextChangedListener(new LoginActivity.ValidationTextWatcher(edtemail));
        edtpassword.addTextChangedListener(new LoginActivity.ValidationTextWatcher(edtpassword));

        pb = findViewById(R.id.pbLogin);

        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), BottomNavigation.class));
            finish();
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validateEmail() & validatePassword() == true){
                    String email = edtemail.getText().toString();
                    String pass = edtpassword.getText().toString();

                    pb.setVisibility(View.VISIBLE);

                    mAuth.signInWithEmailAndPassword(email, pass)
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(LoginActivity.this, "Đăng nhập thành công",
                                                Toast.LENGTH_SHORT).show();
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Intent i = new Intent(LoginActivity.this, BottomNavigation.class);
                                        startActivity(i);
                                        finish();
                                    } else {
                                        Toast.makeText(LoginActivity.this, "Đăng nhập thất bại",
                                                Toast.LENGTH_SHORT).show();
                                        pb.setVisibility(View.GONE);
                                    }
                                }
                            });

                }
            }
        });
        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }
    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
        private boolean validatePassword() {
            if (edtpassword.getText().toString().trim().isEmpty()) {
                inputPass.setError("Bắt buộc nhập mật khẩu");
                requestFocus(edtpassword);
                return false;
            }else if(edtpassword.getText().toString().length() < 6){
                inputPass.setError("Mật khẩu phải là 6 ký tự");
                requestFocus(edtpassword);
                return false;
            }else {
                inputPass.setErrorEnabled(false);
            }
            return true;
        }
        private boolean validateEmail() {
            if (edtemail.getText().toString().trim().isEmpty()) {
                inputEmail.setError("Bắt buộc nhập mật Email");
                requestFocus(edtemail);
                return false;
            } else {
                String emailId = edtemail.getText().toString();
                Boolean  isValid = android.util.Patterns.EMAIL_ADDRESS.matcher(emailId).matches();
                if (!isValid) {
                    inputEmail.setError("Sai định dạng Email, ex: abc@example.com");
                    requestFocus(edtemail);
                    return false;
                } else {
                    inputEmail.setErrorEnabled(false);
                }
            }
            return true;
        }
    private class ValidationTextWatcher implements TextWatcher {

        private View view;

        private ValidationTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.edtEmail:
                    validateEmail();
                    break;
                case R.id.edtPassword:
                    validatePassword();
                    break;
            }
        }
    }
}