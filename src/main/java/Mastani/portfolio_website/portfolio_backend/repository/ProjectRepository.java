package Mastani.portfolio_website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mastani.portfolio_website.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}