package fr.lernejo.tester.api;

public class SomeLernejoTests {

    @TestMethod
    public void ok () {

    }

    @TestMethod
    public void ko () {
        throw new IllegalStateException();
    }

    public void none () {

    }
}
