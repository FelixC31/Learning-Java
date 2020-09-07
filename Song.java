package com.jetBrains;

public class Song {



    private String name;
     private int length;
     private boolean flag;

    public Song(String name, int length, boolean flag) {
        this.name = name;
        this.length = length;
        this.flag = flag;
    }
    public Song() {
        this.name = name;
        this.length = length;
        this.flag = flag;
    }



    public String getName() {
        return name;
    }

    public void setFlag(boolean flag) {

        this.flag = flag;
    }

    public String getDetails(){
       return name + " (time: " + length + " min)";
    }


    }


