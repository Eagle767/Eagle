package jdbccon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageString {
    public static void main(String[] args) {

        try {
            File file = new File("C://Users//muthukumar.m//Downloads/bike.jpg");
            
            BufferedImage bufferedImage = ImageIO.read(file);

            setImageToFrame(bufferedImage);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void setImageToFrame(BufferedImage image) {

        ImageIcon imageIcon = new ImageIcon(image);

        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(700, 500);

        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);

        jFrame.add(jLabel);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}