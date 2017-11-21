package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupplierController 
{
@RequestMapping("/Supplier")
String Supplier()
{
	return "Supplier";
}


}
