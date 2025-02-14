
package newjframe;

//NewLineStart
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
///NewLineEnd

//NL
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//NL

public class NewJFrame extends javax.swing.JFrame {
        
        //NL
        public CollisionDetection collisionDetection;
        public int scoreCount;
        public Timer scoreTimer;
        //NL
        
        //NewLineStart
        public Timer timer3;
        public int labelY3;
        public int labelX3;
        public Timer timer4;
        public int labelY4;
        public int labelX4;
        public Timer timer5;
        public int labelY5;
        public int labelX5;
        public Timer timer6;
        public int labelY6;
        public int labelX6;
        //NewLineStart
        
    public NewJFrame() {
        initComponents();
        
        //NL
         collisionDetection = new CollisionDetection(this, jLabel1, jLabel3, jLabel4, jLabel5, jLabel6);
         scoreCount = 0;

        scoreTimer = new Timer(1000, e -> {
            scoreCount++;
            textField1.setText("Score: " + scoreCount);
        });
        scoreTimer.start();
        //NL
        
        //NewLineStart
         labelY3 = jLabel3.getY();
        labelX3 = jLabel3.getX();
        labelY4 = jLabel4.getY();
        labelX4 = jLabel4.getX();
        labelY5 = jLabel5.getY();
        labelX5 = jLabel5.getX();
        labelY6 = jLabel6.getY();
        labelX6 = jLabel6.getX();
        timer3 = new Timer(19, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabel3();
            }
        });
        timer4 = new Timer(18, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabel4();
            }
        });
         timer5 = new Timer(14, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabel5();
            }
        });
          timer6 = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveLabel6();
            }
        });

        timer3.start();
        timer4.start();
        timer5.start();
        timer6.start();
        //NewLineEnd
 
        jLabel1.setFocusable(true);

    }

    //////////////
     public int getScoreCount() {
        return scoreCount;
    }

    public void stopScoreTimer() {
        scoreTimer.stop();
    }
    ////////////
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        
        ///////
        textField1 = new java.awt.TextField();
        //////
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Behula's Odyssey");
        setResizable(false);
        
        jPanel1.setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\Raft.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        //jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\snake.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 50, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\Croco.gif")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\oc.gif")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 90, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\Boss.gif")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 80, -1));
        
        ///////////
        
        textField1.setEditable(false);
        textField1.setEnabled(false);
        textField1.setText("Score: 0");
        jPanel1.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 150, 30));
        
        ///////////
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Programmings\\Java\\Behula_s Odessey\\Game development\\MyBG.gif")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));
        
        
         

        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        int x = jLabel1.getX();
        int y = jLabel1.getY();
        if(evt.getKeyCode()==evt.VK_LEFT)
        {
            //if statement confirms that the vehicles stays inside the frame
            if(x-5>0){
                jLabel1.setLocation(x-5, y);
            }
            
        }
        else if(evt.getKeyCode()==evt.VK_RIGHT)
        {
            if(x+5<700-60){
                jLabel1.setLocation(x+5, y);
            }
            
        }
        else if(evt.getKeyCode()==evt.VK_UP)
        {
            if(y-91>0){
                jLabel1.setLocation(x, y-5);
            }
            
        }
        else if(evt.getKeyCode()==evt.VK_DOWN)
        {
            if(y+5<450-91){
                jLabel1.setLocation(x, y+5);
            }
            
        }
    }                                  

      //NewLineStart
     public void moveLabel3() {
        int windowHeight3 = getContentPane().getHeight();
        int windowWidth3 = getContentPane().getWidth();
        labelY3 = (labelY3 + 1) % windowHeight3;
        labelX3 = (labelX3 + 1) % windowWidth3;
        jLabel3.setLocation(jLabel3.getX(), labelY3);
        
        //NL
        collisionDetection.checkCollision();
        //NL
    }
      public void moveLabel4() {
        int windowHeight4 = getContentPane().getHeight();
        int windowWidth4 = getContentPane().getWidth();
        labelY4 = (labelY4 + 1) % windowHeight4;
        labelX4 = (labelX4 + 1) % windowWidth4;
        jLabel4.setLocation(jLabel4.getX(), labelY4);
        //NL
        collisionDetection.checkCollision();
        //NL
    }
       public void moveLabel5() {
        int windowHeight5 = getContentPane().getHeight();
        int windowWidth5 = getContentPane().getWidth();
        labelY5 = (labelY5 + 1) % windowHeight5;
        labelX5 = (labelX5 + 1) % windowWidth5;
        jLabel5.setLocation(jLabel5.getX(), labelY5);
        //NL
        collisionDetection.checkCollision();
        //NL
    }
      public void moveLabel6() {
        int windowHeight6 = getContentPane().getHeight();
        int windowWidth6 = getContentPane().getWidth();
        labelY6 = (labelY6 + 1) % windowHeight6;
        labelX6 = (labelX6 + 1) % windowWidth6;
        jLabel6.setLocation(jLabel6.getX(), labelY6);
        //NL
        collisionDetection.checkCollision();
        //NL
    }
    ///NewLineEnd
      
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    
    /////////
    public java.awt.TextField textField1;
    ////////
    
                 
}

//NL
class CollisionDetection {
    public NewJFrame newJFrame;
    public JLabel jLabel1;
    public JLabel jLabel3;
    public JLabel jLabel4;
    public JLabel jLabel5;
    public JLabel jLabel6;
    public boolean collisionOccurred;

    public CollisionDetection(NewJFrame newJFrame, JLabel jLabel1, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6) {
        this.newJFrame = newJFrame;
        this.jLabel1 = jLabel1;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.collisionOccurred = false; //to turn off unlimited game over message 
    }

    public void checkCollision() {
        
        if (collisionOccurred) {
            return; // Skip collision check if collision already occurred
        }
        Rectangle rect1 = jLabel1.getBounds();
        Rectangle rect3 = jLabel3.getBounds();
        Rectangle rect4 = jLabel4.getBounds();
        Rectangle rect5 = jLabel5.getBounds();
        Rectangle rect6 = jLabel6.getBounds();

        if (rect1.intersects(rect3) || rect1.intersects(rect4) || rect1.intersects(rect5) || rect1.intersects(rect6)) {
            // Collision detected
            collisionOccurred = true;
            newJFrame.stopScoreTimer();
            JOptionPane.showMessageDialog(null, "Game Over\nYour Score: " + newJFrame.getScoreCount());
            System.exit(0); //to exit after game over
        }
    }
}

//NL