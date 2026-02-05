package com.paramdhama.Ordo.repository;

import com.paramdhama.Ordo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
