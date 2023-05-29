package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
   public static void main(String[] args) {
	   
	   SellerDao selldao = DaoFactory.createSellerDao();
	   System.out.println("----TEST----");
	   Seller sell = selldao.findById(3);
	   System.out.println(sell);
   } 
}
