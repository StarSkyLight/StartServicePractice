package com.example.ziyi.startservicepractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_start = (Button)findViewById(R.id.button_start);
        Button button_stop = (Button)findViewById(R.id.button_stop);

        button_start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this,MyService.class);
                        intent.putExtra("no",10010);
                        startService(intent);

                    }
                }
        );

        button_stop.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this,MyService.class);
                        stopService(intent);
                    }
                }
        );

    }
}
