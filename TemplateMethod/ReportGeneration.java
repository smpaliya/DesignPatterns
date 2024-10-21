public abstract class ReportGeneration {
    final void generateReport(){
        fetchData();
        processData();
        formattingData();
    }

    final void fetchData(){
        System.out.println("Data is being fetched");
    }

    void processData(){
        System.out.println("Data is being processed");
    }

    abstract void formattingData();

}