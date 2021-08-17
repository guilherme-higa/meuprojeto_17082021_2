package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		StringBuilder sd = new StringBuilder();
		sd.append(super.getName());
		sd.append(" (used) ");
		sd.append(" $");
		sd.append(super.getPrice());
		sd.append(" (Manufacture date: ");
		sd.append(sdf.format(manufactureDate)+ ")");
		return sd.toString();
	}
}
