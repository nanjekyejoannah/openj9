
import java.io.*;
import com.ibm.oti.vm.VM;

class ser implements Serializable {
private static final long serialversionUID =
								129348938L;
	transient int a;
	static int b;
	String name;
	int age;

	// Default constructor
public ser(String name, int age, int a, int b)
	{
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}


public class skyway{

	public static void main(String[] args)
	{
		ser object = new ser("ab", 20, 2, 1000);

		long startTime = System.nanoTime();
		try{
			outBuf = VM.outPutBuffer(object);
		}catch(ArithmeticException e){System.out.println(e);}
   		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration);

	}
}