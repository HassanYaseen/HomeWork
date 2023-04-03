package com.android.iunoob.practiceapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[]{
                new MyListData(R.drawable.background,"video2131-212","23MB","1080","14:23"),
                new MyListData(R.drawable.background,"video2131-212","23MB","1080","14:23"),
                new MyListData(R.drawable.background,"video2131-212","23MB","1080","14:23"),
                new MyListData(R.drawable.background,"video2131-212","23MB","1080","14:23"),
                new MyListData(R.drawable.background,"video2131-212","23MB","1080","14:23"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView.setAdapter(adapter);
    }
}