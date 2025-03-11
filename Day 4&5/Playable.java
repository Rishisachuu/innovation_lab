interface Playable{
    void play();
    
}
class Guitar implements Playable{
    public void play(){
        System.out.println("playing the guitar")
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("playing the piano")
    }
}
public class Main{
    public static void main(String[] args){
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();
        myGuitar.play();
        myPiano.play();
    }
    
}
