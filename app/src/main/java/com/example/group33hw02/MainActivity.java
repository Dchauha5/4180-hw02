package com.example.group33hw02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Tasks")
                        .setNeutralButton("Task1", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Toast.makeText(MainActivity.this, "Please Enter A Task Name", Toast.LENGTH_SHORT).show();


                            }
                        });
                builder.create().show();


            }
        });


//        public void openDialog() {
//
//        }


    }
}