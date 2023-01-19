package com.example.bankingapp;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomerAdapter_userlist extends RecyclerView.Adapter {
    user_list UserList;
    List<Model> modelList;
    Context context;

    public CustomerAdapter_userlist(user_list userList, List<Model> modelList) {
        this.UserList = userList;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
