package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("Activity_Back", "onCreate invoked");

        button = findViewById(R.id.btnBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOldActivity();
            }
        });
    }
    public void openOldActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_Back", "onStart invoked");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity_Back","onResume invoked");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity_Back","onPause invoked");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity_Back","onStop invoked");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Activity_Back","onRestart invoked");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity_Back","onDestroy invoked");
    }
}

