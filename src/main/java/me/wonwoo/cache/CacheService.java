package me.wonwoo.cache;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by wonwoo on 2016. 12. 14..
 */
@Service

public class CacheService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Cacheable(value = "wonwoo", condition = "#name.length() < 10")
  public String find(String name) {
    logger.info("cache find .. {}", name);
    return name;
  }

  @CachePut(key = "#name", value = "wonwoo")
  @Cacheable(value = "wonwoo", condition = "#name.length() < 10")
  public String save(String name) {
    logger.info("cache save .. {}", name);
    return name;
  }

  @CacheEvict(key = "#name", value = "wonwoo", allEntries = true)
  public String update(String name) {
    logger.info("cache update .. {}", name);
    return name;
  }
}
