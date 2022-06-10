 package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private Button button;
     private TextView textView;
     private TextView textView2;
     private TextView editTextTextPersonName;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         button = findViewById(R.id.button);
         textView = findViewById(R.id.textView);
         textView2 = findViewById(R.id.textView2);
         editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "To the Moon", Toast.LENGTH_SHORT).show();
                 String s= editTextTextPersonName.getText().toString();
                 int doge=Integer.parseInt(s);
                 double inr=52.5*doge;
                 textView.setText( doge +" doge is equal to " +inr+" rupees");
             }
         });
     }
 }