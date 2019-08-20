package com.stackroute.neo4j.industry;


import lombok.*;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import javax.validation.GroupSequence;
import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Movie
{
    @GraphId
    private int id;
    private String title;
    private String director;
//    @Relationship(type = "acted-in",direction = Relationship.INCOMING)
//    private List<Role> roles=new ArrayList<>();
}
