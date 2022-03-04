package com.example.listview.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lib.Model.studentModel;
import com.example.listview.R;

public class StudentApdapter extends ArrayAdapter<studentModel> {
    Activity    context;
    int resource;
    public StudentApdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View view = inflater.inflate(this.resource,null);
        ImageView imgStudent = (ImageView) view.findViewById(R.id.imgStudent);
        TextView TxtName = (TextView) view.findViewById(R.id.txtName) ;
        TextView TxtCode = (TextView) view.findViewById(R.id.txtCode) ;
        TextView TxtPhone = (TextView) view.findViewById(R.id.txtPhone) ;

        studentModel studentModel = getItem(position);
        imgStudent.setImageResource(studentModel.pic);
        TxtName.setText(studentModel.name);
        TxtCode.setText(studentModel.Code);
        TxtPhone.setText(studentModel.Phone);
        return view;
    }
}
