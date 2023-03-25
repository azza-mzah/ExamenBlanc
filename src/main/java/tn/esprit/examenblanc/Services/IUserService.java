package tn.esprit.examenblanc.Services;

import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);
    public void assignProjectToUser (int projectId, int userId);

    public void assignProjectToClient(int projectId, String firstName, String lastName);

    public List<Project> getProjectsByScrumMaster(String fName, String lName);


}
