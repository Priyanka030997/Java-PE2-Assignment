package com.stackroute.pe2;

public class Member {
    String name;
    int age, salary;

    public void set(String Name,int Age,int Salary)
    {
      name=Name;
      age=Age;
      salary=Salary;
    }
    public void display()
    {
        System.out.println("Members Name: "+name);
        System.out.println("Members Age: "+age);
        System.out.println("Members Salary: "+salary);

    }
}
class MemberVariable
{
    public static void main(String args[])
    {
       // Scanner sc=new Scanner(System.in);
        Member member=new Member();
        member.set("Harry Potter",21,30000);
        member.display();

    }
}
