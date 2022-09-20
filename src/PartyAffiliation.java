public class PartyAffiliation {
    public static void main(String[] args) {
        String partyAffiliation = "";
        partyAffiliation = "f";
        if (partyAffiliation.equalsIgnoreCase("d")) {
            System.out.println("You are a Donkey!");
        } else if (partyAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You are an Elephant!");
        } else if (partyAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You are an independent person!");
        } else
            System.out.println("You entered an invalid input! Remember to input [I,D,R]");


    }
}