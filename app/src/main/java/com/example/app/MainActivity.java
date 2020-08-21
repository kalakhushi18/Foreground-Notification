package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
    }


    public void startService(View v){

        String input = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this,ExampleService.class);

        intent.putExtra("input",input);
        startService(intent);

    }
    public void stopService(View v){
        Intent intent = new Intent(MainActivity.this,ExampleService.class);
        stopService(intent);
    }
}