package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.rca.gradesclassa.enumerations.EDecision;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentMark {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    private Double score;//65

    private Double passMark;//60

    private Double outOf;//100

    @Enumerated(EnumType.STRING)
    private EDecision decision;

    private LocalDate date;
}
