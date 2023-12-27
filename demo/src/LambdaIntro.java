	import java.util.Arrays;
public class LambdaIntro {


	
		  public static void main (String[] args){    // here signature of class then after in arguments make class then enter the name of the employees
		          Employee[] employees  = {
		              new Employee("Deepak"),
		              new Employee("Naveen"),
		              new Employee("Amit"),
		              new Employee("Raj")};
		            
		    System.out.println("Before Sorting Names: "+Arrays.toString(employees)); // to print out the names before the shorting 
		          Arrays.sort(employees, Employee::nameCompare); // shorting the array of names 
		          System.out.println("After Sorting Names "+Arrays.toString(employees)); // print the array after the shorting
		      }
		}
		  
		class Employee {   // here employee name classs 
		  String name;
		  
		  Employee(String name) { // using this function 
		    this.name = name;
		  }
		  
		  public static int nameCompare(Employee a1, Employee a2) {  // here we compare the name of emloyee
		    return a1.name.compareTo(a2.name);
		  }
		    
		  public String toString() { // use toString because it return the a string
		    return name;
		  }
		}

