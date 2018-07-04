package com.example.lenovo.herbalifemvcproject.controller;

import com.example.lenovo.herbalifemvcproject.model.ContentApplicationData;

public class CariPenyakitController {
    private ContentApplicationData staticData = new ContentApplicationData();

    public String[] getSaran() {
        return staticData.getSaran();
    }
}