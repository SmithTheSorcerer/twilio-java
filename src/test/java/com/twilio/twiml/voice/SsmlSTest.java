/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link SsmlS}
 */
public class SsmlSTest {
    @Test
    public void testEmptyElement() {
        SsmlS elem = new SsmlS.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        SsmlS elem = new SsmlS.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3Cs%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        SsmlS elem = new SsmlS.Builder("words").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>words</s>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        SsmlS elem = new SsmlS.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithChildren() {
        SsmlS.Builder builder = new SsmlS.Builder();

        builder.break_(new SsmlBreak.Builder().strength(SsmlBreak.Strength.NONE).time("time").build());

        builder.emphasis(new SsmlEmphasis.Builder("words").level(SsmlEmphasis.Level.STRONG).build());

        builder.lang(new SsmlLang.Builder("words").xmlLang(SsmlLang.XmlLang.ARB).build());

        builder.phoneme(new SsmlPhoneme.Builder("words").alphabet(SsmlPhoneme.Alphabet.IPA).ph("ph").build());

        builder.prosody(new SsmlProsody.Builder("words").volume("volume").rate("rate").pitch("pitch").build());

        builder.sayAs(new SsmlSayAs.Builder("words")
                    .interpretAs(SsmlSayAs.InterpretAs.CHARACTER)
                    .role(SsmlSayAs.Role.MDY)
                    .build());

        builder.sub(new SsmlSub.Builder("words").alias("alias").build());

        builder.w(new SsmlW.Builder("words").role("role").build());

        SsmlS elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>" +
                "<break strength=\"none\" time=\"time\"/>" +
                "<emphasis level=\"strong\">words</emphasis>" +
                "<lang xml:lang=\"arb\">words</lang>" +
                "<phoneme alphabet=\"ipa\" ph=\"ph\">words</phoneme>" +
                "<prosody pitch=\"pitch\" rate=\"rate\" volume=\"volume\">words</prosody>" +
                "<say-as interpret-as=\"character\" role=\"mdy\">words</say-as>" +
                "<sub alias=\"alias\">words</sub>" +
                "<w role=\"role\">words</w>" +
            "</s>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        SsmlS.Builder builder = new SsmlS.Builder();

        builder.addText("Hey no tags!");

        SsmlS elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>" +
            "Hey no tags!" +
            "</s>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        SsmlS.Builder builder = new SsmlS.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</s>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        SsmlS.Builder builder = new SsmlS.Builder();
        SsmlS elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</s>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithGenericNodeAttributes() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        GenericNode node = genericBuilder.option("key", "value").addText("someText").build();

        SsmlS.Builder builder = new SsmlS.Builder();
        SsmlS elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<s>" +
            "<genericTag key=\"value\">" +
            "someText" +
            "</genericTag>" +
            "</s>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final SsmlS elem = new SsmlS.Builder("words").build();

        Assert.assertEquals(
            SsmlS.Builder.fromXml("<s>words</s>").build().toXml(),
            elem.toXml()
        );
    }

    @Test
    public void testXmlChildrenDeserialization() {
        final SsmlS.Builder builder = new SsmlS.Builder();

        builder.break_(new SsmlBreak.Builder().strength(SsmlBreak.Strength.NONE).time("time").build());

        builder.emphasis(new SsmlEmphasis.Builder("words").level(SsmlEmphasis.Level.STRONG).build());

        builder.lang(new SsmlLang.Builder("words").xmlLang(SsmlLang.XmlLang.ARB).build());

        builder.phoneme(new SsmlPhoneme.Builder("words").alphabet(SsmlPhoneme.Alphabet.IPA).ph("ph").build());

        builder.prosody(new SsmlProsody.Builder("words").volume("volume").rate("rate").pitch("pitch").build());

        builder.sayAs(new SsmlSayAs.Builder("words")
                    .interpretAs(SsmlSayAs.InterpretAs.CHARACTER)
                    .role(SsmlSayAs.Role.MDY)
                    .build());

        builder.sub(new SsmlSub.Builder("words").alias("alias").build());

        builder.w(new SsmlW.Builder("words").role("role").build());

        final SsmlS elem = builder.build();

        Assert.assertEquals(
            SsmlS.Builder.fromXml("<s>" +
                "<break strength=\"none\" time=\"time\"/>" +
                "<emphasis level=\"strong\">words</emphasis>" +
                "<lang xml:lang=\"arb\">words</lang>" +
                "<phoneme alphabet=\"ipa\" ph=\"ph\">words</phoneme>" +
                "<prosody pitch=\"pitch\" rate=\"rate\" volume=\"volume\">words</prosody>" +
                "<say-as interpret-as=\"character\" role=\"mdy\">words</say-as>" +
                "<sub alias=\"alias\">words</sub>" +
                "<w role=\"role\">words</w>" +
            "</s>").build().toXml(),
            elem.toXml()
        );
    }
}