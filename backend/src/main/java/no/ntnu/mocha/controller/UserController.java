package no.ntnu.mocha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import no.ntnu.mocha.DTO.UserDto;
import no.ntnu.mocha.service.JwtService;
import no.ntnu.mocha.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    

    @Autowired
    private UserService service;

    @Autowired
    private JwtService jwtService;


    @PostMapping
    public ResponseEntity<?> addUser(UserDto dto) {
        service.addUser(dto);

        String jwts = jwtService.getToken(dto.getUsername(), dto.getPassword());

        return ResponseEntity.created(null)
            .header(HttpHeaders.AUTHORIZATION, "Bearer " + jwts)
            .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
            .build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable long id, @RequestBody UserDto dto) {
        service.updateUser(id, dto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable long id, @RequestBody UserDto dto) {
        return service.deleteUser(id, dto) ? 
            new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
