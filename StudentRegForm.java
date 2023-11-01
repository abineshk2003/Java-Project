package mypro;

import java.awt.*;
import java.awt.event.*;

 class Myapp extends Frame 
{ 
     Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress;
     TextField txtName,txtFather,txtAge;
     TextArea txtAddress;
     Checkbox checkMale,checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
     CheckboxGroup cbg;
     Choice course;
     Button btnSave,btnClear;
  public Myapp()
  {
    super("Registation Form");
    setSize(1000,600);
    setLayout(null);
    setVisible(true);
    Color formclr=new Color(53,59,72);
    setBackground(formclr);       
    
    Font titleFont =new Font("arial",Font.BOLD,25);
    Font labelFont =new Font("arial",Font.BOLD,18);
    Font textFont =new Font("arial",Font.BOLD,15);
    
    lblTitle=new Label("Registation Form");
    lblTitle.setBounds(250,40,300,50);
    lblTitle.setFont(titleFont);
    lblTitle.setForeground(Color.YELLOW);
    add(lblTitle);
    
    lblName=new Label("Name");
    lblName.setBounds(250,100,150,30);
    lblName.setFont(labelFont);
    lblName.setForeground(Color.WHITE);
    add(lblName);
    
    txtName=new TextField();
    txtName.setBounds(400,100,400,30);
    txtName.setFont(textFont);
    add(txtName);
    
    lblFather=new Label("Father");
    lblFather.setBounds(250,150,150,30);
    lblFather.setFont(labelFont);
    lblFather.setForeground(Color.WHITE);
    add(lblFather);
    
    txtFather=new TextField();
    txtFather.setBounds(400,150,400,30);
    txtFather.setFont(textFont);
    add(txtFather);
    
    lblAge=new Label("Age");
    lblAge.setBounds(250,200,150,30);
    lblAge.setFont(labelFont);
    lblAge.setForeground(Color.WHITE);
    add(lblAge);
    
    txtAge=new TextField();
    txtAge.setBounds(400,200,400,30);
    txtAge.setFont(textFont);
    add(txtAge);
    
    lblGender=new Label("Genter");
    lblGender.setBounds(250,250,150,30);
    lblGender.setFont(labelFont);
    lblGender.setForeground(Color.WHITE);
    add(lblGender);

    cbg=new CheckboxGroup();
    checkMale=new Checkbox("Male",cbg,true);
    checkMale.setBounds(400,250,100,30);
    checkMale.setFont(labelFont);
    checkMale.setForeground(Color.WHITE);
    add(checkMale);
    
    checkFemale=new Checkbox("Female",cbg,false);
    checkFemale.setBounds(500,250,100,30);
    checkFemale.setFont(labelFont);
    checkFemale.setForeground(Color.WHITE);
    add(checkFemale);
    
    
    lblCourse=new Label("Genter");
    lblCourse.setBounds(250,300,150,30);
    lblCourse.setFont(labelFont);
    lblCourse.setForeground(Color.WHITE);
    add(lblCourse);
    
    course=new Choice();
    course.setBounds(400,300,400,50);
    course.setFont(labelFont);
    course.add("C");
    course.add("C++");
    course.add("Python");
    course.add("Java");
    course.add("SQL");
    add(course);
    
    lblHobbies=new Label("Hobbies");
    lblHobbies.setBounds(250,350,150,30);
    lblHobbies.setFont(labelFont);
    lblHobbies.setForeground(Color.WHITE);
    add(lblHobbies);
    
    Hobbies1=new Checkbox("Drawing");
    Hobbies1.setBounds(400,350,100,50);
    Hobbies1.setFont(labelFont);
    Hobbies1.setForeground(Color.WHITE);
    add(Hobbies1);
    
    
    Hobbies2=new Checkbox("Singing");
    Hobbies2.setBounds(500,350,100,50);
    Hobbies2.setFont(labelFont);
    Hobbies2.setForeground(Color.WHITE);
    add(Hobbies2);
    
    
    Hobbies3=new Checkbox("Music");
    Hobbies3.setBounds(600,350,100,50);
    Hobbies3.setFont(labelFont);
    Hobbies3.setForeground(Color.WHITE);
    add(Hobbies3);
    
    
    Hobbies4=new Checkbox("Others");
    Hobbies4.setBounds(700,350,100,50);
    Hobbies4.setFont(labelFont);
    Hobbies4.setForeground(Color.WHITE);
    add(Hobbies4);
    
    lblAddress=new Label("Address");
    lblAddress.setBounds(250,400,150,30);
    lblAddress.setFont(labelFont);
    lblAddress.setForeground(Color.WHITE);
    add(lblAddress);
    
    txtAddress=new TextArea(10,30);
    txtAddress.setBounds(400,400,400,100);
    txtAddress.setFont(labelFont);
    add(txtAddress);
    
    btnSave=new Button("Save Details");
    btnSave.setBounds(400,530,150,30);
    btnSave.setFont(labelFont);
    btnSave.setBackground(Color.GREEN);
    btnSave.setForeground(Color.WHITE);
    add(btnSave);
    
    btnClear=new Button("Clear All");
    btnClear.setBounds(560,530,150,30);
    btnClear.setFont(labelFont);
    btnClear.setBackground(Color.RED);
    btnClear.setForeground(Color.WHITE);
    add(btnClear);
    
    
//close botton
this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
  }}
  
public class student {
    public static void main(String[] args){
        Myapp s1=new Myapp();
    }
}