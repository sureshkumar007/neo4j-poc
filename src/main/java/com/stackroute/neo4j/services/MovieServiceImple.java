package com.stackroute.neo4j.services;

import com.stackroute.neo4j.industry.Movie;
import com.stackroute.neo4j.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MovieServiceImple implements MovieService
{
    private MovieRepository movieRepository;
    //Construction AutoWired
    @Autowired
    public MovieServiceImple(MovieRepository movieRepository)
    {
        this.movieRepository=movieRepository;
    }
    @Override
    public Movie saveMovie(Movie movie) throws Exception
    {
        if(movieRepository.existsById(movie.getId()))
        {
            throw new Exception();
        }
        Movie movie1=movieRepository.save(movie);
        return movie1;
    }

    @Override
    public Movie getMovieById(int id) throws Exception
    {
        if(movieRepository.existsById(id))
        {
            Movie movie=movieRepository.findById(id).get();
            return movie;
        }
        throw new Exception();
    }

//    @Override
//    public List<Movie> getAllMovies()
//    {
//    List<Movie> list=movieRepository.getAllMovies();
//    return list;
//    }

    @Override
    public Optional<Movie> deleteMovieById(int id) throws Exception
    {
        if(movieRepository.existsById(id))
        {
            Optional<Movie> movie=movieRepository.findById(id);
            movieRepository.deleteById(id);
            return movie;
        }
        throw new Exception();

    }

    @Override
    public Movie updateMovie(int id, Movie movie) throws Exception
    {
        if(movieRepository.existsById(id))
        {
            Movie movie1=movieRepository.findById(id).get();
            movie.setDirector(movie.getDirector());
//            movie.setRoles(movie.getRoles());
            movie.setTitle(movie.getTitle());
            movieRepository.save(movie);
            return movie1;
        }
        throw new Exception();
    }

//    @Override
//    public List<Movie> getByName(String title) throws Exception
//    {
//     List<Movie> list=movieRepository.findByName(title);
//        return list;
//    }
}
