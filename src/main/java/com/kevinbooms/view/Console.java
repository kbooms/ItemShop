package com.kevinbooms.view;

import com.sun.tools.javac.Main;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Console {

    private PrintWriter out;
    private Scanner in;

    public Console(InputStream input, OutputStream output) {
        this.out = new PrintWriter(output);
        this.in = new Scanner(input);
    }

    public Object getChoiceFromOptions(Enum menu) {
        MainMenu[] choices = MainMenu.values();
        return null;
    }
}
