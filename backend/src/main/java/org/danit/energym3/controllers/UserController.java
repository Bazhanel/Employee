package org.danit.energym3.controllers;

import org.danit.energym3.entity.ApplicationUser;
import org.danit.energym3.repositories.ApplicationUserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
  private ApplicationUserRepository applicationUserRepository;
  private BCryptPasswordEncoder cryptPasswordEncoder;

  public UserController(ApplicationUserRepository applicationUserRepository,
                        BCryptPasswordEncoder cryptPasswordEncoder) {
    this.applicationUserRepository = applicationUserRepository;
    this.cryptPasswordEncoder = cryptPasswordEncoder;
  }

  @PostMapping("/sign-up")
  public void signUp(@RequestBody ApplicationUser user) {
    user.setPassword(cryptPasswordEncoder.encode(user.getPassword()));
    applicationUserRepository.save(user);
  }
}