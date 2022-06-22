package bank.database;

import bank.Director;

import java.util.List;

public interface DirectorDAO {
    List<Director> getAllDirector();
    Director getDirectorById(int id);
    void save(Director director);
}
