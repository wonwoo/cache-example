package me.wonwoo.cache;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wonwoo on 2016. 12. 14..
 */
@RestController
public class CacheController {

  private final CacheService cacheService;

  public CacheController(CacheService cacheService) {
    this.cacheService = cacheService;
  }

  @GetMapping("/")
  public String find(@RequestParam String name) {
    return cacheService.find(name);
  }

  @GetMapping("save")
  public String save(@RequestParam String name) {
    return cacheService.save(name);
  }

  @GetMapping("/update")
  public String update(@RequestParam String name) {
    return cacheService.update(name);
  }
}
