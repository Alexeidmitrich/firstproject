package bank.database;

import bank.Client;
import bank.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl extends DBManager implements EmployeeDAO{

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select idemployee, firstname, lastname, salary from employee");
            while (rs.next()) {
                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
                Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select idemployee, firstname, lastname, salary, bank_id from employee " +
                    " WHERE idemployee = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            rs.next();
            employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {
        try {
            Connection connection = getConnection();
            String sql = "insert into employee (idemployee, firstname, lastname, salary, bank_id) values (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,employee.getNumber());
            statement.setString(2, employee.getName());
            statement.setString(3, employee.getSurname());
            statement.setInt(4, employee.getSalary());
            statement.setInt(5,employee.getBank_id());
            statement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        EmployeeDAO dao  = new EmployeeDAOImpl();
        Employee employee = dao.getEmployeeById(2);
        employee.printInformation();
    }
}

