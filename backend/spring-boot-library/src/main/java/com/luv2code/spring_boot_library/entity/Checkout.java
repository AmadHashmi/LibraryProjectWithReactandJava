package com.luv2code.spring_boot_library.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="checkout")
@Data
public class Checkout {
    public Checkout(){}

    public Checkout(String userEmail, String checkoutDate, String returnDate, Long bookId){
        this.userEmail = userEmail;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
    }

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonProperty("checkout_date")
    @Column(name = "checkout_date")
    private String checkoutDate;

    @JsonProperty("user_email")
    @Column(name = "user_email")
    private String userEmail;

    @JsonProperty("return_date")
    @Column(name = "return_date")
    private String returnDate;

    @JsonProperty("book_id")
    @Column(name = "book_id")
    private Long bookId;







}
