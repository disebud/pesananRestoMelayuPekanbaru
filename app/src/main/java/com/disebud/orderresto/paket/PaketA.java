package com.disebud.orderresto.paket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.disebud.orderresto.HitungPesanan;
import com.disebud.orderresto.MainActivity;
import com.disebud.orderresto.R;

public class PaketA extends AppCompatActivity {

    EditText harga, jumlah , disc ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_a);

        harga = (EditText) findViewById(R.id.et_harga_paketA);
        jumlah = (EditText) findViewById(R.id.et_jumlah_paketA);
        disc = (EditText) findViewById(R.id.et_disc_paketA);

        tv1 = (TextView) findViewById(R.id.title_paketA);
        tv2 = (TextView) findViewById(R.id.menuA);
    }

    public void pesanMenuA(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , harga.getText().toString());
        in.putExtra("jumlah" , jumlah.getText().toString());
        in.putExtra("disc" , disc.getText().toString());
        startActivity(in);
    }

    public void menuUtama(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}