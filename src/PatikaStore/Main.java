package PatikaStore;

import PatikaStore.Builders.CellPhoneBuilder;
import PatikaStore.Builders.NotebookBuilder;
import PatikaStore.Products.CellPhone;
import PatikaStore.Products.Notebook;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Map<String, Brand> brandMap = new HashMap<>();
    static List<Notebook> notebooks = new ArrayList<>();
    static List<CellPhone> cellPhones = new ArrayList<>();

    static {
        brandMap.put("Samsung", new Brand("Samsung"));
        brandMap.put("Lenovo", new Brand("Lenovo"));
        brandMap.put("Apple", new Brand("Apple"));
        brandMap.put("Huawei", new Brand("Huawei"));
        brandMap.put("Casper", new Brand("Casper"));
        brandMap.put("Asus", new Brand("Asus"));
        brandMap.put("Hp", new Brand("Hp"));
        brandMap.put("Xiaomi", new Brand("Xiaomi"));
        brandMap.put("Monster", new Brand("Monster"));

        notebooks.add(new Notebook(7000.0, 0.2f, 40, "Matebook 14", brandMap.get("Huawei"), 512, 14.0f, 16));
        notebooks.add(new Notebook(3699.0, 0.1f, 50, "V14 IGL", brandMap.get("Lenovo"), 1024, 14.0f, 8));
        notebooks.add(new Notebook(8199.0, 0f, 30, "Tuf Gaming", brandMap.get("Asus"), 2048, 15.6f, 32));

        cellPhones.add(new CellPhone(3199.0, 0f, 75, "GALAXY A51", brandMap.get("Samsung"), 128, 6.5f, 6, 4000, "Black", 32));
        cellPhones.add(new CellPhone(7379.0, 0f, 15, "Iphone 11", brandMap.get("Apple"), 64, 6.1f, 6, 3046, "Blue", 5));
        cellPhones.add(new CellPhone(4012.0, 0f, 25, "Redmi Note 10 Pro", brandMap.get("Xiaomi"), 128, 6.5f, 12, 4000, "White", 35));
    }

    public static void printCellPhones(List<CellPhone> cellPhones) {

        System.out.println("Cell Phone List ");
        System.out.println("""
                ---------------------------------------------------------------------------------------------------------------------------------------------
                | ID  | Product Name                  | Price          | Brand     | HDD       | Screen Size  | Camera  | Battery     | RAM      | Color    |\s
                ---------------------------------------------------------------------------------------------------------------------------------------------""");

        for (CellPhone phone : cellPhones) {
            System.out.println(phone);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void printNotebooks(List<Notebook> notebooks) {
        System.out.println("Notebook List");
        System.out.println("""
                ------------------------------------------------------------------------------------------------------
                | ID  | Product Name                  | Price          | Brand     | HDD     | Screen Size | RAM     |
                ------------------------------------------------------------------------------------------------------""");

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Patika store product management panel");

        while (true) {
            System.out.println("""
                    1 - Notebook Transaction
                    2 - Cell Phone Transaction
                    3 - List Brands
                    0 - Exit""");
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("""
                            Notebook
                            1 - Add Notebook
                            2 - Erase Notebook
                            3 - Print All Notebooks (Filtered by Id)
                            4 - Print All Notebooks (Filtered by Brand name)""");
                    switch (scanner.nextLine()) {
                        case "1" -> {
                            NotebookBuilder notebookBuilder = new NotebookBuilder();
                            notebooks.add(notebookBuilder.getNotebook());
                        }
                        case "2" -> {
                            System.out.println("Enter the id of the notebook you want to delete");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            notebooks.removeIf(notebook -> notebook.getId() == id);
                        }
                        case "3" -> printNotebooks(notebooks);
                        case "4" -> printNotebooks(
                                notebooks.stream()
                                        .sorted(Comparator.comparing(o -> o.getBrand().getName()))
                                        .collect(Collectors.toList())
                        );
                    }
                }
                case "2" -> {
                    System.out.println("""
                            Cell Phone
                            1 - Add Cell Phone
                            2 - Erase Cell Phone
                            3 - Print All Cell Phones (Filtered by Id)
                            4 - Print All cell Phones (Filtered by Brand name)""");
                    switch (scanner.nextLine()) {
                        case "1" -> {
                            CellPhoneBuilder cellPhoneBuilder = new CellPhoneBuilder();
                            cellPhones.add(cellPhoneBuilder.getCellPhone());
                        }
                        case "2" -> {
                            System.out.println("Enter the id of the cell phone you want to delete");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            cellPhones.removeIf(cellPhone -> cellPhone.getId() == id);
                        }
                        case "3" -> printCellPhones(cellPhones);
                        case "4" -> printCellPhones(
                                cellPhones.stream()
                                        .sorted(Comparator.comparing(o -> o.getBrand().getName()))
                                        .collect(Collectors.toList())
                        );
                    }
                }
                case "3" -> brandMap.values()
                        .stream()
                        .map(Brand::getName)
                        .sorted()
                        .forEach(System.out::println);
                case "0" -> System.exit(0);
            }
        }
    }
}
