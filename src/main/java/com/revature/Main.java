package com.revature;

import com.revature.controller.Controller;
import com.revature.controller.BankAccountController;
import com.revature.controller.UserController;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create();

        // Controller is an interface that is implemented
        // by UserController + BankAccountController
        // The Controller interface defines a method,
        // public abstract void mapEndpoints(Javalin app)
        Controller[] controllers = { new UserController(), new BankAccountController() };

        for (Controller c : controllers) {
            c.mapEndpoints(app);
        }

        app.start(8080);
    }
}
