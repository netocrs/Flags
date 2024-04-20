/*  */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import static java.lang.Math.*;

/**
 *
 * @author CrSNet0
 */
public class Flags
{
    private void drawCountryName(Graphics g, String name, int nameX, int nameY, int fontSize)
    {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, fontSize));
        g.drawString(name, nameX, nameY);
    }
    
    public void drawJapanFlag(Graphics g)
    {
        drawCountryName(g, "Japan", 38, 25, 22);
        g.setColor(Color.WHITE);
        g.fillRect(5, 30, 130, 100);
        g.setColor(Color.RED);
        g.fillOval(44, 55, 45, 45);
    }
    
    public void drawIsraelFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triang1 = new GeneralPath();
        GeneralPath triang2 = new GeneralPath();
        
        drawCountryName(g, "Israel", 187, 25, 22);
        
        g.setColor(new Color(0, 60, 179));
        g.fillRect(150, 30, 130, 25);
        g.setColor(Color.WHITE);
        g.fillRect(150, 55, 130, 50);
        g.setColor(new Color(0, 60, 179));
        g.fillRect(150, 105, 130, 25);
        
        g2d.setStroke(new BasicStroke((float) 2.5f));
        
        g.translate(166, 10);
        
        triang1.moveTo(50, 50);
        triang1.lineTo(68, 80);
        triang1.lineTo(31, 80);
        triang1.closePath();
        g2d.draw(triang1);
        
        triang2.moveTo(50, 88);
        triang2.lineTo(31, 58);
        triang2.lineTo(68, 58);
        triang2.closePath();
        g2d.draw(triang2);
    }
    
    public void drawPakistanFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D el = new Ellipse2D.Double();
        Area ar1, ar2;
        GeneralPath star = new GeneralPath();
        
        int xPoints[] = {391, 399, 405, 403, 407, 400, 396, 394, 388, 392};
        int yPoints[] = {62, 67, 63, 72, 77, 77, 84, 78, 75, 71};
        
        drawCountryName(g, "Pakistan", 327, 25, 22);
        
        g.setColor(Color.WHITE);
        g.fillRect(300, 30, 130, 100);
        g.setColor(new Color(0, 77, 0));
        g.fillRect(335, 30, 95, 100);
        
        // Meia Lua
        el.setFrame(353, 53, 57, 57);
        ar1 = new Area(el);
        g.setColor(new Color(0, 77, 0));
        g2d.fill(ar1);
        el.setFrame(363, 50, 50, 50);
        ar2 = new Area(el);
        ar1.subtract(ar2);
        g.setColor(Color.WHITE);
        g2d.fill(ar1);
        
        // Star
        g.translate(-2, -3);
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 1; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath();
        
        g2d.fill(star);
    }
    
    public void drawBahrainFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath spike = new GeneralPath();
        AffineTransform at = g2d.getTransform();
        
        drawCountryName(g, "Bahrain", 675, 25, 20);
        g.setColor(new Color(179, 0, 0));
        g.fillRect(648, 30, 130, 100);
        g.setColor(Color.WHITE);
        g.fillRect(648, 30, 26, 100);
        
        g2d.setStroke(new BasicStroke((float) 1.2f));
        spike.moveTo(674, 30);
        spike.lineTo(686, 35);
        spike.lineTo(674, 40);
        spike.closePath();
        g2d.fill(spike);
        
        g2d.translate(0, 11); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 22); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 33); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 44); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 55); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 66); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 77); g2d.fill(spike);
        g2d.setTransform(at);
        g2d.translate(0, 89); g2d.fill(spike);
        g2d.setTransform(at);
    }
    
    public void drawSouthKoreaFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D el = new Ellipse2D.Double();
        Area ar1, ar2;
        
        drawCountryName(g, "South Korea", 810, 25, 20);
        
        g.setColor(Color.WHITE);
        g.fillRect(798, 30, 130, 100);
        
        // *********************************************************************
        // Red half
        el.setFrame(838, 56, 50, 50);
        ar1 = new Area(el);
        g.setColor(new Color(0, 51, 153));
        g2d.fill(ar1);
        el.setFrame(834, 68, 50, 50);
        ar2 = new Area(el);
        ar1.subtract(ar2);
        g.setColor(new Color(204, 0, 0));
        g2d.fill(ar1);
        
        // Blue half
        el.setFrame(838, 56, 50, 50);
        ar1 = new Area(el);
        g.setColor(new Color(204, 0, 0));
        g2d.fill(ar1);
        el.setFrame(842, 42, 50, 50);
        ar2 = new Area(el);
        ar1.subtract(ar2);
        g.setColor(new Color(0, 51, 153));;
        g2d.fill(ar1);
        // *********************************************************************
        
        g.setColor(new Color(204, 0, 0));
        g.fillOval(838, 65, 25, 25);
        g.setColor(new Color(0, 51, 153));;
        g.fillOval(863, 70, 25, 25);
        
        // Dotzinhos
        g.setColor(new Color(0, 51, 153));;
        g.fillOval(858, 86, 5, 5);
        g.fillOval(856, 88, 2, 2);
        g.fillOval(862, 89, 3, 3);
        g.fillOval(862, 88, 3, 3);
        g.fillOval(861, 84, 2, 2);
        g.fillOval(862, 86, 2, 2);
        g.fillOval(858, 89, 4, 4);
        g.fillOval(865, 90, 2, 2);
        g.fillOval(861, 83, 2, 1);
        g.fillOval(862, 82, 1, 1);
        g.fillOval(860, 85, 2, 2);
        // --------------------------------------------------------------------
        
        // LINES
        g2d.setStroke(new BasicStroke((float) 4.0f));
        g.setColor(Color.BLACK);
        
        g.drawLine(830, 65, 843, 50);
        g.drawLine(825, 61, 838, 46);
        g.drawLine(820, 57, 833, 42);
        
        g.drawLine(881, 110, 885, 105);
        g.drawLine(890, 100, 894, 95);
        g.drawLine(886, 114, 890, 109);
        g.drawLine(895, 104, 899, 99);
        g.drawLine(891, 118, 895, 113);
        g.drawLine(900, 108, 904, 103);
        
        g.drawLine(886, 55, 882, 50);
        g.drawLine(895, 65, 891, 60);
        g.drawLine(900, 61, 887, 46);
        g.drawLine(905, 57, 901, 52);
        g.drawLine(896, 47, 892, 42);
        
        g.drawLine(831, 95, 844, 110);
        g.drawLine(826, 99, 830, 104);
        g.drawLine(835, 109, 839, 114);
        g.drawLine(821, 103, 834, 118);
        // --------------------------------------------------------------------
    }
    
    public void drawVietnamFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        
        drawCountryName(g, "Vietnam", 972, 25, 22);
        g.setColor(new Color(230, 0, 0));
        g.fillRect(948, 30, 130, 100);
        // Yellow Star
        g.setColor(Color.YELLOW);
        star.moveTo(1013, 55);
        star.lineTo(1020, 67);
        star.lineTo(1035, 67);
        star.lineTo(1023, 77);
        star.lineTo(1029, 91);
        star.lineTo(1013, 82);
        star.lineTo(999, 91);
        star.lineTo(1004, 77);
        star.lineTo(993, 67);
        star.lineTo(1007, 67);
        star.closePath();
        g2d.fill(star);
    }
    
    public void drawNigeriaFlag(Graphics g)
    {
        drawCountryName(g, "Nigeria", 38, 165, 22);
        
        g.setColor(new Color(0, 153, 51));
        g.fillRect(5, 170, 44, 100);
        g.setColor(Color.WHITE);
        g.fillRect(49, 170, 42, 100);
        g.setColor(new Color(0, 153, 51));
        g.fillRect(91, 170, 44, 100);
    }
    
    public void drawSudanFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triang = new GeneralPath();
        
        drawCountryName(g, "Sudan", 185, 165, 22);
        
        g.setColor(new Color(204, 0, 0));
        g.fillRect(150, 170, 130, 33);
        g.setColor(Color.WHITE);
        g.fillRect(150, 203, 130, 34);
        g.setColor(Color.BLACK);
        g.fillRect(150, 237, 130, 33);
        
        g.setColor(new Color(0, 102, 0));
        triang.moveTo(150, 170);
        triang.lineTo(200, 219);
        triang.lineTo(150, 269);
        triang.closePath();
        g2d.fill(triang);
    }
    
    public void drawBlankFlag_1(Graphics g)
    {
        g.setColor(Color.WHITE);
        //g.setColor(new Color(233, 121, 56));
        g.fillRect(300, 170, 130, 100);
    }
    
    public void drawNauruFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        
        Point A = new Point(250, 250);
        int nbrOfLoops = 12; // number of loops
        int length = 8; // length of the curve
        
        drawCountryName(g, "Nauru", 680, 165, 22);
        g.setColor(new Color(0, 43, 128));
        g.fillRect(648, 170, 130, 100);
        g.setColor(new Color(255, 204, 0));
        g.fillRect(648, 210, 130, 10);
        
        g.setColor(Color.WHITE);
        g.fillOval(676, 230, 19, 19);
        
        g2d.rotate(Math.toRadians(45), 685, 237);
        g.setColor(Color.WHITE);
        g2d.translate(436, -12);
        g2d.setStroke(new BasicStroke((float) 1.4f));
        for (int i=0; i<400; i++) {
            g.drawLine(A.x + (int) (length * cos(PI * i / 100.0) * (1 - cos(nbrOfLoops * PI * i / 100.0))),
                        A.y + (int) (length * sin(PI * i / 100.0) * (1 - cos(nbrOfLoops * PI * i / 100.0))),
                        A.x + (int) (length * cos(PI * (i+1) / 100.0) * (1 - cos(nbrOfLoops * PI * (i+1) / 100))),
                        A.x + (int) (length * sin(PI * (i+1) / 100.0) * (1 - cos(nbrOfLoops * PI * (i+1) / 100))));
        }
    }
    
    public void drawBlankFlag_2(Graphics g)
    {
        g.setColor(Color.WHITE);
        //g.setColor(new Color(33, 16, 66));
        g.fillRect(798, 170, 130, 100);
    }
    
    public void drawNigerFlag(Graphics g)
    {
        drawCountryName(g, "Niger", 985, 165, 22);
        g.setColor(new Color(230, 92, 0));
        g.fillRect(948, 170, 130, 33);
        g.setColor(Color.WHITE);
        g.fillRect(948, 203, 130, 34);
        g.setColor(new Color(230, 92, 0));
        g.fillOval(1000, 207, 26, 26);
        g.setColor(new Color(0, 179, 0));
        g.fillRect(948, 237, 130, 33);
    }
    
    public void drawAngolaFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        GeneralPath dent1 = new GeneralPath();
        GeneralPath dent2 = new GeneralPath();
        GeneralPath dent3 = new GeneralPath();
        GeneralPath catana = new GeneralPath();
        GeneralPath dent4 = new GeneralPath();
        GeneralPath dent5 = new GeneralPath();
        GeneralPath dent6 = new GeneralPath();
        GeneralPath dent7 = new GeneralPath();
        GeneralPath dent8 = new GeneralPath();
        GeneralPath dent9 = new GeneralPath();
        
        int xPoints[] = {536, 539, 547, 541, 543, 536, 529, 531, 525, 533};
        int yPoints[] = {310, 321, 321, 327, 336, 329, 336, 327, 321, 321};
        
        drawCountryName(g, "Angola", 496, 271, 26);
        
        g.setColor(new Color(204, 0, 0));
        g.fillRect(460, 277, 158, 64);
        g.setColor(Color.BLACK);
        g.fillRect(460, 341, 158, 64);
        
        g.setColor(new Color(255, 214, 51));
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Arc2D.Double(498, 304, 68, 68, 240, 195, Arc2D.OPEN));
        
        g2d.setStroke(new BasicStroke(2.0f));
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 1; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath();
        g2d.fill(star);
        
        /* ---- Dentes da roda dentada ---------------------------------------- */
        dent1.moveTo(516, 371);
        dent1.lineTo(515, 375);
        dent1.lineTo(519, 377);
        dent1.lineTo(521, 373);
        dent1.closePath();
        g2d.fill(dent1);
        
        dent2.moveTo(526, 374);
        dent2.lineTo(526, 378);
        dent2.lineTo(531, 378);
        dent2.lineTo(532, 374);
        dent2.closePath();
        g2d.fill(dent2);
        
        dent3.moveTo(536, 374);
        dent3.lineTo(537, 378);
        dent3.lineTo(542, 377);
        dent3.lineTo(542, 373);
        dent3.closePath();
        g2d.fill(dent3);
        
        dent4.moveTo(556, 365);
        dent4.lineTo(560, 367);
        dent4.lineTo(563, 364);
        dent4.lineTo(558, 361);
        dent4.closePath();
        g2d.fill(dent4);
        
        dent5.moveTo(564, 356);
        dent5.lineTo(567, 357);
        dent5.lineTo(570, 352);
        dent5.lineTo(566, 350);
        dent5.closePath();
        g2d.fill(dent5);
        
        dent6.moveTo(568, 344);
        dent6.lineTo(572, 344);
        dent6.lineTo(572, 339);
        dent6.lineTo(569, 339);
        dent6.closePath();
        g2d.fill(dent6);
        
        dent7.moveTo(568, 330);
        dent7.lineTo(572, 328);
        dent7.lineTo(569, 321);
        dent7.lineTo(565, 323);
        dent7.closePath();
        g2d.fill(dent7);
        
        dent8.moveTo(561, 316);
        dent8.lineTo(564, 314);
        dent8.lineTo(561, 310);
        dent8.lineTo(557, 312);
        dent8.closePath();
        g2d.fill(dent8);
        
        dent9.moveTo(551, 307);
        dent9.lineTo(553, 304);
        dent9.lineTo(548, 301);
        dent9.lineTo(545, 304);
        dent9.closePath();
        g2d.fill(dent9);
        /* -------------------------------------------------------------------- */
        
        catana.moveTo(566, 385);
        catana.lineTo(519, 349);
        catana.curveTo(512, 335, 521, 333, 518, 334);
        catana.curveTo(525, 346, 528, 342, 527, 345);
        catana.lineTo(571, 381);
        catana.closePath();
        g2d.fill(catana);
        
        g2d.fillOval(566, 381, 7, 7);
        
        g.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(0.9f));
        g2d.drawLine(562, 374, 558, 378);
        g2d.drawLine(560, 375, 527, 348);
        
        g2d.fillOval(568, 382, 2, 2);
        g2d.fillOval(563, 378, 2, 2);
    }
    
    public void drawBlankFlag_8(Graphics g)
    {
        //drawCountryName(g, "CntrgNm8", 10, 406, 22);
        g.setColor(Color.WHITE);
        //g.setColor(new Color(77, 77, 80));
        g.fillRect(5, 411, 130, 100);
    }
    
    public void drawBurundiFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        
        drawCountryName(g, "Burundi", 175, 406, 22);
        
        // NOTE: CONSIDERAR WHITE O RECT PRINCIPAL
        g.setColor(new Color(179, 0, 0));
        g.fillRect(150, 411, 130, 100);
        
        g.setColor(Color.WHITE);
        g.fillOval(190, 435, 50, 50);
    }
    
    public void drawMarshIslandsFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triang1 = new GeneralPath();
        GeneralPath triang2 = new GeneralPath();
        
        Point A = new Point(250, 250);
        int nbrOfLoops = 14; // number of loops
        int length = 8; // length of the curve
        
        drawCountryName(g, "Marshall Islands", 304, 406, 17);
        g.setColor(new Color(0, 51, 153));
        g.fillRect(300, 411, 130, 100);
        
        g.setColor(new Color(230, 115, 0));
        triang1.moveTo(430, 413);
        triang1.lineTo(296, 509);
        triang1.lineTo(430, 433);
        triang1.closePath();
        g2d.fill(triang1);
        
        g.setColor(Color.WHITE);
        triang2.moveTo(430, 433);
        triang2.lineTo(296, 509);
        triang2.lineTo(430, 453);
        triang2.closePath();
        g2d.fill(triang2);
        
        g2d.translate(79, 195);
        g2d.setStroke(new BasicStroke((float) 1.4f));
        for (int i=0; i<400; i++) {
            g.drawLine(A.x + (int) (length * cos(PI * i / 100.0) * (1 - cos(nbrOfLoops * PI * i / 100.0))),
                        A.y + (int) (length * sin(PI * i / 100.0) * (1 - cos(nbrOfLoops * PI * i / 100.0))),
                        A.x + (int) (length * cos(PI * (i+1) / 100.0) * (1 - cos(nbrOfLoops * PI * (i+1) / 100))),
                        A.x + (int) (length * sin(PI * (i+1) / 100.0) * (1 - cos(nbrOfLoops * PI * (i+1) / 100))));
        }
    }
    
    public void drawBarbadosFlag(Graphics g)
    {
        drawCountryName(g, "Barbados", 665, 406, 22);
        
        //g.setColor(Color.WHITE);
        g.setColor(new Color(0, 43, 128));
        g.fillRect(648, 411, 130, 100);
    }
    
    public void drawBlankFlag_12(Graphics g)
    {
        //drawCountryName(g, "CntrgNm12", 807, 406, 22);
        g.setColor(Color.WHITE);
        //g.setColor(new Color(31, 83, 31));
        g.fillRect(798, 411, 130, 100);
    }
    
    public void drawCaboVerdeFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        AffineTransform at = g2d.getTransform();
        
        int xPoints[] = {990, 992, 995, 992, 994, 990, 986, 988, 985, 988};
        int yPoints[] = {440, 444, 444, 447, 451, 448, 451, 447, 444, 444};
        
        drawCountryName(g, "Cabo Verde", 955, 406, 22);
        
        g.setColor(new Color(0, 45, 179));
        g.fillRect(948, 411, 130, 100);
        g.setColor(Color.WHITE);
        g.fillRect(948, 461, 130, 25);
        g.setColor(new Color(204, 0, 0));
        g.fillRect(948, 469, 130, 9);
        
        g.setColor(new Color(255, 204, 0));
        g2d.setStroke(new BasicStroke(1.0f));
        star.moveTo(xPoints[0], yPoints[0]);
        for (int count = 1; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath();
        g2d.translate(2, 0); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(19, 5); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(-15, 5); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(28, 19); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(-24, 19); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(28, 35); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(-24, 35); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(19, 49); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(-15, 49); g2d.fill(star);
        g2d.setTransform(at);
        g2d.translate(2, 56); g2d.fill(star);
    }
    
    public void drawMacedoniaFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath ray1  = new GeneralPath();
        GeneralPath ray2  = new GeneralPath();
        GeneralPath ray3  = new GeneralPath();
        GeneralPath ray4  = new GeneralPath();
        GeneralPath ray5  = new GeneralPath();
        GeneralPath ray6  = new GeneralPath();
        GeneralPath ray7  = new GeneralPath();
        GeneralPath ray8  = new GeneralPath();
        
        drawCountryName(g, "Macedonia", 19, 546, 22);
        g.setColor(new Color(230, 46, 0));
        g.fillRect(5, 551, 130, 100);
        
        /**********     Rays     **********/
        g.setColor(new Color(255, 219, 77));
        
        ray1.moveTo(61, 651);
        ray1.lineTo(68, 604);
        ray1.lineTo(75, 651);
        ray1.closePath();
        g2d.fill(ray1);
        
        ray2.moveTo(61, 551);
        ray2.lineTo(68, 600);
        ray2.lineTo(75, 551);
        ray2.closePath();
        g2d.fill(ray2);
        
        ray3.moveTo(5, 651);
        ray3.lineTo(66, 605);
        ray3.lineTo(25, 651);
        ray3.closePath();
        g2d.fill(ray3);
        
        ray4.moveTo(135, 651);
        ray4.lineTo(74, 605);
        ray4.lineTo(115, 651);
        ray4.closePath();
        g2d.fill(ray4);
        
        ray5.moveTo(5, 551);
        ray5.lineTo(66, 600);
        ray5.lineTo(25, 551);
        ray5.closePath();
        g2d.fill(ray5);
        
        ray6.moveTo(135, 551);
        ray6.lineTo(74, 600);
        ray6.lineTo(115, 551);
        ray6.closePath();
        g2d.fill(ray6);
        
        ray7.moveTo(5, 596);
        ray7.lineTo(63, 603);
        ray7.lineTo(5, 610);
        ray7.closePath();
        g2d.fill(ray7);
        
        ray8.moveTo(135, 596);
        ray8.lineTo(77, 603);
        ray8.lineTo(135, 610);
        ray8.closePath();
        g2d.fill(ray8);
        /********** ********** **********/
        
        // Center Circles
        g.setColor(new Color(230, 46, 0));
        g.fillOval(48, 583, 40, 40);
        g.setColor(new Color(255, 219, 77));
        g.fillOval(52, 587, 32, 32);
    }
    
    public void drawSlovakiaFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath path  = new GeneralPath();
        
        drawCountryName(g, "Slovakia", 170, 546, 22);
        
        g.setColor(Color.WHITE);
        g.fillRect(150, 551, 130, 33);
        g.setColor(new Color(0, 77, 153));
        g.fillRect(150, 584, 130, 34);
        g.setColor(new Color(230, 0, 0));
        g.fillRect(150, 618, 130, 33);
    }
    
    public void drawBlankFlag_11(Graphics g)
    {
        //drawCountryName(g, "CntrgNm11", 310, 546, 22);
        g.setColor(Color.WHITE);
        //g.setColor(new Color(54, 100, 230));
        g.fillRect(300, 551, 130, 100);
    }
    
    public void drawBlankFlag_4(Graphics g)
    {
        //drawCountryName(g, "CntrgNm4", 655, 546, 22);
        g.setColor(Color.WHITE);
        //g.setColor(new Color(69, 00, 96));
        g.fillRect(648, 551, 130, 100);
    }
    
    public void drawBrazilFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform transform = g2d.getTransform();
        
        drawCountryName(g, "Brazil", 832, 546, 22);
        
        g.setColor(new Color(41, 163, 41));
        g2d.fill(new Rectangle2D.Double(798, 551, 130, 100));
        
        int x1Points[] = {808, 863,  918, 863};
        int y1Points[] = {601, 561,  601, 641};
        g.setColor(new Color(230, 230, 0));
        g2d.fillPolygon(x1Points, y1Points, 4);
        
        g.setColor(new Color(0, 51, 102));
        g2d.fill(new Ellipse2D.Double(838, 576, 50, 50));
        
        g.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(4.0f));
        g2d.rotate(Math.toRadians(10), 862, 600);
        g2d.draw(new Arc2D.Double(834, 594, 53, 15, 20, 120, Arc2D.OPEN));
    }
    
    public void drawVenezuelaFlag(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        
        drawCountryName(g, "Venezuela", 963, 546, 22);
        
        g.fillRect(948, 551, 130, 100);
        g.setColor(new Color(230, 184, 0));
        g.fillRect(948, 551, 130, 33);
        g.setColor(new Color(0, 51, 128));
        g.fillRect(948, 584, 130, 34);
        g.setColor(new Color(179, 36, 0));
        g.fillRect(948, 618, 130, 33);
        
    }
}
