package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
   public static void main(String[] args) {
	   Department obj = new Department(1,"books");
	   
	   Seller sell = new Seller(21,"João","joão@gmail.com",new Date(),3000.0,obj);
	   System.out.println(sell);
   } 
}
