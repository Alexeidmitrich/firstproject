package bank.database;

import bank.BankDepartment;
import java.util.List;

public interface BankDepartmentDAO {

    void save(BankDepartment bankDepartment);
    void saveAll(List<BankDepartment> bankDepartmentList);
    List<BankDepartment> getAllDepartments();

    BankDepartment getById(int id);

    void deleteById(int id);
}
