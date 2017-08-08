package com.example.evra3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    public void goNewView(View v){
        switch (v.getId()) {

            case R.id.button:
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void Roma(View v){
        switch (v.getId()) {
            case R.id.button2:
                Intent intent = new Intent(this, QWERTY.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
    public void vasya(View v){

        switch (v.getId()) {
            case R.id.button3:
                Intent intent = new Intent(this, map.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
