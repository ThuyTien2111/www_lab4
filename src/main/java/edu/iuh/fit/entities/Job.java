package edu.iuh.fit.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Job {

    @Id
    private UUID job_id;
    private String job_desc;
    private String job_name;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

    // getters and setters

    public Job() {
    }

    public Job(UUID job_id, String job_desc, String job_name, Company company) {
        this.job_id = job_id;
        this.job_desc = job_desc;
        this.job_name = job_name;
        this.company = company;
    }

    public UUID getJob_id() {
        return job_id;
    }

    public void setJob_id(UUID job_id) {
        this.job_id = job_id;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", job_desc='" + job_desc + '\'' +
                ", job_name='" + job_name + '\'' +
                ", company=" + company +
                '}';
    }
}
