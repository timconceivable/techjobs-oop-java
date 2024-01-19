package org.launchcode.techjobs.oo;
import java.util.Objects;

public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {  // Two objects are equal if they have the same id.
        if (this == obj) return true;
        if (!(obj instanceof JobField)) return false;
        JobField jobField = (JobField) obj;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
