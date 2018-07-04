package com.example.lenovo.herbalifemvcproject.controller;

import android.content.Context;

import com.example.lenovo.herbalifemvcproject.model.CatalogModel;
import com.example.lenovo.herbalifemvcproject.model.Penyakit;

public class DetailPenyakitController {
    private Penyakit penyakit;
    private CatalogModel mCatalogModel;

    public DetailPenyakitController(Context context) {
        mCatalogModel = new CatalogModel(context);
    }

    public Penyakit getPenyakit(String q) {
        return mCatalogModel.getPenyakit(q);
    }
}