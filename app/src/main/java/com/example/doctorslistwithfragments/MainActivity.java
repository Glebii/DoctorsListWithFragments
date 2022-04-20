package com.example.doctorslistwithfragments;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.doctorslistwithfragments.ui.doctors.DoctorsAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.doctorslistwithfragments.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private DoctorsAdapter doctorsAdapter;
    ImageView book_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doctorsAdapter = new DoctorsAdapter();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_doctors, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }


//    ImageButton book_image = (ImageButton) binding.popMenu;
//        book_image.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            showPopupMenu(view);
//        }
//    });
//    private void showPopupMenu(View v){
//        PopupMenu popupMenu = new PopupMenu(v.getContext(), v);
//        popupMenu.getMenuInflater().inflate(R.menu.card_menu, popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                if (menuItem.getItemId() == R.id.recording) {
//                    Toast.makeText(v.getContext().getApplicationContext(), "Booooooy clicked", Toast.LENGTH_LONG).show();
//                }
//                return true;
//            }
//
//        });
//    }

}