public class Drum implements Playable
{
    @Override
    public void play()
    {
        System.out.println("snap");
    }

    public void waitForPunchLine()
    {
        System.out.println("skudush");
    }
}

