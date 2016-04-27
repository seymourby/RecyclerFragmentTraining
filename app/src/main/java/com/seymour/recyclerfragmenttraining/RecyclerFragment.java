package com.seymour.recyclerfragmenttraining;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by seymour on 2016/04/27.
 */
public class RecyclerFragment extends Fragment{

    private static final String TAG = "RecyclerFragment";
    private static final int DATASET_COUNT = 50;

    private RecyclerView mRecyclerView;
    private Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] mDataset;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler,container,false);
        rootView.setTag(TAG);

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new Adapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(0);
        return rootView;
    }


    private void initDataset(){
        mDataset = new String[DATASET_COUNT];
        for(int i = 0;i<DATASET_COUNT;i++){
         mDataset[i] = "Number"+i;
        }
    }
}
