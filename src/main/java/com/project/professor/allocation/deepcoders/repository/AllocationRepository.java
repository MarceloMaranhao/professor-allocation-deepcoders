package com.project.professor.allocation.deepcoders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.deepcoders.entity.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {
	List<Allocation> findByCourseId(Long courseId);
	
	List<Allocation> findByProfessorId(Long professorId);
}
