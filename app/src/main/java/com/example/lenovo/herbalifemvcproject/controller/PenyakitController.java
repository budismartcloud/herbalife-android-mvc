package com.example.lenovo.herbalifemvcproject.controller;

import android.content.Context;

import com.example.lenovo.herbalifemvcproject.model.CatalogModel;

import java.util.ArrayList;

public class PenyakitController {
    private ArrayList<String> penyakitNames;
    private CatalogModel mCatalogModel;

    public PenyakitController(Context context) {
        mCatalogModel = new CatalogModel(context);
    }

    public ArrayList<String> getPenyakitNames() {
        return mCatalogModel.getPenyakitNames();
    }
}