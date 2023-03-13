package com.xxxx.server.domain.pojo;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;

@Data
@NodeEntity(label = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Property
    private String name;
}
