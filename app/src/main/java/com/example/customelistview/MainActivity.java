package com.example.customelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayList<Student> studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();

        lv = findViewById(R.id.lv);

        StudentAdapter studentAdapter = new StudentAdapter(this, studentArrayList);
        lv.setAdapter(studentAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Student student = studentArrayList.get(i);

            }
        });
    }


        private void initData()
        {
            studentArrayList = new ArrayList<>();
            studentArrayList.add(new Student(1, "Pritesh", "India"));
            studentArrayList.add(new Student(2, "Denis", "Brazil"));
            studentArrayList.add(new Student(3, "Subham", "India"));
            studentArrayList.add(new Student(4, "Payal", "Canada"));
            studentArrayList.add(new Student(5, "Kirti", "Italy"));
            studentArrayList.add(new Student(6, "Aaryash", "Mexico"));
            studentArrayList.add(new Student(7, "Karan", "Turkey"));
            studentArrayList.add(new Student(8, "Dhruvi", "Brazil"));
            studentArrayList.add(new Student(9, "Shweta", "Sri Lanka"));
            studentArrayList.add(new Student(10, "Nikhil", "USA"));
        }
    }
