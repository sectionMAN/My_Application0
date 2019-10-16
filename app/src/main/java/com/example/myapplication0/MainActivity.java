package com.example.myapplication0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import com.example.myapplication0.Model.My;
import com.example.myapplication0.data.DatabaseHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler data = new DatabaseHandler(this);
        try {
            data.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
       //* com.example.myapplication0.data.openDataBase();
    }

}
