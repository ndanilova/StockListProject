import java.util.Objects;

public class GenericItem {
    static int currentID = 1;
    public int ID;
    public String name; // Наименование товара
    public float price; //Цена товара
    public GenericItem analogue; // analogue product
    public Category category = Category.GENERAL;

    public GenericItem(String name, float price, Category category) {
        ID = currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public GenericItem(String name, float price, GenericItem analogue){
        ID = currentID++;
        this.name = name;
        this.price = price;
        this.analogue = analogue;
    }
    public GenericItem(){
        ID = currentID++;
    };
    void printAll(){
            System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %s \n",ID,name,price, category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericItem)) return false;
        GenericItem that = (GenericItem) o;
        return ID == that.ID && Float.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(analogue, that.analogue) && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price, analogue, category);
    }

    @Override
    public GenericItem clone(){
        GenericItem newItem = new GenericItem(this.name, this.price, this.category);
        newItem.analogue = analogue;
        return newItem;
    }

    @Override
    public String toString() {
        return "GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", analogue=" + analogue +
                ", category=" + category +
                '}';
    }
}
