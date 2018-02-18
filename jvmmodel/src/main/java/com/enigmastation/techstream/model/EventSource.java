package com.enigmastation.techstream.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Duration;
import java.time.Instant;

@Data
@NoArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class EventSource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;
    /* might change, because this is a discriminator field */
    String type;
    double weight;
    Duration frequency;
    String description;
    boolean active;
    Instant lastReadTime;
    double churn;
    int relevance;
}
