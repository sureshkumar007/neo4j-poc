package com.stackroute.neo4j.services;

import com.stackroute.neo4j.industry.Movie;

import java.rmi.MarshalledObject;
import java.util.List;
import java.util.Optional;

public interface MovieService
{
public Movie saveMovie(Movie movie) throws Exception;
public Movie getMovieById(int id) throws Exception;
//public List<Movie> getAllMovies();
public Optional<Movie> deleteMovieById(int id) throws Exception;
public Movie updateMovie(int id,Movie movie) throws Exception;
//public List<Movie> getByName(String title) throws Exception;

}
