package edu.iuh.fit.dao;

import edu.iuh.fit.entities.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class SkillDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SkillDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Skill> getAllSkills() {
        String query = "SELECT * FROM skill";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Skill.class));
    }

    public Skill getSkillById(UUID skillId) {
        String query = "SELECT * FROM skill WHERE skill_id=?";
        return jdbcTemplate.queryForObject(query, new Object[]{skillId}, new BeanPropertyRowMapper<>(Skill.class));
    }

    public boolean addSkill(Skill skill) {
        String query = "INSERT INTO skill (skill_id, skill_description, skill_name, type) VALUES (?, ?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(query, skill.getSkill_id(), skill.getSkill_description(), skill.getSkill_name(), skill.getType());
        return rowsAffected > 0;
    }

    public boolean updateSkill(Skill skill) {
        String query = "UPDATE skill SET skill_description=?, skill_name=?, type=? WHERE skill_id=?";
        int rowsAffected = jdbcTemplate.update(query, skill.getSkill_description(), skill.getSkill_name(), skill.getType(), skill.getSkill_id());
        return rowsAffected > 0;
    }

    public boolean deleteSkill(UUID skillId) {
        String query = "DELETE FROM skill WHERE skill_id=?";
        int rowsAffected = jdbcTemplate.update(query, skillId);
        return rowsAffected > 0;
    }

}

