package com.disebud.orderresto.paket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.disebud.orderresto.HitungPesanan;
import com.disebud.orderresto.MainActivity;
import com.disebud.orderresto.R;

public class PaketF extends AppCompatActivity {

    EditText hargaF, jumlahF , discF ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_f);
        hargaF = (EditText) findViewById(R.id.et_harga_paketF);
        jumlahF = (EditText) findViewById(R.id.et_jumlah_paketF);
        discF = (EditText) findViewById(R.id.et_disc_paketF);

        tv1 = (TextView) findViewById(R.id.title_paketF);
        tv2 = (TextView) findViewById(R.id.menuF);

    }

    public void pesanMenuF(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , hargaF.getText().toString());
        in.putExtra("jumlah" , jumlahF.getText().toString());
        in.putExtra("disc" , discF.getText().toString());
        startActivity(in);
    }

    public void menuUtamaF(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}