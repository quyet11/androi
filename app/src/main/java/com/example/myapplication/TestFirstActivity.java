package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestFirstActivity extends AppCompatActivity {
    private final String Tag ="TestFirstActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_first);
        //bat su kien bam vao button chuyen sang act2
        findViewById(R.id.btn_start_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TestSecondActivity.class));
            }
        });
        //ghi log data
        Log.i(Tag,"************ onCreate run *******");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "******** onStart run ********");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(Tag, "********** onResume run *******");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "********** onPause run *******");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "********** onStop run *******");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "********** onRestart run *******");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "********** onDestroy run *******");
    }
}
