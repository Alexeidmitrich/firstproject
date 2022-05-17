package bank.database;

import bank.Client;

import java.util.List;

public interface ClientDAO {

    List<Client> getAllClient();
    Client getClientById(int id);
    void save(Client client);
}
