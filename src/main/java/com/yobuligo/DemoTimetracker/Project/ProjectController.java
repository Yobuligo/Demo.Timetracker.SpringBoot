package com.yobuligo.DemoTimetracker.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@Autowired
	IProjectRepository projectRepository;

	@GetMapping("/projects")
	public Iterable<Project> getProjects() {
		return projectRepository.findAll();
	}

	@PostMapping("/projects")
	public Project addProject(@RequestBody Project project) {
		projectRepository.save(project);
		return project;
	}

}
