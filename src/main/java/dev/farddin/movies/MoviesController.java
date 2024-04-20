package dev.farddin.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.event.ListDataEvent;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/v1/movies")
public class MoviesController {

    @Autowired
    private MovieService movieService;
    @GetMapping("/")
    public ResponseEntity<List<Movies>> getallMovies(){
        return new ResponseEntity<List<Movies>>(movieService.allMovies() , HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movies>> findMovie(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Movies>>(movieService.Movie(id),HttpStatus.OK);
    }

}
