package com.example.lib.Services;

import com.example.lib.Model.studentModel;
import com.example.lib.Repository.studentRepository;

import java.util.List;

public class studentService
{
    studentRepository studentRepos ;
    public studentService(){
        studentRepos = new studentRepository();
    }
    public List<studentModel> getStudentList(){
        return studentRepos.getStudent();
    }
}
