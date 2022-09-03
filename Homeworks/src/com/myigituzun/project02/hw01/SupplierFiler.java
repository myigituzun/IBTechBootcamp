package com.myigituzun.project02.hw01;

public class SupplierFiler extends BaseFiler<Supplier> {

    public SupplierFiler(String filePath) {
        super(filePath);
    }

    @Override
    protected Supplier parse(String line) {
        String[] tokens = line.split(DELIMETER);
        Supplier supplier = new Supplier();
        supplier.setSupplierId(Long.parseLong(tokens[0]));
        supplier.setSupplierName(tokens[1]);
        supplier.setTotalCredit(Double.parseDouble(tokens[2]));
        
        return supplier;
    }

    @Override
    protected String format(Supplier supplier) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = stringBuilder.
        append(supplier.getSupplierId()).append(DELIMETER).
        append(supplier.getSupplierName()).append(DELIMETER).
        append(supplier.getTotalCredit()).append(DELIMETER).
        toString();

        return line;
    }

}
