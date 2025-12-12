package com.example.bookrecommendation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    private String isbn;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    public enum Genre {
        FICTION, SCI_FI, MYSTERY, ROMANCE, FANTASY, NON_FICTION
    }
}