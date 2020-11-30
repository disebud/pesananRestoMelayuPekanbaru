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

public class PaketE extends AppCompatActivity {

    EditText hargaE, jumlahE , discE ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_e);
        hargaE = (EditText) findViewById(R.id.et_harga_paketE);
        jumlahE = (EditText) findViewById(R.id.et_jumlah_paketE);
        discE = (EditText) findViewById(R.id.et_disc_paketE);

        tv1 = (TextView) findViewById(R.id.title_paketE);
        tv2 = (TextView) findViewById(R.id.menuE);

    }

    public void pesanMenuE(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , hargaE.getText().toString());
        in.putExtra("jumlah" , jumlahE.getText().toString());
        in.putExtra("disc" , discE.getText().toString());
        startActivity(in);
    }

    public void menuUtamaE(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}