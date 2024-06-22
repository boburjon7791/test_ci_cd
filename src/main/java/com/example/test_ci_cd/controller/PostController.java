package com.example.test_ci_cd.controller;

import com.example.test_ci_cd.model.Post;
import com.example.test_ci_cd.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/posts/")
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;
    @PostMapping
    public ResponseEntity<?> save(@RequestBody Post post){
        return ResponseEntity.created(URI.create("")).body(postRepository.save(post));
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(postRepository.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id){
        postRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
