package edu.iuh.fit.lab4;

import edu.iuh.fit.dao.SkillDao;
import edu.iuh.fit.entities.Skill;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@DirtiesContext
public class SkillDaoApplicationTest {

    @Autowired
    private SkillDao skillDao;

//    @BeforeEach
//    public void setUp() {
//        // Thêm các dữ liệu giả vào cơ sở dữ liệu trước khi kiểm tra
//        for (int i = 0; i < 10; i++) {
//            Skill skill = new Skill(UUID.randomUUID(), "Description"+i, "Skill"+i, (byte) 1);
//            skillDao.addSkill(skill);
//
//        }
//    }

//Trường hợp đã có cơ sở dữ liệu
    @Test
    public void testGetAllSkills() {
        List<Skill> skills = skillDao.getAllSkills();
        assertEquals(7, skills.size());
    }

    @Test
    public void testGetSkillById() {
        UUID skillId = skillDao.getAllSkills().get(4).getSkill_id();
        assertNotNull(skillId);

        Skill skill = skillDao.getSkillById(skillId);
        assertNotNull(skill);
        assertEquals("Java Programming", skill.getSkill_name());
    }

    @Test
    public void testAddSkill() {
        Skill newSkill = new Skill(UUID.randomUUID(), "New Skill Description2", "New Skill Name2", (byte) 2);
        skillDao.addSkill(newSkill);

        UUID insertedSkillId = newSkill.getSkill_id();
        assertNotNull(insertedSkillId);
    }

    @Test
    public void testUpdateSkill() {
        UUID skillId = skillDao.getAllSkills().get(2).getSkill_id();
        assertNotNull(skillId);

        Skill skill = skillDao.getSkillById(skillId);
        assertNotNull(skill);
        assertEquals("Graphic Design", skill.getSkill_name());

        skill.setSkill_name("Updated Graphic Designing");
        skillDao.updateSkill(skill);

        Skill updatedSkill = skillDao.getSkillById(skillId);
        assertNotNull(updatedSkill);
        assertEquals("Updated Graphic Designing", updatedSkill.getSkill_name());
    }

    @Test
    public void testDeleteSkill() {
        UUID skillId = skillDao.getAllSkills().get(0).getSkill_id();
        assertNotNull(skillId);

        skillDao.deleteSkill(skillId);

        Skill deletedSkill = skillDao.getSkillById(skillId);
        assertNull(deletedSkill);
    }
}

