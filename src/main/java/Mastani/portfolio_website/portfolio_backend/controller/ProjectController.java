package Mastani.portfolio_website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Mastani.portfolio_website.entity.Project;
import Mastani.portfolio_website.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public Project saveProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return "Project Deleted Successfully";
    }

    @PutMapping("/{id}")
public Project updateProject(@PathVariable Long id,
                             @RequestBody Project project) {

    return projectService.updateProject(id, project);

}
}