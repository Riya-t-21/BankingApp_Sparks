package com.example.bankingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapter_sendTouser extends RecyclerView.Adapter<ViewHolder> {


    sendTouser SendtoUser;
    List<Model> modelList;
    Context context;

    public CustomerAdapter_sendTouser(sendTouser sentoUser, List<Model> modelList) {
        this.SendtoUser = sentoUser;
        this.modelList = modelList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_users, parent, false);

        ViewHolder viewHolder = new ViewHolder(itemView);
        viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                SendtoUser.selectuser(position);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.mName.setText(modelList.get(position).getName());
        holder.mPhonenumber.setText(modelList.get(position).getPhoneno());
        holder.mBalance.setText(modelList.get(position).getBalance());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
    public void setFilter(ArrayList<Model> newList){
        modelList = new ArrayList<>();
        modelList.addAll(newList);
        notifyDataSetChanged();
    }
}
