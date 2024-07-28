package com.mumbaiker.graphql;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {
    public static List<Book> books = Arrays.asList(
            new Book(1,"kunal",200)
            ,new Book(2,"akash",234)
            ,new Book(3,"ritisha",267)
    );
}
