package com.edumarketplace.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tutors")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bio;
    private double hourlyRate;

    @ManyToMany
    @JoinTable(name = "tutor_subjects")
    private List<Subject> subjects;

    @OneToMany(mappedBy = "tutor")
    private List<Session> sessions;

    @OneToMany(mappedBy = "tutor")
    private List<Rating> ratings;

    private Double averageRating;

    @ManyToOne
    private Location location;
}
