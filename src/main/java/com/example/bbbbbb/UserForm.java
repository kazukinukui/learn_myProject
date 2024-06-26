package com.example.bbbbbb;

import jakarta.validation.constraints.NotBlank;

public class UserForm {
    
    @NotBlank(message = "名前を入力してください(これはメインですリベーステストを行います。)")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
