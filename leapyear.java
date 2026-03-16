class leapyear {
    public static void main(String[] args) {
        
        System.out.println("----------- leap year check -----------");

        
        int febDays = 29; 
        
        
        String result;
        
        System.out.println("days in february set to: " + febDays);

        
        result = (febDays == 29) ? "its a leap year!" : "its not a leap year.";
        
        
        System.out.println("result: " + result);
        
        
    }
}