
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayj
 */
public class phoneCall extends javax.swing.JPanel {

    /**
     * Creates new form phoneCall
     */
    public phoneCall() {
        initComponents();
        jLabel8.setText(getDateLong());
    }
    
    /**
     *
     * @return
     */
    public String getDateLong(){
    Date hi = new Date();
        //Day, Date, and time
        return hi.toString().substring(0, 19);
            
    }
     /**
     *
     * @return
     */
    public String getDateShort(){
    Date hi = new Date();
        //Day, Date, and time
        
        //Just time
      return hi.toString().substring(11, 19);
    }
     
        /**
     *
     */
    public void dbAddTicket(){
        
        }
        
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbWho = new javax.swing.JTextField();
        tbPhone = new javax.swing.JTextField();
        labelWho = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelCompTag = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelProblem = new javax.swing.JLabel();
        tbCompTag = new javax.swing.JTextField();
        tbProblem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbNotes = new javax.swing.JTextField();
        labelNotes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnRows = new javax.swing.JButton();

        labelWho.setText("Who");

        labelPhone.setText("Phone #");

        labelCompTag.setText("Comp Tag #");

        labelTime.setText("Date/Time");

        labelProblem.setText("Problem");

        tbProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbProblemActionPerformed(evt);
            }
        });

        labelNotes.setText("Notes");

        jLabel8.setText(";");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRows.setText("Row?");
        btnRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRowsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProblem)
                                .addGap(18, 18, 18)
                                .addComponent(tbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTime)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCompTag)
                                    .addComponent(labelPhone)
                                    .addComponent(labelWho))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbWho, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(tbPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(tbCompTag, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(labelNotes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tbNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRows)
                .addGap(65, 65, 65)
                .addComponent(btnSubmit)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbWho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWho))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbCompTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCompTag, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(labelNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnRows))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbProblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbProblemActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        phonecallTicket ticket = new phonecallTicket(tbWho.getText(),
                                                     tbPhone.getText(), 
                                                     tbCompTag.getText(),
                                                     getDateLong(),
                                                     tbProblem.getText(), 
                                                     tbNotes.getText() 
                                                     );
      database db = new database();
      db.addTicket(ticket);
        System.out.println(tbNotes.getText());
        System.out.println(tbCompTag.getText());
        System.out.println(tbPhone.getText());
        System.out.println(tbProblem.getText());
        System.out.println(tbWho.getText());
           
      //end button submit ACTION  
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRowsActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
      database db = new database();
      System.out.println("There are " + db.total() + " record(s)"); 
           
    }//GEN-LAST:event_btnRowsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRows;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelCompTag;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelProblem;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelWho;
    private javax.swing.JTextField tbCompTag;
    private javax.swing.JTextField tbNotes;
    private javax.swing.JTextField tbPhone;
    private javax.swing.JTextField tbProblem;
    private javax.swing.JTextField tbWho;
    // End of variables declaration//GEN-END:variables
}
