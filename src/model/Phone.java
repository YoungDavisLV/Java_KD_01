package model;

public class Phone extends Product{
	private short processorCount;
	private PhoneManufacturer manufacturer;
	private short displaySize;
	
	public Phone(float price, String title, int amount, short processorCount, PhoneManufacturer manufacturer,
			short displaySize) {
		super(price, title, amount);
		this.processorCount = processorCount;
		this.manufacturer = manufacturer;
		this.displaySize = displaySize;
	}

	public short getProcessorCount() {
		return processorCount;
	}

	public void setProcessorCount(short processorCount) {
		this.processorCount = processorCount;
	}

	public PhoneManufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(PhoneManufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public short getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(short displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public String toString() {
		return   manufacturer  + " ( " + processorCount + " procesori" + ", "+
				+ displaySize + " inches" + " ) "  + getPrice() + "eur " + getTitle() + " " + getAmount()+"gab";
	}
	

	
	

	

}
