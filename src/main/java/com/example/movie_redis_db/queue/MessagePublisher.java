package com.example.movie_redis_db.queue;

public interface MessagePublisher {

    void publish(final String message);
}
