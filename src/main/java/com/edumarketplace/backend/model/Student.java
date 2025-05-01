package com.edumarketplace.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "students")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends User{
    @OneToMany(mappedBy = "student")
    private List<Session> sessions;

    @OneToMany(mappedBy = "student")
    private List<Rating> ratings;
}
