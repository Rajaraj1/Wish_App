package com.example.wish.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wish.Adapter.DashboardAdapter;
import com.example.wish.Adapter.StoryAdapter;
import com.example.wish.Model.DashboardModel;
import com.example.wish.Model.StoryModel;
import com.example.wish.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView storyRv, dashboardRv;
    ArrayList<StoryModel> list;
    ArrayList<DashboardModel> dashboardList;

    public HomeFragment() {
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        storyRv = view.findViewById(R.id.storyRv);

        list = new ArrayList<>();
        list.add(new StoryModel(R.drawable.riya_raj_1,R.drawable.ic_live,R.drawable.riya_raj_1,"Riya raj"));
        list.add(new StoryModel(R.drawable.diya_singh,R.drawable.ic_live,R.drawable.diya_singh,"Riya raj"));
        list.add(new StoryModel(R.drawable.diya_singh,R.drawable.ic_live,R.drawable.diya_singh,"Riya raj"));

        StoryAdapter adapter = new StoryAdapter(list,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        storyRv.setLayoutManager(linearLayoutManager);
        storyRv.setNestedScrollingEnabled(false);
        storyRv.setAdapter(adapter);

        dashboardRv = view.findViewById(R.id.dashboardRv);

        dashboardList = new ArrayList<>();

        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));
        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));
        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));
        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));
        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));
        dashboardList.add(new DashboardModel(R.drawable.diya_singh,R.drawable.diya_singh,R.drawable.ic_bookmark,
                "Riya raj","Crush","4M","688","200"));


        DashboardAdapter dashboardAdapter = new DashboardAdapter(dashboardList,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        dashboardRv.setLayoutManager(layoutManager);
//        dashboardRv.setNestedScrollingEnabled(false);
        dashboardRv.setAdapter(dashboardAdapter);


        return view;
    }
}