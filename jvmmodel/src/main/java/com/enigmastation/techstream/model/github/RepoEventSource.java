package com.enigmastation.techstream.model.github;

import com.enigmastation.techstream.model.EventSource;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(indexes = {@Index(unique = true, columnList = "owner, project")})
public class RepoEventSource extends EventSource {
    String owner;
    String project;
}
