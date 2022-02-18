package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WGUe3c83x6fkV0K4QLNmD9cR0UEequLyxxYMJLcA")
                .clientKey("358iVDPoiUJzPQsPpzzNIovL7fP3jjubKrHSgXdk")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

