package uk.co.gdickinson.smarthome.lambda.codec;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.junit.Test;
import uk.co.gdickinson.smarthome.lambda.models.MessageName;
import uk.co.gdickinson.smarthome.lambda.models.Namespace;
import uk.co.gdickinson.smarthome.lambda.payload.Directive;
import uk.co.gdickinson.smarthome.lambda.payload.DiscoverAppliancesRequest;
import uk.co.gdickinson.smarthome.lambda.payload.Header;
import uk.co.gdickinson.smarthome.lambda.payload.Request;

import static org.junit.Assert.*;

public class SmartHomeDirectiveDeserializerTest {
  private static String TEST_DIRECTIVE_JSON = "{\n" +
          "    \"directive\": {\n" +
          "        \"header\": {\n" +
          "            \"messageId\": \"161a2198-45c4-411c-9117-143412a99d0a\",\n" +
          "            \"name\": \"Discover\",\n" +
          "            \"namespace\": \"Alexa.Discovery\",\n" +
          "            \"payloadVersion\": \"3\"\n" +
          "        },\n" +
          "        \"payload\": {\n" +
          "            \"scope\": {\n" +
          "                \"type\": \"BearerToken\",\n" +
          "                \"token\": \"Atza|IwEBIHoAtHyuDFTrRiJVfSPhrgn66Ce1X0PwfRYjcHspMmUUR4fJq6RR0lrI1NmGXb1utb5LYFXbp2FPSHLWirOmvzzt6IIPKYnDeVzFDz6uG1MDu93XuG1a5xm-Mgq5BsGpYGnErqehHBkv3DcmtRr8ypx7fGbZ2SLeiUlZA1fwxtCNot34bXNxgFyhvYuZGLDKcs9Y7vRf54-ggnCepzG3mBLLK_0sIJjFYZSdnLR-3-hl_WbWXjXzwH0JUq-NmqM9RfsshO7bgBEIQVpu9OP85FyGy7nrCr8ydmigbGD5AgAhCxrYSA-lWRlvcyKW6b8vlHoF8uEJTL6KKVLsOXhAD5CFyyTMbd3WfPAg9esr2RZEq1oRvw7ZYmo713PTrQDxZb_5aR7PpsyVl3F6fTBvBtIr0AaqynFR9BLZjKjVzUomSMH6oN6nrbANk9bQaVFr2O7yp8_AUSP9kwa2r4uJdVXRhIII_oXjwcIpvLp_MJlCWfohA7nkbiu-MoWWeMg9Aa0\"\n" +
          "            }\n" +
          "        }\n" +
          "    }\n" +
          "}";

  @Test
  public void testDeserialize() throws Exception {
//    SmartHomeDirectiveDeserializer deserializer = new SmartHomeDirectiveDeserializer();
    GsonBuilder builder = new GsonBuilder();
//    builder.registerTypeAdapter(SmartHomeDirectiveRequest.class, deserializer);
    Gson gson = builder.create();
    SmartHomeDirectiveRequest req = gson.fromJson(TEST_DIRECTIVE_JSON, SmartHomeDirectiveRequest.class);
    Header requestHeader = req.getDirective().getHeader();
    assertEquals("161a2198-45c4-411c-9117-143412a99d0a", requestHeader.getMessageId());
    assertEquals(MessageName.DISCOVER_APPLIANCES_REQUEST, requestHeader.getName());
    assertEquals(Namespace.DISCOVERY, requestHeader.getNamespace());
    assertEquals("3", requestHeader.getPayloadVersion());
    DiscoverAppliancesRequest discoverAppliancesRequest = PayloadDeserializer.deserializePayload(req);
    System.out.println(discoverAppliancesRequest.getScope().getToken());
    assertNotNull(discoverAppliancesRequest.getScope().getToken());
//    assertNotNull(req.getDirective().getPayload());
  }
}