package com.example.movie_redis_db.repository;

import com.example.movie_redis_db.model.Movie;


import java.util.Map;

public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllMovies();

    /**
     * Add key-value pair to Redis.
     */
    void add(Movie movie);

    /**
     * Delete a key-value pair in Redis.
     */
    void delete(String id);
    
    /**
     * find a movie
     * @return
     */
    Movie findMovie(String id);
    
}
