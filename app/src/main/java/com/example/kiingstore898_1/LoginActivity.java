package com.example.kiingstore898_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout emailTextInputLayout, passwordTextInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = findViewById(R.id.loginButton);
        Button registerButton = findViewById(R.id.registerButton);

        // Obtén las referencias de TextInputLayout
        emailTextInputLayout = findViewById(R.id.emailTextInputLayout);
        passwordTextInputLayout = findViewById(R.id.passwordTextInputLayout);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Valida el correo electrónico y la contraseña
                if (validateForm()) {
                    String email = emailTextInputLayout.getEditText().getText().toString().trim();
                    String password = passwordTextInputLayout.getEditText().getText().toString().trim();

                    // Verifica el correo electrónico y la contraseña específicos
                    if (email.equals("Matias") && password.equals("12345")) {
                        // Iniciar sesión exitosamente
                        startActivity(new Intent(LoginActivity.this, IntroActivity.class));
                        // Muestra un mensaje de confirmación
                        Toast.makeText(LoginActivity.this, "¡Inicio exitoso, Bienvenido Matias!", Toast.LENGTH_SHORT).show();

                    } else {
                        // Muestra un mensaje de error si las creqdenciales son incorrectas
                        Toast.makeText(LoginActivity.this, "Email y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Inicia la actividad de registro cuando se presiona el botón "Registrarse"
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }
    private boolean validateForm() {
        boolean isValid = true;

        String email = emailTextInputLayout.getEditText().getText().toString().trim();
        String password = passwordTextInputLayout.getEditText().getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            emailTextInputLayout.setError("Porfavor rellene este campo");
            isValid = false;
        } else {
            emailTextInputLayout.setError(null);
        }

        if (TextUtils.isEmpty(password)) {
            passwordTextInputLayout.setError("Porfavor rellene este campo");
            isValid = false;
        } else {
            passwordTextInputLayout.setError(null);
        }

        return isValid;
    }
}