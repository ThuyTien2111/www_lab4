package edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CandidateSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private String more_infos;
    private Byte skill_level;

    // getters and setters

    public CandidateSkill() {
    }

    public CandidateSkill(Candidate candidate, Skill skill, String more_infos, Byte skill_level) {
        this.candidate = candidate;
        this.skill = skill;
        this.more_infos = more_infos;
        this.skill_level = skill_level;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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
        return "CandidateSkill{" +
                "candidate=" + candidate +
                ", skill=" + skill +
                ", more_infos='" + more_infos + '\'' +
                ", skill_level=" + skill_level +
                '}';
    }
}