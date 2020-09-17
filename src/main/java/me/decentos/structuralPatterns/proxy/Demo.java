package me.decentos.structuralPatterns.proxy;

import me.decentos.structuralPatterns.proxy.lazy.HeavyObject;
import me.decentos.structuralPatterns.proxy.lazy.HeavyObjectImpl;
import me.decentos.structuralPatterns.proxy.lazy.LazyProxy;
import me.decentos.structuralPatterns.proxy.security.SecurityAccess;
import me.decentos.structuralPatterns.proxy.security.SecurityAccessImpl;
import me.decentos.structuralPatterns.proxy.security.SecurityProxy;

public class Demo {
    public static void main(String[] args) {
        //  security();
        lazy();
    }

    private static void security() {
        SecurityAccess proxy = new SecurityProxy(new SecurityAccessImpl());
        proxy.access();
    }

    private static void lazy() {
        HeavyObject heavyObject = new HeavyObjectImpl();
        System.out.println(heavyObject);

        HeavyObject heavyObjectProxy = new LazyProxy(heavyObject);

        String.valueOf(true).length();

        System.out.println(heavyObjectProxy.getValue());
        System.out.println(heavyObject);
        System.out.println(heavyObjectProxy.getValue());
    }
}
