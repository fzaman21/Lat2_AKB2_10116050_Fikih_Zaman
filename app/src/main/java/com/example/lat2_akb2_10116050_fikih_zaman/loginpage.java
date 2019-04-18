package com.example.lat2_akb2_10116050_fikih_zaman;
// Nama : Fikih Zaman
// Nim  : 10116050
// Kelas: AKB2 - IF2
//changelog
// 18-04-2019 03-20 AM = tanggal Buat
// 18-04-2019 04-05 AM = interface loginpage
// 18-04-2019 04-21 AM = interface registerpage
// 18-04-2019 04-05 AM = interface almost_there_page
// 18-04-2019 04-43 AM = interface verify_page
// 18-04-2019 04-05 AM = interface user_home_page
// 18-04-2019 05-34 AM = fungsi pindah halaman
// 18-04-2019 04-05 AM = debug interface register
// 18-04-2019 04-05 AM = debug interface user_home_page
// 18-04-2019 07-59 AM = finishing

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        TextView register = findViewById(R.id.textView3);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah1();
            }
        });
    }
    public void pindah1(){
        Intent next = new Intent(this, Registerpage.class);
        startActivity(next);
    }
}
