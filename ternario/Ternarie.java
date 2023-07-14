package ternario;

public class Ternarie{
    public int state;
    public boolean state2;
    public int shoeMessage(){
        int x = state > 0 ? 4 : 5;
        int y = state2 ? 8 : 3;
        return x;
    }
}
