
import java.io.*;
import com.ibm.oti.vm.VM;


public class skyway{

	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		outBuf = VM.outPutBuffer(NULL);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration);
	}
}