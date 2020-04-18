package org.openj9.test.javaagenttest;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.lang.instrument.IllegalClassFormatException;
import org.openj9.test.javaagenttest.util.Source;
import org.openj9.test.javaagenttest.util.Transformer;

import com.ibm.oti.vm.VM;


@Test(groups = { "level.extended" })
public class OpenJ9SkyWay_Test {

	private static final Logger logger = Logger.getLogger(OpenJ9SkyWay_Test.class);

	@Test
	public void testGCOpenJ9SkyWay(){
		logger.info("Starting OpenJ9SkyWay_Test...");
		logger.debug("Creating a buffer of Heap state...");
		outBuf = VM.outPutBuffer(NULL);
		logger.debug("Finished creating the ouptut buffer...");
		logger.debug("Test passed");
	}

}
