package Tasks;

public class TaskOne {
    private int collectionRate;
    private int amountPerParcel;
    private int basePay = 5000;
    private  int commissionRate = 0 ;




    public void validateSuccessfulDelivery(int collectionRate) {
        if ( collectionRate < 50)
            amountPerParcel = 160;
        else if (collectionRate < 60)
            amountPerParcel = 200;
        else if (collectionRate < 70)
            amountPerParcel = 250;
        else
            amountPerParcel = 500;

    }
    public int calculateWages(int collectionRate){
        validateSuccessfulDelivery(collectionRate);

        commissionRate = collectionRate * amountPerParcel + basePay;

        return commissionRate;
    }

}
