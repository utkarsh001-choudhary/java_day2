package com.classpath.client;
import com.classpath.inheritance.Doctor;
import com.classpath.inheritance.Orthopedician;
public class DoctorClinet {
    public static void main(String[] args){
        Doctor doctor=new Doctor("vinod","Ortho");
        doctor.treatPatient("Harish");
        Doctor ortho= new Orthopedician("raj");
        ortho.treatPatient("ahrish");
    }
}
