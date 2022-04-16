class Employee{
    /*public void display(String name,int yoj,float sal,String address){
        System.out.println("Name ,Year of joining, Salary, Address: "+name+" "+yoj+" "+sal+" "+address);
    }*/
    Employee(String name,int yoj,float sal,String address){
        System.out.println("Name ,Year of joining, Salary, Address: "+name+" "+yoj+" "+sal+" "+address);
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Robert ",1994,50000f," 64C- WallsStreet Sam 2000 68D- WallsStreet John 1999 26B- WallsStreet");
		Employee emp2= new Employee("ABC",1995,35020f,"XYZWD");
		Employee emp3= new Employee("Xyz",2000,12300f,"AEFTC");
		/*Employee emp = new Employee();
		emp.display("Abc",1990,50000f,"ABCDEF");
		emp.display("Def",1995,35020f,"XYZWD");
		emp.display("Xyz",2000,12300f,"AEFTC");*/
	}
}
