package com.example.customelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends BaseAdapter
{
    private Context context;
    private ArrayList<Student>studentArrayList;


    public StudentAdapter(Context context, ArrayList<Student> studentArrayList) {
        this.context = context;
        this.studentArrayList = studentArrayList;
    }

    public int getCount()
    {
        return studentArrayList.size();
    }

    @Override
    public Student getItem(int position) {
        return studentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.list_item_student, parent, false);
        }

        TextView txtEid = convertView.findViewById(R.id.txtStudentId);
        TextView txtEnm = convertView.findViewById(R.id.txtStudentName);
        TextView txtECountry = convertView.findViewById(R.id.txtCountryName);

        Student student = getItem(position);

        txtEid.setText(String.valueOf(student.getStudentId()));
        txtEnm.setText(student.getStudentName());
        txtECountry.setText(student.getstudentCountry());




        return convertView;
    }
}
