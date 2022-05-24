package DesignPattern.Observer.Hotgirl;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        HotGirl girl = new HotGirl();
        girl.AddToZone(new Boy("1"));
        girl.PostFacebook();
        girl.Notify();
    }
}
