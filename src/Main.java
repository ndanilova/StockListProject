import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String strArr[] = {"eniki", "beniki", "eli", "vareniki"};
        Integer intArr[]={10,20,15};
        Float floatArr[] = new Float[10];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float) Math.random()*10;
        }
        WorkArray insWorkArrayInt = new WorkArray<>(intArr);
        WorkArray insWorkArrayFloat = new WorkArray<>(floatArr);
        //WorkArray insWorkArrayString = new WorkArray<>(strArr);

        System.out.println("Integer array sum is = " + insWorkArrayInt.sum());
        System.out.println("Float array sum is = " + insWorkArrayFloat.sum());


        String line = "Конфеты ’Маска’;45;120";
        String item_fld[] = line.split(";");
        FoodItem candies = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        candies.printAll();
    }

}
