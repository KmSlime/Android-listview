package com.example.lib.Repository;

import com.example.lib.Model.studentModel;

import java.util.ArrayList;
import java.util.List;

public class studentRepository {
    public studentRepository(){

    }
    public List<studentModel> getStudent(){
        List<studentModel> studentModelList = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            studentModelList.add(new studentModel("Sinh viên" +i, "1234567890" , "code"+ i, "1/1/2001", "18DTHA1","2019-2023",0));
        }
        return studentModelList;
    }
}
