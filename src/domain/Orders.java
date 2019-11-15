package domain;

import java.util.List;

public class Orders {
private int id;
private int employeeid;
private int customerid;
private String ordertime;
private Employee employee;
private Customer customer;
private List<OrderDetail> orderdetails;

public List<OrderDetail> getOrderdetails() {
	return orderdetails;
}
public void setOrderdetails(List<OrderDetail> orderdetails) {
	this.orderdetails = orderdetails;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getOrdertime() {
	return ordertime;
}
public void setOrdertime(String ordertime) {
	this.ordertime = ordertime;
}

}
