package com.chen.xia.conf.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Redis配置类
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * redisTemplate相关配置
     * @param factory
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory){

        RedisTemplate<String, Object> template = new RedisTemplate<>();

        //配置连接工厂
        template.setConnectionFactory(factory);

        Jackson2JsonRedisSerializer jacksonnSerial = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        //指定要序列化的域，field,get,set以及修饰的范围，ANY是都有包括private 和public
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);

        //指定序列化输入的类型，类必须是非final修饰的，final修饰的类。比如String，Integet
        om.activateDefaultTyping(LaissezFaireSubTypeValidator.instance,ObjectMapper.DefaultTyping.NON_FINAL);
        jacksonnSerial.setObjectMapper(om);

        RedisSerializer stringRedisSerializer = new StringRedisSerializer();
        //使用StringRedisSerializer的方式来序列化redis的key值
        template.setKeySerializer(stringRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);

        //使用Jackson2JsonRedisSerializer来序列化和反序列化redisd的value值
        template.setValueSerializer(jacksonnSerial);
        template.setHashKeySerializer(jacksonnSerial);

        template.afterPropertiesSet();
        return template;
    }

    /**
     * 对hash类型的数据操作
     * @param template
     * @return
     */
    @Bean
    public HashOperations<String,String,Object> hashOperations(RedisTemplate<String, Object> template){
        return template.opsForHash();
    }

    /**
     * 对redis字符串类型数据操作
     * @param template
     * @return
     */
    @Bean
    public ValueOperations<String, Object> valueOperations(RedisTemplate<String, Object> template){
        return template.opsForValue();
    }

    /**
     * 对链表-List类型的数据操作
     * @param template
     * @return
     */
    @Bean
    public ListOperations<String, Object> listOperations(RedisTemplate<String, Object> template){
        return template.opsForList();
    }

    /**
     * 对无序集合-Set类型的数据进行操作
     * @param template
     * @return
     */
    @Bean
    public SetOperations<String,Object> setOperations(RedisTemplate<String, Object> template){
        return template.opsForSet();
    }

    /**
     * 对有序集合-Zset类型的数据操作
     * @param template
     * @return
     */
    @Bean
    public ZSetOperations<String,Object> zSetOperations(RedisTemplate<String, Object> template){
        return template.opsForZSet();
    }
}
