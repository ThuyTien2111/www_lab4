package edu.iuh.fit;

import edu.iuh.fit.dao.SkillDao;
import edu.iuh.fit.entities.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;


@SpringBootApplication
public class Lab4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Application.class, args);
    }
    @Autowired
    private SkillDao skillDao;
    @Bean
    CommandLineRunner x(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                System.out.println(skillDao.getSkillById(UUID.fromString("2b6e0ecb-5e90-4df1-9fb0-8b66221e3a1f")));
//                skillDao.getAllSkills().forEach(s->System.out.println(s.toString()));

//                System.out.println(skillDao.addSkill(new Skill(UUID.randomUUID(), "Database Administration", "Database Administration", (byte) 2)));
                System.out.println(skillDao.updateSkill(new Skill(UUID.fromString("1926efda-1711-4dcf-a22e-0f7a6ecee06b"), "Database Administration description", "Database Administration", (byte) 1)));
            }
        };

    }
}
