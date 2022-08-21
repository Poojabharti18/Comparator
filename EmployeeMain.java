package ComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {


		public static void main(String[] args) {
			Employee e1=new Employee("gayathri",95000);
			
			Employee e2=new Employee("ravi",50000);
			
			ArrayList<Employee> list=new ArrayList<Employee>();
			list.add(e1);
			list.add(e2);
			System.out.println(list);
			System.out.println("===========================");
			SalarySort s1=new SalarySort();
			NameSort s2=new NameSort();
			Collections.sort(list,s1);
//			for(Employee e:list)
//			{
//				System.out.println(e);
//			}
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			if(choice==1)
			{
				Collections.sort(list,s1);
				for(Employee e:list)
				{
					System.out.println(e);
				}
			}
			else
			{
				Collections.sort(list,s2);
				for(Employee e:list)
				{
					System.out.println(e);
				}
			}
	}

}
