import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

//creates game window using graphics
public class GameWindow {
    /**
     * creates dairy aisle using graphics
     * uses std draw class to create isles and pictures of food items
     */

    static ArrayList<String> cart = new ArrayList<>();

    public static void introduction(){
        JFrame frame = new JFrame();
        frame.setTitle("Orientation");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("<html>Your meal is " + ListHelper.mainDish() + " for " + ListHelper.randomEvent()
        + "<br>Get to shopping!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</html>");

        JButton button = new JButton("Let's go!");
        button.addActionListener(e -> {
            frame.dispose();
            try {
                createDairyAisle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        panel.add(button);

        panel.add(label);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public static void createDairyAisle() throws IOException {
//        StdDraw.setPenColor(Color.cyan);
//        StdDraw.filledSquare(0.5,0.5,0.5);
//        StdDraw.setPenColor(Color.black);
//        Font font = new Font("Arial",Font.BOLD, 90);
//        StdDraw.setFont(font);
//        StdDraw.text(0.5,0.9,"Dairy Aisle");
//        CreateAisle();
//        StdDraw.picture(0.35,0.35, "resources/milk.gif",0.2,0.2);
//        StdDraw.picture(0.35,0.7, "resources/eggs.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.65, "resources/butter.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.35, "resources/cheese.jpeg",0.25,0.2);
//        StdDraw.picture(0.9,0.1, "resources/shopcart.jpeg",0.2,0.2);

        JFrame frame = new JFrame();
        frame.setTitle("Dairy Aisle");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        BufferedImage picture = ImageIO.read(new File("resources/milk.gif"));
        int scaleX =200;
        int scaleY =200;
        Image image = picture.getScaledInstance(scaleX, scaleY, Image.SCALE_SMOOTH);
        BufferedImage buffered = new BufferedImage(scaleX, scaleY, BufferedImage.TYPE_INT_ARGB);
        buffered.getGraphics().drawImage(image, 0, 0 , null);
        JButton picButton1 = new JButton(new ImageIcon(buffered));
        picture = ImageIO.read(new File("resources/eggs.jpeg"));
        JButton picButton2 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/butter.jpeg"));
        JButton picButton3 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/cheese.jpeg"));
        JButton picButton4 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/continue.png"));
        JButton picButton5 = new JButton(new ImageIcon(picture));
        picButton1.addActionListener(e -> {
            addIfNotExists("Milk");
        });
        picButton2.addActionListener(e -> {
            addIfNotExists("Eggs");
        });
        picButton3.addActionListener(e -> {
            addIfNotExists("Butter");
        });
        picButton4.addActionListener(e -> {
            addIfNotExists("Cheese");
        });
        picButton5.addActionListener(e -> {
            try {
                createVeggieAisle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        panel.add(picButton1);
        panel.add(picButton2);
        panel.add(picButton3);
        panel.add(picButton4);
        panel.add(picButton5);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     * creates veggie aisle using graphics
     * uses std draw to create isles and pictures of food items
     */
    public static void createVeggieAisle() throws IOException {
//        StdDraw.setPenColor(Color.green);
//        StdDraw.filledSquare(0.5,0.5,0.5);
//        StdDraw.setPenColor(Color.black);
//        Font font = new Font("Arial",Font.BOLD, 85);
//        StdDraw.setFont(font);
//        StdDraw.text(0.5,0.9,"Veggie Aisle");
//        CreateAisle();
//        StdDraw.picture(0.35,0.35, "resources/tomatoes.jpeg",0.2,0.2);
//        StdDraw.picture(0.35,0.7, "resources/lettuce.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.65, "resources/cucumbers.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.35, "resources/carrots.jpeg",0.25,0.2);
//        StdDraw.picture(0.35,0.1, "resources/peas.jpeg",0.2,0.2);
//        StdDraw.picture(0.65,0.1, "resources/peppers.jpeg",0.2,0.2);
        JFrame frame = new JFrame();
        frame.setTitle("Veggie Aisle");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        BufferedImage picture = ImageIO.read(new File("resources/tomatoes.jpeg"));

        JButton picButton1 = new JButton(new ImageIcon(picture));
        picButton1.setAlignmentY(2.5F);
        picture = ImageIO.read(new File("resources/lettuce.jpeg"));
        JButton picButton2 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/cucumbers.jpeg"));
        JButton picButton3 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/carrots.jpeg"));
        JButton picButton4 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/peas.jpeg"));
        JButton picButton5 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/peppers.jpeg"));
        JButton picButton6 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/continue.png"));
        JButton picButton7 = new JButton(new ImageIcon(picture));
        picButton1.addActionListener(e -> {
            addIfNotExists("Tomatoes");
        });
        picButton2.addActionListener(e -> {
            addIfNotExists("Lettuce");
        });
        picButton3.addActionListener(e -> {
            addIfNotExists("Cucumbers");
        });
        picButton4.addActionListener(e -> {
            addIfNotExists("Carrots");
        });
        picButton5.addActionListener(e -> {
            addIfNotExists("Peas");
        });
        picButton6.addActionListener(e -> {
            addIfNotExists("Peppers");
        });
        picButton7.addActionListener(e -> {
            try {
                createProteinAisle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        panel.add(picButton1);
        panel.add(picButton2);
        panel.add(picButton3);
        panel.add(picButton4);
        panel.add(picButton5);
        panel.add(picButton6);
        panel.add(picButton7);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     *creates protein aisle using graphics
     * uses std draw to create isles and pictures of food items
     */

    public static void createProteinAisle() throws IOException {
//        StdDraw.setPenColor(Color.red);
//        StdDraw.filledSquare(0.5,0.5,0.5);
//        StdDraw.setPenColor(Color.black);
//        Font font = new Font("Arial",Font.BOLD, 80);
//        StdDraw.setFont(font);
//        StdDraw.text(0.5,0.9,"Protein Aisle");
//        CreateAisle();
//        StdDraw.picture(0.35,0.35, "resources/steak.jpeg",0.2,0.2);
//        StdDraw.picture(0.35,0.7, "resources/salmon.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.65, "resources/beans.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.35, "resources/tofu.jpeg",0.25,0.2);
//        StdDraw.picture(0.35,0.1, "resources/gt.jpeg",0.2,0.2);
//        StdDraw.picture(0.65,0.1, "resources/chicken.jpeg",0.2,0.2);
        JFrame frame = new JFrame();
        frame.setTitle("Protein Aisle");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        BufferedImage picture = ImageIO.read(new File("resources/steak.jpeg"));
        JButton picButton1 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/salmon.jpeg"));
        JButton picButton2 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/beans.jpeg"));
        JButton picButton3 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/tofu.jpeg"));
        JButton picButton4 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/gt.jpeg"));
        JButton picButton5 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/chicken.jpeg"));
        JButton picButton6 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/continue.png"));
        JButton picButton7 = new JButton(new ImageIcon(picture));
        picButton1.addActionListener(e -> {
            addIfNotExists("Steak");
        });
        picButton2.addActionListener(e -> {
            addIfNotExists("Salmon");
        });
        picButton3.addActionListener(e -> {
            addIfNotExists("Beans");
        });
        picButton4.addActionListener(e -> {
            addIfNotExists("Tofu");
        });
        picButton5.addActionListener(e -> {
            addIfNotExists("Ground Turkey");
        });
        picButton6.addActionListener(e -> {
            addIfNotExists("Chicken");
        });
        picButton7.addActionListener(e -> {
            try {
                createGrainAisle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        panel.add(picButton1);
        panel.add(picButton2);
        panel.add(picButton3);
        panel.add(picButton4);
        panel.add(picButton5);
        panel.add(picButton6);
        panel.add(picButton7);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    /**
     *creates grain aisle using graphics
     * uses std draw to create isles and pictures of food items
     */
    public static void createGrainAisle() throws IOException {
//        StdDraw.setPenColor(Color.orange);
//        StdDraw.filledSquare(0.5,0.5,0.5);
//        StdDraw.setPenColor(Color.black);
//        Font font = new Font("Arial",Font.BOLD, 80);
//        StdDraw.setFont(font);
//        StdDraw.text(0.5,0.9,"Grain Aisle");
//        CreateAisle();
//        StdDraw.picture(0.35,0.35, "resources/pasta.jpeg",0.2,0.2);
//        StdDraw.picture(0.35,0.7, "resources/bread.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.65, "resources/rice.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.35, "resources/potatoes.jpeg",0.25,0.2);
//        StdDraw.picture(0.35,0.1, "resources/tortillas.jpeg",0.2,0.2);

        JFrame frame = new JFrame();
        frame.setTitle("Grain Aisle");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        BufferedImage picture = ImageIO.read(new File("resources/pasta.jpeg"));
        JButton picButton1 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/bread.jpeg"));
        JButton picButton2 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/rice.jpeg"));
        JButton picButton3 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/potatoes.jpeg"));
        JButton picButton4 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/tortillas.jpeg"));
        JButton picButton5 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/continue.png"));
        JButton picButton6 = new JButton(new ImageIcon(picture));
        picButton1.addActionListener(e -> {
            addIfNotExists("Pasta");
        });
        picButton2.addActionListener(e -> {
            addIfNotExists("Bread");
        });
        picButton3.addActionListener(e -> {
            addIfNotExists("Rice");
        });
        picButton4.addActionListener(e -> {
            addIfNotExists("Potatoes");
        });
        picButton5.addActionListener(e -> {
            addIfNotExists("Tortillas");
        });
        picButton6.addActionListener(e -> {
            try {
                createSeasoningAisle();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            frame.dispose();
        });
        panel.add(picButton1);
        panel.add(picButton2);
        panel.add(picButton3);
        panel.add(picButton4);
        panel.add(picButton5);
        panel.add(picButton6);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    /**
     *creates seasoning aisle using graphics
     * uses std draw to create isles and pictures of food items
     */
    public static void createSeasoningAisle() throws IOException {
//        StdDraw.setPenColor(Color.white);
//        StdDraw.filledSquare(0.5,0.5,0.5);
//        StdDraw.setPenColor(Color.black);
//        Font font = new Font("Arial",Font.BOLD, 70);
//        StdDraw.setFont(font);
//        StdDraw.text(0.5,0.9,"Seasoning Aisle");
//        CreateAisle();
//        StdDraw.picture(0.35,0.35, "resources/salt.jpeg",0.2,0.2);
//        StdDraw.picture(0.35,0.7, "resources/onions.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.65, "resources/garlic.jpeg",0.25,0.2);
//        StdDraw.picture(0.65,0.35, "resources/paprika.jpeg",0.25,0.2);
//        StdDraw.picture(0.35,0.1, "resources/basil.jpeg",0.2,0.2);
        JFrame frame = new JFrame();
        frame.setTitle("Seasoning Aisle");
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        BufferedImage picture = ImageIO.read(new File("resources/salt.jpeg"));
        JButton picButton1 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/onions.jpeg"));
        JButton picButton2 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/garlic.jpeg"));
        JButton picButton3 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/basil.jpeg"));
        JButton picButton4 = new JButton(new ImageIcon(picture));
        picture = ImageIO.read(new File("resources/continue.png"));
        JButton picButton5 = new JButton(new ImageIcon(picture));
        picButton1.addActionListener(e -> {
            addIfNotExists("Salt");
        });
        picButton2.addActionListener(e -> {
            addIfNotExists("Onions");
        });
        picButton3.addActionListener(e -> {
            addIfNotExists("Garlic");
        });
        picButton4.addActionListener(e -> {
            addIfNotExists("Basil");
        });
        picButton5.addActionListener(e -> {
            System.out.println(cart);
            displayListofItems();
            frame.dispose();
        });
        panel.add(picButton1);
        panel.add(picButton2);
        panel.add(picButton3);
        panel.add(picButton4);
        panel.add(picButton5);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public static void displayListofItems(){
        JFrame frame = new JFrame();
        frame.setTitle("Item List");

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        JLabel label = new JLabel("<html> Here are the items you selected:<br>"
                + String.join("<br>", cart) + "</html>");

        panel.add(label);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);


    }

    public static void addIfNotExists(String s){
        if (!cart.contains(s)){
            cart.add(s);
        }
    }
}