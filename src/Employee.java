import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int age;
	private float salary;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public float getSalary() {
		return salary;
	}




	public void setSalary(float salary) {
		this.salary = salary;
	}




	public Employee(int id, String name, int age, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.getId()==o.getId())
			return 0;
		else if(this.getId()<o.getId())
			return 1;
		else
			return -1;
			
	}


	public static void main(String[] args)
	{
		try
		{
			//Map< String, List<Employee> > m=new HashMap< String, List<Employee> >();
			List<Employee> l=new ArrayList<Employee>();
			Scanner sc=new Scanner(System.in);
			int id ;
			String name;
			int age ;
			float Salary;
			
			
			while(true)
			{
				System.out.print("\nThe Choices:\n1>Add\n2>Delete\n3>Display\n4>Sort\n\n");
				System.out.println("Enter the choice: ");
				//System.out.println("To quit type -1");
				int num=sc.nextInt();
				/*if(num == -1)
				{
					break;
				}*/
				switch(num)
				{
					case 1:
						System.out.println("Enter Employee Id: ");
						id = sc.nextInt();
						System.out.println("Enter Employee Name: ");
						name = sc.next();
						System.out.println("Enter Employee Age: ");
						age = sc.nextInt();
						System.out.println("Enter Employee Salary: ");
						float salary = sc.nextFloat();
						Employee e = new Employee(id,name,age,salary);
						
						l.add(e);
						break;
						
					case 2:
						l.remove(0);
						Iterator<Employee> itr = l.iterator();
						while(itr.hasNext())
						{
							for(int i=0;i<l.size();i++)
							{
								System.out.println("Which Employee Do You Want Delete? Type His/Her Id: ");
								 id = sc.nextInt();
								 Employee emp = itr.next();
								 if(l.equals(id))
								 {
									 l.remove(i);
								 }
								
							}
						}
						break;
					
					case 3:
						//System.out.println("=========================================================");
						//System.out.println("ID"+"\t"+"NAME"+"\t\t"+"AGE"+"\t\t"+"SALARY");
						//System.out.println("=========================================================");
						
						Iterator<Employee> i=l.iterator();

						while(i.hasNext()) 
						{
						    
						    System.out.println("Employees Details = "+i.next());
						}
						
						break;
						
					case 4:
						TreeSet<Employee> treeset = new TreeSet<Employee>();
						Iterator<Employee> itr1 = treeset.iterator();
						while(itr1.hasNext())
						{
							Employee obj = itr1.next();
							System.out.println(obj.getName()+" "+obj.getId());
						}
						break;
					
					
					
				}
			}
			
		}catch(Exception e)
		{
			System.out.println("Exception Occurring: ");
		}
	}




	
}






