package tn.esprit.examenblanc.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.User;
import tn.esprit.examenblanc.Services.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("{projectId}/{firstName}/{lastName}")
    public void assignProjectToClient(int projectId, String firstName, String lastName){
        userService.assignProjectToClient(projectId, firstName, lastName);
    }
}