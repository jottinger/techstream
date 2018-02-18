package com.enigmastation.techstream.model.github;

import com.enigmastation.techstream.model.Event;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class RepoEvent extends Event {
}
