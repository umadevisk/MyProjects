package com.app.exampleseven.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.exampleseven.Beanclass;
import com.app.exampleseven.R;
import com.app.exampleseven.adapter.SampleItem;
import com.mikepenz.fastadapter.adapters.FastItemAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentPageOne extends Fragment {

    @BindView(R.id.item_recycler_view)
    RecyclerView mRecyclerView;

    private FastItemAdapter fastAdapter;


    private int[] Image = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image5_170127819,R.drawable.modi,R.drawable.nmodi};

    private String[] Title ={"Nasa goes to mars: Astronauts could land on red planet by 2039","Arctic sea ice hits lowest winter maximum on record","The balloon thet could fly tourists to the edge of space","Arctic sea ice hits lowest winter maximum on record","The balloon thet could fly tourists to the edge of space"};

    private String[] Desc = {"SPACE.com","CNN ","CNN ","CNN ","CNN "};

    private String[] Date = {" SCIENCE","ENVIRONMENT"," OTHER","ENVIRONMENT"," OTHER"};


    public static FragmentPageOne newInstance() {
        return new FragmentPageOne();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_page, container, false);
        ButterKnife.bind(this, fragmentView);

        return fragmentView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupRecyclerView();

        addData();
    }

    private void setupRecyclerView() {
        fastAdapter = new FastItemAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(fastAdapter);
    }

    private void addData() {
        for (int i = 0; i <= 4; i++) {
            fastAdapter.add(new SampleItem().withName(Desc[i],Title[i],Date[i],Image[i]));

        }
    }

    public void refreshData() {
        fastAdapter.clear();
        addData();
    }
}
