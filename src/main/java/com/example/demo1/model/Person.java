package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  UUID id1, @JsonProperty("name") String name) {
        this.id = id1;
        id = id;
        this.name = name;
    }

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(UUID id, String name, UUID id1) {

        this.id = id1;
        this.name = null;
    }

    public UUID getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}

