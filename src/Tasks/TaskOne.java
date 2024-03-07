package Tasks;

public class TaskOne {
    private int collectionRate;
    private int amountPerParcel;
    private int basePay = 5000;
    private  int commissionRate;




    public void validateSuccessfulDelivery() {
        if ( collectionRate < 50)
            amountPerParcel = 160;
        if (collectionRate >=50 && collectionRate <= 59)
            amountPerParcel = 200;
        if (collectionRate >=60 && collectionRate <= 69)
            amountPerParcel = 250;
        if ( collectionRate >= 70)
            amountPerParcel = 500;


    }
    public int calculateWages(int collectionRate){
        validateSuccessfulDelivery();

        commissionRate = collectionRate * amountPerParcel + basePay;

        return commissionRate;
    }

}
