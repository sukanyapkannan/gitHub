package com.niit.BooksWorldBackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Table
@Entity
@Component
public class Supplier implements Serializable
{
private static final long serialVersionUID=1L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int supId;
private String SupName;
private String SupAddress;
public int getSupId() {
	return supId;
}
public void setSupId(int supId) {
	this.supId = supId;
}
public String getSupName() {
	return SupName;
}
public void setSupName(String supName) {
	SupName = supName;
}
public String getSupAddress() {
	return SupAddress;
}
public void setSupAddress(String supAddress) {
	SupAddress = supAddress;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
