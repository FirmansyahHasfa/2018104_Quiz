package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BALOK extends AppCompatActivity {

    EditText input_panjang,input_lebar,input_tinggi;
    TextView output_hasil;
    Button hasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        input_panjang = (EditText) findViewById(R.id.input_panjang);
        input_lebar = (EditText) findViewById(R.id.input_lebar);
        input_tinggi = (EditText) findViewById(R.id.input_tinggi);
        hasil = (Button) findViewById(R.id.btn_hitung);
        output_hasil = (TextView) findViewById(R.id.output_hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(input_panjang.length()==0 && input_lebar.length()==0 && input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Panjang, Lebar, dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else if(input_panjang.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else if(input_lebar.length()==0) {
                    Toast.makeText(getApplication(), "Lebar tidak boleh kosong", Toast.LENGTH_LONG).show();
                }
                else if(input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String panjang = input_panjang.getText().toString();
                    String lebar = input_lebar.getText().toString();
                    String tinggi = input_tinggi.getText().toString();
                    double input_panjang = Double.parseDouble(panjang);
                    double input_lebar = Double.parseDouble(lebar);
                    double input_tinggi = Double.parseDouble(tinggi);
                    double hasil = VolumeBalok(input_panjang,input_lebar,input_tinggi);
                    String output = String.valueOf(hasil);
                    output_hasil.setText(output);
                }
            }
        });
    }
    public double VolumeBalok(double input_panjang, double input_lebar, double input_tinggi){
        return input_panjang*input_lebar*input_tinggi;
    }

}