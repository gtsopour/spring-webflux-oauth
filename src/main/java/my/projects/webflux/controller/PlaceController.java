package my.projects.webflux.controller;

import my.projects.webflux.model.Place;
import my.projects.webflux.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PlaceController {
  @Autowired
  private PlaceRepository placeRepository;

  @GetMapping(value = "/place")
  public Flux<Place> getAllPerson() {
    return placeRepository.findAll();
  }
}
