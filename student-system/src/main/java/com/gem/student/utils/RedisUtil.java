package com.gem.student.utils;

import redis.clients.jedis.Jedis;

public class RedisUtil {

    static Jedis jedis = null;
 public static Jedis getRedisUtil() {
     jedis = new Jedis("114.55.7.3");
     return jedis;
  }
}
