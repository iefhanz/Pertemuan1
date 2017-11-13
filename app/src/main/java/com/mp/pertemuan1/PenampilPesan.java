package com.mp.pertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PenampilPesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penampil_pesan);

        Intent it = getIntent();
        String pesan = it.getStringExtra("main.pesan");
        Log.d("logging app",pesan);

        TextView lbl_tampil = (TextView) findViewById(R.id.text_tampil);
        lbl_tampil.setText(pesan);
    }
}
