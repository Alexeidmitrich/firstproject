package bookshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bookshop {
    Scanner in = new Scanner(System.in);
    Director director;
    private List<Employee> employeeList = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();
    private List<Magazine> magazineList = new ArrayList<>();
    private List<PrintEdition> printEditionList = new ArrayList<>();

    public Bookshop(Director director){
        this.director = director;
    }

    public void addEmployee(int number, String name, String surname){
        Employee employee = new Employee(number, name, surname);
        employeeList.add(employee);
    }

    public void addBook (String title, int article, int price, int numberPlace){
        Book book = new Book(title, article, price, numberPlace);
        bookList.add(book);
        printEditionList.add(book);
    }

    public void addMagazine(String title, int article, int price, int numberPlace){
        Magazine magazine = new Magazine(title, article, price, numberPlace);
        magazineList.add(magazine);
        printEditionList.add(magazine);
    }

    public void printAllEmloyee(){
        for (int i = 0; i < employeeList.size(); i++) {
           Employee employee = employeeList.get(i);
           employee.printInformation();
        }
    }

    public void printAllPrintEditions(){
        for (int i = 0; i < printEditionList.size(); i++) {
          PrintEdition printEdition = printEditionList.get(i);
          printEdition.printInformationEdition();
        }
    }

    public void whoIsDirector(){
        director.printInformation();
    }

    public void maxPrice(int price){

    }

    public static void main(String[] args) {
        Director director = new Director("Алексей", "Горшков");
        Bookshop a = new Bookshop(director);
        a.addEmployee(1,"Светлана", "Алексеева");
        a.addEmployee(2, "Жанна", "Иванова");
        a.addBook("Му-му",124,1200, 3);
        a.addBook("Война и мир", 145,1540,4);
        a.addMagazine("Искра",254, 250,1);
        a.addMagazine("Пионерская правда", 15,120,7);
        a.whoIsDirector();
        a.printAllEmloyee();
        a.printAllPrintEditions();
        }
    }
