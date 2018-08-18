package com.bridgelabz.discoveryClient.utilservice.redisrepository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.bridgelabz.discoveryClient.model.User;
import com.bridgelabz.discoveryClient.utilservice.Utility;

/**
 * @author bridgelabz
 * @since 5/08/2018 <br>
 *        <p>
 *        Entity for redisrepository implementation <br>
 *        </p>
 */
@Repository
public class RedisRepositoryImpl implements RedisRepository {

	private static final String key = "TOKEN";
	Utility utility=new Utility();
	private RedisTemplate<String, User> redisTemplate;
	private HashOperations<String, String, String> hashOps;

	@Autowired
	public RedisRepositoryImpl(RedisTemplate<String, User> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	@PostConstruct
	private void init() {
		hashOps = redisTemplate.opsForHash();
	}

	@Override
	public void saveInRedis(String token) {
		String userId = utility.parseJwt(token).getId();
		hashOps.put(key, userId, token);
	}

	@Override
	public String getFromRedis(String userId) {
		System.out.println(userId);
		return hashOps.get(key, userId);
	}

	/*@Override
	public String getFromRedis(Claims userId) {
		System.out.println(userId);
		return hashOps.get(key, userId);
	}*/

}
