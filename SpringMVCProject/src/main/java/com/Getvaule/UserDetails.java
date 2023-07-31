package com.Getvaule;

public class UserDetails {
private String name;
private String gmail;
private String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserDetails [name=" + name + ", gmail=" + gmail + ", password=" + password + "]";
}

}
