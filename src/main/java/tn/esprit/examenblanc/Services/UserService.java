package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.User;
import tn.esprit.examenblanc.Repositories.ProjectRepository;
import tn.esprit.examenblanc.Repositories.UserRepository;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;
@Autowired
    private  ProjectRepository projectRepository;



    @Override
    public User addUser(User user) {
        return  userRepository.save(user);
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {

    }

    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {

    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
        return null;
    }


}
