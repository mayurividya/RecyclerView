package com.example.recyclerviewwww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.CaseMap;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<String> titles,description;
    ArrayList<item> itemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       titles = new  ArrayList<>();
       description = new ArrayList<>();
       for (int i=1; i<=30; i++){
           titles.add("Title " + i);
           description.add("Description " +i);
       }

       recyclerView=findViewById(R.id.recycleView);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       adapter=  new MyAdapter(titles,description);
       recyclerView.setAdapter(adapter);


    }
}
