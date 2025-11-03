package Week10_Materials.Assignment;

public class Card {
    private int suit; //spades, hearts, diamonds, clubs or joker represented numerically
    private int value; //the numerical values on each card, 1 to 13, except joker which i sonly 2 in number

    public Card(int value, int suit){
        this.suit = suit;
        this.value = value;
    }

    //Getters
    public String getSuitAsString(){ //Return string representaiton of a card's suit based on the suit numerical value
        switch(suit) {
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4: 
                return "Clubs";
            case 5: 
                return "Joker";
            default:
                return "Wrong input";
        }        
    }

    public String getValueAsString(){ //Return string represenation of a card's alue based on the numerical
        if(getSuitAsString().equals("Joker")){
            return "";
        }
        else{
            switch(value){
                case 1:
                    return "Ace";
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                case 7:
                    return "7";
                case 8:
                    return "8";
                case 9:
                    return "9";
                case 10:
                    return "10";
                case 11:
                    return "Jack";
                case 12:
                    return "Queen";
                case 13:
                    return "King";
                default:
                    return "Wrong input";
            }
        }
    }

    @Override
    public String toString(){ //returns representation of a card
        if(getSuitAsString().equals("Joker")){
            return "Joker";
        }
        else{
            return getValueAsString() + " of " +  getSuitAsString();
        }
    }
}