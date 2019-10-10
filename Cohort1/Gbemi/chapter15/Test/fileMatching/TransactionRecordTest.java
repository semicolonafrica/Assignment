package fileMatching;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionRecordTest {
TransactionRecord myrecord;
FileMatch myFile;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myrecord = new TransactionRecord();
		myFile = new FileMatch();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTransFile() throws IOException {
//		Scanner inTransaction =new Scanner(Paths.get("trans.txt"));
//		myrecord.setAcctNo(inTransaction.nextInt());
//		myrecord.setAmount(inTransaction.nextDouble());
		myFile.openTransFile();
		myFile.readTransFile();
		myFile.closeTransFile();
	}

	@Test
	void testOldmasterFile() {
		myFile.openOldMastFile();
		myFile.readOldMastFile();
		myFile.closeOldMastFile();
	}
	@Test
	void testWritingToTransFile() throws IOException {
		myrecord.openMyTransFile();
		myrecord.addRecordMyTransFile();
		myrecord.closeMyTransFile();
	}
	
	@Test
	void testMyFileMacth() {
		
		myFile.matchFile();
	}
}
