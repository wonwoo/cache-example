package me.wonwoo.cache;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

/**
 * Created by wonwoo on 2016. 12. 14..
 */
public class KeyGeneratorImpl implements KeyGenerator {
  @Override
  public Object generate(Object o, Method method, Object... objects) {
    return "123";
  }
}
