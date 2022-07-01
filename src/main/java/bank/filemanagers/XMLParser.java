package bank.filemanagers;

import bank.Bank;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLParser {


    public Bank getBank(String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Bank.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(new File(fileName));
        if (object instanceof Bank ) {
            Bank bank = (Bank) object;
            return bank;
        }
        return null;
    }

    public static void main(String[] args) {
        XMLParser parser = new XMLParser();
        try {
            Bank bank = parser.getBank("bank.xml");
            System.out.println(bank);
        } catch (JAXBException e) {

        }
    }
}
