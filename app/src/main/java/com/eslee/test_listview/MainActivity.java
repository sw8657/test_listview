package com.eslee.test_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.eslee.test_listview.database.DbOpenHelper;

public class MainActivity extends AppCompatActivity {

    private ListView mDetailListView;
    private ListViewAdapter mAdapter;

    private DbOpenHelper mDbOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DB연결


        mDetailListView = (ListView) findViewById(R.id.myinfo_details_listview); // 사용내역
        mAdapter = new ListViewAdapter();
        mDetailListView.setAdapter(mAdapter);

        mAdapter.addItem("주말이벤트","2017.02.11 15:28",1000,"이벤트");
        mAdapter.addItem("스타벅스", "2017.02.05 10:43",-500,"사용");
        mAdapter.addItem("걷기","2017.02.04 19:00",500,"걷기적립");
        mAdapter.addItem("걷기","2017.02.03 19:00",450,"걷기적립");
        mAdapter.addItem("버거킹","2017.02.01 12:20",-400,"사용");
    }
}
