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

public class PaketB extends AppCompatActivity {

    EditText hargaB, jumlahB , discB ;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_b);
        hargaB = (EditText) findViewById(R.id.et_harga_paketB);
        jumlahB = (EditText) findViewById(R.id.et_jumlah_paketB);
        discB = (EditText) findViewById(R.id.et_disc_paketB);

        tv1 = (TextView) findViewById(R.id.title_paketB);
        tv2 = (TextView) findViewById(R.id.menuB);
    }

    public void pesanMenuB(View view) {
        Intent in = new Intent(getApplicationContext(), HitungPesanan.class);
        in.putExtra("namaMenu" , tv1.getText().toString() +" : "+tv2.getText().toString());
        in.putExtra("harga" , hargaB.getText().toString());
        in.putExtra("jumlah" , jumlahB.getText().toString());
        in.putExtra("disc" , discB.getText().toString());
        startActivity(in);
    }

    public void menuUtamaB(View view) {
        Intent in = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(in);
    }
}