package bookshop;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private  List<PrintEdition> printEditionList = new ArrayList<>();
    private  Employee employee;
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public void addPrintEdition(PrintEdition printEdition){
        printEditionList.add(printEdition);
    }

    public void setEmnployee(Employee employee){
        this.employee = employee;
    }


    public void addPriceToEmployee(int price) {
        employee.addPrice(price);
    }

    public Employee getEmployee() {
        return employee;
    }

    public List<PrintEdition> getPrintEditionList() {
        return printEditionList;
    }

    public void setPrintEditionList(List<PrintEdition> printEditionList) {
        this.printEditionList = printEditionList;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
