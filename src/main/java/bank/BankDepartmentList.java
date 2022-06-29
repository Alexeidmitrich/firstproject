package bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BankDepartmentList {
    @XmlElement(name = "bankDepartment")
    List<BankDepartment> bankDepartments = new ArrayList<>();

    public List<BankDepartment> getBankDepartments() {
        return bankDepartments;
    }

    public void setBankDepartments(List<BankDepartment> bankDepartments) {
        this.bankDepartments = bankDepartments;
    }

    @Override
    public String toString() {
        return " " + bankDepartments +
                ' ';
    }
}
