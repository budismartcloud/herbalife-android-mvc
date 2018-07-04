package com.example.lenovo.herbalifemvcproject.controller;

import com.example.lenovo.herbalifemvcproject.model.ContentApplicationData;

public class MainController {
    private ContentApplicationData staticData = new ContentApplicationData();

    public String getHelp() {
        return staticData.getHelp();
    }
}
