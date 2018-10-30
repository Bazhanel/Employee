package org.danit.energym3.controllers;

import org.danit.energym3.entity.Organization;
import org.danit.energym3.exceptions.RecordNoFound;
import org.danit.energym3.repositories.OrganizationRepository;
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
public class OrganizationController {
  @Autowired
  private OrganizationRepository organizationRepository;

  @GetMapping("/organization")
  public List<Organization> retrieveAllOrganization() {
    return organizationRepository.findAll();
  }

  @GetMapping("/organization/{id}")
  public Organization retrieveOrganization(@PathVariable long id) {
    Optional<Organization> organization = organizationRepository.findById(id);

    if (!organization.isPresent()) {
      throw new RecordNoFound("id-" + id);
    }
    return organization.get();
  }

  @DeleteMapping("/organization/{id}")
  public void deleteOrganization(@PathVariable long id) {
    organizationRepository.deleteById(id);
  }

  @PostMapping("/organization")
  public ResponseEntity<Object> createOrganization(@RequestBody Organization organization) {
    Organization savedOrganization = organizationRepository.save(organization);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(savedOrganization.getId()).toUri();
    return ResponseEntity.created(location).build();

  }

  @PutMapping("/organization/{id}")
  public ResponseEntity<Object> updateOrganization(@RequestBody Organization organization, @PathVariable long id) {

    Optional<Organization> organizationOptional = organizationRepository.findById(id);

    if (!organizationOptional.isPresent()) {
      return ResponseEntity.notFound().build();
    }
    organization.setId(id);

    organizationRepository.save(organization);

    return ResponseEntity.noContent().build();
  }
}
