package th.ac.ku.kps.eng.cpe.soa.lab1.model;

/**
 * @author 8404-xx
 *
 */
public class BookStore {
	private String title,author,catagory;
	private Integer year;
	private Byte edition;
	private Double price;
	private String Isbn; 
	
	public String getIsbn() {
		return Isbn;
	}

	public void setIsbn(String isbn) {
		Isbn = isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	
	public void setEdition(Byte edition) {
		this.edition = edition;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCatagory() {
		return catagory;
	}

	public Integer getYear() {
		return year;
	}

	public Byte getEdition() {
		return edition;
	}

	public Double getPrice() {
		return price;
	}
	
	
}
