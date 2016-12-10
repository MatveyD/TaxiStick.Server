package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<remind, Long> {
}
