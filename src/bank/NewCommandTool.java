package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewCommandTool {

    private Bank bank;
    public NewCommandTool(){
        this.bank = bank;
    }

    public void parseCommand(String command){
        final String regexAddDirector = "(adddirector) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+)";
        final String bankInfo = "(addbank) ([a-zA-Z]+;[a-zA-Z-]+)";
        final String employeeInfo = "(addemployee) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        final String clientInfo = "(addclient) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
        Matcher pattern = isPatternMatches(command, bankInfo);
        Matcher matcher = isPatternMatches(command , bankInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String[] bankData = data.split(";");
            bank = new Bank(bankData[0], bankData[1]);
            System.out.println("Ok");
        }
        pattern = isPatternMatches(command,regexAddDirector);
        matcher = isPatternMatches(command , regexAddDirector);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] directorData = data.split(";");
            int salary = Integer.parseInt(directorData[2]);
            Director director = new Director(directorData[0], directorData[1], salary);
            bank.setDirector(director);
            System.out.println("OK");
        }
        pattern = isPatternMatches(command, employeeInfo);
        matcher = isPatternMatches(command , employeeInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] employeeData = data.split(";");
            int salary = Integer.parseInt(employeeData[3]);
            int number = Integer.parseInt(employeeData[2]);
            Employee employee = new Employee(employeeData[0], employeeData[1], number, salary);
            bank.setEmployee(employee);
            System.out.println("OK");
        }
        pattern = isPatternMatches(command, clientInfo);
        matcher = isPatternMatches(command , clientInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] clientData = data.split(";");
            int ranking = Integer.parseInt(clientData[3]);
            int number = Integer.parseInt(clientData[2]);
            Client client = new Client(clientData[0], clientData[1], number, ranking);
            bank.setClient(client);
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
