package com.example.demo.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	
	 @Autowired
	    private UserService userService;

	    @GetMapping("/{id}")
	    public ResponseEntity<?> getUserById(@PathVariable Long id) {
	        User user = userService.getUserById(id);
	        if (user != null) {
	            return ResponseEntity.ok(user);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @GetMapping("/username/{username}")
	    public ResponseEntity<?> getUserByUsername(
	            @PathVariable String username) {
	        
	        User user = userService.getUserByUsername(username);
	        if (user != null) {
	            return ResponseEntity.ok(user);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<?> createNewUser(@RequestBody User user) {
	        try {
	            User newUser = userService.createNewUser(user);
	            return ResponseEntity.created(
	                    URI.create("/user/" + newUser.getId())).body(newUser);
	        } catch (Exception e) {
	            return ResponseEntity.status(500).body(e.getMessage());
	        }
	    }

	    @PatchMapping
	    public ResponseEntity<?> updateUser(@RequestBody User updatedUser) {
	        try {
	            return ResponseEntity.ok(userService.updateUser(updatedUser));
	        } catch (Exception e) {
	            return ResponseEntity.badRequest().body(e.getMessage());
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteUserById(@PathVariable Long id) {
	        try {
	            userService.deleteUser(id);
	            return ResponseEntity.ok("user with " + id + " deleted");
	        } catch (Exception e) {
	            return ResponseEntity.status(500).body(e.getMessage());
	        }
	    }
	}


