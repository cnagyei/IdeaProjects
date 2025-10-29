package com.calbert.demo.api;

import com.calbert.demo.model.entity.UserInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody UserInfo user) {
        if (user.isEnabled()) {
            return String.format("Hello %s. Your account is active.", user.getName());
        } else {
            return String.format("Hello %s. Your account is deactivated.", user.getName());
        }
    }

    @PostMapping("/users")
    public String userList(@RequestBody List<UserInfo> users) {
        return String.format("Added %d users.", users.size());
    }

    @PostMapping(value = "/user-xml", consumes = MediaType.APPLICATION_XML_VALUE)
    public String userStatusXml(@RequestBody List<UserInfo> users) {
        return String.format("Added %s", users.size());
    }
}
