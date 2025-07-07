package com.example.demo.endpoint;

import com.example.demo.service.StoredIntService;
import java.io.IOException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class StoredIntController {
  private final StoredIntService storedIntService;

  @GetMapping("/stored-int")
  public int getStoredInt() throws IOException {
    return storedIntService.getStoredInt();
  }
}
