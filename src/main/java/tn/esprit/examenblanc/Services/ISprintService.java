package tn.esprit.examenblanc.Services;

import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.Sprint;

public interface ISprintService {
    Sprint addSprintToProject(Project project, Sprint sprint);
}
