package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandTool {

    private Bank bank;
    private BankRefactoring bankRefactoring;
    public CommandTool(){
        bankRefactoring = new BankRefactoring();
    }


    public void parseCommand(String command) {
        final String addBank = "(addbank) ([a-zA-Z\\sа-яА-Я\\- W$0-9]+)";
        final String addDirector = "(adddirector) ([a-zA-Z\\sа-яА-Я\\- W$0-9]+;[a-zA-Z\\sа-яА-Я\\- W$0-9]+;[a-zA-Z\\sа-яА-Я\\- W$0-9]+)";
        final String addEmployee = "(addemployee) ([a-zA-Z\\sа-яА-Я\\- W$0-9]+;[a-zA-Z\\sа-яА-Я\\- W$0-9]+;[a-zA-Z\\sа-яА-Я\\- W$0-9]+;[a-zA-Z\\sа-яА-Я\\- W$0-9]+;)";
        final String employeeInfo = "(employee)";
        final String addClient = "(addclient) ([a-zA-Zа-яА-Я]+;[a-zA-Zа-яА-Я]+;[0-9]+;[a-zA-Zа-яА-Я0-9]+;[a-zA-Zа-яА-Я@.0-9]+;[a-zA-Zа-яА-Я0-9]+;[a-zA-Zа-яА-Я0-9]+;[a-zA-Zа-яА-Я0-9]+;[0-9]+)";
        final String accountOpen = "(openclientaccount) ([0-9]+;[0-9]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        final String clientInfoAccount = "(printclientaccount) ([0-9]+)";
        final String creditOpen = "(creditdata) ([0-9]+;[0-9]+;[a-zA-Z]+;[0-9]+;[0-9]+;[0-9]+)";
        final String creditInfo = "(infocredit) ([0-9]+)";
        final String clientsInfo = "(clients)";
        Matcher matcher = isPatternMatches(command, addDirector);
        if (matcher.find()) {
            String data = matcher.group(2);
            System.out.println(data);
            String[] directorData = data.split(";");
            int salary = Integer.parseInt(directorData[2]);
            bankRefactoring.addDirector(directorData[0], directorData[1], salary);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command, addBank);
        if (matcher.find()) {
            String data = matcher.group(2);
            System.out.println(data);
            String[] bankData = data.split(";");
            bankRefactoring.addBank(bankData[0]);
            System.out.println("Ok");
        }
        matcher = isPatternMatches(command , addEmployee);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] employeeData = data.split(";");
            int salary = Integer.parseInt(employeeData[2]);
            bankRefactoring.addEmployee(employeeData[0], employeeData[1], salary);
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , employeeInfo);
        if (matcher.find()){
            bankRefactoring.printEmployees();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , clientsInfo);
        if (matcher.find()){
            bankRefactoring.printClients();
            System.out.println("OK");
        }
        matcher = isPatternMatches(command , addClient);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] clientData = data.split(";");
            int serie = Integer.parseInt(clientData[2]);
            int numberDepartment = Integer.parseInt(clientData[8]);
            bankRefactoring.addClient(clientData[0], clientData[1], serie, clientData[3],clientData[4], clientData[5], clientData[6], clientData[7],numberDepartment );
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
        matcher = isPatternMatches(command , clientInfoAccount);
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
        CommandTool commandTool = new CommandTool();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, type a command");
            String command = sc.nextLine();
           commandTool.parseCommand(command);
        }
    }
}
