package bookshop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewCommandTool {

    private Bookshop bookshop;
    private Director director;

    public void parseCommand(String command) {
        final String bookshopInfo = "(addbookshop) ([a-zA-Z]+)";
        final String directorAdd = "(adddirector) ([a-zA-Z]+;[a-zA-Z]+)";
        final String employeeAdd = "(addEmployee) ([0-9]+;[a-zA-Z]+;[a-zA-Z]+;[0-9]+;[а-яА-Я]+)";
        final String employeeInfo = "(employee)";
        final String employeeWhoSold = "(enterNumberArticle) ([0-9]+)";
        final String priceMax = "(maxPrice)";
        final String priceMin = "(minPrice)";
        final String bookAdd = "(addBook) ([a-zA-Z]+;[0-9]+;[0-9]+;[а-яА-Я]+)";
        final String magazineAdd = "(addMagazine) ([a-zA-Z]+;[0-9]+;[0-9]+;[а-яА-Я]+)";
        final String PrintEditionInfo = "(printEdition)";
        final String allSoldPrintEdition = "(whoAllSold)";
        final String employeeWithMaxSales = "(maxSalesEmployee)";
        final String avarageSalaryEmployee = "(avarageSalary)";
        Matcher matcher = isPatternMatches(command, bookshopInfo);
        if (matcher.find()) {
            String data = matcher.group(2);
            System.out.println(data);
            String[] bookshopData = data.split(";");
            bookshop = new Bookshop(director);
            System.out.println("Ok");
        }
        matcher = isPatternMatches(command, directorAdd);
        if (matcher.find()) {
            String data = matcher.group(2);
            String[] directorData = data.split(";");
            Director director = new Director(directorData[0], directorData[1]);
            director.printInformation();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeAdd);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] employeeData = data.split(";");
            int salary = Integer.parseInt(employeeData[3]);
            int number = Integer.parseInt(employeeData[0]);
            bookshop.addEmployee(number, employeeData[1], employeeData[2], salary, employeeData[4]);
            System.out.println("OK");
        }
       matcher = isPatternMatches(command , employeeInfo);
        if (matcher.find()){
            bookshop.printAllEmployee();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , bookAdd);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] bookData = data.split(";");
            int article = Integer.parseInt(bookData[1]);
            int price = Integer.parseInt(bookData[2]);
            bookshop.addBook(bookData[0], article, price, bookData[3]);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , magazineAdd);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] magazineData = data.split(";");
            int article = Integer.parseInt(magazineData[1]);
            int price = Integer.parseInt(magazineData[2]);
            bookshop.addMagazine(magazineData[0], article, price, magazineData[3]);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , PrintEditionInfo);
        if (matcher.find()){
            bookshop.printAllPrintEditions();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeWhoSold);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] employeeData = data.split(";");
            int articleNumber = Integer.parseInt(employeeData[0]);
            bookshop.productSale(articleNumber);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , allSoldPrintEdition);
        if (matcher.find()){
            bookshop.printAllSoldPrintEditions();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeWithMaxSales);
        if (matcher.find()){
            bookshop.printEmployeeWithMaxSales();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , avarageSalaryEmployee);
        if (matcher.find()){
            bookshop.avarageSalaryEmployee();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , priceMax);
        if (matcher.find()){
            bookshop.maxPrice();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , priceMin);
        if (matcher.find()){
            bookshop.minPrice();
            System.out.println("OK");
        }
    }
    public Matcher isPatternMatches(String command, String regex){
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(command);
        return matcher;
    }

    public static void main(String[] args) {
       NewCommandTool commandTool = new NewCommandTool();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, type a command");
            String command = sc.nextLine();
            commandTool.parseCommand(command);
        }
    }
}
