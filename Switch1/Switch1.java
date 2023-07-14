package Switch1;

public class Switch1 {
    public int option;
    public String showOption(){
        switch (option){
            case 1 :{
                return "It's prize is a Bicycle";
            }
            case 2 : {
                return "It's ´prize is a car";
            }
            default: {
                return "incorrect option";
            }
        }
    }
}
