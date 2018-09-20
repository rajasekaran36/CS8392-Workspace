import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class BalloonApplet extends Applet
   implements ActionListener {

   private Button grow, shrink, left, right;
   private Balloon theBalloon;

   public void init() {
      grow = new Button("Grow");
      add(grow);
      grow.addActionListener(this);

      shrink = new Button("Shrink");
      add(shrink);
      shrink.addActionListener(this);

      left = new Button("Left");
      add(left);
      left.addActionListener(this);

      right = new Button("Right");
      add(right);
      right.addActionListener(this);

      theBalloon = new Balloon();
   }

   public void actionPerformed(ActionEvent event) {
      if (event.getSource() == grow)
         theBalloon.grow();
      if (event.getSource() == shrink)
         theBalloon.shrink();
      if (event.getSource() == left)
         theBalloon.moveLeft();
      if (event.getSource() == right)
         theBalloon.moveRight();

      repaint();
   }

   public void paint(Graphics g) {
      theBalloon.display(g);
   }
}