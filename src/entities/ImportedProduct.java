package entities;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {

	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}

	@Override
	public String toString() {
		StringBuilder sd = new StringBuilder();
		sd.append(super.getName());
		sd.append(" $");
		sd.append(totalPrice());
		sd.append(" (Customs fee: $");
		sd.append(customsFee + ")");
		return sd.toString();
	}

}
