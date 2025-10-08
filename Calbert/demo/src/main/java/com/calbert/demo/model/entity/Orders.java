package com.calbert.demo.model.entity;

import com.calbert.demo.model.enums.Status;
import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Orders {

    // 1
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;

    // 2
    @Column(name = "product_type") // Use when db column name differs from class field
    private String productType; // camelCase auto converted to snake_case to match database

    // 3
    @Column(name = "price")
    private double  price;

    // 4
    @Column(name = "product_state")
    private String productState;

    // 5
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    // 6
    @Column(name = "login_time")
    private Instant loginTime;

    // 7
    @Column(name = "is_fulfilled")
    private boolean  isFulfilled;

    // 8
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private Status orderStatus;

    @Transient
    private String orderProgress;
}
