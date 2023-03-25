package tn.esprit.examenblanc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.Sprint;
import tn.esprit.examenblanc.Repositories.ProjectRepository;
import tn.esprit.examenblanc.Repositories.SprintRepository;

import java.util.Optional;

@RestController
@RequestMapping("/project")
public class SprintController {

    @Autowired
    private SprintRepository sprintRepository;

    @Autowired
    private ProjectRepository projectRepository;


    @PostMapping("/{projectId}/sprints")
    public ResponseEntity<Sprint> addSprintToProject(@PathVariable int projectId, @RequestBody Sprint sprint) {
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        if (optionalProject.isPresent()) {
            Project project = optionalProject.get();
            sprint.setProject(project);
            Sprint addedSprint = sprintRepository.save(sprint);
            return new ResponseEntity<>(addedSprint, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}