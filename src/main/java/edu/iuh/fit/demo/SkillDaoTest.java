package edu.iuh.fit.demo;

import edu.iuh.fit.dao.SkillDao;
import edu.iuh.fit.entities.Skill;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.UUID;

@SpringBootApplication
public class SkillDaoTest {
    public static void main(String[] args) {
        // Khởi tạo ứng dụng Spring Boot và nhận ApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(SkillDaoTest.class, args);

        // Lấy JdbcTemplate từ ApplicationContext
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        // Khởi tạo SkillDao sử dụng JdbcTemplate
        SkillDao skillDao = new SkillDao(jdbcTemplate);

        // Kiểm tra phương thức
//        skillDao.getAllSkills().forEach(s->System.out.println(s.toString()));
//        System.out.println(skillDao.getSkillById(UUID.fromString("2b6e0ecb-5e90-4df1-9fb0-8b66221e3a1f")));
//        System.out.println(skillDao.addSkill(new Skill(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), "Network Security", "Network Security", (byte) 2)));
        System.out.println(skillDao.updateSkill(new Skill(UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), "Network Security description", "Network Security", (byte) 2)));


        //
        context.close();


    }

}
