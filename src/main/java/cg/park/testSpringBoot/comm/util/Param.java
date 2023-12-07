package cg.park.testSpringBoot.comm.util;

import java.util.HashMap;
import java.util.List;

public class Param extends HashMap {

    public Param () {
        super();
    }
    public Param(String key, Object value) {
        super();
        super.put(key, value);
    }

    public Param set(String column, int value) {
        super.put(column, Integer.toString(value));
        return this;
    }

    public Param set(String column, long value) {
        super.put(column, Long.toString(value));
        return this;
    }

    public Param set(String column, float value) {
        super.put(column, Float.toString(value));
        return this;
    }

    public Param set(String column, double value) {
        super.put(column, Double.toString(value));
        return this;
    }

    public Param set(String column, List<Param> value) {
        super.put(column, value);
        return this;
    }

    public Param set(String column, String[] value) {
        super.put(column, value);
        return this;
    }

    public Param set(String column, Object value) {
        super.put(column, value);
        return this;
    }

    public Param set(int column, int value) {
        super.put(column, value);
        return this;
    }

    public Param code(String code) {
        super.put("code", code);
        return this;
    }

    public Param message(String message) {
        super.put("message", message);
        return this;
    }

    public Param data(Param param) {
        super.remove("code");
        return this;
    }
}