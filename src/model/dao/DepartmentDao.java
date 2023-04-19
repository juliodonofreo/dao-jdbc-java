package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void Update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
