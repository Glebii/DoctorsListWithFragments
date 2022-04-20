package com.example.doctorslistwithfragments.ui.doctors;

import static android.icu.number.NumberRangeFormatter.with;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.doctorslistwithfragments.R;
import com.example.doctorslistwithfragments.databinding.ItemDoctorBinding;
import com.example.doctorslistwithfragments.models.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorsAdapter extends RecyclerView.Adapter<DoctorsAdapter.ViewHolder> {
    private List<Doctor> doctorsList = new ArrayList<>();

    public void setDoctorsList(List<Doctor> list){
        this.doctorsList=list;
        notifyDataSetChanged();

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemDoctorBinding binding = ItemDoctorBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Doctor doctor = doctorsList.get(position);
        holder.onBind(doctor);
        holder.binding.popMenu.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.getMenuInflater().inflate(R.menu.card_menu, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (menuItem.getItemId() == R.id.recording) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",holder.binding.txtPhone.getText().toString(),null));
                        view.getContext().startActivity(intent);
                    }
                    return true;
                }

            });
            popupMenu.show();
        });
    }


    @Override
    public int getItemCount() {
        return doctorsList.size();
    }


    //view holder


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemDoctorBinding binding;

        public ViewHolder(@NonNull ItemDoctorBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }

        public void onBind(Doctor doctor) {
            binding.txtName.setText(doctor.getName());
            binding.txtRoom.setText(doctor.getRoom());
            Glide.with(binding.getRoot()).load(doctor.getImageVIew()).centerCrop().into(binding.iv25);
            binding.txtProfile.setText(doctor.getProfile());
            binding.txtPhone.setText(doctor.getPhone());
        }
    }
}
