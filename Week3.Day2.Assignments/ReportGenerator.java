package week3.day2.assignments;

public class ReportGenerator {

   
    public void reportStep(String msg, String status) {
        System.out.println("ReportStep (2 arguments) called:");
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
    }

    
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("ReportStep (3 arguments) called:");
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Take Snapshot: " + snap);
    }

    public static void main(String[] args) {

        ReportGenerator report = new ReportGenerator();

        System.out.println("---- Calling reportStep with 2 arguments ----");
        report.reportStep("Login successful", "PASS");

        System.out.println("\n---- Calling reportStep with 3 arguments ----");
        report.reportStep("Clicked on login button", "PASS", true);
    }
}
