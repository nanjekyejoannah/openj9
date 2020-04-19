
import java.io.*;

/*
 * This test case is only designed for testing gc handles static references of hot swap class in gencon,
 * please add -Xgcpolicy:gencon as VMArg for the testing
 */
public class testgc {


	public static void main(String[] args)
	{
		long startTime = System.nanoTime();
		System.gc();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println(duration);
	}
}
