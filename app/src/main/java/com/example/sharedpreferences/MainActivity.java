package com.example.sharedpreferences;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Exit,reset,count;
    EditText eT;
    TextView tV;
    Intent si ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.tV);
        eT = findViewById(R.id.eT);
        Exit = findViewById(R.id.Exit);
        reset = findViewById(R.id.reset);
        count = findViewById(R.id.count);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 100,"credits");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        if(st.equals("credits")){
            si = new Intent(this, MainActivity2.class);
            startActivity(si);
        }
        return true;
    }
}