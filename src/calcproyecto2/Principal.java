package calcproyecto2;

public class Principal extends javax.swing.JFrame {

    String operador = "";
    String operador2 = "";
    String contenido;
    boolean CambioEstado = false;
    float valor1 = 0, valor2 = 0;
    float total = 0, acumu = 0;
    private boolean punto = true;

    public Principal() {
        initComponents();
        this.setTitle("Calculadora");
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Presultado = new javax.swing.JPanel();
        Lresultado1 = new javax.swing.JLabel();
        Lresultado2 = new javax.swing.JLabel();
        Pbotones2 = new javax.swing.JPanel();
        Bdivision = new javax.swing.JButton();
        Bmultiplicacion = new javax.swing.JButton();
        Bresta = new javax.swing.JButton();
        Bsuma = new javax.swing.JButton();
        Pbotones1 = new javax.swing.JPanel();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        BCE = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bpunto = new javax.swing.JButton();
        Pbotones3 = new javax.swing.JPanel();
        Belevacion = new javax.swing.JButton();
        Braiz = new javax.swing.JButton();
        Bporcentaje = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        EFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Presultado.setBackground(new java.awt.Color(249, 245, 229));

        Lresultado1.setBackground(new java.awt.Color(252, 247, 223));
        Lresultado1.setFont(new java.awt.Font("Mistral", 1, 48)); // NOI18N
        Lresultado1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lresultado1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Lresultado2.setBackground(new java.awt.Color(243, 228, 157));
        Lresultado2.setFont(new java.awt.Font("Mistral", 0, 14)); // NOI18N
        Lresultado2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lresultado2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout PresultadoLayout = new javax.swing.GroupLayout(Presultado);
        Presultado.setLayout(PresultadoLayout);
        PresultadoLayout.setHorizontalGroup(
            PresultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PresultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lresultado1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(Lresultado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PresultadoLayout.setVerticalGroup(
            PresultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PresultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lresultado2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(Presultado);
        Presultado.setBounds(10, 10, 440, 100);

        Pbotones2.setBackground(new java.awt.Color(0, 102, 102));
        Pbotones2.setLayout(new java.awt.GridLayout(4, 1));

        Bdivision.setBackground(new java.awt.Color(156, 142, 142));
        Bdivision.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bdivision.setText("÷");
        Bdivision.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bdivision.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BdivisionMouseDragged(evt);
            }
        });
        Bdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivisionActionPerformed(evt);
            }
        });
        Pbotones2.add(Bdivision);

        Bmultiplicacion.setBackground(new java.awt.Color(156, 142, 142));
        Bmultiplicacion.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bmultiplicacion.setText("x");
        Bmultiplicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmultiplicacionActionPerformed(evt);
            }
        });
        Pbotones2.add(Bmultiplicacion);

        Bresta.setBackground(new java.awt.Color(156, 142, 142));
        Bresta.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bresta.setText("-");
        Bresta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrestaActionPerformed(evt);
            }
        });
        Pbotones2.add(Bresta);

        Bsuma.setBackground(new java.awt.Color(156, 142, 142));
        Bsuma.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bsuma.setText("+");
        Bsuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsumaActionPerformed(evt);
            }
        });
        Pbotones2.add(Bsuma);

        getContentPane().add(Pbotones2);
        Pbotones2.setBounds(350, 120, 100, 220);

        Pbotones1.setBackground(new java.awt.Color(0, 102, 102));
        Pbotones1.setLayout(new java.awt.GridLayout(4, 3));

        B7.setBackground(new java.awt.Color(204, 204, 204));
        B7.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B7.setText("7");
        B7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        Pbotones1.add(B7);

        B8.setBackground(new java.awt.Color(204, 204, 204));
        B8.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B8.setText("8");
        B8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        Pbotones1.add(B8);

        B9.setBackground(new java.awt.Color(204, 204, 204));
        B9.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B9.setText("9");
        B9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        Pbotones1.add(B9);

        B4.setBackground(new java.awt.Color(204, 204, 204));
        B4.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B4.setText("4");
        B4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        Pbotones1.add(B4);

        B5.setBackground(new java.awt.Color(204, 204, 204));
        B5.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B5.setText("5");
        B5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        Pbotones1.add(B5);

        B6.setBackground(new java.awt.Color(204, 204, 204));
        B6.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B6.setText("6");
        B6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        Pbotones1.add(B6);

        B1.setBackground(new java.awt.Color(204, 204, 204));
        B1.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B1.setText("1");
        B1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B1MouseEntered(evt);
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        Pbotones1.add(B1);

        B2.setBackground(new java.awt.Color(204, 204, 204));
        B2.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B2.setText("2");
        B2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        Pbotones1.add(B2);

        B3.setBackground(new java.awt.Color(204, 204, 204));
        B3.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B3.setText("3");
        B3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        Pbotones1.add(B3);

        BCE.setBackground(new java.awt.Color(255, 115, 37));
        BCE.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        BCE.setText("CE");
        BCE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCEActionPerformed(evt);
            }
        });
        Pbotones1.add(BCE);

        B0.setBackground(new java.awt.Color(204, 204, 204));
        B0.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        B0.setText("0");
        B0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        Pbotones1.add(B0);

        Bpunto.setBackground(new java.awt.Color(156, 142, 142));
        Bpunto.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bpunto.setText(".");
        Bpunto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpuntoActionPerformed(evt);
            }
        });
        Pbotones1.add(Bpunto);

        getContentPane().add(Pbotones1);
        Pbotones1.setBounds(10, 190, 330, 240);

        Pbotones3.setBackground(new java.awt.Color(0, 102, 102));
        Pbotones3.setLayout(new java.awt.GridLayout());

        Belevacion.setBackground(new java.awt.Color(156, 142, 142));
        Belevacion.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Belevacion.setText("X²");
        Belevacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Belevacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BelevacionActionPerformed(evt);
            }
        });
        Pbotones3.add(Belevacion);

        Braiz.setBackground(new java.awt.Color(156, 142, 142));
        Braiz.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Braiz.setText("√");
        Braiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Braiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BraizActionPerformed(evt);
            }
        });
        Pbotones3.add(Braiz);

        Bporcentaje.setBackground(new java.awt.Color(156, 142, 142));
        Bporcentaje.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bporcentaje.setText("%");
        Bporcentaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bporcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BporcentajeActionPerformed(evt);
            }
        });
        Pbotones3.add(Bporcentaje);

        getContentPane().add(Pbotones3);
        Pbotones3.setBounds(10, 120, 330, 60);

        Bigual.setBackground(new java.awt.Color(255, 255, 51));
        Bigual.setFont(new java.awt.Font("Mistral", 1, 36)); // NOI18N
        Bigual.setText("=");
        Bigual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        getContentPane().add(Bigual);
        Bigual.setBounds(350, 340, 100, 90);

        EFondo.setBackground(new java.awt.Color(255, 255, 255));
        EFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calcproyecto2/fondo matematico.jpg"))); // NOI18N
        getContentPane().add(EFondo);
        EFondo.setBounds(0, 0, 460, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "1");
        AlmacenarValores();
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "2");
        AlmacenarValores();
    }//GEN-LAST:event_B2ActionPerformed

    private void BCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCEActionPerformed
        Lresultado1.setText("");
        Lresultado2.setText("");
        valor1 = 0;
        valor2 = 0;
        total = 0;
        CambioEstado = false;
    }//GEN-LAST:event_BCEActionPerformed

    private void BsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsumaActionPerformed
        CambioEstado = true;
        operador = "+";
        Lresultado1.setText("");
        Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_BsumaActionPerformed

    private void BrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrestaActionPerformed
        CambioEstado = true;
        operador = "-";
        Lresultado1.setText("");
        Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_BrestaActionPerformed

    private void BigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigualActionPerformed
        valor2 = Float.parseFloat(Lresultado1.getText());
        switch (operador) {
            case "+":
                //INSTANCIA
                Suma sum = new Suma(valor1, valor2);
                total = sum.Sumar();
                break;
            case "-":
                Resta rest = new Resta(valor1, valor2);
                total = rest.Restar();
                break;
            case "x":
                Multiplicacion mult = new Multiplicacion(valor1, valor2);
                total = mult.Multiplicar();
                break;
            case "÷":
                Division divi = new Division(valor1, valor2);
                total = divi.Dividir();
                break;
            case "√":
                valor1 = (float) (Math.sqrt(valor1));
                total = total + valor1;
                break;
            case "X²":
                Elevacion elev = new Elevacion(valor1, 2);
                total = elev.Elevar();
                break;
            case "%":
                total = valor1 / 100;
                break;
        } 
            Lresultado2.setText(String.valueOf(valor1) + " " + operador + " " + String.valueOf(valor2) + " = ");
            Lresultado1.setText(String.valueOf(total));
                valor1 = total;
                valor2 = 0;

        switch (operador) {
            case "√":
                Lresultado2.setText(String.valueOf(valor1));
                Lresultado1.setText(String.valueOf(total));
                break;
            case "X²":
                Lresultado2.setText(String.valueOf(valor1));
                //Lresultado1.setText(String.valueOf(total));
                break;
            case "%":
                Lresultado2.setText(String.valueOf(valor1));
                Lresultado1.setText(String.valueOf(total));

        }
    }//GEN-LAST:event_BigualActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "3");
        AlmacenarValores();
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "4");
        AlmacenarValores();
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "5");
        AlmacenarValores();
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "6");
        AlmacenarValores();
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "7");
        AlmacenarValores();
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "8");
        AlmacenarValores();
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "9");
        AlmacenarValores();
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        Lresultado1.setText(Lresultado1.getText() + "0");
        AlmacenarValores();
    }//GEN-LAST:event_B0ActionPerformed

    private void BmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmultiplicacionActionPerformed
        CambioEstado = true;
        operador = "x";
        Lresultado1.setText("");
        Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_BmultiplicacionActionPerformed

    private void BdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivisionActionPerformed
        CambioEstado = true;
        operador = "÷";
        Lresultado1.setText("");
        Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_BdivisionActionPerformed

    private void BpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpuntoActionPerformed
        contenido = Lresultado1.getText();
        if (contenido.length() <= 0) {
            Lresultado1.setText("0.");
        } else if (Lresultado1.getText().contains(".")) {
        } else {
            Lresultado1.setText(Lresultado1.getText() + ".");
            punto = false;
        }
    }//GEN-LAST:event_BpuntoActionPerformed

    private void B1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseEntered

    }//GEN-LAST:event_B1MouseEntered

    private void BraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BraizActionPerformed
        //CambioEstado = true;
        operador = "√";
        //Lresultado1.setText("");
        Lresultado2.setText(operador);
    }//GEN-LAST:event_BraizActionPerformed

    private void BelevacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BelevacionActionPerformed
        CambioEstado = true;
        operador = "X²";
        //Lresultado1.setText("");
        Lresultado2.setText(valor1 +" "+ operador);
    }//GEN-LAST:event_BelevacionActionPerformed

    private void BporcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BporcentajeActionPerformed
        CambioEstado = true;
        operador = "%";
        //Lresultado1.setText("");
        Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_BporcentajeActionPerformed

    private void BdivisionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdivisionMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BdivisionMouseDragged

    private void AlmacenarValores() {
        if (CambioEstado == false) {
            valor1 = Float.parseFloat(Lresultado1.getText());
        } else {
            valor2 = Float.parseFloat(Lresultado1.getText());
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BCE;
    private javax.swing.JButton Bdivision;
    private javax.swing.JButton Belevacion;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bmultiplicacion;
    private javax.swing.JButton Bporcentaje;
    private javax.swing.JButton Bpunto;
    private javax.swing.JButton Braiz;
    private javax.swing.JButton Bresta;
    private javax.swing.JButton Bsuma;
    private javax.swing.JLabel EFondo;
    private javax.swing.JLabel Lresultado1;
    private javax.swing.JLabel Lresultado2;
    private javax.swing.JPanel Pbotones1;
    private javax.swing.JPanel Pbotones2;
    private javax.swing.JPanel Pbotones3;
    private javax.swing.JPanel Presultado;
    // End of variables declaration//GEN-END:variables
}
