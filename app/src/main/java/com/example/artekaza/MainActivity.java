package com.example.artekaza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_admin1,btn_cliente,btn_artesano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_admin1=(Button)findViewById(R.id.btn_admin1);
        btn_admin1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent btn_admin1 = new Intent(MainActivity.this, admin.class);
                startActivity(btn_admin1);
            }
        });
        btn_cliente=(Button)findViewById(R.id.btn_cliente);
        btn_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_cliente = new Intent(MainActivity.this, cliente.class);
                startActivity(btn_cliente);

            }
        });
        btn_artesano=(Button)findViewById(R.id.btn_artesano);
        btn_artesano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_artesano = new Intent(MainActivity.this, artesano.class);
                startActivity(btn_artesano);
            }
        });


    }
}