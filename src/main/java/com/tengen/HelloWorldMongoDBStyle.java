package com.tengen;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

public class HelloWorldMongoDBStyle {
	public static void main( String[] args ) throws UnknownHostException {
        MongoClient client = new MongoClient(new ServerAddress("localhost",27017));
        
        
        DB database = client.getDB("course");
        DBCollection collection = database.getCollection("hello");
        
        //Example insert
        BasicDBObject document = new BasicDBObject();
        document.put("name", "MongoDB");
        collection.insert(document);
        
        //Example Find
        DBObject result = collection.findOne();
        System.out.println(result);
    }
}
