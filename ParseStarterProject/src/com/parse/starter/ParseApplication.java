package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.PushService;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Add your initialization code here
    Parse.initialize(this, "VohYl19On2ZdUPmbIa8i85hxFOgbRQIyNnAYPU9z", "2BoZ0xM4Loo63jtMapBzsOud5WeOilrnfQNoCzH4");
    
    PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);
    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
      
    // If you would like all objects to be private by default, remove this line.
    defaultACL.setPublicReadAccess(true);
    
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
