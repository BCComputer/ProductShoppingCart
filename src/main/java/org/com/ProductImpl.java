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
                    quit();
                    break;
                default:
                    if (response != 3) {
                        JOptionPane.showMessageDialog(null, "Please select an option in the drop down menu");
                    }
            }
        } while (response != 3);
        return response;
    }

    public static void addProduct(int productChoice, List<Product> products) {
        List<Laptop> laptops = new ArrayList<>();
        List<Table> tables = new ArrayList<>();
        List<Light> lights = new ArrayList<>();

        if (productChoice == 1) {
            //nt screenSize, double ram, double ssd, double processor
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
            }
        } while ((ram < 1));
        return ram;
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
                price = price - 1;
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
        final int MAX_OPTION = 3;
        int menuChoice;
        do {
            try {
                menuChoice = Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter your selection:"
                                + "\n[1] Add Products"
                                + "\n[2] Display All Products"
                                + "\n[3] Quit"
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

    public static void quit() {
        JOptionPane.showMessageDialog(null, "Thank you for adding products.");
    }
}