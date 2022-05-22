package bank.database;

import bank.BankDepartment;
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

            String sql =  "select idemployee, firstname, lastname, salary, bank_id, city from employee e" +
                    " inner join bank b on e.bank_id = b.bankid ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
                BankDepartment bankDepartment = new BankDepartment(rs.getInt("bank_id"), rs.getString("city"));
                Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), bankDepartment);
                employeeList.add(employee);
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
            String sql =  "select idemployee, firstname, lastname, salary, bank_id, city from employee e" +
                            " inner join bank b on e.bank_id = b.bank " +
                             " WHERE idemployee = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            rs.next();
            BankDepartment bankDepartment = new BankDepartment(rs.getInt("bank_id"), rs.getString("city"));
            employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), bankDepartment);

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @Override
    public void save(Employee employee, int departmentId) {
        try {
            Connection connection = getConnection();
            String sql = "insert into employee (firstname, lastname, salary, bank_id) values (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getSurname());
            statement.setDouble(3, employee.getSalary());
            statement.setInt(4, departmentId);
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

