package com.example.doctorslistwithfragments.ui.doctors;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doctorslistwithfragments.R;
import com.example.doctorslistwithfragments.databinding.ItemDoctorBinding;
import com.example.doctorslistwithfragments.models.DoctorsService;


public class DoctorsFragment extends Fragment {
//    ImageView book_image;

    public DoctorsFragment(){
        super(R.layout.fragment_doctors);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        DoctorsService doctorsService = new DoctorsService();
        View view =  inflater.inflate(R.layout.fragment_doctors,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.resview_doctors);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        DoctorsAdapter doctorsAdapter = new DoctorsAdapter();
        doctorsAdapter.setDoctorsList(doctorsService.getDoctors());
        recyclerView.setAdapter(doctorsAdapter);



        return view;
    }


}