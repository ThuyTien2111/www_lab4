package edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JobSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private String more_infos;
    private Byte skill_level;

    // getters and setters
    public JobSkill() {
    }

    public JobSkill(Job job, Skill skill, String more_infos, Byte skill_level) {
        this.job = job;
        this.skill = skill;
        this.more_infos = more_infos;
        this.skill_level = skill_level;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getMore_infos() {
        return more_infos;
    }

    public void setMore_infos(String more_infos) {
        this.more_infos = more_infos;
    }

    public Byte getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(Byte skill_level) {
        this.skill_level = skill_level;
    }

    @Override
    public String toString() {
        return "JobSkill{" +
                "job=" + job +
                ", skill=" + skill +
                ", more_infos='" + more_infos + '\'' +
                ", skill_level=" + skill_level +
                '}';
    }
}
