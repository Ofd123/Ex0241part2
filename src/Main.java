public class Main
{
    public static void main(String[]args)
    {
        Playable[] instruments = new Playable[5];
        instruments[0] = new Drum();
        instruments[1] = new Piano();
        instruments[2] = new Guitar();
        instruments[3] = new Drum();
        instruments[4] = new Guitar();

        for(int i = 0; i<instruments.length;i++)
        {
            instruments[i].play();
        }
    }
}
