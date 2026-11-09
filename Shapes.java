public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
       Turtle vayuna = new Turtle();
        
       for (int i = 0; i < 6; i++) {
         vayuna.forward(50);
         vayuna.right(60);
       }
       
       vayuna.up();
       vayuna.setPosition(100, 100);
        

        // Task 2: Draw a regular shape many times
       vayuna.down();
       for (int times = 1; times <= 12; times++) {
         for (int i = 1; i <= 8; i++) {
             vayuna.forward(75);
             vayuna.left(135);
         }
         vayuna.left(30);
       }

        // Task 3: How many times does Turtle turn!
        vayuna.up();
        vayuna.setPosition(-100, 100);
        vayuna.down();
       int numTurns = 0;
       for (int times = 1; times <= 12; times++) {
       
         for (int i = 1; i <= 8; i++) {
             vayuna.forward(75);
             vayuna.left(135);
             numTurns++;
         }
         vayuna.left(30);
         numTurns++;
       }
       
       System.out.print("Vayuna has turned " + numTurns + "times!");



        // Extension 1: Random
        vayuna.up();
        vayuna.setPosition(-100, -200);
        vayuna.down();
         for (int times = 1; times <= 10; times++) {
            int distance = (int)((Math.random() * 100) + 1);
            for (int i = 1; i <= 5; i++) {
               vayuna.forward(distance);
               vayuna.left(72);
            }
         }
             
        


        // Extension 2: Triply nested loop
        vayuna.up();
        vayuna.setPosition(600, -500);
        vayuna.down();
         for (int times = 1; times <= 6; times++) {
            for (int i = 1; i <= 6; i++) {
               vayuna.forward(100);
               vayuna.left(60);
               for (int a = 1; a <= 5; a++) {
                  vayuna.forward(50);
                  vayuna.left(72);
               }
            }
            
            vayuna.right(60);
         }

    }
}
