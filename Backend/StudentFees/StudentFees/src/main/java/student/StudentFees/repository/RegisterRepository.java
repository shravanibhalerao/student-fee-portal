package student.StudentFees.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.StudentFees.model.Register;

@Repository
@Qualifier("regRepo")
public interface RegisterRepository extends JpaRepository<Register , Long>
{
	
}