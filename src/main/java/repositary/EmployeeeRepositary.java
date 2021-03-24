package repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import model.Employee;

@Repository //Annotation
//employee entity and the data type of id  
public interface EmployeeeRepositary extends JpaRepository<Employee, Long>{

}
