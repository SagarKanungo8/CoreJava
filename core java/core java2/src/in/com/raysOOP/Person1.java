package in.com.raysOOP;

import java.util.Date;

public class Person1 {
private String name = null;
private int id = 0;
private Date dob = null;

public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;	
}
public void setId(int id) {
	this.id = id;
}
public int getId() {
	return id;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Date getDob() {
	return dob;
}
}