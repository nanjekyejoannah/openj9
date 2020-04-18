// Java code for serialization and deserialization
// of a Java object
import java.io.*;

class Emp implements Serializable {
private static final long serialversionUID =
								129348938L;
	transient int a;
	static int b;
	String name;
	int age;

	// Default constructor
public Emp(String name, int age, int a, int b)
	{
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}

public class SerialExample {
public static void printdata(Emp object1)
	{

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);
	}

public static void main(String[] args)
	{
		Emp object = new Emp("ab", 20, 2, 1000);
		String filename = "shubham.txt";

		// Serialization
		try {

			// Saving of object in a file
			FileOutputStream file = new FileOutputStream
										(filename);
			ObjectOutputStream out = new ObjectOutputStream
										(file);

			long startTime = System.nanoTime();
		    methodToTime();
			// Method for serialization of object
			out.writeObject(object);
			long endTime = System.nanoTime();
			long duration = (endTime - startTime);

			System.out.println(duration);

			out.close();
			file.close();
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}
}
