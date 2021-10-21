package com.example.simpleserver.controller;

import com.example.simpleserver.service.SimpleService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
  @Autowired
  private SimpleService simpleService;

  @GetMapping("/add")
  public Object add(@RequestParam final int a, @RequestParam final int b) {
    return Map.of("code", "200", "message", "ok", "result", this.simpleService.add(a, b));
  }
}
