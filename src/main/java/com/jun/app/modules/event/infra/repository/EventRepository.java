package com.jun.app.modules.event.infra.repository;

import com.jun.app.modules.event.domain.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface EventRepository extends JpaRepository<Event, Long> {
	
}