package com.apnatriangle.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IdGenerator;

import java.util.Map;

public class HazelCastServer {
    public static void main(String[] args) {
        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

        Map<Long, String> dogs = hazelcastInstance.getMap("dogs");
        IdGenerator idGenerator = hazelcastInstance.getIdGenerator("dogid");
        for (int i = 0; i < 100 ; i++) {
            Long newId = idGenerator.newId();
            dogs.put(newId, "Dog "+newId);
        }
    }
}
