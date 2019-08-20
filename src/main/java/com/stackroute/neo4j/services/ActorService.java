package com.stackroute.neo4j.services;

import com.stackroute.neo4j.industry.Actors;

public interface ActorService
{
    public Actors saveMovie(Actors actors) throws Exception;
}
