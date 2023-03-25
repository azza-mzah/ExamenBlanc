package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
