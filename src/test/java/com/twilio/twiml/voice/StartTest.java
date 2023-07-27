/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.http.HttpMethod;
import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

/**
 * Test class for {@link Start}
 */
public class StartTest {
    @Test
    public void testEmptyElement() {
        Start elem = new Start.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Start elem = new Start.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CStart%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Start elem = new Start.Builder().action(URI.create("https://example.com")).method(HttpMethod.GET).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start action=\"https://example.com\" method=\"GET\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Start elem = new Start.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithChildren() {
        Start.Builder builder = new Start.Builder();

        builder.stream(new Stream.Builder()
                    .name("name")
                    .connectorName("connector_name")
                    .url("url")
                    .track(Stream.Track.INBOUND_TRACK)
                    .statusCallback("status_callback")
                    .statusCallbackMethod(Stream.StatusCallbackMethod.GET)
                    .build());

        builder.siprec(new Siprec.Builder()
                    .name("name")
                    .connectorName("connector_name")
                    .track(Siprec.Track.INBOUND_TRACK)
                    .statusCallback("status_callback")
                    .statusCallbackMethod(Siprec.StatusCallbackMethod.GET)
                    .build());

        Start elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start>" +
                "<Stream connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\" url=\"url\"/>" +
                "<Siprec connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\"/>" +
            "</Start>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Start.Builder builder = new Start.Builder();

        builder.addText("Hey no tags!");

        Start elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start>" +
            "Hey no tags!" +
            "</Start>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Start.Builder builder = new Start.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Start>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Start.Builder builder = new Start.Builder();
        Start elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Start>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithGenericNodeAttributes() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        GenericNode node = genericBuilder.option("key", "value").addText("someText").build();

        Start.Builder builder = new Start.Builder();
        Start elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Start>" +
            "<genericTag key=\"value\">" +
            "someText" +
            "</genericTag>" +
            "</Start>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Start elem = new Start.Builder().action(URI.create("https://example.com")).method(HttpMethod.GET).build();

        Assert.assertEquals(
            Start.Builder.fromXml("<Start action=\"https://example.com\" method=\"GET\"/>").build().toXml(),
            elem.toXml()
        );
    }

    @Test
    public void testXmlChildrenDeserialization() {
        final Start.Builder builder = new Start.Builder();

        builder.stream(new Stream.Builder()
                    .name("name")
                    .connectorName("connector_name")
                    .url("url")
                    .track(Stream.Track.INBOUND_TRACK)
                    .statusCallback("status_callback")
                    .statusCallbackMethod(Stream.StatusCallbackMethod.GET)
                    .build());

        builder.siprec(new Siprec.Builder()
                    .name("name")
                    .connectorName("connector_name")
                    .track(Siprec.Track.INBOUND_TRACK)
                    .statusCallback("status_callback")
                    .statusCallbackMethod(Siprec.StatusCallbackMethod.GET)
                    .build());

        final Start elem = builder.build();

        Assert.assertEquals(
            Start.Builder.fromXml("<Start>" +
                "<Stream connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\" url=\"url\"/>" +
                "<Siprec connectorName=\"connector_name\" name=\"name\" statusCallback=\"status_callback\" statusCallbackMethod=\"GET\" track=\"inbound_track\"/>" +
            "</Start>").build().toXml(),
            elem.toXml()
        );
    }

    @Test
    public void testXmlEmptyChildrenDeserialization() {
        final Start.Builder builder = new Start.Builder();

        builder.stream(new Stream.Builder().build());

        builder.siprec(new Siprec.Builder().build());

        final Start elem = builder.build();

        Assert.assertEquals(
            Start.Builder.fromXml("<Start>" +
                "<Stream/>" +
                "<Siprec/>" +
            "</Start>").build().toXml(),
            elem.toXml()
        );
    }
}