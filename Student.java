/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;
import java.io.Serializable;

/**
 *
 * @author hieu
 */
public class Student implements Serializable {
    private int id;
    private String name;
    private byte age;
    private float gpa;
    
    public Student(){
    }
    public Student (int id, String name, byte age,float gpa){
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    }

    Student(int id, String name, byte age, String address, float gpa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public byte getAge(){
        return age;
    }
    public void setAge (byte age){
        this.age = age;
    }
    public float getGpa(){
        return gpa;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
}