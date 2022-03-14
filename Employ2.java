package employ2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Employ2{
	private String name;
	private int salary;
	private String designation;
	private int Id;
	
	//constructor
	public void Employ(String name,String designation,int salary,int Id) {
		
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.Id=Id;
	}
	//getters and setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesg(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "employ [name=" + name + ", salary=" + salary + ", desg=" + designation + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employ2> c =new ArrayList<Employ2>();
		int ch;
		do  {
			System.out.println("***************");
			System.out.println("1.show all the employee records");
			System.out.println("2.Add employee ");
			System.out.println("3.Remove employee");
			System.out.println("4.get employee details ");
			System.out.println("5.update the employee ");
			System.out.println("-1.exit the program ");
			System.out.println("***************");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1: System.out.println("show employee records");
	        System.out.println("--------------------------------------------------");
	        System.out.println("EmployeeName    Designation     Salary       Id");
	        Iterator<Employ2> i=c.iterator();
	        while(i.hasNext()) {
	           Employ2 x=i.next();
	    	   System.out.println(x);
	       }
	       System.out.println("--------------------------------------------------");
	            break;
			case 2:System.out.println(" add employee");
		       System.out.println(" add employee name---->");
		       String name=sc.next();
		       System.out.println(" add employee designation----->");
		       String designation=sc.next();
		       System.out.println(" add employee salary----->");
		       int salary=sc.nextInt();
		       System.out.println(" add employee Id----->");
		       int Id=sc.nextInt();
		       c.add(new Employ2());
               break;
			   case 3:System.out.println(" remove employee");
			   Boolean found=false;
			   System.out.println(" enter employee Id to remove");
			   Id=sc.nextInt();
			   i=c.iterator();
	       while(i.hasNext()) {
	    	   Employ2 x=i.next();
	    	   if(x.getId()==Id) {
	    		   i.remove();
	    		   found=true;
	    	   }
	       }
	       if(!found) {
	    	   System.out.println("Record not found"); 
	       }
	       else {
	    	   System.out.println("Record deleted"); 
	       }
		        break;
		case 4:System.out.println(" employee details are--->");
		System.out.println(" enter employee Id to get details ");
		Id=sc.nextInt();
		found=false;
		System.out.println("--------------------------------------------------");
		      i=c.iterator();
		       while(i.hasNext()) {
		    	   Employ2 x=i.next();
		    	   if(x.getId()==Id) {
		    	   System.out.println(x);
		    	   found=true;
		       }
		       }
		    	   if(!found) {
                 System.out.println("Record not found");
		    	   }
			       System.out.println("--------------------------------------------------");
		        
		       break;
		case 5:System.out.println(" update  employee details");
		found=false;
		System.out.println(" enter employee Id to update ");
		Id=sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		      ListIterator<Employ2>li=c.listIterator();
		       while(li.hasNext()) {
		    	   Employ2 x=li.next();
		    	   if(x.getId()==Id) {
		    	   System.out.println("enter new name");
		    	    name=sc.next();
			       System.out.println("employee new  designation----->");
			       designation=sc.next();
			       System.out.println(" add employee new salary----->");
			       salary=sc.nextInt();
			       li.set(new Employ2());
		    	   found=true;
		       }
		       }
		    	   if(found==false) {
                 System.out.println("Record not found");
		    	   }
		    	   else {
		    		   System.out.println("Record updated");
		    	   }
			       System.out.println("--------------------------------------------------"); break;
		       
		      
		case -1:System.out.println(" exit");
		        break;
		default:System.out.println(" Invalid selection");
		        break; 
		}

	}while(ch!=-1);
	}

}
