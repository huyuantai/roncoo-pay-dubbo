/*
 *
 * 陈德元：



 *
 */
package org.mengyun.tcctransaction.repository.helper;

import redis.clients.jedis.Jedis;

/**
 * Created by  on 9/15/16.
 */
public interface JedisCallback<T> {

    public T doInJedis(Jedis jedis);
}