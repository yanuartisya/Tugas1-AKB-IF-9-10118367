package net.abk.a10118367_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//06-04-2021-10118367_YanuarTisyaDwiPutra_IF-9
public class LoginActivity extends AppCompatActivity {
    private Button btnlogin;
    private Button btnregistrasi;
    EditText etUsername;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        btnlogin = findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = etUsername.getText().toString();
                Intent main = new Intent(LoginActivity.this, MainActivity.class);
                main.putExtra("username",username);
                startActivity(main);
            }
        });

        btnregistrasi = findViewById(R.id.btn_registrasi);
        btnregistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregistrationactivity();
            }
        });
    }



    public void openregistrationactivity() {
        Intent registrasi = new Intent(this, RegistrationActivity.class);
        startActivity(registrasi);
    }

}