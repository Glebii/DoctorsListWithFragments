package com.example.doctorslistwithfragments.models;

import android.app.Application;

import com.example.doctorslistwithfragments.models.DoctorsService;

public class App extends Application  {
    DoctorsService doctorsService = new DoctorsService();
}
