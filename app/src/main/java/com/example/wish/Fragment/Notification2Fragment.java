package com.example.wish.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wish.Adapter.NotificationAdapter;
import com.example.wish.Adapter.ViewPagerAdapter;
import com.example.wish.Model.NotificationModel;
import com.example.wish.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Notification2Fragment extends Fragment {
    ArrayList<NotificationModel> list;
    RecyclerView recyclerView;

    public Notification2Fragment() {
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

        View view = inflater.inflate(R.layout.fragment_notification2, container, false);
        recyclerView = view.findViewById(R.id.notification2RV);

        list = new ArrayList<>();
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.diya_singh,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.cute_girl,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj_1,"Riya raj mention you in a comment","just now"));
        list.add(new NotificationModel(R.drawable.riya_raj,"Riya raj mention you in a comment","just now"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new NotificationAdapter(list,getContext()));


        return view;
    }
}