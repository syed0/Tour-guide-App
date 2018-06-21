package com.example.tourguide.tourguide;

public class custom {
    private int imageid;
    private int name;
    private int subname;

    public custom(int mimageid, int mname, int msubname1) {
        imageid = mimageid;
        name = mname;
        subname = msubname1;
    }

    public custom(int mname, int msubname) {

        name = mname;
        subname = msubname;
    }


    public int getImageid() {
        return imageid;
    }

    public int getName() {
        return name;
    }

    public int getSubname() {
        return subname;
    }
}
