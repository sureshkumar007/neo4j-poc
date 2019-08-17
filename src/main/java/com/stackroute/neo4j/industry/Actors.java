package com.stackroute.neo4j.industry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actors
{
    @Id
    private int id;
    private String name;
    private int  age;
    @Relationship(type = "acted-in",direction = Relationship.OUTGOING)
    private List<Movie> movieList=new ArrayList<>();
}
