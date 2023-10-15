package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateCourseDTO;
import rw.ac.rca.gradesclassa.dtos.CreateDeliberationDTO;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.enumerations.EStatus;
import rw.ac.rca.gradesclassa.models.Course;
import rw.ac.rca.gradesclassa.models.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentDeliberationService {

    Course save(CreateDeliberationDTO dto);
    boolean delete(UUID id);
    Course update(UUID id, CreateDeliberationDTO dto);
    Course getById(UUID id);
    Course getByStudentAndAcademicYear(Student student, String academicYear);
    List<Course> getAll();
    List<Course> getAllByStudent(Student student);
    List<Course> getAllByStudent(String academicYear);
    List<Course> getAllByAcademicYearAndDecision(String academicYear, EDecision decision);
}
