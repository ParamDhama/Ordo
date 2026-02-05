package com.paramdhama.Ordo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @Column(name = "description")
    private String description;

    @Column(name = "deadline")
    private LocalDateTime deadline;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status taskStatus;

    @Column(nullable = false)
    private LocalDateTime createAt;
    @Column(nullable = false)
    private LocalDateTime updateAt;

    @PrePersist
    protected void onCreate(){
        createAt = LocalDateTime.now();
        updateAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        updateAt = LocalDateTime.now();
    }
}
