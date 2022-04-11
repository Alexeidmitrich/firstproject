package bookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookshop {

    Director director;
    private List<Employee> employeeList = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();
    private List<Magazine> magazineList = new ArrayList<>();
    private List<PrintEdition> printEditionList = new ArrayList<>();
    private Department bookDepartment = new Department("книжный");
    private Department newspapersDepartment = new Department("газетный");
    private List<PrintEdition> soldPrinEditionList = new ArrayList<>();

    public Bookshop(Director director) {
        this.director = director;
    }

    public void addEmployee(int number, String name, String surname, int salary,  String department) {
        Employee employee = new Employee(number, name, surname, salary, department);
        employeeList.add(employee);
        if(department.equals("книжный")){
            bookDepartment.setEmnployee(employee);
        }
        if (department.equals("газетный")){
            newspapersDepartment.setEmnployee(employee);
        }
    }

    public void addBook(String title, int article, int price, int numberPlace) {
        Book book = new Book(title, article, price, numberPlace, bookDepartment);
        bookList.add(book);
        printEditionList.add(book);
        bookDepartment.addPrintEdition(book);
    }

    public void addMagazine(String title, int article, int price, int numberPlace) {
        Magazine magazine = new Magazine(title, article, price, numberPlace, newspapersDepartment);
        magazineList.add(magazine);
        printEditionList.add(magazine);
        newspapersDepartment.addPrintEdition(magazine);
    }

    public void printAllEmloyee() {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            employee.printInformation();
        }
    }

    public void printAllPrintEditions() {
        for (int i = 0; i < printEditionList.size(); i++) {
            PrintEdition printEdition = printEditionList.get(i);
            printEdition.printInformationEdition();
        }
    }

    public void whoIsDirector() {
        director.printInformation();
    }

    public void maxPrice() {
        PrintEdition max = printEditionList.get(0);
        for (int i = 1; i < printEditionList.size(); i++) {
           if (printEditionList.get(i).getPrice() > max.getPrice()) {
               max = printEditionList.get(i);
           }
        }
        max.printInformationEdition();
    }

    public  void minPrice(){
        PrintEdition min = printEditionList.get(0);
        for (int i = 0; i < printEditionList.size(); i++) {
            if(printEditionList.get(i).getPrice() < min.getPrice()){
                min = printEditionList.get(i);
            }
        }
        min.printInformationEdition();
    }


    public void productSale(int articleNumber){
        for (int i = 0; i < printEditionList.size(); i++) {
            if(printEditionList.get(i).getArticle() == articleNumber){
               PrintEdition edition = printEditionList.get(i);
               Department department = edition.getDepartment();
               int price = edition.getPrice();
               department.addPriceToEmployee(price);
               soldPrinEditionList.add(edition);
            }
        }
    }

    public void printAllSoldPrintEditions(){
        for (int i = 0; i < soldPrinEditionList.size(); i++) {
            soldPrinEditionList.get(i).printInformation();
        }
    }

    public void printEmployeeWithMaxSales() {
        Employee max = employeeList.get(0);
        for (int i = 1; i < employeeList.size(); i++) {
            if (employeeList.get(i).getSalesPrice() > max.getSalesPrice()) {
                max = employeeList.get(i);
            }
        }
        max.printInformationWithSales();
    }

    public void avarageSalaryEmployee(){
        int avarage = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            avarage += employeeList.get(i).getSalary() / employeeList.size();
        }
        System.out.println("Средняя заработаная плата :" + " " + avarage);
    }


    public static void main (String[]args){
        Director director = new Director("Алексей", "Горшков");
        Bookshop a = new Bookshop(director);
        a.addEmployee(1, "Светлана", "Пушкина",25_000,"книжный");
        a.addEmployee(2, "Жанна", "Иванова",37_000, "газетный");
        a.addBook("Му-му", 124, 1200, 3);
        a.addBook("Война и мир", 145, 1540, 4);
        a.addMagazine("Искра", 254, 250, 1);
        a.addMagazine("Пионерская правда", 215, 120, 7);
       // a.whoIsDirector();
        a.printAllEmloyee();
        a.printAllPrintEditions();
       // a.maxPrice();
       // a.minPrice();
        //a.productSale(145);
        //a.printAllSoldPrintEditions();
        a.productSale(254);
        a.printAllSoldPrintEditions();
        a.printEmployeeWithMaxSales();
        a.avarageSalaryEmployee();
    }
}