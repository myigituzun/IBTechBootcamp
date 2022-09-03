package com.myigituzun.filer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFind {
    private static Supplier find(List<Supplier> suppliers, long supplierId) throws IOException {
        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId() == supplierId) {
                return supplier;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        List<Supplier> suppliers = new ArrayList<>();

        suppliers.add(new Supplier(601, "Cem Karaca", 6540));
        suppliers.add(new Supplier(602, "Barış Manço", 7645));
        suppliers.add(new Supplier(603, "Fikret Kızılok", 3450));

        long supplierId = 601;
        Supplier supplier = find(suppliers, supplierId);

        if (supplier != null) {
            System.out.println(
                    supplier.getSupplierId() + " " + supplier.getSupplierName() + " " + supplier.getTotalCredit());
        } else {
            System.out.println("Satıcı bulunamadı:" + supplierId);
        }
    }
}
