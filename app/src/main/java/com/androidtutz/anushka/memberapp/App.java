package com.androidtutz.anushka.memberapp;

import android.app.Application;


public class App extends Application {


    private static App app;
    private MemberAppComponent memberAppComponent;


    public static App getApp() {


        return app;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        app = this;
        memberAppComponent = DaggerMemberAppComponent.builder()
                .memberDataModule(new MemberDataModule())
                .build();


    }


    public MemberAppComponent getMemberAppComponent() {


        return this.memberAppComponent;
    }

}
