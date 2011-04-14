package net.sourceforge.lxmed.gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import net.sourceforge.lxmed.model.MenuItem;
import net.sourceforge.lxmed.persistence.ModelLoader;

/**
 *
 * @author <a href="mailto:cicakmarko@yahoo.com">Marko Čičak</a>
 */
public class CodeEditDialog extends javax.swing.JDialog {

    private MenuItem mi;
    private MenuItemDialog mid;
    boolean editable = true;

    /** Creates new form CodeEditDialog */
    public CodeEditDialog(java.awt.Frame parent, MenuItem mi, boolean editable, MenuItemDialog mid) {
        super(parent, true);
        this.mi = mi;
        this.editable = editable;
        this.mid = mid;

        setTitle("Original desktop code");

        initComponents();
        setLocationRelativeTo(null);

        lblTitle.setText("Original code for " + mi.getName());
        txtCode.setText(mi.getOriginalCode());


        if (!editable) {
            setReadOnly();
        }

        // close on Esc
        this.getRootPane().getActionMap().put("close", new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                btnCancelActionPerformed(e);
            }
        });
        InputMap map = this.getRootPane().getInputMap(
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "close");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new JLabel();
        btnOk = new JButton();
        btnCancel = new JButton();
        spCode = new JScrollPane();
        txtCode = new JTextArea();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setDisplayedMnemonic('r');
        lblTitle.setFont(lblTitle.getFont().deriveFont(lblTitle.getFont().getStyle() | Font.BOLD, lblTitle.getFont().getSize()-1));
        lblTitle.setText("lblTitle");

        btnOk.setFont(btnOk.getFont().deriveFont(btnOk.getFont().getStyle() & ~Font.BOLD, btnOk.getFont().getSize()-1));
        btnOk.setIcon(new ImageIcon(getClass().getResource("/images/dialogs/ok.png"))); // NOI18N
        btnOk.setMnemonic('o');
        btnOk.setText("Ok");
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setFont(btnCancel.getFont().deriveFont(btnCancel.getFont().getStyle() & ~Font.BOLD, btnCancel.getFont().getSize()-1));
        btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/dialogs/cancel.png"))); // NOI18N
        btnCancel.setMnemonic('c');
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtCode.setColumns(20);
        txtCode.setFont(new Font("Monospaced", 0, 13)); // NOI18N
        txtCode.setRows(5);
        spCode.setViewportView(txtCode);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(spCode, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGroup(Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addPreferredGap(ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                        .addComponent(btnOk)))
                .addContainerGap())
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnCancel, btnOk});

        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(spCode, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (!editable) {
            setVisible(false);
            return;
        }
        MenuItem newMenuItem = ModelLoader.loadData(txtCode.getText());
        mid.getMenuItem().cloneData(newMenuItem);
        mid.updateGui();

        setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    private static void main(String args[]) {
        final MenuItem lmi = new MenuItem("Test Item");
        lmi.setOriginalCode("#!/usr/bin/env xdg-open\n[Desktop Entry]\n"
                + "Encoding=UTF-8\nType=Application\nExec=/home/cicakmarko/FTN/fax/se"
                + "mestar_09/neuronske_mreze/software/neurophstudio/bin/neurophstudio"
                + "\nIcon=/home/cicakmarko/Desktop/neuroph.png\nIcon[en_US]=/home/c"
                + "icakmarko/programi/icons/neuroph.png\nName=Neuroph\nName[en_US]"
                + "=Neuroph\nTerminal=false");
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CodeEditDialog dialog = new CodeEditDialog(new javax.swing.JFrame(), lmi, false, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnCancel;
    private JButton btnOk;
    private JLabel lblTitle;
    private JScrollPane spCode;
    private JTextArea txtCode;
    // End of variables declaration//GEN-END:variables

    void setReadOnly() {
        txtCode.setEditable(false);
        btnCancel.setVisible(false);
        btnOk.setText("Close");
        btnOk.setMnemonic('c');
    }
}
