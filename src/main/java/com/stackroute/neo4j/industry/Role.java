package com.stackroute.neo4j.industry;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.ArrayList;
import java.util.List;

@RelationshipEntity(type = "acted-in")
public class Role
{
    @Id
    private int id;
    //private List<String> role=new ArrayList<>();
    @StartNode
    private Actors actors;
    @EndNode
    private Movie movie;


}



