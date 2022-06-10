package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department dep = new Department(1, "books");
        System.out.println(dep);
        Seller sl = new Seller(1,"Ramon", "ramonsilva@",new Date(),3000.0,dep);
        System.out.println(sl);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        
    }
}
