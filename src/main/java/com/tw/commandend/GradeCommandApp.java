package com.tw.commandend;

import com.tw.commandend.controller.RouteController;

import static com.tw.commandend.controller.RouteController.DISPLAY_MAIN_MENU_PAGE;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class GradeCommandApp {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String args[]) {
        RouteController routeController = new RouteController();
        routeController.generateCommand(DISPLAY_MAIN_MENU_PAGE).initDisplay();
    }
}
