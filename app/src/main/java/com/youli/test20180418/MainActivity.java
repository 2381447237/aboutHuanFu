package com.youli.test20180418;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zhy.changeskin.SkinManager;


public class MainActivity extends BaseActivity implements View.OnClickListener{

    private Button toTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toTwo=findViewById(R.id.btn_to_two);


        toTwo.setOnClickListener(this);

        findViewById(R.id.btn_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SkinManager.getInstance().changeSkin("red");

            }
        });

        findViewById(R.id.btn_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SkinManager.getInstance().changeSkin("green");

            }
        });

        findViewById(R.id.btn_default).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SkinManager.getInstance().changeSkin("default");

            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){




            case R.id.btn_to_two:

                Intent i=new Intent(this,TwoActivity.class);
                startActivity(i);

                break;
        }

    }
}
