package com.xxxx.server.dao;


import com.xxxx.server.domain.relation.BuyRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BuyRespository extends Neo4jRepository<BuyRelation, Long> {

    @Query("match (n:User),(m:User) where n.name=$from and m.name=$to create (n)-[r:Buy]->(m)")
    void createRelation(@Param("from") String from, @Param("to") String to);
}
