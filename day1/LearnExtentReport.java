package week7.day1;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	/*
	 * What is mean by reporter ?
	 * ==========================
	 * 1. Error
	 * 2. Status of the execution
	 * 3. TestName
	 * --------------------------
	 * ExtentReport
	 * ============
	 * 4. Test Description
	 * 5. Test Author name
	 * 6. Test Category
	 * 7. Screenshot 
	 * 
	 * all the reports developed using which format ? HTML
	 */

	public static void main(String[] args) throws IOException {
		// way 1 : TimeStamping
        DateTimeFormatter requiredPattern = DateTimeFormatter.ofPattern("MMM dd,yyyy HH_mm_ssa");
        String timeStamp = LocalDateTime.now().format(requiredPattern);
		// step 1 : The ExtentHtmlReporter creates a rich standalone HTML file
		//          file path as the argument here
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/"+timeStamp+"-result.html"); // physical file is created
		// way 2 : reporter.setAppendExisting(true);
		// step 2 : The ExtentReports report client for starting reporters and building reports.
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		// step 3 : Creates a test with description
		// Parameters:
		// testName : Name of test
		// testDescription : A short test description
		ExtentTest test = extent.createTest("Create Lead", "Test to verify the create lead functionality with the valid test data");
		// step 4 : Defines a test.
		// 1.You can assign author and test category
		// 2.You can add Status: Pass nor Fail 
		// 3.You can add snapshots 
		
		test.assignAuthor("Bhuvanesh");
		test.assignCategory("Sanity");
		test.pass("User name is entered successfully");
		test.pass("password is entered successfully");
		//test.fail("Login button cannot accept the click action", MediaEntityBuilder.createScreenCaptureFromPath("./snap/screenShot.png"));
		test.fail("Login button cannot accept the click action", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/screenShot.png").build());
		// step 5: Writes test information from the started reporters to their output view
		extent.flush();
		System.out.println("Reported Generated Successfully");
	}

}