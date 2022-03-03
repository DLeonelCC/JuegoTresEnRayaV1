package Ventanas;

import java.awt.Color;

/**
 *
 * @author ACER
 */
public class main extends javax.swing.JFrame {

    public boolean jugador = false; //false = jugador x , true = jugador o
    public char matriz[][] = new char[3][3];
    public boolean FinJuego = false;
    
    public main() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(604, 470); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_00 = new javax.swing.JButton();
        btn_01 = new javax.swing.JButton();
        btn_02 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_21 = new javax.swing.JButton();
        btn_22 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlabel_jugador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_jugar_nuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlabel_ganador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_00.setBackground(new java.awt.Color(0, 0, 51));
        btn_00.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_00.setDefaultCapable(false);
        btn_00.setFocusable(false);
        btn_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_00ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        btn_01.setBackground(new java.awt.Color(0, 0, 51));
        btn_01.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_01.setFocusable(false);
        btn_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_01ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 100));

        btn_02.setBackground(new java.awt.Color(0, 0, 51));
        btn_02.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_02.setFocusable(false);
        btn_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 100));

        btn_10.setBackground(new java.awt.Color(0, 0, 51));
        btn_10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_10.setFocusable(false);
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 100));

        btn_11.setBackground(new java.awt.Color(0, 0, 51));
        btn_11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_11.setFocusable(false);
        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 100));

        btn_12.setBackground(new java.awt.Color(0, 0, 51));
        btn_12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_12.setFocusable(false);
        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, 100));

        btn_20.setBackground(new java.awt.Color(0, 0, 51));
        btn_20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_20.setFocusable(false);
        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 100));

        btn_21.setBackground(new java.awt.Color(0, 0, 51));
        btn_21.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_21.setFocusable(false);
        btn_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_21ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, 100));

        btn_22.setBackground(new java.awt.Color(0, 0, 51));
        btn_22.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_22.setFocusable(false);
        btn_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_22ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 100, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 320));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));

        jlabel_jugador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlabel_jugador.setForeground(new java.awt.Color(255, 0, 0));
        jlabel_jugador.setText("X");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Jugador:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jlabel_jugador)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel_jugador)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 210, 110));

        btn_jugar_nuevo.setBackground(new java.awt.Color(0, 255, 255));
        btn_jugar_nuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_jugar_nuevo.setText("Jugar de nuevo");
        btn_jugar_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugar_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_jugar_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 190, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Tres en raya");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 255, 255), null));

        jlabel_ganador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlabel_ganador.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Ganador:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jlabel_ganador)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel_ganador)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 210, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_00ActionPerformed
        if(FinJuego != true && matriz[0][0] != 'x' && matriz[0][0] != 'o'){
            if(jugador == false){
                btn_00.setForeground(Color.red);
                btn_00.setText("x");

                matriz[0][0] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_00.setForeground(Color.blue);
                btn_00.setText("o");

                matriz[0][0] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_00ActionPerformed

    private void btn_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_01ActionPerformed
        if(FinJuego != true && matriz[0][1] != 'x' && matriz[0][1] != 'o'){
            if(jugador == false){
                btn_01.setForeground(Color.red);
                btn_01.setText("x");

                matriz[0][1] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_01.setForeground(Color.blue);
                btn_01.setText("o");

                matriz[0][1] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
        
    }//GEN-LAST:event_btn_01ActionPerformed

    private void btn_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_02ActionPerformed
        if(FinJuego != true && matriz[0][2] != 'x' && matriz[0][2] != 'o'){
            if(jugador == false){
                btn_02.setForeground(Color.red);
                btn_02.setText("x");

                matriz[0][2] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_02.setForeground(Color.blue);
                btn_02.setText("o");

                matriz[0][2] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_02ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        if(FinJuego != true && matriz[1][0] != 'x' && matriz[1][0] != 'o'){
            if(jugador == false){
                btn_10.setForeground(Color.red);
                btn_10.setText("x");

                matriz[1][0] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_10.setForeground(Color.blue);
                btn_10.setText("o");

                matriz[1][0] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        if(FinJuego != true && matriz[1][1] != 'x' && matriz[1][1] != 'o'){
            if(jugador == false){
                btn_11.setForeground(Color.red);
                btn_11.setText("x");

                matriz[1][1] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_11.setForeground(Color.blue);
                btn_11.setText("o");

                matriz[1][1] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        if(FinJuego != true && matriz[1][2] != 'x' && matriz[1][2] != 'o'){
            if(jugador == false){
                btn_12.setForeground(Color.red);
                btn_12.setText("x");

                matriz[1][2] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_12.setForeground(Color.blue);
                btn_12.setText("o");

                matriz[1][2] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        if(FinJuego != true && matriz[2][0] != 'x' && matriz[2][0] != 'o'){
            if(jugador == false){
                btn_20.setForeground(Color.red);
                btn_20.setText("x");

                matriz[2][0] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_20.setForeground(Color.blue);
                btn_20.setText("o");

                matriz[2][0] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_21ActionPerformed
        if(FinJuego != true && matriz[2][1] != 'x' && matriz[2][1] != 'o'){
            if(jugador == false){
                btn_21.setForeground(Color.red);
                btn_21.setText("x");

                matriz[2][1] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_21.setForeground(Color.blue);
                btn_21.setText("o");

                matriz[2][1] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_21ActionPerformed

    private void btn_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_22ActionPerformed
        if(FinJuego != true && matriz[2][2] != 'x' && matriz[2][2] != 'o'){
            if(jugador == false){
                btn_22.setForeground(Color.red);
                btn_22.setText("x");

                matriz[2][2] = 'x';
                EvaluarX();

                jlabel_jugador.setText("o");
                jlabel_jugador.setForeground(Color.blue);
            }else if(jugador == true){
                btn_22.setForeground(Color.blue);
                btn_22.setText("o");

                matriz[2][2] = 'o';
                EvaluarO();

                jlabel_jugador.setText("x");
                jlabel_jugador.setForeground(Color.red);
            }
            jugador = !jugador;
        }
    }//GEN-LAST:event_btn_22ActionPerformed

    private void btn_jugar_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugar_nuevoActionPerformed
        
        jugador = false; //osea jugador x
        
        jlabel_jugador.setText("x");
        jlabel_jugador.setForeground(Color.red);
        
        jlabel_ganador.setText("");
        
        btn_00.setText("");
        btn_01.setText("");
        btn_02.setText("");
        btn_10.setText("");
        btn_11.setText("");
        btn_12.setText("");
        btn_20.setText("");
        btn_21.setText("");
        btn_22.setText("");
        
        btn_00.setBackground(new java.awt.Color(0, 0, 51));
        btn_01.setBackground(new java.awt.Color(0, 0, 51));
        btn_02.setBackground(new java.awt.Color(0, 0, 51));
        btn_10.setBackground(new java.awt.Color(0, 0, 51));
        btn_11.setBackground(new java.awt.Color(0, 0, 51));
        btn_12.setBackground(new java.awt.Color(0, 0, 51));
        btn_20.setBackground(new java.awt.Color(0, 0, 51));
        btn_21.setBackground(new java.awt.Color(0, 0, 51));
        btn_22.setBackground(new java.awt.Color(0, 0, 51));
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = ' ';
            }
        }
        
        FinJuego = false;
    }//GEN-LAST:event_btn_jugar_nuevoActionPerformed
    
    public void EvaluarX(){
        try{
            if(FinJuego == false){
                if(matriz[0][0] == 'x' && matriz[0][1] == 'x' && matriz[0][2] == 'x'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_01.setBackground(Color.white);
                    btn_02.setBackground(Color.white);
                }
                else if(matriz[1][0] == 'x' && matriz[1][1] == 'x' && matriz[1][2] == 'x'){
                    FinJuego = true;
                    btn_10.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_12.setBackground(Color.white);
                }
                else if(matriz[2][0] == 'x' && matriz[2][1] == 'x' && matriz[2][2] == 'x'){
                    FinJuego = true;
                    btn_20.setBackground(Color.white);
                    btn_21.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
            
                else if(matriz[0][0] == 'x' && matriz[1][0] == 'x' && matriz[2][0] == 'x'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_10.setBackground(Color.white);
                    btn_20.setBackground(Color.white);
                }
                else if(matriz[0][1] == 'x' && matriz[1][1] == 'x' && matriz[2][1] == 'x'){
                    FinJuego = true;
                    btn_01.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_21.setBackground(Color.white);
                }
                else if(matriz[0][2] == 'x' && matriz[1][2] == 'x' && matriz[2][2] == 'x'){
                    FinJuego = true;
                    btn_02.setBackground(Color.white);
                    btn_12.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
            
                else if(matriz[0][0] == 'x' && matriz[1][1] == 'x' && matriz[2][2] == 'x'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
                else if(matriz[0][2] == 'x' && matriz[1][1] == 'x' && matriz[2][0] == 'x'){
                    FinJuego = true;
                    btn_02.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_20.setBackground(Color.white);
                }
            }
        }catch(Exception e){
            
        }
        
        if(FinJuego == true){
            jlabel_ganador.setForeground(Color.red);
            jlabel_ganador.setText("Jugador x");
        }
    }
    
    public void EvaluarO(){
        try{
            if(FinJuego == false){
                if(matriz[0][0] == 'o' && matriz[0][1] == 'o' && matriz[0][2] == 'o'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_01.setBackground(Color.white);
                    btn_02.setBackground(Color.white);
                }
                else if(matriz[1][0] == 'o' && matriz[1][1] == 'o' && matriz[1][2] == 'o'){
                    FinJuego = true;
                    btn_10.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_12.setBackground(Color.white);
                }
                else if(matriz[2][0] == 'o' && matriz[2][1] == 'o' && matriz[2][2] == 'o'){
                    FinJuego = true;
                    btn_20.setBackground(Color.white);
                    btn_21.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
            
                else if(matriz[0][0] == 'o' && matriz[1][0] == 'o' && matriz[2][0] == 'o'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_10.setBackground(Color.white);
                    btn_20.setBackground(Color.white);
                }
                else if(matriz[0][1] == 'o' && matriz[1][1] == 'o' && matriz[2][1] == 'o'){
                    FinJuego = true;
                    btn_01.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_21.setBackground(Color.white);
                }
                else if(matriz[0][2] == 'o' && matriz[1][2] == 'o' && matriz[2][2] == 'o'){
                    FinJuego = true;
                    btn_02.setBackground(Color.white);
                    btn_12.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
            
                else if(matriz[0][0] == 'o' && matriz[1][1] == 'o' && matriz[2][2] == 'o'){
                    FinJuego = true;
                    btn_00.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_22.setBackground(Color.white);
                }
                else if(matriz[0][2] == 'o' && matriz[1][1] == 'o' && matriz[2][0] == 'o'){
                    FinJuego = true;
                    btn_02.setBackground(Color.white);
                    btn_11.setBackground(Color.white);
                    btn_20.setBackground(Color.white);
                }
            }
        }catch(Exception e){
            
        }
        
        if(FinJuego == true){
            jlabel_ganador.setForeground(Color.blue);
            jlabel_ganador.setText("Jugador o");
        }
    }
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_00;
    private javax.swing.JButton btn_01;
    private javax.swing.JButton btn_02;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_21;
    private javax.swing.JButton btn_22;
    private javax.swing.JButton btn_jugar_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlabel_ganador;
    private javax.swing.JLabel jlabel_jugador;
    // End of variables declaration//GEN-END:variables
}
