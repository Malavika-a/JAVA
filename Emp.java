class Employee{
	int Empid;
	String Name;
	int Salary;
	String Address;
	Employee(int eid,String Name,int Sal,String Add){
		Empid=eid;
		this.Name=Name;
		Salary=Sal;
		Address=Add;
	}
}
class Teacher extends Employee{
	String Department;
	String Subject_taught;
	Teacher(int eid,String Name,int Sal,String Add,String Dep,String Sub){
	super(eid,Name,Sal,Add);
	Department=Dep;
	Subject_taught=Sub;
}
	public void display(){
		System.out.println("The Employee id :"+Empid);
		System.out.println("The Employee Name :"+this.Name);
		System.out.println("The Employee Salary :"+Salary);
		System.out.println("The Employee Address :"+Address);
		System.out.println("The Department :"+Department);
		System.out.println("The Subject taught :"+Subject_taught); 
	}
}
class Emp{
	public static void main(String args[]){
		Teacher emp1= new Teacher(101,"Aby",15000,"KOttayam","CS","Java");
		System.out.println("*******EMP1********");
		emp1.display();
		System.out.println(" ");
		Teacher emp2= new Teacher(102,"Ann",15000,"Kannur","MCA","DBMS");
		System.out.println("*******EMP2********");
		emp2.display(); 
		System.out.println(" ");
		Teacher emp3= new Teacher(103,"Iva",25000,"Idukki","Maths","Statistics");
		System.out.println("*******EMP3********");
		emp3.display();
	}
}