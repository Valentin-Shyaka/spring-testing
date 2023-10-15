package rw.ac.rca.gradesclassa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rw.ac.rca.gradesclassa.enumerations.EStatus;

import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GradeSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Double minScore;

    private Double maxScore;

    private String grade;

}
