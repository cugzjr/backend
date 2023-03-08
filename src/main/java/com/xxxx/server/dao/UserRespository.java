package com.xxxx.server.dao;

import com.xxxx.server.domain.pojo.User;
import org.spark_project.jetty.security.UserAuthentication;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRespository extends Neo4jRepository<User, Long> {
}
