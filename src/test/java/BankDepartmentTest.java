import bank.Bank;
import bank.BankDepartment;
import bank.Director;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class BankDepartmentTest {
    private JAXBContext context;

    @Before
    public void init() throws JAXBException {
        this.context = JAXBContext.newInstance(Bank.class);
    }

    @Test
    public void serializition() throws JAXBException {
        Marshaller marshaller = this.context.createMarshaller();
        //marshaller.marshal(new BankDepartment(1, "Орел"), new File("bank.xml"));

        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new File("bank.xml"));
        System.out.println(unmarshalled);
    }
}
