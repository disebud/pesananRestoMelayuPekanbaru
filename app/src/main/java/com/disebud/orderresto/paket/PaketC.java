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

public class PaketC extends AppCompatActivity {

    EditText hargaC, jumlahC , discC ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_c);
        hargaC = (EditText) findViewById(R.id.et_harga_paketC);
        jumlahC = (EditText) findViewById(R.id.et_jumlah_paketC);
        discC = (EditText) findViewById(R.id.et_disc_paketC);

        tv1 = (TextView) findViewById(R.id.title_paketC);
        tv2 = (TextView) findViewById(R.id.menuC);

    }

    public void pesanMenuC(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , hargaC.getText().toString());
        in.putExtra("jumlah" , jumlahC.getText().toString());
        in.putExtra("disc" , discC.getText().toString());
        startActivity(in);
    }

    public void menuUtamaC(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}