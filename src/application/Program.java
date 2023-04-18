package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program
    {
        public static void main(String[] args) {

            SellerDao sellerDao = DaoFactory.createSellerDao();

            System.out.println("=== TEST 1: seller findById =====");
            Seller seller = sellerDao.findById(3);
            System.out.println(seller);

            System.out.println("=== TEST 2: seller finbByDepartment =====");
            Department department = new Department(2, "Electronics");
            List<Seller> sellers = sellerDao.findByDepartment(department);

            for(Seller seller1: sellers){
                System.out.println(seller1);
            }

            System.out.println("=== TEST 3: seller findAll =====");
            sellers = sellerDao.findAll();

            for(Seller seller1: sellers){
                System.out.println(seller1);
            }
        }
    }
