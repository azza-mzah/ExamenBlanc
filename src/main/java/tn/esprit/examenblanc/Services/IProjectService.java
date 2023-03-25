package tn.esprit.examenblanc.Services;

import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.User;
import tn.esprit.examenblanc.Repositories.ProjectRepository;

import java.util.List;

public interface IProjectService {
     Project addProject (Project project);
     Project assignProjectToUser(int projectId, int userId);

     public List<Project> getAllCurrentProject();



}
