package com.example.awyel.doctory;

/**
 * Created by AWYEL on 6/25/2018.
 */

public class Student {
    String name = null;
    String title=null ;
    String specil=null;
    String number = null;

    public Student(String Sname, String Snumber, String Stitle, String Sspical) {

        super();

        this.name = Sname;
        this.number = Snumber;
        this.title=Stitle;
        this.specil=Sspical;
    }

    public String getName() {

        return name;

    }
    public void setName(String Name2) {

        this.name = Name2;

    }
    public String getNumber() {

        return number;

    }
    public void setNumber(String number2) {

        this.number = number2;

    }

    public void setSpecil(String specil) {
        this.specil = specil;
    }

    public String getSpecil() {
        return specil;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return  name + "  " + number  + " " + title  + " " + specil ;

    }

}