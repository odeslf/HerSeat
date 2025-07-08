package com.herseat.herseat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "travels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String origin;

    @Column
    private String destination;

    @Column(nullable = false)
    private LocalDate departureTime;

    @Column(nullable = false)
    private LocalDate arrivalTime;

    @Column(nullable = false, length = 10)
    private String busNumber;

    @Column
    private int totalSeats;

    @Column
    private int availableSeats;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "travel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Seat> seats = new ArrayList<>();
}
