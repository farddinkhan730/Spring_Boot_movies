package dev.farddin.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    public MovierRepository movierRepository;
    public List<Movies> allMovies(){
        return movierRepository.findAll();
    }
    public Optional<Movies> Movie(ObjectId id){
        return movierRepository.findById(id);
    }
}
