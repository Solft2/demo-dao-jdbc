package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
   public static void main(String[] args) {
	   
	   SellerDao selldao = DaoFactory.createSellerDao();
	   System.out.println("----TEST----");
	   Seller sell = selldao.findById(3);
	   System.out.println(sell);
	   System.out.println("----TEST 2 ----");
	   Department department = new Department(2,null);
	   List<Seller> list = selldao.findByDepartment(department);
	   for(Seller obj : list) {
		   System.out.println(obj);
	   }
	   System.out.println("----TEST 3 ----");	   
	   list = selldao.findAll();
	   for(Seller obj : list) {
		   System.out.println(obj);
	   }
   } 
}
