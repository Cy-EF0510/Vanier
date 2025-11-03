package Lab;

public class Joker extends Card{
    public Joker(int value, int suit){
        super(value, suit);
    }    

    public String getSuitAsString(){
        if(suit == 5){
            return "Joker";
        }
        else{
            return "Wrong Input";
        }
    }

    public String getValueAsString(){
        if(getSuitAsString() == "Joker"){
            return "1";
        }
        else{
            return "Error";
        }
    }
}
