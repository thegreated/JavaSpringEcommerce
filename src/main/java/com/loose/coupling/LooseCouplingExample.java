package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args)
    {
       UserDataProvider databaseProvider = new UserDatabaseProvider();
       UserManager userManageWithDb = new UserManager(databaseProvider);
       System.out.println(userManageWithDb.getUserInfo());

        UserDataProvider WebDatabaseProvider = new WebServiceDataProvider();
        UserManager userManager = new UserManager(WebDatabaseProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider NewDatabaseProvider = new NewDatabaseProvider();
        UserManager newUserManager = new UserManager(NewDatabaseProvider);
        System.out.println(newUserManager.getUserInfo());

    }
}
