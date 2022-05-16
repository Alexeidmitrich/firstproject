package bank;

import bank.database.DBManager;

import java.sql.*;

public class BankRefactoring  extends Bank {

    private DBManager dbManager = new DBManager();

    public BankRefactoring(String title, String address) {
        super(title, address);
    }

    public BankRefactoring(String title, String address, Director director) {
        super(title, address, director);
    }

    @Override
    public void printAllEmployees() {
        Connection connection = dbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select idemployee, firstname, lastname, salary from employee");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void printClients() {
        Connection connection = dbManager.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select firstname, lastname, id from clients");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void addEmployee(int number, String name, String surname, int salary, int bank_id) {
        try {
            Connection connection = dbManager.getConnection();
            String sql = "insert into employee (idemployee, firstname, lastname, salary, bank_id) values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,number);
            statement.setString(2, name);
            statement.setString(3, surname);
            statement.setInt(4, salary);
            statement.setInt(5,bank_id);
            statement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void addClient(int number, String name, String surname, int serie, String passnumber, String email, String phone, String password, String salt, int numberDepartment) {
        try {
            Connection connection = dbManager.getConnection();
            String sql = "insert into clients (id, firstname, lastname, serie, passnumber, email, phone, password, salt, numberDepartment) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,number);
            statement.setString(2, name);
            statement.setString(3, surname);
            statement.setInt(4, serie);
            statement.setString(5,passnumber);
            statement.setString(6,email);
            statement.setString(7,phone);
            statement.setString(8,password);
            statement.setString(9,salt);
            statement.setInt(10,numberDepartment);
            statement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
