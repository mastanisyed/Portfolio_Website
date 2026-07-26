package Mastani.portfolio_website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mastani.portfolio_website.entity.Project;
import Mastani.portfolio_website.repository.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    // Save Project
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    // Get All Projects
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // Delete Project
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
    // Update Project
public Project updateProject(Long id, Project updatedProject) {

    Project project = projectRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Project Not Found"));

    project.setTitle(updatedProject.getTitle());
    project.setDescription(updatedProject.getDescription());
    project.setTechnologies(updatedProject.getTechnologies());
    project.setGithubLink(updatedProject.getGithubLink());
    project.setImageName(updatedProject.getImageName());

    return projectRepository.save(project);
}
}