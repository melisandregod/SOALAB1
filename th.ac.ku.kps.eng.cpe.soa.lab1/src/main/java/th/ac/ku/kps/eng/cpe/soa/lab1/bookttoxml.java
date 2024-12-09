package th.ac.ku.kps.eng.cpe.soa.lab1;

import th.ac.ku.kps.eng.cpe.soa.lab1.model.BookStore;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class bookttoxml {

	public static void main(String[] args) throws Exception{
		BookStore b = new BookStore();
		b.setIsbn("0123456001");
		b.setTitle("Java For Dummies");
		b.setAuthor("Tan Ah Teck");
		b.setCatagory("Programming");
		b.setYear(2009);
		b.setEdition((byte) 7);
		b.setPrice(19.99);
		
		Document doc = DocumentFactory.getInstance().createDocument();
		Element bookstore = doc.addElement("bookstore");
		Element book = bookstore.addElement("book");
		book.addAttribute("ISBN",b.getIsbn());
		Element title = book.addElement("title");
		title.addText(b.getTitle().toString());
		Element author = book.addElement("author");
		author.addText(b.getAuthor().toString());
		Element category = book.addElement("category");
		category.addText(b.getCatagory().toString());
		Element year = book.addElement("year");
		year.addText(b.getYear().toString());
		Element edition = book.addElement("edition");
		edition.addText(b.getEdition().toString());
		Element price = book.addElement("price");
		price.addText(b.getPrice().toString());
		
		
		FileOutputStream fos = new FileOutputStream("bookstore.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(fos, format);
		writer.write(doc);
		writer.flush();
		writer.close();
		fos.close();
		
	
	}

}
