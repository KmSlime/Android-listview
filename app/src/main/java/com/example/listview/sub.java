package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lib.Model.studentModel;

public class sub extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Bundle bundle = getIntent().getExtras();
        studentModel student = (com.example.lib.Model.studentModel) bundle.get("student");
        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtCode = (TextView) findViewById(R.id.txtCode);
        TextView txtDate = (TextView) findViewById(R.id.txtDate);
        TextView txtClass = (TextView) findViewById(R.id.txtClass);
        TextView txtYear = (TextView) findViewById(R.id.txtYear);
        ImageView imgStudent = (ImageView) findViewById(R.id.imgStudent);
        txtName.setText("Tên: "+student.name);
        txtCode.setText("MSSV: "+student.Code);
        txtDate.setText("Ngày sinh: "+ student.date);
        txtClass.setText("Lớp: "+ student.ClassRoom);
        txtYear.setText("Niên Khóa: "+ student.year);
        imgStudent.setImageResource(student.pic);
    }
}