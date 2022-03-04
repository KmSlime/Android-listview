package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.lib.Model.studentModel;
import com.example.listview.Adapter.StudentApdapter;

public class ListView extends AppCompatActivity {
    android.widget.ListView listview ;
    StudentApdapter studentApdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listview = findViewById(R.id.ListView);
        studentApdapter = new StudentApdapter(ListView.this,R.layout.studentitem);

        studentApdapter.add(new studentModel("Nguyễn Hồng Liêm", "0792777911" , "18DTHA1", "11/08/1999", "18DTHA1","2018-2022",R.drawable.ic_baseline_face_100));
        studentApdapter.add(new studentModel("Sinh viên 1", "1234567890" , "12345", "1/1/2000", "18DTHA1","2018-2022",R.drawable.ic_baseline_adb_24));
        studentApdapter.add(new studentModel("Sinh viên 2", "1234567890" , "12345", "1/1/2001", "18DTHA1","2018-2022",R.drawable.ic_mitsuki2_foreground));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                studentModel item = (com.example.lib.Model.studentModel) studentApdapter.getItem(position);
//                Toast.makeText(ListViewAdvance.this, item.year,Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(ListView.this, sub.class);
                bundle.putSerializable("student", item);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        listview.setAdapter(studentApdapter);
    }
}