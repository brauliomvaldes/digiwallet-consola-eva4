package entities;

import java.util.Date;

public class AccountPaid {
	
	private int idAccountPaid;
	private AccountPayable accountPayable;
	private String paymentMethod;
	private Date datePaid;
	private Double amountPaid;
	private Account accountUser;
	
	public AccountPaid() {};
 
	public AccountPaid(int idAccountPaid, AccountPayable accountPayable, String paymentMethod, Date datePaid,
			Double amountPaid, Account accountUser) {
		super();
		this.idAccountPaid = idAccountPaid;
		this.accountPayable = accountPayable;
		this.paymentMethod = paymentMethod;
		this.datePaid = datePaid;
		this.amountPaid = amountPaid;
		this.accountUser = accountUser;
	}

	public int getIdAccountPaid() {
		return idAccountPaid;
	}
	public void setIdAccountPaid(int idAccountPaid) {
		this.idAccountPaid = idAccountPaid;
	}
	public AccountPayable getAccountPayable() {
		return accountPayable;
	}
	public void setAccountPayable(AccountPayable accountPayable) {
		this.accountPayable = accountPayable;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}	
	public Date getDatePaid() {
		return datePaid;
	}
	public void setDatePaid(Date datePaid) {
		this.datePaid = datePaid;
	}
	public Double getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Account getAccountUser() {
		return accountUser;
	}
	public void setAccountUser(Account accountUser) {
		this.accountUser = accountUser;
	}
}
