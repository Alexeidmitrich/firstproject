package bank.database;

import bank.Client;
import bank.database.hibernate.HiberUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOImpl extends  DBManager implements ClientDAO{


    @Override
    public List<Client> getAllClient() {
        List<Client> clientList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select id, firstname, lastname, serie, passnumber, email, phone, password, salt, number_department, title from clients inner join bank on bankid = number_department ");

            while (rs.next()) {
                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
                Client client = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10));
                clientList.add(client);
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return clientList;
    }

    @Override
    public Client getClientById(int id) {
        Client client = null;
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select id, firstname, lastname, serie, passnumber, email, phone, password, salt, number_department, title from clients inner join bank on bankid = number_department " +
                    " WHERE id = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            rs.next();
           client = new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10));

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return client;
    }

    @Override
    public void save(Client client) {
        SessionFactory factory = HiberUtil.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();
        factory.close();
      /*  try {
            Connection connection = getConnection();
            String sql = "insert into clients (id, firstname, lastname, serie, passnumber, email, phone, password, salt, numberDepartment) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, client.getNumber());
            statement.setString(2, client.getName());
            statement.setString(3, client.getSurname());
            statement.setInt(4, client.getSerie());
            statement.setString(5, client.getPassnumber());
            statement.setString(6, client.getEmail());
            statement.setString(7, client.getPhone());
            statement.setString(8, client.getPassword());
            statement.setString(9, client.getSalt());
            statement.setInt(10, client.getNumberDepartment());
            statement.execute();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/
    }
}
