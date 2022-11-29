package com.example.bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<PhepTinh> mList;
        Adapter adapter;

        listView = findViewById(R.id.listView);
        mList = new ArrayList<>();
        mList.add(new PhepTinh("Cộng"));
        mList.add(new PhepTinh("Trừ"));
        mList.add(new PhepTinh("Nhân"));
        mList.add(new PhepTinh("Chia"));

        adapter = new Adapter(MainActivity.this,R.layout.layout_item,mList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                int key = i;
                switch ( key ) {
                    case  0:
                        intent = new Intent(MainActivity.this,CongActivity.class);
                        startActivity(intent);
                        break;
                    case  1:
                        intent = new Intent(MainActivity.this,TruActivity.class);
                        startActivity(intent);
                        break;
                    case  2:
                        intent = new Intent(MainActivity.this,NhanActivity.class);
                        startActivity(intent);
                        break;
                    case  3:
                        intent = new Intent(MainActivity.this,ChiaActivity.class);
                        startActivity(intent);
                        break;
                    case  4:
                        // Làm gì đó tại đây ...
                        break;
                    default:
                        // Làm gì đó tại đây ...
                }
            }
        });

    }
}