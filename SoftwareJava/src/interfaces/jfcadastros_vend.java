/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.HeadlessException;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mauricio
 */
public class jfcadastros_vend extends javax.swing.JInternalFrame {

    java.sql.Connection conn = new BDConexao().connect();
    String txtData;

    /**
     * Creates new form jfcadastros_vend
     */
    public jfcadastros_vend() {
        setFrameIcon(new ImageIcon("C:\\Users\\Mauricio\\Documents\\NetBeansProjects\\SoftwareJava\\src\\interfaces\\icones\\ebella.png"));
        //setFrameIcon(null); 
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
        CTnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CTemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DTdatanasc = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CTtelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        CTimagem = new javax.swing.JTextField();
        BTpimagem = new javax.swing.JButton();
        LBimagem = new javax.swing.JLabel();

        setTitle("Cadastro de Vendedores");
        setName(""); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Data Nasc:");

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPAR FORMULÁRIO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("*");

        jLabel6.setText("*");

        try {
            CTtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Foto:");

        BTpimagem.setText("Procurar");
        BTpimagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTpimagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DTdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CTemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(CTnome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(CTtelefone, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(CTimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTpimagem)))
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addComponent(DTdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBimagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CTimagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTpimagem))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //AÇÕES BOTÃO PARA VALIDAR CAMPOS
        if (CTnome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo Nome esta em branco!", "Atenção!", 1);
            CTnome.requestFocus();
        } else if (CTemail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O Campo E-mail esta em branco!", "Atenção!", 1);
            CTemail.requestFocus();
        } else {

            try {

                //SELECT NO BANCO DE DADOS
                String selectTableSQL = "SELECT * FROM ebella_clientes";
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(selectTableSQL);
                while (rs.next()) {
                    if (CTnome.getText().equals(rs.getString("nome")) && CTemail.getText().equals(rs.getString("email"))) {
                        JOptionPane.showMessageDialog(null, "Cliente já Registrado!", "Atenção!", 1);
                        CTnome.setText("");
                        CTemail.setText("");
                        CTtelefone.setText("");
                        DTdatanasc.setDate(null);
                        CTnome.requestFocus();
                        break;
                    } else {
                        //ALTERA O FORMATO DA DATA
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US.getDefault());

                        //TRATA A SAIDA DO CAMPO DATA
                        String dataformatada;
                        if (DTdatanasc.getDate() != null) {
                            dataformatada = sdf.format(DTdatanasc.getDate());
                        } else {
                            dataformatada = "0000-00-00";
                        }
                        //TRATAR IMAGEM
                        String caminho_imagem = this.CTimagem.getText();
                        String caminho_imagem_tratado = caminho_imagem.replace("\\", "\\\\");
                        
                        

                        //INSERIR NO BANCO DE DADOS
                        statement.executeUpdate("INSERT INTO ebella_clientes (nome, email, telefone, datanasc, foto) "
                                + "VALUE ('" + this.CTnome.getText() + "', '" + this.CTemail.getText() + "', '" + this.CTtelefone.getText() + "', '" + dataformatada + "', '" + caminho_imagem_tratado + "')");
                        JOptionPane.showMessageDialog(null, "Cliente Cadastrado!", "Atenção!", 1);
                        CTnome.setText("");
                        CTemail.setText("");
                        CTtelefone.setText("");
                        DTdatanasc.setDate(null);
                        CTnome.requestFocus();
                        break;
                    }
                }

            } catch (SQLException | HeadlessException E) {
                JOptionPane.showMessageDialog(null, "Não foi possivel inserir o Cliente!", "Atenção!", 1);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //AÇÕES LIMPAR CAMPOS
        CTnome.setText("");
        CTemail.setText("");
        CTtelefone.setText("");
        DTdatanasc.setDate(null);
        CTnome.requestFocus();


    }//GEN-LAST:event_jButton2ActionPerformed
//FILTRO PARA CAMPO IMAGEM
    private void BTpimagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTpimagemActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        String filename = f.getAbsolutePath();
        CTimagem.setText(filename);
        LBimagem.setIcon(new javax.swing.ImageIcon(filename));


    }//GEN-LAST:event_BTpimagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTpimagem;
    private javax.swing.JTextField CTemail;
    private javax.swing.JTextField CTimagem;
    private javax.swing.JTextField CTnome;
    private javax.swing.JFormattedTextField CTtelefone;
    private com.toedter.calendar.JDateChooser DTdatanasc;
    private javax.swing.JLabel LBimagem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
