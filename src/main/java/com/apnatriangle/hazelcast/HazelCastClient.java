package com.apnatriangle.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Map;

public class HazelCastClient {
    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();

        IMap<Long, String> dogs = client.getMap("dogs");
        for(Map.Entry<Long, String> dog : dogs.entrySet()) {
            System.out.println(String.format("Key: %d, Value: %s", dog.getKey(), dog.getValue()));
        }
    }
}
