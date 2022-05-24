package DesignPattern.Observer.Hotgirl;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class HotGirl {
    private boolean needAttention = false;

    // Some of boys crushing this instance :))
    public List<Boy> FriendZone = new ArrayList<Boy>();

    public void PostFacebook()
    {
        System.out.println("Complete post");
        NeedAttention = true;
    }

    // State of instance. When state change, observe will know and react
    private boolean NeedAttention;
    {

        {
            needAttention = needAttention;
            Notify();
        }
    }

    public void Notify()
    {
        for(Boy boy : FriendZone)
        {
            boy.Care();
        }
    }

    // Register observer.
    public void AddToZone(Boy b)
    {
        FriendZone.add(b);
    }
}

