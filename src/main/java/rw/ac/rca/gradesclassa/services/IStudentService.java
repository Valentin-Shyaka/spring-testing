package rw.ac.rca.gradesclassa.services;

import rw.ac.rca.gradesclassa.dtos.CreateStudentDTO;
import rw.ac.rca.gradesclassa.models.Student;

import java.util.List;
import java.util.UUID;

public interface IStudentService {
    Student getById(UUID id);
    Student getByRegistrationCode(String registrationCode);
    Student save(CreateStudentDTO dto);
    Student update(UUID id, CreateStudentDTO dto);
    List<Student> getAll();
}
