package com.example.doctorslistwithfragments.ui.doctors;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.doctorslistwithfragments.models.Doctor;

public class DoctorsViewModel extends ViewModel {

    private final MutableLiveData<Doctor> doctorPrime;

    public DoctorsViewModel() {
        doctorPrime = new MutableLiveData<>();
    }

    public LiveData<Doctor> getDoctor() {
        return doctorPrime;
    }
}