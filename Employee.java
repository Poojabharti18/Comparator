package ComparatorEx;

public class Employee {
	int id;
	String name;
	float salary;
	private static int idgen=1001;
	
	Employee()//default
	{
		id=idgen++;//1001
	}
	Employee(String j,float k)//i=1001,j="gayathri" k=45000
	{
		this();//default constructor
		name=j;//gayathri
		salary=k;//45000
	}
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	double annualsalary()
	{
		double annualsalary=salary*12;
		return annualsalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
