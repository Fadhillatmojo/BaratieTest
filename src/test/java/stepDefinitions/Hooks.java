package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest createTestimonialTest;
    public static ExtentTest deleteTestimonialTest;
    public static ExtentTest updateTestimonialTest;
    @BeforeAll
    public static void setUp() {
        extent = ExtentReportManager.getInstance();
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        createTestimonialTest = extent.createTest("Create Testimonial Test");
        deleteTestimonialTest = extent.createTest("Delete Testimonial Test");
        updateTestimonialTest = extent.createTest("Update Testimonial Test");
    }
    public static WebDriver getDriver() {
        if (driver == null) new Hooks().setUp();
        return driver;
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

        createTestimonialTest.log(Status.INFO, "Close Create Testimonial");
        deleteTestimonialTest.log(Status.INFO, "Close Delete Testimonial");
        updateTestimonialTest.log(Status.INFO, "Close Update Testimonial");

        extent.flush();
    }


}
