
import java.io.*;
import com.ibm.oti.vm.VM;


public class skyway{

	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		try{
			outBuf = VM.outPutBuffer(NULL);
		}catch(ArithmeticException e){System.out.println(e);}
   			long endTime = System.nanoTime();
			long duration = (endTime - startTime);
			System.out.println(duration);

	}
}