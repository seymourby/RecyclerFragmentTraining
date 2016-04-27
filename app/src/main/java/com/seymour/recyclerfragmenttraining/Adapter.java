package com.seymour.recyclerfragmenttraining;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by seymour on 2016/04/27.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Activity mActivity;
    private String[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
     private final TextView textView;
        public  ViewHolder(View v){
            super(v);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Toast.makeText(v.ge, getPosition(), Toast.LENGTH_LONG).show();
                }
            });
            textView = (TextView)v.findViewById(R.id.textView);
        }
        public  TextView getTextView() {
         return textView;
        }
    }
    public  Adapter(String[] dataset){
        mDataSet = dataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,final int position) {
        holder.getTextView().setText(mDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
