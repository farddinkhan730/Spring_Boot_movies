package dev.farddin.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovierRepository extends MongoRepository<Movies , ObjectId> {
}
