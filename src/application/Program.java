package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
   public static void main(String[] args) {
	   
	   Scanner teclado = new Scanner(System.in);
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
	   System.out.println("----TEST 4 ----");
	   Seller newSeller = new Seller(null,"Greg","Greg@gmail.com",new Date(),4000.0,department);
	   selldao.insert(newSeller);
	   System.out.println("Adicionado: " + newSeller.getId());
	   
	   System.out.println("----TEST 5 ----");
	   sell = selldao.findById(1);
	   sell.setName("Martha wayne");
	   selldao.update(sell);
	   System.out.println("Update feito");
	   System.out.println("----TEST 6 ----");
	   System.out.println("Entre com um id para deletar: ");
	   int id = teclado.nextInt();
	   selldao.deleteById(id);
	   System.out.println("Deletado com sucesso! ");
	   teclado.close();
   } 
}
