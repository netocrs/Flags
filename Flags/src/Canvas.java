/* */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

/**
 *
 * @author CrSNet0
 */
public class Canvas extends JPanel
{
    Flags flags = new Flags();
    
    public Canvas() { }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform transform = g2d.getTransform();
        
        //---------------------------------------------------------------------------------------------------------
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //---------------------------------------------------------------------------------------------------------

        flags.drawJapanFlag(g);
        flags.drawIsraelFlag(g);
        g2d.setTransform(transform);
        flags.drawPakistanFlag(g);
        g2d.setTransform(transform);
        flags.drawBahrainFlag(g);
        flags.drawSouthKoreaFlag(g);
        flags.drawVietnamFlag(g);
        flags.drawNigeriaFlag(g);
        flags.drawSudanFlag(g);
        flags.drawBlankFlag_1(g);
        flags.drawNauruFlag(g);
        g2d.setTransform(transform);
        flags.drawBlankFlag_2(g);
        flags.drawNigerFlag(g);
        flags.drawAngolaFlag(g);
        flags.drawBlankFlag_8(g);
        flags.drawBurundiFlag(g);
        flags.drawMarshIslandsFlag(g);
        g2d.setTransform(transform);
        flags.drawBarbadosFlag(g);
        flags.drawBlankFlag_12(g);
        flags.drawCaboVerdeFlag(g);
        g2d.setTransform(transform);
        flags.drawMacedoniaFlag(g);
        flags.drawSlovakiaFlag(g);
        flags.drawBlankFlag_11(g);
        flags.drawBlankFlag_4(g);
        flags.drawBrazilFlag(g);
        g2d.setTransform(transform);
        flags.drawVenezuelaFlag(g);
    }
}
