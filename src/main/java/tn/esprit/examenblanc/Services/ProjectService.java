package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.User;
import tn.esprit.examenblanc.Repositories.ProjectRepository;
import tn.esprit.examenblanc.Repositories.UserRepository;

import java.util.List;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project addProject(Project project) {
        projectRepository.save(project);
        return project;
    }

    @Override
    public Project assignProjectToUser(int projectId, int userId) {
        return null;
    }

    @Override
    public List<Project> getAllCurrentProject() {
        return null;
    }


}
