/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid.id;

/**
 *
 * @author Carlita Portero
 */
public class validateId extends javax.swing.JFrame {

    /**
     * Creates new form validateId
     */
    public validateId() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidnumber = new javax.swing.JTextField();
        btnvalidate = new javax.swing.JButton();
        presenttt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("VALID ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("ID NUMBER:");

        txtidnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidnumberActionPerformed(evt);
            }
        });

        btnvalidate.setText("VALIDATE");
        btnvalidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvalidateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnvalidate)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(presenttt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(presenttt, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnvalidate)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvalidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvalidateMouseClicked
     
     String id =txtidnumber.getText();
     String [] division = id.split("");
     String last = division[division.length - 1];
    
     
     int dg1,dg2,dg3,dg4,dg5,dg6,dg7,dg8,dg9;
     int op1,op2,op3,op4,op5,op6,op7,op8,op9;
     int sum=0,rest=0,dgchecker;
    
     if (id.length()==10) {
         
     dg1=Integer.parseInt(division[division.length - 10]);
     dg2=Integer.parseInt(division[division.length - 9]);
     dg3=Integer.parseInt(division[division.length - 8]);
     dg4=Integer.parseInt(division[division.length - 7]);
     dg5=Integer.parseInt(division[division.length - 6]);
     dg6=Integer.parseInt(division[division.length - 5]);
     dg7=Integer.parseInt(division[division.length - 4]);
     dg8=Integer.parseInt(division[division.length - 3]);
     dg9=Integer.parseInt(division[division.length - 2]);
     dgchecker=Integer.parseInt(division[division.length - 1]);
     
     presenttt.setText(" "+dg1+" "+dg2+" "+dg3+" "+dg4+" "+dg5+" "+dg6+" "+dg7+" "+dg8+" "+dg9);           
     
     op1=dg1*2;
     if (op1>=10) {
     op1 =op1- 9;
     }
     
     op2=dg2*1;
     
     op3=dg3*2;
     if (op3>=10); {
         op3 =op3- 9;
     }
     
     op4=dg4*1;
     
     op5=dg5*2;
     if (op5>=10) {
         op5 =op5- 9;
     }
     
     op6=dg6*1;
     
     op7=dg7*2;
     if (op7>=10) {
         op7 =op7- 9;
     }
     
     op8=dg8*1;
     
     op9=dg9*2;
     if (op9>=10) {
         op9 =op9- 9;
     }
     
     sum=op1+op2+op3+op4+op5+op6+op7+op8+op9;
     rest=sum % 10;
     
     if (rest==0) {
     if (rest==dgchecker) {
         
          presenttt.setText("true");
     } else {
         
         presenttt.setText("id false");
     }
     
     }if (rest>=1) {
         rest=10-rest;
         
       if (rest==dgchecker){
           presenttt.setText("true"+rest);
       } else {
            presenttt.setText("true");
     
    }//GEN-LAST:event_btnvalidateMouseClicked
     }
     }
    }
    private void txtidnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidnumberActionPerformed

    
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
            java.util.logging.Logger.getLogger(validateId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(validateId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(validateId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(validateId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new validateId().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvalidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel presenttt;
    private javax.swing.JTextField txtidnumber;
    // End of variables declaration//GEN-END:variables
}
