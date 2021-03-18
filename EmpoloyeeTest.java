
import java.util.*;
import  java.io.*;
class Empolyee
{
	String  first_name;
	String last_name;
	int salaray;
	Empolyee()	
	{
		setFirst_name();
		setLast_name();
		setSal();
			
	}
	void  setFirst_name()
	{
		try
		{
		System.out.println("\n Enter  First Name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		 first_name=br.readLine(); 
		}catch(Exception e){}
	}
	void  setLast_name()
	{
		try
		{
		System.out.println("\n Enter  Last Name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		last_name=br.readLine(); 
		}catch(Exception e){}

	}
	void  setSal()
	{
		try
		{
		
		System.out.println("\n Enter  salaray");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		salaray=Integer.parseInt(br.readLine());
		}catch(Exception e){}
	}
	void  display()
	{
		getFirst();
		getLast();
		getSal();

	}
	void getFirst()
	{

		System.out.println("\tFirst Name"+first_name);
	}
	void getLast()
	{
		System.out.println("\tlast Name:-"+last_name);
	}	
	void getSal()
	{
		if(salaray>0)
		{ 
			salaray*=0.10;
		System.out.println("\tSalaray:"+salaray);
		}
		else
		{ 
			salaray=0;
			 salaray*=0.10;
			System.out.println("\tSalaray:"+salaray);
		}
	}


}
class  EmpoloyeeTest 
{
	public static void main(String args[])
	{
		
		try
		{
		int  n=2;
		Empolyee  e1[]=new Empolyee[5];
		int i=0;
		for(i=0;i<n;i++)
		{
		  
		     e1[i]=new Empolyee();

		}
		
		System.out.println("**************Empolyee Details ******************");
		
		 for(i=0;i<n;i++)
		{
		      e1[i].display();

		}
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		 
		
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		 	}catch(Exception e){}

	}

}