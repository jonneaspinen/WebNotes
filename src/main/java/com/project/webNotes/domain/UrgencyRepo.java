package com.project.webNotes.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrgencyRepo extends CrudRepository<Urgency, Long> {
	List<Urgency> findByImportance(String importance);
}
