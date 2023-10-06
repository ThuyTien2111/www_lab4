package edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Skill {

    @Id
    private UUID skill_id;
    private String skill_description;
    private String skill_name;
    private Byte type;

    // getters and setters

    public Skill() {
    }

    public UUID getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(UUID skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_description() {
        return skill_description;
    }

    public void setSkill_description(String skill_description) {
        this.skill_description = skill_description;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Skill(UUID skill_id, String skill_description, String skill_name, Byte type) {
        this.skill_id = skill_id;
        this.skill_description = skill_description;
        this.skill_name = skill_name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skill_id=" + skill_id +
                ", skill_description='" + skill_description + '\'' +
                ", skill_name='" + skill_name + '\'' +
                ", type=" + type +
                '}';
    }
}
