package org.calbert.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Equivalent to LibraryTech.java

@Component
public class LibraryTech2 implements InitializingBean, DisposableBean {
    private final List<String> bookTitles = Collections.synchronizedList(new ArrayList<String>());

    @Override
    public void afterPropertiesSet() throws Exception {
        bookTitles.add("Animal Farm");
        bookTitles.add("Dog Farm");
        bookTitles.add("Cat");
        System.out.println("Library 2 - Book Titles initialized: " + bookTitles);
    }

    @Override
    public void destroy() throws Exception {
        bookTitles.clear();
        System.out.println("Library 2 destroyed: " + bookTitles);
    }
}
