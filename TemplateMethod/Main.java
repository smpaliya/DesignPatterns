public class Main {
    public static void main(String[] args) {
        ReportGeneration rg=new Pdf();
        ReportGeneration  rg2= new Html();
        rg.generateReport();
        rg2.generateReport();
    }
}
