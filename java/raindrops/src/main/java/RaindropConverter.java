class RaindropConverter {

    String convert(int number) {
        String conversion = "";

        if(number % 3 == 0) conversion += "Pling";
        if(number % 5 == 0) conversion += "Plang";
        if(number % 7 == 0) conversion += "Plong";

        return conversion.equals("") ? Integer.toString(number) : conversion;

    }

}
