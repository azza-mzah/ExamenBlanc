package tn.esprit.examenblanc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "project")
    private List<Sprint> sprints;

    public void setId(int id) {
    }
}
