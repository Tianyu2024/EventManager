package cn.tianyu.client.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: CN_tianyu
 */

public class EventManager {
    private static final List<Object> listeners = new ArrayList<>();

    public static void register(Object listener) {
        listeners.add(listener);
    }

    public static void unregister(Object listener) {
        listeners.remove(listener);
    }

    public static void callEvent(Object event) {
        for (Object listener : listeners) {
            for (Method method : listener.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(EventTarget.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(event.getClass())) {
                        try {
                            method.invoke(listener, event);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}