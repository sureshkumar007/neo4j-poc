package com.stackroute.neo4j.repository;

import com.stackroute.neo4j.Neo4jApplication;
import com.stackroute.neo4j.industry.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends Neo4jRepository<Movie,Integer>
{

//    List<Movie> getAllMovies();
//
//    List<Movie> findByName(String title);
}
