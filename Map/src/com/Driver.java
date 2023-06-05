package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
public static void main(String[] args) {
	User user1 = new User("001", "user1", "user1@gmail.com");
	User user2 = new User("002", "user2", "user2@gmail.com");
	User user3 = new User("003", "user3", "user3@gmail.com");


    Product p1= new Product("001", "product1");
    Product p2= new Product("002", "product2");
    Product p3= new Product("003", "product3");
    
    List<Product> pl = new ArrayList<>();
    
    Map<String, User> userIdToUserMap = new HashMap<>();
    userIdToUserMap.put("user1", user1);
    userIdToUserMap.put("user2", user2);
    userIdToUserMap.put("user3", user3);
    
    System.out.println(userIdToUserMap);
    
    pl.add(p1);
    pl.add(p2);
    pl.add(p3);
    
    Map<String,List<Product>> userIdToProductListMap = new HashMap<>();
    userIdToProductListMap.put("001",Arrays.asList(p1,p2) );
    userIdToProductListMap.put("002",Arrays.asList(p1,p2,p3) );
    userIdToProductListMap.put("003",Arrays.asList(p1,p3) );
    
    System.out.println(userIdToProductListMap);
    
    
}
}
