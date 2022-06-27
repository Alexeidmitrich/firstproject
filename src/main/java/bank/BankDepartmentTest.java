package bank;


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
        this.context = JAXBContext.newInstance(BankDepartment.class);
    }

    @Test
    public void serializition() throws JAXBException {
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(new BankDepartment(1, "Orel"), new File("bank.xml"));

        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        Object unmarshalled = unmarshaller.unmarshal(new File("bank.xml"));
        System.out.println(unmarshalled);
    }
    }
