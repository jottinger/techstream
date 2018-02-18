package com.enigmastation.techstream.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
@Data
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @ManyToOne
    EventSource source;
    String type;
    @Lob
    String content;
    Instant created;
    boolean relevant;
    int hits;
}
