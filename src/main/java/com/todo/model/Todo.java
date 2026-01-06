package com.todo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TODO")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 1, max = 100)
    @Column(nullable = false, length = 100)
    private String title;

    @Size(min = 1, max = 300,message = "Description cannot exceed 300 charecters")
    @Column( length = 300)
    private String description;

    @Column(nullable = false)
    private boolean done;

    @Column(nullable = false)
    private LocalDateTime created;

}
