package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByFnameAndLname(String fname, String lname);
    User findByFnameAndLnameAndRole_ScrumMaster(String fname, String lname);
}
