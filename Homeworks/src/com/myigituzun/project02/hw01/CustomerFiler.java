package com.myigituzun.project02.hw01;

public class CustomerFiler extends BaseFiler<Customer> {

    public CustomerFiler(String filePath) {
        super(filePath);
    }

    @Override
    protected String format(Customer customer) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = stringBuilder.
        append(customer.getCustomerId()).append(DELIMETER).
        append(customer.getCustomerName()).append(DELIMETER).
        append(customer.getTotalDebit()).append(DELIMETER).
        toString();

        return line;
    }

    @Override
    protected Customer parse(String line) {
        String[] tokens = line.split(DELIMETER);
        Customer customer = new Customer();
        customer.setCustomerId(Long.parseLong(tokens[0]));
        customer.setCustomerName(tokens[1]);
        customer.setTotalDebit(Double.parseDouble(tokens[2]));
        
        return customer;
    }
    
}
