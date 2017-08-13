package me.ramon.springbootredis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

/**
 * Created by Mojtaba on 8/13/2017.
 */
@RedisHash("student")
public class Student {

    @Id
    private int id;
    @Indexed
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
