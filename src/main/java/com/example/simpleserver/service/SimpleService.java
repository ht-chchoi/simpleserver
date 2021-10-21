package com.example.simpleserver.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
  public Integer add(final int a, final int b) {
    return a+b;
  }
}
