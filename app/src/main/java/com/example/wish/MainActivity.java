package com.example.wish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.example.wish.Fragment.AddFragment;
import com.example.wish.Fragment.HomeFragment;
import com.example.wish.Fragment.NotificationFragment;
import com.example.wish.Fragment.ProfileFragment;
import com.example.wish.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,new HomeFragment());
        transaction.commit();

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch(i){
                    case 0:
                        transaction.replace(R.id.container,new HomeFragment());
                        break;
                    case 1:
                        transaction.replace(R.id.container,new NotificationFragment());
                        break;
                    case 2:
                        transaction.replace(R.id.container, new AddFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.container,new ProfileFragment());
                        break;
                }
                transaction.commit();
                return false;
            }
        });

    }
}