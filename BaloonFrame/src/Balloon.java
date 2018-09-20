import java.awt.*;

public class Balloon {

   private int diameter;
   private int x, y;

   public Balloon() {
      diameter = 10;
      x = 20;
      y = 50;
   }

   public void display(Graphics g) {
      g.drawOval(x, y, diameter, diameter);
   }

   public void moveLeft() {
      x -= 10;
   }

   public void moveRight() {
      x += 10;
   }

   public void grow() {
      diameter += 5;
   }

   public void shrink() {
      diameter -= 5;
   }
}