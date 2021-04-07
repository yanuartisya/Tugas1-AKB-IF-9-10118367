package net.abk.a10118367_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//06-04-2021-10118367_YanuarTisyaDwiPutra_IF-9
public class MainActivity extends AppCompatActivity {
    private Button btnlogout;
    private Button btnprofile;
    private TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUsername = (TextView) findViewById(R.id.txtusername);
        tvUsername.setText(getIntent().getStringExtra("username"));
        btnprofile = findViewById(R.id.btn_profile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openprofileactivity();
            }
        });

        btnlogout = findViewById(R.id.btn_logout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloginactivity();
            }
        });

    }
    public void openprofileactivity(){
        Intent profile = new Intent(this, ProfileActivity.class);
        startActivity(profile);
    }
    public void openloginactivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
    }
}