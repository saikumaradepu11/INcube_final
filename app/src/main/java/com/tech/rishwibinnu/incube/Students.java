package com.tech.rishwibinnu.incube;

public class Students {

    public String name,htno;

    public Students()
    {

    }

    public Students(String name, String htno) {
        this.name = name;
        this.htno = htno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtno() {
        return htno;
    }

    public void setHtno(String htno) {
        this.htno = htno;
    }
}
