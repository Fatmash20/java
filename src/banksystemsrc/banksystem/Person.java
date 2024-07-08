/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

/**
 *
 * @author Dell
 */
public class Person {
   private int id;
   private String name;
    private String password;
  
    
    public void setname(String n){
       if(Validation.Vali_name(name)) {
           name=n;
       } else { System.out.println("Make sure that your name meets the requirement ");
       }
    }
    public void setpass(String pass){
         if(Validation.Vali_pass(pass)){
      password=pass;}
        else { System.out.println("Make sure that your passworde meets the requirement ");}
    }
    public void setid(int id){
         if(Validation.Vali_id(id)){
       this.id=id;}
         else { System.out.println("Make sure that your id meets the requirement ");}
    }
    
     public int getid(){
       
        return id;
    }
       public String getpassword(){
       
        return password;
    }
           public String getname(){
       
        return name;
    }
      public Person(){
               
           }
           public Person (int id,String pass,String name){
               this.name=name;
               password=pass;
               this.name=name;
           }
}
