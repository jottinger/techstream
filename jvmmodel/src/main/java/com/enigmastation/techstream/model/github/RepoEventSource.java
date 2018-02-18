package com.enigmastation.techstream.model.github;

import com.enigmastation.techstream.model.EventSource;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class RepoEventSource extends EventSource {
    @Column(unique = true)
    String url;
}
