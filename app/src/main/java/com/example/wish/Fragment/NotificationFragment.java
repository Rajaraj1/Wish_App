package com.example.wish.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wish.Adapter.ViewPagerAdapter;
import com.example.wish.R;
import com.example.wish.databinding.FragmentNotificationBinding;
import com.google.android.material.tabs.TabLayout;

public class NotificationFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;
    FragmentNotificationBinding binding;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = binding.inflate(inflater, container, false);

        viewPager = binding.viewPager;
//        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getFragmentManager()));

        tabLayout = binding.tabLayout;
//        tabLayout = view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        return binding.getRoot();
    }
}