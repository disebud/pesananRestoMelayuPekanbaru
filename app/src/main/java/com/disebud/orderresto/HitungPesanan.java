package com.disebud.orderresto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;

public class HitungPesanan extends AppCompatActivity {

    String namaMenu ;
    Integer harga , jumlah , disc , jumlahTotalHargaPesanan , grandTotalBayar , jumlahDiscTot;

    EditText menuPaket , hargaPaket , jumlahPaket , jumlahHargaPesanan , jumlahDisc , totalBayar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_pesanan);

        menuPaket = (EditText) findViewById(R.id.et_menu_paket_pesanan);
        hargaPaket = (EditText) findViewById(R.id.et_harga_menu_paket_pesanan);
        jumlahPaket = (EditText) findViewById(R.id.et_jumlah_menu_paket_pesanan);
        jumlahHargaPesanan = (EditText) findViewById(R.id.et_jumlah_harga_menu_paket_pesanan);
        jumlahDisc = (EditText) findViewById(R.id.et_jumlah_disc_menu_paket_pesanan);
        totalBayar = (EditText) findViewById(R.id.et_total_bayar_menu_paket_pesanan);

        namaMenu = getIntent().getStringExtra("namaMenu");
        harga = Integer.parseInt(getIntent().getStringExtra("harga"));
        jumlah = Integer.parseInt(getIntent().getStringExtra("jumlah"));
        disc = Integer.parseInt(getIntent().getStringExtra("disc"));

        jumlahTotalHargaPesanan = Integer.parseInt(String.valueOf(harga)) * Integer.parseInt(String.valueOf(jumlah)) ;
        jumlahDiscTot = jumlahTotalHargaPesanan * disc/100 ;
        grandTotalBayar = jumlahTotalHargaPesanan - jumlahDiscTot;

        Locale locale = new Locale("in","ID");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);

        menuPaket.setText(namaMenu);
        hargaPaket.setText("Rp." + numberFormat.format(harga));
        jumlahPaket.setText(String.valueOf(jumlah)+" Pcs");
        jumlahHargaPesanan.setText("Rp." + numberFormat.format(jumlahTotalHargaPesanan));
        jumlahDisc.setText(String.valueOf(disc)+" % = Rp."+numberFormat.format(jumlahDiscTot));
        totalBayar.setText("Rp." + numberFormat.format(grandTotalBayar));

    }

    public void MenuUtama(View view) {
        Intent in = new Intent(HitungPesanan.this,MainActivity.class);
        startActivity(in);
    }
}