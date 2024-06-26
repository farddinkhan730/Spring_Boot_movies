package dev.farddin.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovierRepository extends MongoRepository<Movies , ObjectId> {
    Optional<Movies> findMovieByimdbId(String objectId);
}
