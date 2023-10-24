package ra.data.lesson.lesson1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static List<Product> productList = new ArrayList<>();
    private static List<Product> products;
    private static File file;

    public static void main(String[] args) throws IOException, ClassNotFoundException, ClassCastException {
        file = new File("product.dat");
        file.createNewFile();

        while (true) {
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi san pham");
            System.out.println("3. Tim kiem san pham theo ten");
            System.out.println("4. Thoat");
            System.out.println("-----------------------------------");
            System.out.println("Nhap lua chon: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    searchProductByName();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Khong co chuc nang phu hop voi lua chon, moi chon la");
                    break;
            }
        }
    }

    private static void searchProductByName() {
        System.out.println("Nhap ten san pham muon tim kiem: ");
        String productName = scanner.nextLine();
        for (Product product : products) {
            if (product.getProductName().toLowerCase().contains(productName.toLowerCase())) {
                System.out.println(product);
            }
        }
        System.out.println("Khong tim thay san pham voi ten vua nhap");
    }

    private static void showProduct() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Product> products = (List<Product>) ois.readObject();
            ois.close();
            System.out.println("Danh sach san pham: ");
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println();
        }
    }

    private static void addProduct() {
        System.out.println("Nhap so luong san pham muon them moi: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Them moi san pham thu " + (i + 1));
            Product newProduct = new Product();
            System.out.println("Nhap ten san pham: ");
            newProduct.setProductName(scanner.nextLine());

            System.out.println("Nhap ten nha san xuat: ");
            newProduct.setManufacturer(scanner.nextLine());

            System.out.println("Nhap gia san pham: ");
            newProduct.setPrice(Double.parseDouble(scanner.nextLine()));

            System.out.println("Nhap mo ta san pham: ");
            newProduct.setDescription(scanner.nextLine());

            productList.add(newProduct);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(productList);
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }


}
