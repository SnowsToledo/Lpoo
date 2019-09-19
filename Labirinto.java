
package Trabalho;

public class Labirinto extends javax.swing.JFrame {
    Logic aux = new Logic();
    public Labirinto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tela = new javax.swing.JTextArea();
        cima = new javax.swing.JButton();
        esquerda = new javax.swing.JButton();
        start = new javax.swing.JButton();
        direita = new javax.swing.JButton();
        baixo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tela.setColumns(20);
        tela.setRows(5);
        jScrollPane1.setViewportView(tela);

        cima.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cima.setText("▲");
        cima.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cimaActionPerformed(evt);
            }
        });

        esquerda.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        esquerda.setText("◀");
        esquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esquerdaActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        start.setText("⬤");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        direita.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        direita.setText("▶");
        direita.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        direita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direitaActionPerformed(evt);
            }
        });

        baixo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        baixo.setText("▼");
        baixo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        baixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(baixo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baixo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cimaActionPerformed
        aux.movimentar(0, aux.procurarLin(aux.gerarMat()), aux.procurarCol(aux.gerarMat()), aux.gerarMat());
        tela.setText(aux.gerarMatS);
    }//GEN-LAST:event_cimaActionPerformed

    private void esquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esquerdaActionPerformed
        aux.movimentar(2, aux.procurarLin(aux.gerarMat()), aux.procurarCol(aux.gerarMat()), aux.gerarMat());
        tela.setText(aux.gerarMatS);
    }//GEN-LAST:event_esquerdaActionPerformed

    private void direitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direitaActionPerformed
        aux.movimentar(3, aux.procurarLin(aux.gerarMat()), aux.procurarCol(aux.gerarMat()), aux.gerarMat());
        tela.setText(aux.gerarMatS);
    }//GEN-LAST:event_direitaActionPerformed

    private void baixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixoActionPerformed
        aux.movimentar(1, aux.procurarLin(aux.gerarMat()), aux.procurarCol(aux.gerarMat()), aux.gerarMat());
        tela.setText(aux.gerarMatS);
    }//GEN-LAST:event_baixoActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        tela.setText(aux.gerarMatS());
    }//GEN-LAST:event_startActionPerformed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Labirinto().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baixo;
    private javax.swing.JButton cima;
    private javax.swing.JButton direita;
    private javax.swing.JButton esquerda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton start;
    private javax.swing.JTextArea tela;
    // End of variables declaration//GEN-END:variables
}
