package com.revature.models;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.xspec.NULL;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@DynamoDBTable(tableName = "ForumNodes")
public class Node {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private String subject;

    @DynamoDBAttribute
    private List<String> ancestors;

    @DynamoDBAttribute
    private String parent;

    @DynamoDBAttribute
    private String description;

    @DynamoDBAttribute
    private int childCount;

    @DynamoDBAttribute
    private LocalDateTime dateCreated;

    @DynamoDBAttribute
    private String owner;

    @DynamoDBAttribute
    private List<String> tags;

    public Node(String subject, String description) {
        this.subject = subject;
        this.ancestors = null;
        this.parent = "";
        this.description = description;
        this.tags = null;
        this.childCount = 0;
        this.dateCreated = LocalDateTime.now();
    }

}
