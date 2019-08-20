package com.stackroute.neo4j.controller;
import com.stackroute.neo4j.industry.Movie;
import com.stackroute.neo4j.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class MovieController
{
    private MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService)
    {
        this.movieService=movieService;
    }
    @PostMapping("movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) throws Exception
    {
        Movie movie1=movieService.saveMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }
    @GetMapping("movie/{id}")
    public ResponseEntity<?> getMovieId(@PathVariable int id) throws Exception
    {
        Movie movie=movieService.getMovieById(id);
        return new ResponseEntity<>(movie,HttpStatus.FOUND);
    }
//    @GetMapping("movies")
//    public ResponseEntity<?> getAllMovies() throws Exception
//    {
//       List<Movie> movie1=movieService.getAllMovies();
//       return new ResponseEntity<>(movie1,HttpStatus.FOUND);
//    }
    @DeleteMapping("movies/{id}")
    public ResponseEntity<?> deleteMovieById(@PathVariable("id") int id) throws Exception
    {
        Optional<Movie> optionalMovie=movieService.deleteMovieById(id);
        return new ResponseEntity<>(optionalMovie,HttpStatus.OK);
    }
    @PatchMapping("movies/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable int id,@RequestBody Movie movie) throws Exception
    {
       Movie movie1=movieService.updateMovie(id,movie);
       return new ResponseEntity<>(movie1,HttpStatus.CREATED);
    }
//    @GetMapping("movies/{title}")
//    public ResponseEntity<?> getByName(@PathVariable String title) throws Exception
//    {
//        List<Movie> movieList=movieService.getByName(title);
//        return new ResponseEntity<>(movieList,HttpStatus.FOUND);
//    }

}

/*
public Movie saveMovie(Movie movie) throws Exception;
public Movie getMovieById(int id) throws Exception;
public List<Movie> getAllMovies();
public Optional<Movie> deleteMovieById(int id) throws Exception;
public Movie updateMovie(int id,Movie movie) throws Exception;
public List<Movie> getByName(String title) throws Exception;
 */












