package com.myigituzun.project02.hw02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.myigituzun.project02.hw01.Supplier;
import com.myigituzun.project02.hw01.SupplierFiler;

public class ConsoleApplication {
    private static Scanner scanner = new Scanner(System.in);

    private static List<Supplier> suppliers = new ArrayList<>();
    private static String filePath = "D:\\GitHub\\IBTechBootcamp\\Homeworks\\src\\com\\myigituzun\\project02\\hw01\\Texts\\Supplier.txt";

    private static void printMenu() {
        System.out.println("Menü:");
        System.out.println("1. Yükle:");
        System.out.println("2. Sakla:");
        System.out.println("3. Listele:");
        System.out.println("4. Bul:");
        System.out.println("5. Ekle:");
        System.out.println("6. Güncelle:");
        System.out.println("7. Sil:");
        System.out.println("0. Çık:");
    }

    private static int scanChoice() {

        System.out.println("Seçiniz:");
        int choice = scanner.nextInt();

        return choice;
    }

    private static void handleChoice(int choice) throws IOException {
        switch (choice) {
            case 0:
                doExit();
                break;
            case 1:
                doLoad();
                break;
            case 2:
                doStore();
                break;
            case 3:
                doList();
                break;
            case 4:
                doFind();
                break;
            case 5:
                doAdd();
                break;
            case 6:
                doUpdate();
                break;
            case 7:
                doDelete();
                break;
            default:
                System.out.println("Geçersiz işlem: " + choice);
                break;
        }
    }

    private static void doLoad() throws IOException {
        SupplierFiler supplierFiler = new SupplierFiler(filePath);
        suppliers = supplierFiler.load();

        if (suppliers.size() > 0) {
            for (Supplier supplier : suppliers) {
                printSupplier(supplier);
            }
        } else {
            System.out.println("Liste boş.");
        }
    }
    private static void doStore() throws IOException {
        Supplier supplier = new Supplier(getSupplierIdForProcess(), getSupplierNameForProcess(), getTotalCreditForProcess());
        suppliers.add(supplier);

        SupplierFiler supplierFiler = new SupplierFiler(filePath);
        supplierFiler.store(suppliers);

        System.out.println("Eklendi: ");
    }

    private static void doList() {
        if (suppliers.size() > 0) {
            for (Supplier supplier : suppliers) {
                printSupplier(supplier);
            }
        } else {
            System.out.println("Liste boş.");
        }
    }

    private static void doFind() {
        long supplierId = getSupplierIdForProcess();
        boolean isThere = false;

        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId() == supplierId) {
                printSupplier(supplier);
                isThere = true;
                break;
            }
        }

        if (!isThere) {
            System.out.println("Satıcı bulunamadı:" + supplierId);
        }
    }

    private static void doAdd() {
        Supplier supplier = new Supplier(getSupplierIdForProcess(), getSupplierNameForProcess(), getTotalCreditForProcess());

        suppliers.add(supplier);

        System.out.println("Eklendi: ");
        printSupplier(supplier);
    }

    private static void doUpdate() {
        long supplierId = getSupplierIdForProcess();
        String supplierName = getSupplierNameForProcess();
        double totalCredit = getTotalCreditForProcess();

        boolean isThere = false;

        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId() == supplierId) {

                supplier.setSupplierId(supplierId);
                supplier.setSupplierName(supplierName);
                supplier.setTotalCredit(totalCredit);

                isThere = true;
                break;
            }
        }

        if (!isThere) {
            System.out.println("Satıcı bulunamadı:" + supplierId);
        }
    }

    private static void doDelete() {
        System.out.println("Güncellenecek ID:");
        long supplierId = getSupplierIdForProcess();

        boolean isThere = false;

        for (Supplier supplier : suppliers) {
            if (supplier.getSupplierId() == supplierId) {

                suppliers.remove(supplier);
                isThere = true;
                break;
            }
        }

        if (!isThere) {
            System.out.println("Satıcı bulunamadı:" + supplierId);
        }
    }

    private static void doExit() {
        System.exit(0);
    }

    private static long getSupplierIdForProcess() {
        System.out.println("ID giriniz:");

        return scanner.nextLong();
    }

    private static String getSupplierNameForProcess() {
        System.out.println("İsim giriniz:");

        return scanner.next();
    }

    private static double getTotalCreditForProcess() {
        System.out.println("Total kredi giriniz:");

        return scanner.nextDouble();
    }

    private static void printSupplier(Supplier supplier) {
        System.out
                .println(supplier.getSupplierId() + " " + supplier.getSupplierName() + " " + supplier.getTotalCredit());
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            printMenu();
            int choice = scanChoice();

            handleChoice(choice);
        }
    }
}
