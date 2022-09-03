package com.myigituzun.filer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestStore {
    public static void main(String[] args) {
        
        try {
            List<Supplier> suppliers = new ArrayList<>();

            suppliers.add(new Supplier(601, "Cem Karaca", 6540));
            suppliers.add(new Supplier(602, "Barış Manço", 7645));
            suppliers.add(new Supplier(603, "Fikret Kızılok", 3450));

            String path = "D:\\GitHub\\IBTechBootcamp\\Project02\\Texts\\Supplier.txt";
            SupplierFiler supplierFiler = new SupplierFiler(path);
            supplierFiler.store(suppliers);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
