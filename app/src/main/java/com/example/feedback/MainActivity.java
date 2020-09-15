package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Submit = (Button) findViewById (R.id.btnsubmit);
        ImageButton Back = (ImageButton) findViewById (R.id.btnBack);
    }
    public void Submit(View view){
        Toast toast = Toast.makeText(this, "Submitted",Toast.LENGTH_SHORT);
        toast.show();
    }


}