public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visorCalculadora = new javax.swing.JTextPane();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btno5 = new javax.swing.JButton();
        btno6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnIgualdade = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle ( "CALCULADORA" );
 
        jScrollPane1.setViewportView(visorCalculador);
 
        btnCE.setText("CE");
        btnCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCEMouseClicked(evt);
            }
        });
 
        btn7.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
 
        btn8.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
 
        btn9.setFont(new java.awt.Font("Ubuntu", 0, 24));  
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
 
        btn5.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
 
        btn6.setFont(new java.awt.Font("Ubuntu", 0, 24));  
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
 
        btn4.setFont(new java.awt.Font("Ubuntu", 0, 24));
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
 
        btn1.setFont(new java.awt.Font("Ubuntu", 0, 24));  
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
 
        btn2.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
 
        btn3.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
 
        btn0.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
 
        btnMult.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btnMult.setText("*");
        btnMult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultMouseClicked(evt);
            }
        });
 
        btnDivisao.setFont(new java.awt.Font("Ubuntu", 0, 24));
        btnDivisao.setText("/");
        btnDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivisaoMouseClicked(evt);
            }
        });
 
        btnSubtracao.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btnSubtracao.setText("-");
        btnSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubtracaoMouseClicked(evt);
            }
        });
 
        btnSoma.setFont(new java.awt.Font("Ubuntu", 0, 24)); 
        btnSoma.setText("+");
        btnSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSomaMouseClicked(evt);
            }
        });
 
        btnIgualdade.setText("=");
        btnIgualdade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualdadeMouseClicked(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup
                (javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent
                        (jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, 
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent
                            (btnCE, javax.swing.GroupLayout.Alignment.LEADING, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, 
                            jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap
                                (javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                             jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn7, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn8, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                 javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSoma, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, 
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnIgualdade, javax.swing.GroupLayout.DEFAULT_SIZE, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn6, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSubtracao, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE))
                                    .addComponent(btnMult, 
                                    javax.swing.GroupLayout.Alignment.TRAILING, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                                    jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn9, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDivisao, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                                        Short.MAX_VALUE)))
                                .addGap(2, 2, 2)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, 
                    Short.MAX_VALUE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
 
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgualdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, 
                    javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
 
        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]
         {btn7, btn8, btn9});
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
 
        pack();
    }
 
    private void btnCEMouseClicked(java.awt.event.MouseEvent evt) 
    {                                     
 
        visorCalculador.setText("");
       
 
    }                                    
 
    private void btnMultMouseClicked(java.awt.event.MouseEvent evt) 
    {                                        
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "*");
         
    }                                       
 
    private void btn7MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "7");
    }                                   
 
    private void btn8MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "8");        
    }                                   
 
    private void btn9MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "9");       
    }                                   
 
    private void btnDivisaoMouseClicked(java.awt.event.MouseEvent evt) 
    {                                      
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "/"); 
           
    }                                     
 
    private void btn4MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "4");        
    }                                   
 
    private void btn5MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "5");       
    }                                   
 
    private void btn6MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "6");       
    }                                   
 
    private void btnSubtracaoMouseClicked(java.awt.event.MouseEvent evt) 
    {                                        
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "-");        
    }                                       
 
    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "1");        
    }
 
    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "2");        
    }
 
    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "3");        
    }
 
    private void btnSomaMouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "+");        
    }
 
    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        visorCalculador.setText(valor + "0");        
    }
 
    private void btnIgualdadeMouseClicked(java.awt.event.MouseEvent evt) {
        String valor = visorCalculador.getText();
        System.out.println(">>>"+valor);
        Calculos calculos = new Calculos();
        String resultado = calculos.calculadora(valor);
        visorCalculador.setText(resultado);
      
    }
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
            javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCalculador.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(
            java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgualdade;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnMult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane visorCalculador;
  
}