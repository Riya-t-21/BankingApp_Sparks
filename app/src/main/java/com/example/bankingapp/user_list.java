package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class user_list extends AppCompatActivity {

    RecyclerView recyclerView_u;

    List<Model> modelList_showlist = new ArrayList<>();

    RecyclerView.LayoutManager layoutManager;

    CustomerAdapter_userlist adapter;

    String phonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        recyclerView_u = findViewById(R.id.recUserlist);
        recyclerView_u.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView_u.setLayoutManager(layoutManager);

    }

  private void showData()
  {
      modelList_showlist.clear();
      //Cursor cursor = new DatabaseHelper(this);
  }

}
