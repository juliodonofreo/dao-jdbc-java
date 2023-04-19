package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 4: seller insert =====");
        Department newDepartment = new Department(null, "Human resources");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted New id = " + newDepartment.getId());
    }

}
