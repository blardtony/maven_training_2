package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class TestClassDescription {
    private final Class<?> aClass;
    private final List<Method> methodList;

    public TestClassDescription(Class<?> aClass) {
        this.aClass = aClass;
        this.methodList = new ArrayList<>();
    }

    public List<Method> listTestMethods() {
        for (Method method: aClass.getMethods()) {
            if (Modifier.isPublic(method.getModifiers()) && method.getParameterCount() == 0 && method.isAnnotationPresent(TestMethod.class)) {
                methodList.add(method);
            }
        }
        return methodList;
    }
}
