package org.techtown.sns_project;

public class WriteInfo {
    private String title;
    private String contents;
    private String publisher;

    public WriteInfo(String title, String contents, String publisher){
        this.title = title;
        this.contents = contents;
        this.publisher = publisher;
    }
    public String gettitle(){
        return this.title;
    }
    public void gettitle(String title){
        this.title = title;
    }
    public String getcontents(){
        return this.contents;
    }
    public void getcontents(String contents){
        this.contents = contents;
    }
    public String getpublisher(){
        return this.publisher;
    }
    public void getpublisher(String publisher){
        this.publisher = publisher;
    }
}
