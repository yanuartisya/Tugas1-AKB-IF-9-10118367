package net.abk.a10118367_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//06-04-2021-10118367_YanuarTisyaDwiPutra_IF-9
public class RegistrationActivity extends AppCompatActivity {

    private Button btndaftar;
    private EditText etNIM , etNama , etKelas , etDeskripsi ;
    private String NIM , Nama , Kelas , Deskripsi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initView();
        setData();
    }
    public void initView(){
        btndaftar = findViewById(R.id.btn_daftar);
        etNIM = findViewById(R.id.et_nim);
        etNama = findViewById(R.id.et_nama);
        etKelas = findViewById(R.id.et_kelas);
        etDeskripsi = findViewById(R.id.et_deskripsi);
    }

    public void setData(){
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NIM = etNIM.getText().toString();
                Nama = etNama.getText().toString();
                Kelas = etKelas.getText().toString();
                Deskripsi = etDeskripsi.getText().toString();

                //action
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                intent.putExtra("NIM",NIM);
                intent.putExtra("Nama", Nama);
                intent.putExtra("Kelas",Kelas);
                intent.putExtra("Deskripsi",Deskripsi);
                startActivity(intent);
            }
        });

    }
}