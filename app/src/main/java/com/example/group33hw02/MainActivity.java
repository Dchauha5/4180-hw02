package com.example.group33hw02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //code to go to createTaskActivity
        findViewById(R.id.createTaskButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createTask = new Intent(MainActivity.this, createTaskActivity.class);
                startActivity(createTask);

            }
        });

        findViewById(R.id.viewTasksButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //openDialog();


            }
        });


//        public void openDialog() {
//
//        }


    }
}