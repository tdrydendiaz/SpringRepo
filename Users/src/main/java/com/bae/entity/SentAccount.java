package com.bae.entity;

//@Entity
public class SentAccount {

//	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
//	private long id;
//	@Column (length = 30)
	private String accountNumber;
//	@Column (length = 50)
	private String firstName;
//	@Column (length = 50)
	private String lastName;
	private String prize;

	public SentAccount(Account account) {

//		this.accountNumber = accountNumber;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.prize = prize;
		this.accountNumber = account.getAccountNumber();
		this.firstName = account.getFirstName();
		this.lastName = account.getLastName();
		this.prize = account.getPrize();
	}

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

}
