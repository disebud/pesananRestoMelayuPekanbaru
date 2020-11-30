package com.disebud.orderresto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.disebud.orderresto.paket.PaketA;
import com.disebud.orderresto.paket.PaketB;
import com.disebud.orderresto.paket.PaketC;
import com.disebud.orderresto.paket.PaketD;
import com.disebud.orderresto.paket.PaketE;
import com.disebud.orderresto.paket.PaketF;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kePaketA(View view) {
        Intent in = new Intent(MainActivity.this, PaketA.class);
        startActivity(in);
    }

    public void kePaketB(View view) {
        Intent in = new Intent(MainActivity.this, PaketB.class);
        startActivity(in);
    }

    public void kePaketC(View view) {
        Intent in = new Intent(MainActivity.this, PaketC.class);
        startActivity(in);
    }

    public void kePaketD(View view) {
        Intent in = new Intent(MainActivity.this, PaketD.class);
        startActivity(in);
    }

    public void kePaketE(View view) {
        Intent in = new Intent(MainActivity.this, PaketE.class);
        startActivity(in);
    }

    public void kePaketF(View view) {
        Intent in = new Intent(MainActivity.this, PaketF.class);
        startActivity(in);
    }
}