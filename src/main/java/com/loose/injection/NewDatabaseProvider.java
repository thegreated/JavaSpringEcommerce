package com.loose.injection;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New database IN action";
    }
}
