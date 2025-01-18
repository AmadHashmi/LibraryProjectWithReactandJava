package com.luv2code.spring_boot_library.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="review")
@Data
public class Review {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private Long id;

    @JsonProperty("user_email")
    @Column(name="user_email")
    private String userEmail;

    @JsonProperty("date")
    @Column(name="date")
    private Date date;

    @JsonProperty("rating")
    @Column(name="rating")
    private double rating;

    @JsonProperty("book_id")
    @Column(name="book_id")
    private Long bookId;

    @JsonProperty("review_description")
    @Column(name="review_description")
    private String reviewDescription;

}
