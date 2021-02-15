package com.example.group33hw02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class createTaskActivity extends AppCompatActivity {


    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    int year=0;
    String date;

    EditText nameAdded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
        setTitle("Create Task");


        RadioGroup radioGroup = findViewById(R.id.priorityRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



            }
        });



        findViewById(R.id.cancelButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        mDisplayDate = findViewById(R.id.setDateButton);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                 year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        createTaskActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;


                date = month + "/" + day + "/" + year;

                TextView editDate;
                editDate = (TextView) findViewById(R.id.editTextDate);
                editDate.setText(date);
            }
        };

        nameAdded = findViewById(R.id.editTextTextPersonName);

        nameAdded.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
//                if((nameAdded.getText()){
//
//                }



            }
        });



        ///submit button function
        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(nameAdded.getText().toString().isEmpty())
                {
                    Toast.makeText(createTaskActivity.this, "Please Enter A Task Name", Toast.LENGTH_SHORT).show();

                }
                else{

                }

                if(year == 0)
                {
                    Toast.makeText(createTaskActivity.this, "Please Select A Date", Toast.LENGTH_SHORT).show();

                }
                else {

                }




                if(radioGroup.getCheckedRadioButtonId() == (R.id.lowButton))
                {
                    Toast.makeText(createTaskActivity.this, "low button checked", Toast.LENGTH_SHORT).show();
                }
                else if(radioGroup.getCheckedRadioButtonId() == (R.id.highButton))
                {
                    Toast.makeText(createTaskActivity.this, "high button checked", Toast.LENGTH_SHORT).show();

                }

                else if(radioGroup.getCheckedRadioButtonId() == (R.id.mediumButton))
                {
                    Toast.makeText(createTaskActivity.this, "med button checked", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(createTaskActivity.this, "no checked", Toast.LENGTH_SHORT).show();

                }


            }
        });




    }
}

