package com.myigituzun.filer;

import java.io.IOException;
import java.util.List;

public class TestLoad {
    public static void main(String[] args) throws IOException {
        String path = "D:\\GitHub\\IBTechBootcamp\\Project02\\Texts\\Supplier.txt";
        SupplierFiler supplierFiler = new SupplierFiler(path);

        List<Supplier> suppliers = supplierFiler.load();

        for (Supplier supplier : suppliers) {
            System.out.println(supplier.getSupplierId() + " " + supplier.getSupplierName() + " " + supplier.getTotalCredit());
        }
    }
}
