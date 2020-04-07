package org.techtown.sns_project;

import android.widget.EditText;

public class MemberInfo {
    private String name;
    private String phoneNumber;
    private String birthDay;
    private String address;

    public MemberInfo(String name, String phoneNumber, String birthDay, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public void getName(String name){
        this.name = name;
    }
    public String getphoneNumber(){
        return this.phoneNumber;
    }
    public void getphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getbirthDay(){
        return this.birthDay;
    }
    public void getbirthDay(String birthDay){
        this.birthDay = birthDay;
    }
    public String getaddress(){
        return this.address;
    }
    public void getaddress(String address){
        this.address = address;
    }
}
