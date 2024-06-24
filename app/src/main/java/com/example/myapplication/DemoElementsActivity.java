package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class DemoElementsActivity extends AppCompatActivity {
    private final String FlagTag ="Demoelement";
    private CheckBox AgreeYes;
    private CheckBox AgreeNo;
    private Button ClickMe;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_elements);
        findViewById(R.id.btn_click_me).setEnabled(false);
        AgreeYes = findViewById(R.id.cb_yes);
        AgreeNo = findViewById(R.id.cb_no);

        //bat su kien khi kich vao o checkbox

        AgreeYes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ClickMe = findViewById(R.id.btn_click_me);

                if (isChecked){

                    ClickMe.setEnabled(true);
                    Log.i(FlagTag, " checked");
                }else{
                    ClickMe.setEnabled(false);
                    Log.i(FlagTag, " checked");

                }
            }
        });
    }

    public void handleClickMe(View view){
        AgreeNo = findViewById(R.id.cb_no);
        if(AgreeNo.isChecked()){
            Toast.makeText(this,"chekced",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"not chekced",Toast.LENGTH_SHORT).show();
        }
    }
}
