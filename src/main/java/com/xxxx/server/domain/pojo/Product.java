package com.xxxx.server.domain.pojo;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity(label = "Product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
}
