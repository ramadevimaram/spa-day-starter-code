package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.Client;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping
    public String displayAllEvents(Model model){
        //model.addAttribute("title","All Events");
        model.addAttribute("user", UserData.getAll());
        return "user/index";
    }
    @GetMapping("add")
    public String displayAddUserForm(){
        return "user/add";
    }

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verifyPassword) {
        if(user.getPassword().equals(verifyPassword)){
            model.addAttribute("username" , user.getUsername());
            UserData.add(user);
            return "user/index";
        }
        model.addAttribute("email" , user.getEmail());
        model.addAttribute("error","Passwords do not match");
        return "user/add";
    }

}
