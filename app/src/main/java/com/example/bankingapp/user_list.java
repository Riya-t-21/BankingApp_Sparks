package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import java.text.NumberFormat;
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

        showData();
    }

  private void showData()
  {
      modelList_showlist.clear();
      Cursor cursor = new DatabaseHelper(this).readAlldata();
      while(cursor.moveToNext())
      {
          String balancefromdb = cursor.getString(2);
          Double balance = Double.parseDouble(balancefromdb);

          NumberFormat nf = NumberFormat.getNumberInstance();
          nf.setGroupingUsed(true);
          nf.setMaximumFractionDigits(2);
          nf.setMinimumFractionDigits(2);
          String price = nf.format(balance);

          Model model = new Model(cursor.getString(0), cursor.getString(1), price);
          modelList_showlist.add(model);

      }
      adapter = new CustomerAdapter_userlist(user_list.this, modelList_showlist);
      recyclerView_u.setAdapter(adapter);

  }
    public void nextActivity(int position) {
        phonenumber = modelList_showlist.get(position).getPhoneno();
        Intent intent = new Intent(user_list.this, user_data.class);
        intent.putExtra("phonenumber",phonenumber);
        startActivity(intent);
    }


}
