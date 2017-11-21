package com.niit.BooksWorldBackend.DaoImpl;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.BooksWorldBackend.DAO.SupplierDao;
import com.niit.BooksWorldBackend.model.Supplier;



@Repository
public class SupplierDaoImpl implements SupplierDao
{
@Autowired
private SessionFactory sessionF;
public SupplierDaoImpl(SessionFactory sessionF)
{
	super();
	this.sessionF=sessionF;
}
public SupplierDaoImpl()
{
	super();
	
}
public void saveSupplier(Supplier s) 
{
	Session k=sessionF.openSession();
	k.beginTransaction();
	k.save(s);
	k.getTransaction();
	k.close();
	
}
public void updateSupplier(Supplier s) {
	
	
}
public void deletSupplier(Supplier s) {

}
public List<Supplier> getSuppliers() {
	
	return null;
}
public Supplier getSupplier(int supId) {
	
	return null;
}

}
