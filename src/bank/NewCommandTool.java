package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewCommandTool {

    private Bank bank;


    public void parseCommand(String command) {
        final String bankInfo = "(addbank) ([a-zA-Z]+;[a-zA-Z-]+)";
        final String regexAddDirector = "(adddirector) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+)";
        final String employeeAdd = "(addEmployee) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        final String employeeInfo = "(employee)";
        final String clientAdd = "(addClient) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        final String accountOpen = "(openClientAccount) ([0-9]+;[0-9]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        final String clientInfo = "(printclientAccount) ([0-9]+)";
        final String creditOpen = "(creditData) ([0-9]+;[0-9]+;[a-zA-Z]+;[0-9]+;[0-9]+;[0-9]+)";
        final String creditInfo = "(infoCredit) ([0-9]+)";
        Matcher matcher = isPatternMatches(command, bankInfo);
        if (matcher.find()) {
            String data = matcher.group(2);
            System.out.println(data);
            String[] bankData = data.split(";");
            bank = new Bank(bankData[0], bankData[1]);
            System.out.println("Ok");
        }
        matcher = isPatternMatches(command, regexAddDirector);
        if (matcher.find()) {
            String data = matcher.group(2);
            System.out.println(data);
            String[] directorData = data.split(";");
            int salary = Integer.parseInt(directorData[2]);
            Director director = new Director(directorData[0], directorData[1], salary);
            bank.setDirector(director);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeAdd);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] employeeData = data.split(";");
            int salary = Integer.parseInt(employeeData[3]);
            int number = Integer.parseInt(employeeData[2]);
            bank.addEmployee(employeeData[0], employeeData[1], number, salary);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeInfo);
        if (matcher.find()){
            bank.printAllEmployees();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , clientAdd);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] clientData = data.split(";");
            int ranking = Integer.parseInt(clientData[3]);
            int number = Integer.parseInt(clientData[2]);
            bank.addClient(clientData[0], clientData[1], number, ranking);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , accountOpen);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] accountData = data.split(";");
            int numberClient = Integer.parseInt(accountData[0]);
            boolean replenished = Boolean.parseBoolean(accountData[4]);
            int amount = Integer.parseInt(accountData[3]);
            int numberAccount = Integer.parseInt(accountData[1]);
            bank.openAccount(numberClient, numberAccount,accountData[2], amount, replenished);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , clientInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            String [] clientData = data.split(";");
            int numberClient = Integer.parseInt(clientData[0]);
            bank.printClientAccount(numberClient);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , creditOpen);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] creditData = data.split(";");
            int numberClient = Integer.parseInt(creditData[0]);
            int ranking = Integer.parseInt(creditData[5]);
            int amount = Integer.parseInt(creditData[3]);
            int numberCredit = Integer.parseInt(creditData[1]);
            int month = Integer.parseInt(creditData[4]);
            bank.openCredit(numberClient, numberCredit, creditData[2], amount, month, ranking);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , creditInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            String [] creditData = data.split(";");
            int numberClient = Integer.parseInt(creditData[0]);
            bank.printClientCredit(numberClient);
            System.out.println("OK");
        }
    }

    public Matcher isPatternMatches(String command, String regex){

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(command);
        return matcher;
    }
    public static void main(String[] args) {
        //adddirector Max;Ivanov;50000
        NewCommandTool commandTool = new NewCommandTool();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, type a command");
            String command = sc.nextLine();
           // System.out.println(command);
           commandTool.parseCommand(command);
        }
    }
}
