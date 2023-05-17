package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

public class Main {

    public static void main(String[] args) throws ItemAlreadyExistsException {
        ItemCatalog cat = new ItemCatalog();
        CatalogStubLoader stub = new CatalogStubLoader();
        stub.load(cat);
    }
}