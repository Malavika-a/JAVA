 import java.util.Scanner;
 class Person{
  String Name;
  String Gender;
  String Address;
  int Age;
  Person(String Nm,String G,String Add,int Ag){
   Name=Nm;
   Gender=G;
   Address=Add;
   Age=Ag;
   }
   }
  class Employee extends Person{
	  int Empid;
	  String Company_name;
	  String Qualification;
	  int Salary;
	Employee(String Nm,String G,String Add,int Ag,int Id,String Cname,String Quali,int Sal){
      super(Nm,G,Add,Ag);
      Empid=Id;
      Company_name=Cname;
      Qualification=Quali;
      Salary=Sal;
	}
  }
  class Teacher extends Employee{
      String Subject;
      String Department;
      int Teacherid;
    Teacher(String Nm,String G,String Add,int Ag,int Id,String Cname,String Quali,int Sal,String Sub,String Dep,int Tid){
      super(Nm,G,Add,Ag,Id,Cname,Quali,Sal);
      Subject=Sub;
      Department=Dep;
      Teacherid=Tid;
	}
  void display(){
   System.out.println("Person Name : "+Name);	
   System.out.println("Gender: "+Gender);
   System.out.println("Address: "+Address);
   System.out.println("Age: "+Age);
   System.out.println("Employee id: "+Empid);
   System.out.println("Company Name: "+Company_name);
   System.out.println("Qualification: "+Qualification);
   System.out.println("Salary: "+Salary);
   System.out.println("Subject: "+Subject);
   System.out.println("Department: "+Department);
   System.out.println("Teacher id: "+Teacherid);   
  }
  }
  class Pers{
	public static void main(String[] args) {
    System.out.println("\nEnter the No. of persons");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
		System.out.println("*******Enter Details*******");
        System.out.println("\nEnter Person Name: ");
        String Name=sc.next();
        System.out.println("\nEnter Gender: ");
        String Gender=sc.next();
        System.out.println("\nEnter Address: ");
        String Address=sc.next();
		System.out.println("\nEnter Age: ");
        int Age=sc.nextInt();
		System.out.println("\nEnter Employee id: ");
        int Empid=sc.nextInt();
        System.out.println("\nEnter Company Name: ");
        String Company_name=sc.next();
        System.out.println("\nEnter Qualification: ");
        String Qualification=sc.next();
		System.out.println("\nEnter Salary: ");
        int Salary=sc.nextInt();
		System.out.println("\nEnter Subject: ");
        String Subject=sc.next();
		System.out.println("\nEnter Department: ");
        String Department=sc.next();
		System.out.println("\nEnter Teacher id: ");
        int Teacherid=sc.nextInt();
        arr[i]=new Teacher(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary,Subject,Department,Teacherid);
   }
   System.out.println("\n********Informations of all the employee's************");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
       
 }
 sc1.close();
 }
  }