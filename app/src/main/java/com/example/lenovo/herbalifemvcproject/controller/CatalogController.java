package com.example.lenovo.herbalifemvcproject.controller;

import android.content.Context;

import com.example.lenovo.herbalifemvcproject.model.CatalogModel;

import java.util.ArrayList;

public class CatalogController {
    private ArrayList<String> catalogNames;
    private CatalogModel catalogModel;

    public CatalogController(Context context) {
        catalogModel = new CatalogModel(context);
    }

    public ArrayList<String> getCatalogNames() {
        return catalogModel.getCatalogNames();
    }
}