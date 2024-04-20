/* */

import javax.swing.JFrame;

/**
 *
 * @author CrSNet0
 */
public class Frame extends JFrame
{
    Canvas canvas = new Canvas();
    final int WIDTH = 1100, HEIGHT = 695;
    
    public Frame()
    {
        add(canvas);
        
        setTitle("Flags");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}
