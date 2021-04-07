package net.abk.a10118367_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//06-04-2021-10118367_YanuarTisyaDwiPutra_IF-9
public class SplashScreenActivity extends AppCompatActivity {
    private Button btnsigin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        btnsigin = findViewById(R.id.btn_sigin);
        btnsigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openloginactivity();
            }
        });
    }
    public void openloginactivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);

    }
}