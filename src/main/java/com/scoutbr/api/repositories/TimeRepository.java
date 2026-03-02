package com.scoutbr.api.repositories;

import com.scoutbr.api.models.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}