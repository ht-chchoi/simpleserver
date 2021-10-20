package com.example.simpleserver.service;

import org.springframework.stereotype.Service;

@Service
public class DelayService {
  public void delay(final long delayMilSec) throws InterruptedException {
    Thread.sleep(delayMilSec);
  }
}
