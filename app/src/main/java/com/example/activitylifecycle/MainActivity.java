package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity_lifecycle", "onCreate invoked");

        button = (Button) findViewById(R.id.btnNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this,MainActivity2.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_lifecycle", "onStart invoked");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity_lifecycle","onResume invoked");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity_lifecycle","onPause invoked");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity_lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Activity_lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity_lifecycle","onDestroy invoked");
    }
}





