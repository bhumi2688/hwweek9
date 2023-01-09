package methodoverriding24;

//creating child class
 class SBI extends Bank {
    @Override
    public int getRateofInterest()  //get method
    {
        return 8;
    }
}
