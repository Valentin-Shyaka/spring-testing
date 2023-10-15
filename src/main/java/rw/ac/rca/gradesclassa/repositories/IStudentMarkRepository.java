package rw.ac.rca.gradesclassa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.StudentMark;

import java.util.UUID;

@Repository
public interface IStudentMarkRepository extends JpaRepository<StudentMark, UUID> {
}
