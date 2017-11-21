
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class JImage extends JComponent{

    //Something to store the picture
    private BufferedImage image;
    
    @Override
    public void paintComponent(Graphics g){
        //there is an image to draw 
        if(image != null){
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
        }
}
    public void setImage(BufferedImage img){
       // store the image 
        this.image = img;
        //repaint to draw
        repaint();
    }
    
    
}