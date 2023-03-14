import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

public class Play extends javax.swing.JFrame {

    DotComBust game;

    public Play(DotComBust game) {
        initComponents();
        this.game = game;
    }

    public void finalizar(){
        this.setVisible(false);
        new Final(game).setVisible(true);
    }
    
    @SuppressWarnings("unchecked")

    private void initComponents() {

        a1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        d1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        e1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        f1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        g1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        a2 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        d2 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        g2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        d3 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        d6 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        g6 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        d7 = new javax.swing.JButton();
        e7 = new javax.swing.JButton();
        f7 = new javax.swing.JButton();
        g7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        jLabel1.setText("A");

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel2.setText("B");

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel3.setText("C");

        d1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d1ActionPerformed(evt);
            }
        });

        jLabel4.setText("D");

        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        jLabel5.setText("E");

        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        jLabel6.setText("F");

        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        jLabel7.setText("G");

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });

        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });

        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });

        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });

        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });

        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });

        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });

        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });

        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });

        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });

        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });

        d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ActionPerformed(evt);
            }
        });

        e7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e7ActionPerformed(evt);
            }
        });

        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });

        g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ActionPerformed(evt);
            }
        });

        jLabel8.setText("2");

        jLabel9.setText("1");

        jLabel10.setText("7");

        jLabel11.setText("4");

        jLabel12.setText("6");

        jLabel13.setText("5");

        jLabel14.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel7))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(8, 8, 8)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(f6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(45, 45, 45))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        var v = game.verify("g6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g6ActionPerformed

    private void g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ActionPerformed
        var v = game.verify("g7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g7ActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        var v = game.verify("a1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a1.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        var v = game.verify("b1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b1.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        var v = game.verify("c1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c1.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void d1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d1ActionPerformed
        var v = game.verify("d1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d1.setBackground(Color.blue);
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_d1ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        var v = game.verify("e1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e1.setBackground(Color.blue);
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        var v = game.verify("f1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f1.setBackground(Color.blue);
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_f1ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        var v = game.verify("g1");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g1.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g1.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g1.setBackground(Color.blue);
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_g1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        var v = game.verify("a2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a2.setBackground(Color.blue);
                break;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        var v = game.verify("b2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        var v = game.verify("c2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c2ActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        var v = game.verify("d2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d2ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        var v = game.verify("e2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        var v = game.verify("a3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a3ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        var v = game.verify("b3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        var v = game.verify("c3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c3ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        var v = game.verify("f2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f2ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        var v = game.verify("g2");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g2.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g2.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g2.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g2ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        var v = game.verify("d3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d3ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        var v = game.verify("e3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e3ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        var v = game.verify("f3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f3ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        var v = game.verify("g3");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g3.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g3.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g3.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        var v = game.verify("a4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a4ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        var v = game.verify("b4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        var v = game.verify("c4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c4ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        var v = game.verify("d4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d4ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        var v = game.verify("e4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e4ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        var v = game.verify("f4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f4ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        var v = game.verify("g4");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g4.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g4.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g4.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g4ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        var v = game.verify("a5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a5ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        var v = game.verify("b5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        var v = game.verify("c5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c5ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        var v = game.verify("d5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d5ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
        var v = game.verify("e5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e5ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        var v = game.verify("f5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f5ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        var v = game.verify("g5");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                g5.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                g5.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                g5.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_g5ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        var v = game.verify("a6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a6ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        var v = game.verify("b6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        var v = game.verify("c6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c6ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        var v = game.verify("d6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d6ActionPerformed

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        var v = game.verify("e6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e6ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        var v = game.verify("f6");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f6.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f6.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f6.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        var v = game.verify("a7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                a7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                a7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                a7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_a7ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        var v = game.verify("b7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                b7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                b7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                b7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        var v = game.verify("c7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                c7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                c7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                c7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_c7ActionPerformed

    private void d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ActionPerformed
        var v = game.verify("d7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                d7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                d7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                d7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_d7ActionPerformed

    private void e7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e7ActionPerformed
        var v = game.verify("e7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                e7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                e7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                e7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_e7ActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        var v = game.verify("f7");
        switch (v) {
            case "miss":
                showMessageDialog(null, "Que pena! Você não acertou nada!");
                f7.setBackground(Color.red);
                break;
            case "finish":
                showMessageDialog(null, "Boa! Acabou!");
                finalizar();

                f7.setBackground(Color.blue);
                break;
            default:
                showMessageDialog(null, "Boa! Você " + v + "!");
                f7.setBackground(Color.blue);
                break;
        }
    }//GEN-LAST:event_f7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play(new DotComBust()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton d1;
    private javax.swing.JButton d2;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton d6;
    private javax.swing.JButton d7;
    private javax.swing.JButton e1;
    private javax.swing.JButton e2;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton e6;
    private javax.swing.JButton e7;
    private javax.swing.JButton f1;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton f7;
    private javax.swing.JButton g1;
    private javax.swing.JButton g2;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton g6;
    private javax.swing.JButton g7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
