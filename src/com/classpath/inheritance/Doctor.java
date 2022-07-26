package com.classpath.inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Doctor{
    private String name;
    private String specialisation;
    //constructor
    public Doctor(String name,String specialisation){
        this.name=name;
        this.specialisation=specialisation;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSpecialisation(String specialisation)
    {
        this.specialisation=specialisation;
    }
    public String getSpecialisation(){
        return this.specialisation;
    }
    public void treatPatient(String patientName){
        System.out.println(patientName);
    }


}

