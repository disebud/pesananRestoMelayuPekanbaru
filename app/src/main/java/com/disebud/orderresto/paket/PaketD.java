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

public class PaketD extends AppCompatActivity {

    EditText hargaD, jumlahD , discD ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_d);
        hargaD = (EditText) findViewById(R.id.et_harga_paketD);
        jumlahD = (EditText) findViewById(R.id.et_jumlah_paketD);
        discD = (EditText) findViewById(R.id.et_disc_paketD);

        tv1 = (TextView) findViewById(R.id.title_paketD);
        tv2 = (TextView) findViewById(R.id.menuD);

    }

    public void pesanMenuD(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , hargaD.getText().toString());
        in.putExtra("jumlah" , jumlahD.getText().toString());
        in.putExtra("disc" , discD.getText().toString());
        startActivity(in);
    }

    public void menuUtamaD(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}