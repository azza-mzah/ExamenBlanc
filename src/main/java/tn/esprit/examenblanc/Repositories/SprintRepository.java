package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Sprint;

import java.util.List;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Integer> {

    List<Sprint> findByProjectId(int projectId);

}
