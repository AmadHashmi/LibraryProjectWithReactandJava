package com.luv2code.spring_boot_library.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonProperty("title")
    @Column(name = "title")
    private String title;

    @JsonProperty("author")
    @Column(name = "author")
    private String author;



    @JsonProperty("description")
    @Column(name = "description")
    private String description;


    @JsonProperty("copies")
    @Column(name = "copies")
    private int copies;

    @JsonProperty("copies_available")
    @Column(name = "copies_available")
    private int copiesAvailable;


    @JsonProperty("category")
    @Column(name = "category")
    private String category;

    @Column(name = "img")
    private String img;
}
