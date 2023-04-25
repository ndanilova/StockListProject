package ru.billing.client;

import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
    ItemCatalog cat = new ItemCatalog();
        for (int i = 0; i < 10; i++) {
            cat.addItem(new GenericItem());
        }
        /*long begin = new Date().getTime();

        for(int i=0; i<100000;i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin));
        begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));*/

        CatalogLoader loader = new CatalogStubLoader();
        loader.load(cat);
        cat.printItems();



    }








    /*public static void main(String[] args) {
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
        ru.billing.stocklist.FoodItem candies = new ru.billing.stocklist.FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        candies.printAll();
    }*/
}
