package io.vertx.kafka.admin;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.impl.JsonUtil;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.kafka.admin.OffsetSpec}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.kafka.admin.OffsetSpec} original class using Vert.x codegen.
 */
public class OffsetSpecConverter {


  private static final Base64.Decoder BASE64_DECODER = JsonUtil.BASE64_DECODER;
  private static final Base64.Encoder BASE64_ENCODER = JsonUtil.BASE64_ENCODER;

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, OffsetSpec obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "spec":
          if (member.getValue() instanceof Number) {
            obj.setSpec(((Number)member.getValue()).longValue());
          }
          break;
      }
    }
  }

  public static void toJson(OffsetSpec obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(OffsetSpec obj, java.util.Map<String, Object> json) {
    json.put("spec", obj.getSpec());
  }
}
