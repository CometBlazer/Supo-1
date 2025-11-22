public class StudentReportGenerator  {
    public static final int DEFAULT_YEAR = 2025;

    private String reportTitle; 

    public StudentReportGenerator(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String generateReport() {
        return "Generating a student report for the year " + DEFAULT_YEAR + " titled: " + reportTitle;
    }
    
}
