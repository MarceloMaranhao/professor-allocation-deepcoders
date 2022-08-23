package com.project.professor.allocation.deepcoders.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.deepcoders.entity.Professor;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class ProfessorRepositoryTest {

	@Autowired
    ProfessorRepository professorRepository;
	
	@Test
	public void findAll() {
		List<Professor> AllProfessors = professorRepository.findAll();
		System.out.println(AllProfessors);
	}
	
	@Test
	public void create() {
		Professor newProfessor = new Professor();
		newProfessor.setName("Tiago Santos");
		newProfessor.setCpf("12345678900");
		newProfessor.setDepartmentId(1L);
		
		System.out.println(professorRepository.save(newProfessor));
	}
	
	@Test
	public void update() {
		Professor newProfessor = new Professor();
		newProfessor.setName("Rafael Lopes");
		newProfessor.setId(1L);
		
		System.out.println(professorRepository.save(newProfessor));
	}
	
	@Test
	public void delete() {
		professorRepository.deleteById(1L);
	}
	
	@Test
	public void deleteAll() {
		professorRepository.deleteAllInBatch();
	}

}
