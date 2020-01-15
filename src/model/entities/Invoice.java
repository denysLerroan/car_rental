package model.entities;

public class Invoice {

	public Double basicPayment;
	public Double tax;
	
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasiPayment() {
		return basicPayment;
	}

	public void setBasiPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasiPayment() + getTax();
	}
	
}
