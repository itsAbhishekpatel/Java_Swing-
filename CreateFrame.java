import java.awt.*;//import awt class
import javax.swing.*;//import swing class

class CraeteFrame{

    public static void main(String [] args) {
        JFrame f=new JFrame();//object of frame.
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setSize(500, 250);
        // f.setLocation(250, 250);
        f.setBounds(100, 100, 1000, 500);//you can set both size and location with setbounds.
        f.setTitle("JFrame");
        ImageIcon Icon =new ImageIcon("A.png");//object of imageicon.
        f.setIconImage(Icon.getImage());

        Container c=f.getContentPane();//make a container to add all component.
        c.setBackground(Color.CYAN); 
        f.setResizable(false);//restrict the user to minimize.
        

    }
}