package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static final Map<Integer, User> users = new HashMap<>();
    //get all Users
    public static Collection<User> getAll(){
        return users.values();
    }
    //get a single User
    public static User getById(int id){
        return users.get(id);
    }
    //add an user
    public static void add(User user){
        users.put(user.getId(),user);
    }
}
