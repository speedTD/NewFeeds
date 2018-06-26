package com.developer.dinhduy.animation_demo2;

class Noidung {
    private String Name;
    private String LinkAnh;

    public Noidung(String name, String linkAnh) {
        Name = name;
        LinkAnh = linkAnh;
    }

    public Noidung() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        LinkAnh = linkAnh;
    }
}
