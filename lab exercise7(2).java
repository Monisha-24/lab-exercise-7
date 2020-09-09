/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package test;
import java.util.Scanner;
import java.util .Arraylist;
import java .util .*;
public class main
{
	public static void main(String[] args) {
	Scanner obj =new Scanner (System .in);
	ArrayList <employee>list=new ArrayList<>();
	employee e1=new employee("aa",70000);
	employee e2=new employee("bb",60000);
	list.add(e1);
	list.add(e2);
	for(int i=0;i<20;i++)
	{
	    System .out.println("Enter the name and Salary of employee"+(i+1));
	    String na=Obj.next();
	    double sa=Obj.nextDouble();
	    list.add(i,new employee(na,sa));
	}
	Collection.sort(list,new namesort());
	System.out.println(list);
	}
}
class employee
{
    String name;
    double Salary;
    employee(String n,double S)
    {
        name=n;
        Salary=S;
    }
    public String toString()
    {
        return "\n name:"+name+"\n Salary"+salary;
    }
}
class namesort implements Comparator<employee>
{
    public int compare(employee e1,employee e2)
    {
        System .out.println(e1.name+"....."+e2.name);
        return e2.name.CompareTo(e1.name);
    }
}
