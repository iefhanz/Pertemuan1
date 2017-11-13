package com.mp.pertemuan1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilPesan(View v) {
        EditText txtPesan = (EditText) findViewById(R.id.inp_pesan);
        String pesan = txtPesan.getText().toString();

        // Toast.makeText(this,pesan,Toast.LENGTH_LONG).show();
        ///intent untuk menampilkan pesan di window(activity) lain
        Intent it = new Intent(this, PenampilPesan.class);
        it.putExtra("main.pesan", pesan);
        startActivity(it);
    }
        public void callPhone(View v){
        EditText txtPhone = (EditText) findViewById(R.id.inp_telp);
        String phoneNum = txtPhone.getText().toString();
            Uri uri = Uri.parse("tel:"+phoneNum);
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);

    }
}
