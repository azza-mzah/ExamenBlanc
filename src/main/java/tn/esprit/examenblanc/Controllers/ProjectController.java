package tn.esprit.examenblanc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblanc.Entities.Project;
import tn.esprit.examenblanc.Entities.User;
import tn.esprit.examenblanc.Services.IProjectService;
import tn.esprit.examenblanc.Services.IUserService;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private IProjectService projectService;

    @PostMapping("/add")

        public Project addProject(@RequestBody Project project) {
            return projectService.addProject(project);
        }


    }
