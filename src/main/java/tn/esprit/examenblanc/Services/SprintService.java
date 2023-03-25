package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.Sprint;
import tn.esprit.examenblanc.Repositories.SprintRepository;

import java.util.List;

@Service
public class SprintService implements ISprintService {

    @Autowired
    private SprintRepository sprintRepository;

    @Override
    public Sprint addSprintToProject(Project project, Sprint sprint) {
        sprint.setProject(project);
        sprintRepository.save(sprint);
        return sprint;
    }

}
