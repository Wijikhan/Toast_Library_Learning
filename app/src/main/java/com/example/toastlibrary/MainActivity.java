package com.example.toastlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toast_library.ToastClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastClass obj = new ToastClass(MainActivity.this);
        obj.ShowMessage("Run the library ");
    }
}