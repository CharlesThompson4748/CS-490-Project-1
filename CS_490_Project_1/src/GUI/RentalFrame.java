/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BusinessLogic.Controller;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katrina Flynn
 */
public class RentalFrame extends javax.swing.JFrame {
    Controller controller = Controller.instance();
    String name;
    /**
     * Creates new form RentalFrame
     */
    public RentalFrame(String name, int tabNumber) {
        initComponents();
        tabs.setSelectedIndex(tabNumber);
        customerName.setText(name);
        this.name = name;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        FCTextField = new javax.swing.JTextField();
        FCSearchButton = new javax.swing.JButton();
        FCRentSelected = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FCTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rentedCarsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentedCarsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        returnedCarsTable = new javax.swing.JTable();
        customerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        FCSearchButton.setText("Search");
        FCSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCSearchButtonActionPerformed(evt);
            }
        });

        FCRentSelected.setText("Rent Selected");
        FCRentSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCRentSelectedActionPerformed(evt);
            }
        });

        FCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "ID", "Make", "Model", "Year", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FCTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FCRentSelected)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FCTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FCSearchButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FCTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FCSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FCRentSelected)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Find Car", jPanel2);

        rentedCarsButton.setText("Return Selected");
        rentedCarsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentedCarsButtonActionPerformed(evt);
            }
        });

        rentedCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Make", "Model", "Year", "Rented"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rentedCarsTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rentedCarsButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentedCarsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Rented Cars", jPanel3);

        returnedCarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Make", "Model", "Year", "Rented", "Returned"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(returnedCarsTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Returned Cars", jPanel4);

        customerName.setText("Customer's Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerName)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FCSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCSearchButtonActionPerformed
        LinkedList<String[]> cars = controller.searchCars(FCTextField.getText());
        DefaultTableModel model=(DefaultTableModel)FCTable.getModel();
        model.setRowCount(0);
        for(String[] row:cars){
            model.addRow(row);
        }
    }//GEN-LAST:event_FCSearchButtonActionPerformed

    private void FCRentSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCRentSelectedActionPerformed
        LinkedList<String[]> rentals = controller.searchRentals(name);
        DefaultTableModel model=(DefaultTableModel)rentedCarsTable.getModel();
        model.setRowCount(0);
        for (String[] rental: rentals){
            LinkedList<String[]> cars = controller.searchCars(rental[2]);
            for (String[] car: cars){
                model.addRow(new Object[]{car[0], car[1], car[2], rental[0]});
            }          
        }
        tabs.setSelectedIndex(1); 
    }//GEN-LAST:event_FCRentSelectedActionPerformed

    private void rentedCarsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentedCarsButtonActionPerformed
        
    }//GEN-LAST:event_rentedCarsButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FCRentSelected;
    private javax.swing.JButton FCSearchButton;
    private javax.swing.JTable FCTable;
    private javax.swing.JTextField FCTextField;
    private javax.swing.JLabel customerName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rentedCarsButton;
    private javax.swing.JTable rentedCarsTable;
    private javax.swing.JTable returnedCarsTable;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
