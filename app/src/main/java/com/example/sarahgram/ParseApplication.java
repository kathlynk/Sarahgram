package com.example.sarahgram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //register Parse Models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nF0ZuvOPLuIJsorxSIgXN1N9JlGoGbJ5KubJiG5X")
                .clientKey("XQ2A82v6FOA5aK2xrxVqu084LSGw6Qpzp2nB0vhg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
