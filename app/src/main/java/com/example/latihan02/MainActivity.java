package com.example.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menggunakan lambda untuk menulis event listener dan event handler

        Button btMadrid = findViewById(R.id.btMadrid);
        Button btUnited = findViewById(R.id.btUnited);
        Button btCity = findViewById(R.id.btCity);
        Button btDortmund = findViewById(R.id.btDortmund);

        //lamda
        btMadrid.setOnClickListener(view ->{
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Guweh Barcelona Fans Club", Toast.LENGTH_SHORT).show();
        });

        btUnited.setOnClickListener(view ->Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show());
        btCity.setOnClickListener(view ->Toast.makeText(this, "Hala", Toast.LENGTH_SHORT).show());
        btDortmund.setOnClickListener(view ->Toast.makeText(this, "Hila", Toast.LENGTH_SHORT).show());
    }
}
