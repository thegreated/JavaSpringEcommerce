package com.loose.injection;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails()
    {
        return "User Details form Database";
    }
}
