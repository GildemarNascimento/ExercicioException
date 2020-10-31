package model.entities;

import model.exceptions.DominionException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double witdrawLimit;
public Account(Integer number, String holder, Double balance, Double witdrawLimit) {
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.witdrawLimit = witdrawLimit;
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getHolder() {
	return holder;
}
public void setHolder(String holder) {
	this.holder = holder;
}
public Double getBalance() {
	return balance;
}
public Double getWitdrawLimit() {
	return witdrawLimit;
}
public void setWitdrawLimit(Double witdrawLimit) {
	this.witdrawLimit = witdrawLimit;
}

public void deposit(Double amount) {
	this.balance += amount;
}
public void withdraw(Double amount) throws DominionException {
	if (balance < amount) {
		throw new DominionException("Not enough balance");
	}
	if(witdrawLimit < amount) {
		throw new DominionException("Withdraw error: The amount exceeds withdraw limit");
	}
		
	this.balance -= amount;
}
}
