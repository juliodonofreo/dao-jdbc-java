package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: seller findById =====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 1: seller findAll =====");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("\n=== TEST 4: seller insert =====");
        Department newDepartment = new Department(null, "Human resources");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted New id = " + newDepartment.getId());

    }

}
