package by.it.dziomin.jd02_09;

import by.it.dziomin.jd02_09.beans.User;
import by.it.dziomin.jd02_09.beans.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class TaskA {
    public static void main(String[] args) {
        String xmlIn = System.getProperty("user.dir")+"\\src\\by\\it\\dziomin\\jd02_09\\CarRent+XSD.xml";
        System.out.println(xmlIn);

        String xmlOut = System.getProperty("user.dir")+"\\src\\by\\it\\dziomin\\jd02_09\\CarRent.xml";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Users users = (Users) unmarshaller.unmarshal(new File(xmlIn));
            User vasya = users.getUser().get(0);
            vasya.setLogin("Petr");
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(users, new File(xmlOut));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
