package com.example.lenovo.herbalifemvcproject.controller;

import android.content.Context;

import com.example.lenovo.herbalifemvcproject.model.CatalogModel;
import com.example.lenovo.herbalifemvcproject.model.Tumbuhan;

public class DetailCatalogController {
    private Tumbuhan tumbuhan;
    private CatalogModel catalogModel;

    public DetailCatalogController(Context context) {
        catalogModel = new CatalogModel(context);
    }

    public Tumbuhan getTumbuhan(String q) {
        return catalogModel.getTumbuhan(q);
    }
}