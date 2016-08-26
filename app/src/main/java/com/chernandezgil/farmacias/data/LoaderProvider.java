package com.chernandezgil.farmacias.data;

import android.content.Context;


import android.database.Cursor;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;

import com.chernandezgil.farmacias.data.source.local.DbContract;

/**
 * Created by Carlos on 03/08/2016.
 */
public class LoaderProvider  {

    private Context mContext;

    public LoaderProvider(Context context){
        mContext=context;
    }
    public Loader<Cursor> getPharmaciesNearby(){

        return new CursorLoader(mContext,
                DbContract.FarmaciasEntity.CONTENT_URI,
                null,
                null,
                null,
                null) ;
    }
}