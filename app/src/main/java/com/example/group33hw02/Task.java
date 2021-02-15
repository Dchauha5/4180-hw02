package com.example.group33hw02;

import java.io.Serializable;

public class Task implements Serializable {


    String TaskName ;
    String date ;
    String priority;

    public Task(String TaskName , String date, String priority)
    {
        this.TaskName = TaskName;
        this.date = date;
        this.priority = priority;

    }


    public Task()
    {

    }
}
