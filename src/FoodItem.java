import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem{
    Date dateOfIncome; // дата производства
    short expires; // срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }
    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.GENERAL);
        this.expires = expires;
    }
    public FoodItem(String name){
        super(name, 0f, Category.GENERAL);
    }

    @Override
    void printAll(){
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %s , date of income: %tA , expires: %d \n",ID,name,price, category, dateOfIncome, expires );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodItem)) return false;
        if (!super.equals(o)) return false;
        FoodItem foodItem = (FoodItem) o;
        return expires == foodItem.expires && Objects.equals(dateOfIncome, foodItem.dateOfIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires);
    }

    @Override
    public FoodItem clone(){
        FoodItem newItem = new FoodItem(this.name, this.price, this.expires);
        newItem.dateOfIncome = this.dateOfIncome;
        return newItem;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                '}';
    }
}
