package me.ramon.springbootredis.repositories;

import me.ramon.springbootredis.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Mojtaba on 8/13/2017.
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
