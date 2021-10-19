package com.example.simpleserver.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {
  @GetMapping
  public Object checkIsAlive() {
    return Map.of("code", "200", "message", "ok");
  }
}
