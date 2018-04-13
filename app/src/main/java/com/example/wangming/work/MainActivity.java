package com.example.wangming.work;

import android.content.Intent;
import android.os.Bundle;
import android.os.WorkSource;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }


}
