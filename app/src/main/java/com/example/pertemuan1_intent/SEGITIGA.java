package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SEGITIGA extends AppCompatActivity {

    EditText input_alas,input_tinggi;
    TextView output_hasil;
    Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        input_alas = (EditText) findViewById(R.id.input_alas);
        input_tinggi = (EditText) findViewById(R.id.input_tinggi);
        hasil = (Button) findViewById(R.id.btn_hitung);
        output_hasil = (TextView) findViewById(R.id.output_hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(input_alas.length()==0 && input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else if(input_alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else if(input_tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String alas = input_alas.getText().toString();
                    String tinggi = input_tinggi.getText().toString();
                    double input_alas = Double.parseDouble(alas);
                    double input_tinggi = Double.parseDouble(tinggi);
                    double hasil = LuasSegitiga(input_alas,input_tinggi);
                    String output = String.valueOf(hasil);
                    output_hasil.setText(output);
                }
            }
        });
    }
    public double LuasSegitiga(double input_alas, double input_tinggi){
        return input_alas*input_tinggi/2;
    }

}