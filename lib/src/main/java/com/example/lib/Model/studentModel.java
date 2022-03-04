package com.example.lib.Model;

import android.graphics.ColorSpace;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class studentModel implements Serializable {
    public String name;
    public String Phone ;
    public String Code ;
    public String date;
    public String ClassRoom ;
    public String year ;
    public int pic ;

    public studentModel(String name, String phone, String code, String date, String aClass, String year, int pic) {
        this.name = name;
        this.Phone = phone;
        this.Code = code;
        this.date = date;
        this.ClassRoom = aClass;
        this.year = year;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(String aClass) {
        ClassRoom = aClass;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return  name + '-' +  Phone + '-' + Code ;
    }
}
