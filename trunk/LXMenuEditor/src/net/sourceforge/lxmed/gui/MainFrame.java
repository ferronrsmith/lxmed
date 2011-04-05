package net.sourceforge.lxmed.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sourceforge.lxmed.model.Categorie;
import net.sourceforge.lxmed.model.MenuItem;
import net.sourceforge.lxmed.model.Model;

/**
 *
 * @author <a href="mailto:cicakmarko@yahoo.com">Marko Čičak</a>
 */
public class MainFrame extends javax.swing.JFrame {

    protected DefaultListModel dlmItems = new DefaultListModel();
    protected DefaultListModel dlmCategories = new DefaultListModel();

    /** Creates new form MainFrame */
    public MainFrame() {
        for (Categorie categorie : Model.getModel().getCategories()) {
            dlmCategories.addElement(categorie);
        }
        initComponents();
        lstCategories.setSelectedIndex(0);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        pnlSouth = new JPanel();
        btnHelp = new JButton();
        btnAbout = new JButton();
        btnClose = new JButton();
        sprSouth = new JSeparator();
        pnlNorth = new JPanel();
        lblTitle = new JLabel();
        sprTitle = new JSeparator();
        pnlCenter = new JPanel();
        lblCategories = new JLabel();
        spCategories = new JScrollPane();
        lstCategories = new JList();
        spItems = new JScrollPane();
        lstItems = new JList();
        lblItems = new JLabel();
        pnlControls = new JPanel();
        btnNewItem = new JButton();
        btnProperties = new JButton();
        btnDelete = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("LXDE Main Menu Editor");

        pnlSouth.setLayout(new GridBagLayout());

        btnHelp.setFont(new Font("Dialog", 0, 11));
        btnHelp.setMnemonic('h');
        btnHelp.setText("Help");
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = new Insets(0, 10, 0, 10);
        pnlSouth.add(btnHelp, gridBagConstraints);

        btnAbout.setFont(new Font("Dialog", 0, 11));
        btnAbout.setMnemonic('b');
        btnAbout.setText("About");
        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        pnlSouth.add(btnAbout, gridBagConstraints);

        btnClose.setFont(new Font("Dialog", 0, 11));
        btnClose.setMnemonic('c');
        btnClose.setText("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(0, 10, 0, 10);
        pnlSouth.add(btnClose, gridBagConstraints);

        sprSouth.setForeground(new Color(0, 0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        pnlSouth.add(sprSouth, gridBagConstraints);

        getContentPane().add(pnlSouth, BorderLayout.SOUTH);

        pnlNorth.setLayout(new GridBagLayout());

        lblTitle.setFont(new Font("Dialog", 1, 11));
        lblTitle.setText("Configure main menu:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(7, 10, 7, 10);
        pnlNorth.add(lblTitle, gridBagConstraints);

        sprTitle.setForeground(new Color(0, 0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(0, 10, 0, 10);
        pnlNorth.add(sprTitle, gridBagConstraints);

        getContentPane().add(pnlNorth, BorderLayout.NORTH);

        pnlCenter.setLayout(new GridBagLayout());

        lblCategories.setDisplayedMnemonic('a');
        lblCategories.setFont(new Font("Dialog", 0, 11));
        lblCategories.setLabelFor(lstCategories);
        lblCategories.setText("Categories:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(12, 12, 0, 0);
        pnlCenter.add(lblCategories, gridBagConstraints);

        lstCategories.setFont(new Font("Dialog", 0, 11));
        lstCategories.setModel(dlmCategories);
        lstCategories.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstCategories.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                lstCategoriesValueChanged(evt);
            }
        });
        spCategories.setViewportView(lstCategories);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.ipady = 275;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(6, 12, 12, 0);
        pnlCenter.add(spCategories, gridBagConstraints);

        lstItems.setFont(new Font("Dialog", 0, 11));
        lstItems.setModel(dlmItems);
        lstItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstItems.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lstItemsMouseClicked(evt);
            }
        });
        lstItems.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                lstItemsValueChanged(evt);
            }
        });
        lstItems.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                lstItemsKeyReleased(evt);
            }
        });
        spItems.setViewportView(lstItems);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 264;
        gridBagConstraints.ipady = 275;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(6, 10, 12, 0);
        pnlCenter.add(spItems, gridBagConstraints);

        lblItems.setDisplayedMnemonic('t');
        lblItems.setFont(new Font("Dialog", 0, 11));
        lblItems.setLabelFor(lstItems);
        lblItems.setText("Menu Items:");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(12, 10, 0, 0);
        pnlCenter.add(lblItems, gridBagConstraints);

        getContentPane().add(pnlCenter, BorderLayout.CENTER);

        pnlControls.setLayout(new GridBagLayout());

        btnNewItem.setFont(new Font("Dialog", 0, 11));
        btnNewItem.setMnemonic('n');
        btnNewItem.setText("New Item");
        btnNewItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNewItemActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(31, 10, 5, 10);
        pnlControls.add(btnNewItem, gridBagConstraints);

        btnProperties.setFont(new Font("Dialog", 0, 11));
        btnProperties.setMnemonic('r');
        btnProperties.setText("Properties");
        btnProperties.setEnabled(false);
        btnProperties.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPropertiesActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(5, 10, 5, 10);
        pnlControls.add(btnProperties, gridBagConstraints);

        btnDelete.setFont(new Font("Dialog", 0, 11));
        btnDelete.setMnemonic('d');
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new Insets(5, 10, 5, 10);
        pnlControls.add(btnDelete, gridBagConstraints);

        getContentPane().add(pnlControls, BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnHelpActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        ni();
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnAboutActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        ni();
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnNewItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnNewItemActionPerformed
        new MenuItemDialog(this, null).setVisible(true);
    }//GEN-LAST:event_btnNewItemActionPerformed

    private void btnPropertiesActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnPropertiesActionPerformed
        editItem();
    }//GEN-LAST:event_btnPropertiesActionPerformed

    private void btnDeleteActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        ni();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lstCategoriesValueChanged(ListSelectionEvent evt) {//GEN-FIRST:event_lstCategoriesValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        dlmItems.clear();
        Categorie c = (Categorie) lstCategories.getSelectedValue();
        for (MenuItem menuItem : c) {
            dlmItems.addElement(menuItem);
        }
    }//GEN-LAST:event_lstCategoriesValueChanged

    private void lstItemsValueChanged(ListSelectionEvent evt) {//GEN-FIRST:event_lstItemsValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        MenuItem mi = (MenuItem) lstItems.getSelectedValue();
        if (mi == null) {
            disableControls();
            return;
        }

        enableControls();
    }//GEN-LAST:event_lstItemsValueChanged

    private void lstItemsMouseClicked(MouseEvent evt) {//GEN-FIRST:event_lstItemsMouseClicked
        if (evt.getClickCount() == 2) {
            editItem();
        }
    }//GEN-LAST:event_lstItemsMouseClicked

    private void lstItemsKeyReleased(KeyEvent evt) {//GEN-FIRST:event_lstItemsKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            editItem();
        }
    }//GEN-LAST:event_lstItemsKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAbout;
    private JButton btnClose;
    private JButton btnDelete;
    private JButton btnHelp;
    private JButton btnNewItem;
    private JButton btnProperties;
    private JLabel lblCategories;
    private JLabel lblItems;
    private JLabel lblTitle;
    private JList lstCategories;
    private JList lstItems;
    private JPanel pnlCenter;
    private JPanel pnlControls;
    private JPanel pnlNorth;
    private JPanel pnlSouth;
    private JScrollPane spCategories;
    private JScrollPane spItems;
    private JSeparator sprSouth;
    private JSeparator sprTitle;
    // End of variables declaration//GEN-END:variables

    // TODO: remove at end
    private void ni() {
        JOptionPane.showMessageDialog(rootPane, "Not implemented!");
    }

    private void enableControls() {
        btnProperties.setEnabled(true);
        btnDelete.setEnabled(true);
    }

    private void disableControls() {
        btnProperties.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    private void editItem() {
        MenuItem mi = (MenuItem) lstItems.getSelectedValue();
        if (mi == null) {
            return;
        }

        new MenuItemDialog(this, mi).setVisible(true);
    }
}