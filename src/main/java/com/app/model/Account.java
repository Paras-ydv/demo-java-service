package com.app.model;

import lombok.Builder;
import lombok.Value;
import java.util.UUID;

@Value
@Builder
public class Account {
    UUID id;
    String name;
    String email;
    Status status;

    public enum Status {
        ACTIVE, INACTIVE, PENDING
    }

    public boolean isActive() {
        return status == Status.ACTIVE;
    }
}