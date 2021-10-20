package com.example.simpleserver.controller;

import com.example.simpleserver.service.DelayService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {
  @Autowired
  private DelayService delayService;

  @GetMapping
  public Object checkIsAlive() {
    return Map.of("code", "200", "message", "ok");
//    return "{\"code\": \"200\", \"message\": \"ok\"}";
  }

  @GetMapping("delay")
  public Object delayCheck(@RequestParam(required = false, defaultValue = "10000") final Long delayMilSec)
      throws InterruptedException {
    this.delayService.delay(delayMilSec);
    return Map.of("code", "200", "message", "ok");
  }
}
