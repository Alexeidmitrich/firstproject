package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewCommandTool {

    private Bank bank;

    public NewCommandTool() {
        this.bank = bank;
    }

    public void parseCommand(String command) {
        final String regexAddDirector = "(adddirector) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+)";
        final String bankInfo = "(addbank) ([a-zA-Z]+;[a-zA-Z-]+)";
        final String employeeInfo = "(employee)";
        //final String employeeInfo = "(addemployee) ([0-9]+)";
        final String clientInfo = "(addclient) ([a-zA-Z]+;[a-zA-Z]+;[0-9]+;[0-9]+)";
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
        matcher = isPatternMatches(command , employeeInfo);
        if (matcher.find()){
            bank.printAllEmployees();
    }
        matcher = isPatternMatches(command , clientInfo);
        if (matcher.find()){
            String data = matcher.group(2);
            System.out.println(data);
            String [] clientData = data.split(";");
            int ranking = Integer.parseInt(clientData[3]);
            int number = Integer.parseInt(clientData[2]);
            Client client = new Client(clientData[0], clientData[1], number, ranking);
            bank.printClientCredit(number);
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
