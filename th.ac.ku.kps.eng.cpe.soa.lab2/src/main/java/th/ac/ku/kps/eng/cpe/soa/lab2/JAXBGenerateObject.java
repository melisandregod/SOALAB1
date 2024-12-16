package th.ac.ku.kps.eng.cpe.soa.lab2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXBGenerateObject {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("customer-jaxb.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer cus = (Customer) jaxbUnmarshaller.unmarshal(is);
			System.out.println("Customer Name: " + cus.getName());
			ArrayList<PhoneNumber> phoneList = (ArrayList<PhoneNumber>) cus.getPhoneNumbers();
			for (PhoneNumber p : phoneList) {
				System.out.println("phone number Id: " + p.getNumber());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
