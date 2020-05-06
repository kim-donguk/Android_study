package org.techtown.sns_project;

import java.util.ArrayList;
import java.util.Date;

public class WriteInfo {
    private String title;
    private ArrayList<String> contents;
    private String publisher;
    private Date createdAt;

    public WriteInfo(String title, ArrayList<String> contents, String publisher,Date createdAt){
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
        this.createdAt = createdAt;
    }
    public String gettitle(){
        return this.title;
    }
    public void gettitle(String title){
        this.title = title;
    }
    public ArrayList<String> getcontents(){
        return this.contents;
    }
    public void getcontents(ArrayList<String> contents){
        this.contents = contents;
    }
    public String getpublisher(){
        return this.publisher;
    }
    public void getpublisher(String publisher){
        this.publisher = publisher;
    }
    public Date getcreatedAt(){
        return this.createdAt;
    }
    public void getcreatedAt(Date publisher){
        this.createdAt = createdAt;
    }
}
