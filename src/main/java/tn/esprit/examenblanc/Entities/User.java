package tn.esprit.examenblanc.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String email;
    private String pwd;
    private String fname;
    private String lname;
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany
    @JsonIgnore
    private List<Project> projects;

    @OneToMany
    private List<Project> ClientProjects;
}
