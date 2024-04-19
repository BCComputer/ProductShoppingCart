package org.com;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl {
    private static int id = 101;
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        mainMenuChoice(products);
    }

    public static int mainMenuChoice(List<Product> products) {
        int response = 0;
        do {
            response = createMenu();
            switch (response) {
                case 1:
                    int productChoice = getProductChoice();
                    addProduct(productChoice, products);
                    break;
                case 2:
                    printProduct(products);
                    break;
                case 3:
                    printLaptop(products);
                    break;
                case 4:
                    getTableProduct(products);
                    break;
                case 5:
                    getLightProduct(products);
                    break;
                case 6:
                    removeProduct(products);
                    break;
                case 7:
                    quit();
                    break;
                default:
                    if (response != 7) {
                        JOptionPane.showMessageDialog(null, "Please select an option in the drop down menu");
                    }
            }
        } while (response != 7);
        return response;
    }
    public static void getLightProduct(List<Product> products){
        List<Light> lights = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Light) {
                lights.add((Light) product);
            }
        }
        printLightProduct(lights);
    }
    public static void printLightProduct(List<Light> lights) {
        JOptionPane.showMessageDialog(null, "Products Lists ____________________________\n\n" +
                lights.toString());
    }
    public static void getTableProduct(List<Product> products){
        List<Table> tables = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Table) {
                tables.add((Table) product);
            }
        }
        printTableProduct(tables);
    }
    public static void printTableProduct(List<Table> tables) {
        JOptionPane.showMessageDialog(null, "Products Lists ____________________________\n\n" +
                tables.toString());
    }
    public static void printLaptop(List<Product> products){
        List<Laptop> laptops = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Laptop) {
                laptops.add((Laptop) product);
            }
        }
        printLaptopProducts(laptops);
    }
    public static void printLaptopProducts(List<Laptop> laptops) {
        JOptionPane.showMessageDialog(null, "Products Lists ____________________________\n\n" +
                laptops.toString());
    }
    public static void addProduct(int productChoice, List<Product> products) {
        List<Laptop> laptops = new ArrayList<>();
        List<Table> tables = new ArrayList<>();
        List<Light> lights = new ArrayList<>();

        if (productChoice == 1) {
            laptops.add(new Laptop(id, inputName(), inputPrice(), inputRating(), inputScreenSize(), inputRAM(), getSSD(), inputProcessor()));
            id++;
        } else if (productChoice == 2) {
            tables.add(new Table(id, inputName(), inputPrice(), inputHeight(), inputWeight(), inputLength()));
            id++;
        } else {
            lights.add(new Light(id, inputName(), inputPrice(), inputRating(), inputWatts(), inputLumen()));
            id++;
        }
        products.addAll(laptops);
        products.addAll(tables);
        products.addAll(lights);
    }

    public static void removeProduct(List<Product> products){

        int idToRemove = inputRemoveId();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getId());;
            if (products.get(i).getId() == idToRemove) {
                products.remove(products.get(i));
            }
        }
    }
    public static void printProduct(List<Product> products) {
        JOptionPane.showMessageDialog(null, "Products Lists ____________________________\n\n" +
                products.toString());
    }

    public static double inputProcessor() {
        double processor = 0;
        do {
            try {
                processor = Double.parseDouble(JOptionPane.showInputDialog("Enter processor capacity"));
                if (processor < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                processor = processor - 1;
            }
        } while ((processor < 1));
        return processor;
    }

    public static double getSSD() {
        double ssd = 0;
        do {
            try {
                ssd = Double.parseDouble(JOptionPane.showInputDialog("Enter SSD"));
                if (ssd < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                ssd = ssd - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((ssd < 1));
        return ssd;
    }

    public static double inputRAM() {
        double ram = 0;
        do {
            try {
                ram = Double.parseDouble(JOptionPane.showInputDialog("Enter RAM"));
                if (ram < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                ram = ram - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((ram < 1));
        return ram;
    }

    public static int inputRemoveId() {
        int screenSize = 0;
        do {
            try {
                screenSize = Integer.parseInt(JOptionPane.showInputDialog("Enter ID from list that you want to remove:"));
                if (screenSize < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                screenSize = screenSize - 1;
            }
        } while ((screenSize < 1));
        return screenSize;
    }

    public static int inputScreenSize() {
        int screenSize = 0;
        do {
            try {
                screenSize = Integer.parseInt(JOptionPane.showInputDialog("Enter screen size:"));
                if (screenSize < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                screenSize = screenSize - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((screenSize < 1));
        return screenSize;
    }

    public static int inputLumen() {
        int lumen = 0;
        do {
            try {
                lumen = Integer.parseInt(JOptionPane.showInputDialog("Enter lights lumen:"));
                if (lumen < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                lumen = lumen - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((lumen < 1));
        return lumen;
    }

    public static int inputWatts() {
        int watts = 0;
        do {
            try {
                watts = Integer.parseInt(JOptionPane.showInputDialog("Enter lights watts:"));
                if (watts < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                watts = watts - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((watts < 1));
        return watts;
    }

    public static String inputName() {
        String name = "";
        do {
            name = JOptionPane.showInputDialog("Enter product Name :");
            if ((name == null || name.equals(""))) {
                JOptionPane.showMessageDialog(null, "EnterEnter Valid Name");
            }
        } while (name == null || name.equals(""));
        return name;
    }

    public static double inputRating() {
        double ratings = 0;
        do {
            try {
                ratings = Double.parseDouble(JOptionPane.showInputDialog("Enter product rating"));
                if (ratings < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                ratings = ratings - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((ratings < 1));
        return ratings;
    }

    public static double inputLength() {
        double length = 0;
        do {
            try {
                length = Double.parseDouble(JOptionPane.showInputDialog("Enter product length"));
                if (length < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                length = length - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((length < 1));
        return length;
    }

    public static double inputHeight() {
        double height = 0;
        do {
            try {
                height = Double.parseDouble(JOptionPane.showInputDialog("Enter product height"));
                if (height < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                height = height - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((height < 1));
        return height;
    }

    public static double inputWeight() {
        double weight = 0;
        do {
            try {
                weight = Double.parseDouble(JOptionPane.showInputDialog("Enter product weight"));
                if (weight < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                weight = weight - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((weight < 1));
        return weight;
    }
    public static double inputPrice() {
        double price = 0;
        do {
            try {
                price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price"));
                if (price < 1) {
                    JOptionPane.showMessageDialog(null, "Number should be positive");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Number should be positive");
                price = price - 1;
                JOptionPane.showMessageDialog(null, "Number should be positive");
            }
        } while ((price < 1));
        return price;
    }

    public static int getProductChoice() {
        final int MIN_OPTION = 1;
        final int MAX_OPTION = 3;
        int menuChoice;
        do {
            try {
                menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
                        "Please Select Products:"
                                + "\n[1] Laptop"
                                + "\n[2] Table"
                                + "\n[3] Light"
                ));
            } catch (NumberFormatException e) {
                menuChoice = 0;
            }
            if (menuChoice < MIN_OPTION || menuChoice > MAX_OPTION) {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter the number between 1 to 3 menu option.");
            }
        } while (menuChoice < MIN_OPTION || menuChoice > MAX_OPTION);
        return menuChoice;
    }

    public static int createMenu() {
        final int MIN_OPTION = 1;
        final int MAX_OPTION = 7;
        int menuChoice;
        do {
            try {
                menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter your selection:"
                                + "\n[1] Add Products"
                                + "\n[2] Display All Products"
                                + "\n[3] Display Laptops"
                                + "\n[4] Display Tables"
                                + "\n[5] Display Lights"
                                + "\n[6] Remove Products by ID"
                                + "\n[7] Quit"
                ));
            } catch (NumberFormatException e) {
                menuChoice = 0;
            }
            if (menuChoice < MIN_OPTION || menuChoice > MAX_OPTION) {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter the number between 1 to 7 menu option.");
            }
        } while (menuChoice < MIN_OPTION || menuChoice > MAX_OPTION);

        return menuChoice;
    }

    public static void quit() {
        JOptionPane.showMessageDialog(null, "Thank you for adding products.");
    }
}