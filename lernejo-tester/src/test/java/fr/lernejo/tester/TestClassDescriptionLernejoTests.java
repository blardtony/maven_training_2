package fr.lernejo.tester;

import fr.lernejo.tester.api.SomeLernejoTests;
import fr.lernejo.tester.internal.TestClassDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestClassDescriptionLernejoTests {
    @Test
    void testClassDescription() {
        TestClassDescription testClassDescription = new TestClassDescription(SomeLernejoTests.class);
        List<Method> expected = new ArrayList<>();

        try {
            expected.add(SomeLernejoTests.class.getMethod("ok"));
            expected.add(SomeLernejoTests.class.getMethod("ko"));
        }
        catch (Exception e) {
            System.out.println(e);
        }
        Assertions.assertEquals(expected, testClassDescription.listTestMethods());
    }



}
