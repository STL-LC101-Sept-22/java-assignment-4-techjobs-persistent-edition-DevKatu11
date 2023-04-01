package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

  private String description;
  public Skill() {}

  @ManyToMany(mappedBy = "skills")
  private List<Job> jobs = new ArrayList<>();

  public String getDescription() {
    return description;
  }

  public List<Job> getJobs() {
    return jobs;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setJobs(List<Job> jobs) {
    this.jobs = jobs;
  }
}