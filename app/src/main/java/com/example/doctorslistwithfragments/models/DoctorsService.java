package com.example.doctorslistwithfragments.models;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DoctorsService {

    private List<Doctor> doctors = new ArrayList<>();


    public DoctorsService(){
        Faker faker = Faker.instance();
        List<String> IMAGES = new ArrayList<>();
        IMAGES.add("https://images.unsplash.com/photo-1438761681033-6461ffad8d80?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cGVyc29ufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1547425260-76bcadfb4f2c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cGVyc29ufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1544005313-94ddf0286df2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8cGVyc29ufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1500048993953-d23a436266cf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1599566150163-29194dcaad36?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1542206395-9feb3edaa68d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjl8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1491349174775-aaafddd81942?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzR8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1568602471122-7832951cc4c5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDB8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1544723795-3fb6469f5b39?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mzh8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1560250097-0b93528c311a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDJ8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");
        IMAGES.add("https://images.unsplash.com/photo-1573496359142-b8d87734a5a2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDR8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60");

        String[] profiles = {"ALLERGIST", "THERAPIST", "CARDIOLOGIST", "ONCOLOGIST", "ORTHOPEDIC", "PHYSIOTHERAPIST", "RADIOLOGIST"
                , "TOXICOLOGIST", "PULMONOLOGIST", "UROLOGIST", "PEDIATRICIAN", "NEUROPATHOLOGIST"
        };
        for(int i=0 ;i<12; i++){

            doctors.add(new Doctor(
                    faker.name().firstName()+" "+faker.name().lastName(),
                    String.valueOf(faker.number().numberBetween(100,500)),
                    IMAGES.get(i),
                    profiles[i],
                    String.format(
                            "+(%s)%s-%s-%s",faker.phoneNumber().subscriberNumber(3),
                            faker.phoneNumber().subscriberNumber(2),
                            faker.phoneNumber().subscriberNumber(2),
                            faker.phoneNumber().subscriberNumber(2)
                            )

            ));
        }

    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void moveDoctor(Doctor doctor , int moveBy){
        int oldIndex = doctors.indexOf(doctor);
        if(oldIndex == -1) return;
        int newIndex = oldIndex+moveBy;
        if(newIndex<0 || newIndex>=doctors.size()) return;
        Collections.swap(doctors,oldIndex,newIndex);
    }
}
