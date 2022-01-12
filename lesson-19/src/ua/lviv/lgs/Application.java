package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("Serialization.txt");
		File file2 = new File("ArraySerialization.txt");
		Employee e = new Employee("John", 1, 14000.0);
		Methods m = new Methods();

		m.Serialize(file, e);
		System.out.println(e);
		System.out.println(m.Deserialize(file, e));
		
		ArrayList<Employee> arr = new ArrayList<>();
		arr.add(new Employee("Bruno", 2, 12500.50));
		arr.add(new Employee("Andrew", 3, 15500.0));
		arr.add(new Employee("Juan", 4, 11500));
		
		m.Serialize(file2, arr);
		System.out.println(m.Deserialize(file2, arr));
		
	}
}