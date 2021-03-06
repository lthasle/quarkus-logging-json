package io.quarkiverse.loggingjson.providers;

import java.io.IOException;

import io.quarkiverse.loggingjson.JsonGenerator;

public class KeyValueStructuredArgument implements StructuredArgument {
    private final String key;
    private final Object value;

    public KeyValueStructuredArgument(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public static StructuredArgument kv(String key, Object value) {
        return new KeyValueStructuredArgument(key, value);
    }

    @Override
    public void writeTo(JsonGenerator generator) throws IOException {
        generator.writeObjectField(key, value);
    }
}
