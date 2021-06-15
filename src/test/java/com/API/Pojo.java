package com.API;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Pojo {
        private String _id;
        private int index;
        private String guid;
        private boolean isActive;
        private String balance;
        private int age;
        private String eyeColor;
        private String name;
        private String gender;
        private String email;
        private String phone;
        private String address;
        private LocalDateTime registered;
        private String[] tags;
        private List<Map<Integer, Object>> friends;
        private int id;

}

