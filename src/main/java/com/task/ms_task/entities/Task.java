package com.task.ms_task.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "t_task")
public class Task implements Serializable {
    private static final long serialVersionUID = 8799656478674716638L;

    @Id
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String deadline;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;

}
