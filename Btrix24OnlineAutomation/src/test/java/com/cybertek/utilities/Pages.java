package com.cybertek.utilities;

import com.cybertek.pages.Navigation.NavigationPage;
import com.cybertek.pages.activity_stream.TasksPage;
import com.cybertek.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private TasksPage tasksPage;
    private NavigationPage navigationPage;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



    public TasksPage tasksPage() {
        if (tasksPage == null) {
            tasksPage = new TasksPage();
        }
        return tasksPage;
    }


    public NavigationPage navigationPage() {
        if (navigationPage == null) {
            navigationPage = new NavigationPage();
        }
        return navigationPage;
    }




}
