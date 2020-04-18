
import java.io.*;
import com.ibm.oti.vm.VM;


public class SkyWay{

	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		methodToTime();
		outBuf = VM.outPutBuffer(NULL);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);

		System.out.println(duration);
	}
}