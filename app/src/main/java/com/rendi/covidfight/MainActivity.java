package com.rendi.covidfight;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  btn_share_1;
    Button  btn_share_2;
    Button  btn_share_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_1 = findViewById(R.id.btn_baca1);
        btn_1.setOnClickListener(this);

        Button btn_2 = findViewById(R.id.btn_baca2);
        btn_2.setOnClickListener(this);

        Button btn_3 = findViewById(R.id.btn_baca3);
        btn_3.setOnClickListener(this);

        Button btn_4 = findViewById(R.id.btn_baca4);
        btn_4.setOnClickListener(this);

        Button btn_prof = findViewById(R.id.profil);
        btn_prof.setOnClickListener(this);

        //share


        btn_share_1 =findViewById(R.id.btn_share_1);
        btn_share_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moIntent = new Intent(Intent.ACTION_SEND);
                moIntent.setType("text/plain");
                String sharelink ="Aku ingin Menyelamatkan mu kawan :) \n https://www.qasir.id/tips/jaga-jarak-lindungi-diri-sendiri-dan-orang-lain-dari-penularan-covid-19";
                moIntent.putExtra(Intent.EXTRA_TEXT,sharelink);
                startActivity(Intent.createChooser(moIntent, "Share Dengan Apa Boss ?"));

            }
        });


        btn_share_2 =findViewById(R.id.btn_share_2);
        btn_share_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moIntent = new Intent(Intent.ACTION_SEND);
                moIntent.setType("text/plain");
                String sharelink ="Aku ingin kau sadar kawan, ayolah :) \n https://sulsel.idntimes.com/health/medical/izza-namira-1/alasan-semua-orang-harus-memakai-masker-regional-sulsel";
                moIntent.putExtra(Intent.EXTRA_TEXT,sharelink);
                startActivity(Intent.createChooser(moIntent, "Share Dengan Apa Boss ?"));

            }
        });


        btn_share_3 =findViewById(R.id.btn_share_3);
        btn_share_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moIntent = new Intent(Intent.ACTION_SEND);
                moIntent.setType("text/plain");
                String sharelink ="Semoga cara ini membantu hidupmu kawan \n https://health.grid.id/read/352072682/5-fakta-cuci-tangan-untuk-hadapi-corona-mesti-pakai-sabun-dan-dikeringkan?page=all";
                moIntent.putExtra(Intent.EXTRA_TEXT,sharelink);
                startActivity(Intent.createChooser(moIntent, "Share Dengan Apa Boss ?"));

            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_baca1:
                Intent moIntent = new Intent(MainActivity.this , Baca_1.class);
                startActivity(moIntent);
                break;

            case R.id.btn_baca2:
                Intent pindah = new Intent(MainActivity.this , Baca_2.class);
                startActivity(pindah);
                break;

            case R.id.btn_baca3:
                Intent los = new Intent(MainActivity.this , Baca_3.class);
                startActivity(los);
                break;

            case R.id.btn_baca4:
                Intent ap = new Intent(MainActivity.this , Baca_4.class);
                startActivity(ap);
                break;

            case R.id.profil:
                Intent pro = new Intent(MainActivity.this , Profil.class);
                startActivity(pro);
                break;

                //sosmed

            case R.id.btn_wa:
                 Intent noWa = new Intent(Intent.ACTION_VIEW, Uri.parse("www.whatshapp.com"));
                 startActivity(noWa);
                 break;

            case R.id.btn_fb:
                Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse("www.facebook.com"));
                startActivity(fb);
                break;

            case R.id.btn_ig:
                Intent ig = new Intent(Intent.ACTION_VIEW, Uri.parse("www.instagram.com"));
                startActivity(ig);
                break;


//            case R.id.btn_move_actyvity_data:
//                Intent moveData= new Intent(MainActivity.this, PindahData.class);
//                moveData.putExtra(PindahData.EXTRANAME,"RENDI");
//                moveData.putExtra(PindahData.EXTRAAGE,17);
//                startActivity(moveData);
//                break;
//            case R.id.btn_dial_number:
//                String Wa= "083834454000";
//                Intent noWa = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Wa));
//                startActivity(noWa);
//                break;
//            case R.id.btn_data_recivered:
//                Intent kirim = new Intent(MainActivity.this, MainActivity.class);
//                break;
        }

    }



}
