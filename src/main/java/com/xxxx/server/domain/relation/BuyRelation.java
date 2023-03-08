package com.xxxx.server.domain.relation;

import com.xxxx.server.domain.pojo.User;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type = "购买")
public class BuyRelation {

    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private User StartNode;
    @EndNode
    private User EndNode;
    @Property
    private String relation;
}
