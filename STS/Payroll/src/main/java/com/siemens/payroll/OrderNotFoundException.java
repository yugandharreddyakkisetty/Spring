package com.siemens.payroll;

public class OrderNotFoundException  extends RuntimeException{
	 public OrderNotFoundException(Long id) {
		    super("Could not find employee " + id);
		  }
}
