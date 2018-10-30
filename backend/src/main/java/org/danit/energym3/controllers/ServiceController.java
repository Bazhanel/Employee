package org.danit.energym3.controllers;

import org.danit.energym3.entity.Service;
import org.danit.energym3.exceptions.RecordNoFound;
import org.danit.energym3.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ServiceController {

  @Autowired
  private ServiceRepository serviceRepository;

  @GetMapping("/service")
  public List<Service> retrieveAllService() {
    return serviceRepository.findAll();
  }

  @GetMapping("/service/{id}")
  public Service retrieveService(@PathVariable long id) {
    Optional<Service> service = serviceRepository.findById(id);

    if (!service.isPresent()) {
      throw new RecordNoFound("Запись услуги с id = " + id);
    }
    return service.get();
  }

  @DeleteMapping("/service/{id}")
  public void deleteService(@PathVariable long id) {
    serviceRepository.deleteById(id);
  }

  @PostMapping("/service")
  public ResponseEntity<Object> createService(@RequestBody Service service) {
    Service savedService = serviceRepository.save(service);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(savedService.getId()).toUri();

    return ResponseEntity.created(location).build();

  }

  @PutMapping("/service/{id}")
  public ResponseEntity<Object> updateService(@RequestBody Service service, @PathVariable long id) {

    Optional<Service> serviceOptional = serviceRepository.findById(id);

    if (!serviceOptional.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    service.setId(id);

    serviceRepository.save(service);

    return ResponseEntity.noContent().build();
  }
}
