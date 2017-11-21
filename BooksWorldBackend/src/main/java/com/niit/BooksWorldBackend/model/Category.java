package com.niit.BooksWorldBackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Component
@Table
public class Category implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int catId;
private String catName;
private String catdescription;
public int getCatId() {
	return catId;
}
public void setCatId(int catId) {
	this.catId = catId;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
public String getCatdescription() {
	return catdescription;
}
public void setCatdescription(String catdescription) {
	this.catdescription = catdescription;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
