/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

//import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.util.ArrayList;
//import javax.*;
//import java.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Michael
 */
public class EditorFrame extends javax.swing.JFrame {
    public static ArrayList tabArray = new ArrayList(24);
    public static String[] tabArray2 = new String[24];
    public static String savedFile;

    /**
     * Creates new form EditorFrame
     */
    public EditorFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        instructLabel = new javax.swing.JLabel();
        generateButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabs7 = new javax.swing.JTextField();
        jTabs3 = new javax.swing.JTextField();
        jTabs4 = new javax.swing.JTextField();
        jTabs1 = new javax.swing.JTextField();
        jTabs8 = new javax.swing.JTextField();
        jTabs2 = new javax.swing.JTextField();
        jTabs5 = new javax.swing.JTextField();
        jTabs6 = new javax.swing.JTextField();
        jImagelabel1 = new javax.swing.JLabel();
        jTabs15 = new javax.swing.JTextField();
        jTabs11 = new javax.swing.JTextField();
        jTabs12 = new javax.swing.JTextField();
        jTabs9 = new javax.swing.JTextField();
        jTabs16 = new javax.swing.JTextField();
        jTabs10 = new javax.swing.JTextField();
        jTabs13 = new javax.swing.JTextField();
        jTabs14 = new javax.swing.JTextField();
        jTabs23 = new javax.swing.JTextField();
        jTabs19 = new javax.swing.JTextField();
        jTabs20 = new javax.swing.JTextField();
        jTabs17 = new javax.swing.JTextField();
        jTabs24 = new javax.swing.JTextField();
        jTabs18 = new javax.swing.JTextField();
        jTabs21 = new javax.swing.JTextField();
        jTabs22 = new javax.swing.JTextField();
        jTabs65 = new javax.swing.JTextField();
        jTabs66 = new javax.swing.JTextField();
        jTabs67 = new javax.swing.JTextField();
        jTabs68 = new javax.swing.JTextField();
        jTabs69 = new javax.swing.JTextField();
        jTabs70 = new javax.swing.JTextField();
        jTabs71 = new javax.swing.JTextField();
        jTabs72 = new javax.swing.JTextField();
        jTabs31 = new javax.swing.JTextField();
        jTabs27 = new javax.swing.JTextField();
        jTabs28 = new javax.swing.JTextField();
        jTabs25 = new javax.swing.JTextField();
        jTabs32 = new javax.swing.JTextField();
        jTabs26 = new javax.swing.JTextField();
        jTabs29 = new javax.swing.JTextField();
        jTabs30 = new javax.swing.JTextField();
        jTabs39 = new javax.swing.JTextField();
        jTabs35 = new javax.swing.JTextField();
        jTabs36 = new javax.swing.JTextField();
        jTabs33 = new javax.swing.JTextField();
        jTabs40 = new javax.swing.JTextField();
        jTabs34 = new javax.swing.JTextField();
        jTabs37 = new javax.swing.JTextField();
        jTabs38 = new javax.swing.JTextField();
        jTabs47 = new javax.swing.JTextField();
        jTabs43 = new javax.swing.JTextField();
        jTabs44 = new javax.swing.JTextField();
        jTabs41 = new javax.swing.JTextField();
        jTabs48 = new javax.swing.JTextField();
        jTabs42 = new javax.swing.JTextField();
        jTabs45 = new javax.swing.JTextField();
        jTabs46 = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jNotes1 = new javax.swing.JLabel();
        jNotes2 = new javax.swing.JLabel();
        jNotes3 = new javax.swing.JLabel();
        jNotes4 = new javax.swing.JLabel();
        jNotes5 = new javax.swing.JLabel();
        jNotes6 = new javax.swing.JLabel();
        jNotes7 = new javax.swing.JLabel();
        jNotes8 = new javax.swing.JLabel();
        jNotes9 = new javax.swing.JLabel();
        jNotes10 = new javax.swing.JLabel();
        jNotes11 = new javax.swing.JLabel();
        jNotes12 = new javax.swing.JLabel();
        jNotes13 = new javax.swing.JLabel();
        jNotes14 = new javax.swing.JLabel();
        jNotes15 = new javax.swing.JLabel();
        jNotes16 = new javax.swing.JLabel();
        jNotes17 = new javax.swing.JLabel();
        jNotes18 = new javax.swing.JLabel();
        jNotes19 = new javax.swing.JLabel();
        jNotes20 = new javax.swing.JLabel();
        jNotes21 = new javax.swing.JLabel();
        jNotes22 = new javax.swing.JLabel();
        jNotes23 = new javax.swing.JLabel();
        jNotes24 = new javax.swing.JLabel();
        jNotes25 = new javax.swing.JLabel();
        jNotes26 = new javax.swing.JLabel();
        jNotes27 = new javax.swing.JLabel();
        jNotes28 = new javax.swing.JLabel();
        jNotes29 = new javax.swing.JLabel();
        jNotes30 = new javax.swing.JLabel();
        jNotes31 = new javax.swing.JLabel();
        jNotes32 = new javax.swing.JLabel();
        jNotes33 = new javax.swing.JLabel();
        jNotes34 = new javax.swing.JLabel();
        jNotes35 = new javax.swing.JLabel();
        jNotes36 = new javax.swing.JLabel();
        jNotes37 = new javax.swing.JLabel();
        jNotes38 = new javax.swing.JLabel();
        jNotes39 = new javax.swing.JLabel();
        jNotes40 = new javax.swing.JLabel();
        jNotes41 = new javax.swing.JLabel();
        jNotes42 = new javax.swing.JLabel();
        jNotes43 = new javax.swing.JLabel();
        jNotes44 = new javax.swing.JLabel();
        jNotes45 = new javax.swing.JLabel();
        jNotes46 = new javax.swing.JLabel();
        jNotes47 = new javax.swing.JLabel();
        jNotes48 = new javax.swing.JLabel();
        jNotes49 = new javax.swing.JLabel();
        jNotes50 = new javax.swing.JLabel();
        jNotes51 = new javax.swing.JLabel();
        jNotes52 = new javax.swing.JLabel();
        jNotes53 = new javax.swing.JLabel();
        jNotes54 = new javax.swing.JLabel();
        jNotes55 = new javax.swing.JLabel();
        jNotes56 = new javax.swing.JLabel();
        jNotes57 = new javax.swing.JLabel();
        jNotes58 = new javax.swing.JLabel();
        jNotes59 = new javax.swing.JLabel();
        jNotes60 = new javax.swing.JLabel();
        jNotes61 = new javax.swing.JLabel();
        jNotes62 = new javax.swing.JLabel();
        jNotes63 = new javax.swing.JLabel();
        jNotes64 = new javax.swing.JLabel();
        jNotes65 = new javax.swing.JLabel();
        jNotes66 = new javax.swing.JLabel();
        jNotes67 = new javax.swing.JLabel();
        jNotes68 = new javax.swing.JLabel();
        jNotes69 = new javax.swing.JLabel();
        jNotes70 = new javax.swing.JLabel();
        jNotes71 = new javax.swing.JLabel();
        jNotes72 = new javax.swing.JLabel();
        jNotes73 = new javax.swing.JLabel();
        jNotes74 = new javax.swing.JLabel();
        jNotes75 = new javax.swing.JLabel();
        jNotes76 = new javax.swing.JLabel();
        jNotes77 = new javax.swing.JLabel();
        jNotes78 = new javax.swing.JLabel();
        jNotes79 = new javax.swing.JLabel();
        jNotes80 = new javax.swing.JLabel();
        jNotes81 = new javax.swing.JLabel();
        jNotes82 = new javax.swing.JLabel();
        jNotes83 = new javax.swing.JLabel();
        jNotes84 = new javax.swing.JLabel();
        jNotes85 = new javax.swing.JLabel();
        jNotes86 = new javax.swing.JLabel();
        jNotes87 = new javax.swing.JLabel();
        jNotes88 = new javax.swing.JLabel();
        jNotes89 = new javax.swing.JLabel();
        jNotes90 = new javax.swing.JLabel();
        jNotes91 = new javax.swing.JLabel();
        jNotes92 = new javax.swing.JLabel();
        jNotes93 = new javax.swing.JLabel();
        jNotes94 = new javax.swing.JLabel();
        jNotes95 = new javax.swing.JLabel();
        jNotes96 = new javax.swing.JLabel();
        jNotes98 = new javax.swing.JLabel();
        jNotes99 = new javax.swing.JLabel();
        jNotes100 = new javax.swing.JLabel();
        jNotes101 = new javax.swing.JLabel();
        jNotes102 = new javax.swing.JLabel();
        jNotes103 = new javax.swing.JLabel();
        jNotes104 = new javax.swing.JLabel();
        jNotes105 = new javax.swing.JLabel();
        jNotes106 = new javax.swing.JLabel();
        jNotes107 = new javax.swing.JLabel();
        jNotes108 = new javax.swing.JLabel();
        jNotes109 = new javax.swing.JLabel();
        jNotes110 = new javax.swing.JLabel();
        jNotes111 = new javax.swing.JLabel();
        jNotes112 = new javax.swing.JLabel();
        jNotes113 = new javax.swing.JLabel();
        jNotes114 = new javax.swing.JLabel();
        jNotes115 = new javax.swing.JLabel();
        jNotes116 = new javax.swing.JLabel();
        jNotes117 = new javax.swing.JLabel();
        jNotes118 = new javax.swing.JLabel();
        jNotes119 = new javax.swing.JLabel();
        jNotes120 = new javax.swing.JLabel();
        jNotes121 = new javax.swing.JLabel();
        jNotes122 = new javax.swing.JLabel();
        jNotes123 = new javax.swing.JLabel();
        jNotes124 = new javax.swing.JLabel();
        jNotes125 = new javax.swing.JLabel();
        jNotes126 = new javax.swing.JLabel();
        jNotes127 = new javax.swing.JLabel();
        jNotes128 = new javax.swing.JLabel();
        jNotes129 = new javax.swing.JLabel();
        jNotes130 = new javax.swing.JLabel();
        jNotes131 = new javax.swing.JLabel();
        jNotes132 = new javax.swing.JLabel();
        jNotes133 = new javax.swing.JLabel();
        jNotes134 = new javax.swing.JLabel();
        jNotes135 = new javax.swing.JLabel();
        jNotes136 = new javax.swing.JLabel();
        jNotes137 = new javax.swing.JLabel();
        jNotes138 = new javax.swing.JLabel();
        jNotes139 = new javax.swing.JLabel();
        jNotes140 = new javax.swing.JLabel();
        jNotes141 = new javax.swing.JLabel();
        jNotes142 = new javax.swing.JLabel();
        jNotes143 = new javax.swing.JLabel();
        jNotes144 = new javax.swing.JLabel();
        jNotes145 = new javax.swing.JLabel();
        jNotes146 = new javax.swing.JLabel();
        jNotes147 = new javax.swing.JLabel();
        jNotes148 = new javax.swing.JLabel();
        jNotes149 = new javax.swing.JLabel();
        jNotes150 = new javax.swing.JLabel();
        jNotes151 = new javax.swing.JLabel();
        jNotes152 = new javax.swing.JLabel();
        jNotes153 = new javax.swing.JLabel();
        jNotes154 = new javax.swing.JLabel();
        jNotes155 = new javax.swing.JLabel();
        jNotes156 = new javax.swing.JLabel();
        jNotes157 = new javax.swing.JLabel();
        jNotes158 = new javax.swing.JLabel();
        jNotes159 = new javax.swing.JLabel();
        jNotes160 = new javax.swing.JLabel();
        jNotes161 = new javax.swing.JLabel();
        jNotes162 = new javax.swing.JLabel();
        jNotes163 = new javax.swing.JLabel();
        jNotes164 = new javax.swing.JLabel();
        jNotes165 = new javax.swing.JLabel();
        jNotes166 = new javax.swing.JLabel();
        jNotes167 = new javax.swing.JLabel();
        jNotes168 = new javax.swing.JLabel();
        jNotes169 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        //jLabel1.setIcon(new javax.swing.ImageIcon("C:\\musicBeta\\src\\Mypackage\\Images\\newtabs.JPG")); // NOI18N
        //jLabel1.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        instructLabel.setText("Input Guitar Tabs here:");
        getContentPane().add(instructLabel);
        instructLabel.setBounds(60, 50, 130, 30);

        generateButton1.setText("Generate Sheet");
        generateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(generateButton1);
        generateButton1.setBounds(30, 280, 170, 40);

        jTabs7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs7.setText("—");
        jTabs7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs7ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs7, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs7);
        jTabs7.setBounds(500, 220, 40, 20);

        jTabs3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs3.setText("—");
        jLayeredPane1.setLayer(jTabs3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs3);
        jTabs3.setBounds(160, 220, 40, 20);

        jTabs4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs4.setText("—");
        jLayeredPane1.setLayer(jTabs4, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs4);
        jTabs4.setBounds(240, 220, 40, 20);

        jTabs1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs1.setText("—");
        jTabs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs1ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs1, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs1);
        jTabs1.setBounds(10, 220, 40, 20);

        jTabs8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs8.setText("—");
        jTabs8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs8ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs8, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs8);
        jTabs8.setBounds(590, 220, 40, 20);

        jTabs2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs2.setText("—");
        jTabs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs2ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs2, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs2);
        jTabs2.setBounds(80, 220, 40, 20);

        jTabs5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs5.setText("—");
        jLayeredPane1.setLayer(jTabs5, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs5);
        jTabs5.setBounds(320, 220, 40, 20);

        jTabs6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs6.setText("—");
        jLayeredPane1.setLayer(jTabs6, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs6);
        jTabs6.setBounds(410, 220, 40, 20);

        jImagelabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jImagelabel1.setIcon(new javax.swing.ImageIcon("C:\\musicBeta\\src\\Mypackage\\Images\\newtabs.JPG")); // NOI18N
        jLayeredPane1.add(jImagelabel1);
        jImagelabel1.setBounds(10, 0, 630, 260);

        jTabs15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs15.setText("—");
        jTabs15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs15ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs15, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs15);
        jTabs15.setBounds(500, 180, 40, 20);

        jTabs11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs11.setText("—");
        jLayeredPane1.setLayer(jTabs11, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs11);
        jTabs11.setBounds(160, 180, 40, 20);

        jTabs12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs12.setText("—");
        jLayeredPane1.setLayer(jTabs12, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs12);
        jTabs12.setBounds(240, 180, 40, 20);

        jTabs9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs9.setText("—");
        jTabs9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs9ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs9, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs9);
        jTabs9.setBounds(10, 180, 40, 20);

        jTabs16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs16.setText("—");
        jTabs16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs16ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs16, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs16);
        jTabs16.setBounds(590, 180, 40, 20);

        jTabs10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs10.setText("—");
        jTabs10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs10ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs10, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs10);
        jTabs10.setBounds(80, 180, 40, 20);

        jTabs13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs13.setText("—");
        jLayeredPane1.setLayer(jTabs13, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs13);
        jTabs13.setBounds(320, 180, 40, 20);

        jTabs14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs14.setText("—");
        jLayeredPane1.setLayer(jTabs14, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs14);
        jTabs14.setBounds(410, 180, 40, 20);

        jTabs23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs23.setText("—");
        jTabs23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs23ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs23, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs23);
        jTabs23.setBounds(500, 140, 40, 20);

        jTabs19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs19.setText("—");
        jLayeredPane1.setLayer(jTabs19, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs19);
        jTabs19.setBounds(160, 140, 40, 20);

        jTabs20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs20.setText("—");
        jLayeredPane1.setLayer(jTabs20, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs20);
        jTabs20.setBounds(240, 140, 40, 20);

        jTabs17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs17.setText("—");
        jTabs17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs17ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs17, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs17);
        jTabs17.setBounds(10, 140, 40, 20);

        jTabs24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs24.setText("—");
        jTabs24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs24ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs24, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs24);
        jTabs24.setBounds(590, 140, 40, 20);

        jTabs18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs18.setText("—");
        jTabs18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs18ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs18, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs18);
        jTabs18.setBounds(80, 140, 40, 20);

        jTabs21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs21.setText("—");
        jTabs21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs21ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs21, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs21);
        jTabs21.setBounds(320, 140, 40, 20);

        jTabs22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs22.setText("—");
        jLayeredPane1.setLayer(jTabs22, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs22);
        jTabs22.setBounds(410, 140, 40, 20);

        jTabs65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs65.setText("—");
        jTabs65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs65ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs65, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs65);
        jTabs65.setBounds(500, 180, 40, 20);

        jTabs66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs66.setText("—");
        jLayeredPane1.setLayer(jTabs66, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs66);
        jTabs66.setBounds(160, 180, 40, 20);

        jTabs67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs67.setText("—");
        jLayeredPane1.setLayer(jTabs67, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs67);
        jTabs67.setBounds(240, 180, 40, 20);

        jTabs68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs68.setText("—");
        jTabs68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs68ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs68, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs68);
        jTabs68.setBounds(10, 180, 40, 20);

        jTabs69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs69.setText("—");
        jTabs69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs69ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs69, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs69);
        jTabs69.setBounds(590, 180, 40, 20);

        jTabs70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs70.setText("—");
        jTabs70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs70ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs70, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs70);
        jTabs70.setBounds(80, 180, 40, 20);

        jTabs71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs71.setText("—");
        jLayeredPane1.setLayer(jTabs71, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs71);
        jTabs71.setBounds(320, 180, 40, 20);

        jTabs72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs72.setText("—");
        jLayeredPane1.setLayer(jTabs72, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs72);
        jTabs72.setBounds(410, 180, 40, 20);

        jTabs31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs31.setText("—");
        jTabs31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs31ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs31, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs31);
        jTabs31.setBounds(500, 90, 40, 20);

        jTabs27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs27.setText("—");
        jLayeredPane1.setLayer(jTabs27, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs27);
        jTabs27.setBounds(160, 90, 40, 20);

        jTabs28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs28.setText("—");
        jLayeredPane1.setLayer(jTabs28, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs28);
        jTabs28.setBounds(240, 90, 40, 20);

        jTabs25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs25.setText("—");
        jTabs25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs25ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs25, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs25);
        jTabs25.setBounds(10, 90, 40, 20);

        jTabs32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs32.setText("—");
        jTabs32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs32ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs32, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs32);
        jTabs32.setBounds(590, 90, 40, 20);

        jTabs26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs26.setText("—");
        jTabs26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs26ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs26, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs26);
        jTabs26.setBounds(80, 90, 40, 20);

        jTabs29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs29.setText("—");
        jLayeredPane1.setLayer(jTabs29, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs29);
        jTabs29.setBounds(320, 90, 40, 20);

        jTabs30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs30.setText("—");
        jLayeredPane1.setLayer(jTabs30, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs30);
        jTabs30.setBounds(410, 90, 40, 20);

        jTabs39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs39.setText("—");
        jTabs39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs39ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs39, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs39);
        jTabs39.setBounds(500, 50, 40, 20);

        jTabs35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs35.setText("—");
        jLayeredPane1.setLayer(jTabs35, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs35);
        jTabs35.setBounds(160, 50, 40, 20);

        jTabs36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs36.setText("—");
        jLayeredPane1.setLayer(jTabs36, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs36);
        jTabs36.setBounds(240, 50, 40, 20);

        jTabs33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs33.setText("—");
        jTabs33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs33ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs33, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs33);
        jTabs33.setBounds(10, 50, 40, 20);

        jTabs40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs40.setText("—");
        jTabs40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs40ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs40, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs40);
        jTabs40.setBounds(590, 50, 40, 20);

        jTabs34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs34.setText("—");
        jTabs34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs34ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs34, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs34);
        jTabs34.setBounds(80, 50, 40, 20);

        jTabs37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs37.setText("—");
        jLayeredPane1.setLayer(jTabs37, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs37);
        jTabs37.setBounds(320, 50, 40, 20);

        jTabs38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs38.setText("—");
        jLayeredPane1.setLayer(jTabs38, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs38);
        jTabs38.setBounds(410, 50, 40, 20);

        jTabs47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs47.setText("—");
        jTabs47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs47ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs47, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs47);
        jTabs47.setBounds(500, 10, 40, 20);

        jTabs43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs43.setText("—");
        jLayeredPane1.setLayer(jTabs43, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs43);
        jTabs43.setBounds(160, 10, 40, 20);

        jTabs44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs44.setText("—");
        jLayeredPane1.setLayer(jTabs44, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs44);
        jTabs44.setBounds(240, 10, 40, 20);

        jTabs41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs41.setText("—");
        jTabs41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs41ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs41, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs41);
        jTabs41.setBounds(10, 10, 40, 20);

        jTabs48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs48.setText("—");
        jTabs48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs48ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs48, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs48);
        jTabs48.setBounds(590, 10, 40, 20);

        jTabs42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs42.setText("—");
        jTabs42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabs42ActionPerformed(evt);
            }
        });
        jLayeredPane1.setLayer(jTabs42, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs42);
        jTabs42.setBounds(80, 10, 40, 20);

        jTabs45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs45.setText("—");
        jLayeredPane1.setLayer(jTabs45, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs45);
        jTabs45.setBounds(320, 10, 40, 20);

        jTabs46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabs46.setText("—");
        jLayeredPane1.setLayer(jTabs46, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(jTabs46);
        jTabs46.setBounds(410, 10, 40, 20);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(240, 10, 650, 240);
        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(260, 940, 0, 0);

        jLayeredPane3.setPreferredSize(new java.awt.Dimension(40000, 40000));
        jLayeredPane3.setLayer(jNotes1, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes1);
        jNotes1.setBounds(260, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes2, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes2);
        jNotes2.setBounds(310, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes3);
        jNotes3.setBounds(360, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes4, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes4);
        jNotes4.setBounds(410, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes5, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes5);
        jNotes5.setBounds(460, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes6, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes6);
        jNotes6.setBounds(520, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes7, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes7);
        jNotes7.setBounds(570, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes8, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes8);
        jNotes8.setBounds(620, 410, 40, 40);
        jLayeredPane3.setLayer(jNotes9, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes9);
        jNotes9.setBounds(260, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes10, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes10);
        jNotes10.setBounds(310, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes11, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes11);
        jNotes11.setBounds(360, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes12, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes12);
        jNotes12.setBounds(410, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes13, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes13);
        jNotes13.setBounds(460, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes14, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes14);
        jNotes14.setBounds(520, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes15, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes15);
        jNotes15.setBounds(570, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes16, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes16);
        jNotes16.setBounds(620, 390, 40, 40);
        jLayeredPane3.setLayer(jNotes17, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes17);
        jNotes17.setBounds(260, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes18, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes18);
        jNotes18.setBounds(310, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes19, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes19);
        jNotes19.setBounds(360, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes20, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes20);
        jNotes20.setBounds(410, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes21, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes21);
        jNotes21.setBounds(460, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes22, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes22);
        jNotes22.setBounds(520, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes23, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes23);
        jNotes23.setBounds(570, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes24, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes24);
        jNotes24.setBounds(620, 370, 40, 40);
        jLayeredPane3.setLayer(jNotes25, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes25);
        jNotes25.setBounds(260, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes26, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes26);
        jNotes26.setBounds(310, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes27, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes27);
        jNotes27.setBounds(360, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes28, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes28);
        jNotes28.setBounds(410, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes29, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes29);
        jNotes29.setBounds(460, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes30, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes30);
        jNotes30.setBounds(520, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes31, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes31);
        jNotes31.setBounds(570, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes32, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes32);
        jNotes32.setBounds(620, 350, 40, 40);
        jLayeredPane3.setLayer(jNotes33, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes33);
        jNotes33.setBounds(260, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes34, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes34);
        jNotes34.setBounds(310, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes35, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes35);
        jNotes35.setBounds(360, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes36, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes36);
        jNotes36.setBounds(410, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes37, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes37);
        jNotes37.setBounds(460, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes38, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes38);
        jNotes38.setBounds(520, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes39, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes39);
        jNotes39.setBounds(570, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes40, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes40);
        jNotes40.setBounds(620, 330, 40, 40);
        jLayeredPane3.setLayer(jNotes41, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes41);
        jNotes41.setBounds(260, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes42, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes42);
        jNotes42.setBounds(310, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes43, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes43);
        jNotes43.setBounds(360, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes44, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes44);
        jNotes44.setBounds(410, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes45, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes45);
        jNotes45.setBounds(460, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes46, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes46);
        jNotes46.setBounds(520, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes47, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes47);
        jNotes47.setBounds(570, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes48, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes48);
        jNotes48.setBounds(620, 310, 40, 40);
        jLayeredPane3.setLayer(jNotes49, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes49);
        jNotes49.setBounds(260, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes50, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes50);
        jNotes50.setBounds(310, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes51, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes51);
        jNotes51.setBounds(360, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes52, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes52);
        jNotes52.setBounds(410, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes53, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes53);
        jNotes53.setBounds(460, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes54, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes54);
        jNotes54.setBounds(520, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes55, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes55);
        jNotes55.setBounds(570, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes56, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes56);
        jNotes56.setBounds(620, 290, 40, 40);
        jLayeredPane3.setLayer(jNotes57, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes57);
        jNotes57.setBounds(260, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes58, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes58);
        jNotes58.setBounds(310, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes59, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes59);
        jNotes59.setBounds(360, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes60, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes60);
        jNotes60.setBounds(410, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes61, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes61);
        jNotes61.setBounds(460, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes62, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes62);
        jNotes62.setBounds(520, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes63, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes63);
        jNotes63.setBounds(570, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes64, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes64);
        jNotes64.setBounds(620, 270, 40, 40);
        jLayeredPane3.setLayer(jNotes65, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes65);
        jNotes65.setBounds(260, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes66, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes66);
        jNotes66.setBounds(310, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes67, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes67);
        jNotes67.setBounds(360, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes68, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes68);
        jNotes68.setBounds(410, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes69, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes69);
        jNotes69.setBounds(460, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes70, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes70);
        jNotes70.setBounds(520, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes71, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes71);
        jNotes71.setBounds(570, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes72, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes72);
        jNotes72.setBounds(620, 250, 40, 40);
        jLayeredPane3.setLayer(jNotes73, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes73);
        jNotes73.setBounds(260, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes74, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes74);
        jNotes74.setBounds(310, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes75, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes75);
        jNotes75.setBounds(360, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes76, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes76);
        jNotes76.setBounds(410, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes77, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes77);
        jNotes77.setBounds(460, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes78, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes78);
        jNotes78.setBounds(520, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes79, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes79);
        jNotes79.setBounds(570, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes80, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes80);
        jNotes80.setBounds(620, 230, 40, 40);
        jLayeredPane3.setLayer(jNotes81, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes81);
        jNotes81.setBounds(260, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes82, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes82);
        jNotes82.setBounds(310, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes83, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes83);
        jNotes83.setBounds(360, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes84, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes84);
        jNotes84.setBounds(410, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes85, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes85);
        jNotes85.setBounds(460, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes86, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes86);
        jNotes86.setBounds(520, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes87, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes87);
        jNotes87.setBounds(570, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes88, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes88);
        jNotes88.setBounds(620, 210, 40, 40);
        jLayeredPane3.setLayer(jNotes89, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes89);
        jNotes89.setBounds(260, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes90, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes90);
        jNotes90.setBounds(310, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes91, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes91);
        jNotes91.setBounds(360, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes92, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes92);
        jNotes92.setBounds(410, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes93, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes93);
        jNotes93.setBounds(460, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes94, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes94);
        jNotes94.setBounds(520, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes95, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes95);
        jNotes95.setBounds(570, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes96, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes96);
        jNotes96.setBounds(620, 190, 40, 40);
        jLayeredPane3.setLayer(jNotes98, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes98);
        jNotes98.setBounds(260, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes99, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes99);
        jNotes99.setBounds(310, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes100, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes100);
        jNotes100.setBounds(360, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes101, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes101);
        jNotes101.setBounds(410, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes102, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes102);
        jNotes102.setBounds(460, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes103, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes103);
        jNotes103.setBounds(520, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes104, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes104);
        jNotes104.setBounds(570, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes105, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes105);
        jNotes105.setBounds(620, 170, 40, 40);
        jLayeredPane3.setLayer(jNotes106, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes106);
        jNotes106.setBounds(260, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes107, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes107);
        jNotes107.setBounds(310, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes108, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes108);
        jNotes108.setBounds(360, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes109, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes109);
        jNotes109.setBounds(410, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes110, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes110);
        jNotes110.setBounds(460, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes111, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes111);
        jNotes111.setBounds(520, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes112, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes112);
        jNotes112.setBounds(570, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes113, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes113);
        jNotes113.setBounds(620, 150, 40, 40);
        jLayeredPane3.setLayer(jNotes114, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes114);
        jNotes114.setBounds(260, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes115, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes115);
        jNotes115.setBounds(310, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes116, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes116);
        jNotes116.setBounds(360, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes117, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes117);
        jNotes117.setBounds(410, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes118, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes118);
        jNotes118.setBounds(460, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes119, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes119);
        jNotes119.setBounds(520, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes120, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes120);
        jNotes120.setBounds(570, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes121, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes121);
        jNotes121.setBounds(620, 130, 40, 40);
        jLayeredPane3.setLayer(jNotes122, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes122);
        jNotes122.setBounds(260, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes123, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes123);
        jNotes123.setBounds(310, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes124, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes124);
        jNotes124.setBounds(360, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes125, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes125);
        jNotes125.setBounds(410, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes126, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes126);
        jNotes126.setBounds(460, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes127, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes127);
        jNotes127.setBounds(520, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes128, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes128);
        jNotes128.setBounds(570, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes129, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes129);
        jNotes129.setBounds(620, 110, 40, 40);
        jLayeredPane3.setLayer(jNotes130, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes130);
        jNotes130.setBounds(260, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes131, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes131);
        jNotes131.setBounds(310, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes132, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes132);
        jNotes132.setBounds(360, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes133, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes133);
        jNotes133.setBounds(410, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes134, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes134);
        jNotes134.setBounds(460, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes135, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes135);
        jNotes135.setBounds(520, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes136, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes136);
        jNotes136.setBounds(570, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes137, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes137);
        jNotes137.setBounds(620, 90, 40, 40);
        jLayeredPane3.setLayer(jNotes138, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes138);
        jNotes138.setBounds(260, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes139, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes139);
        jNotes139.setBounds(310, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes140, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes140);
        jNotes140.setBounds(360, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes141, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes141);
        jNotes141.setBounds(410, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes142, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes142);
        jNotes142.setBounds(460, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes143, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes143);
        jNotes143.setBounds(520, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes144, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes144);
        jNotes144.setBounds(570, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes145, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes145);
        jNotes145.setBounds(620, 70, 40, 40);
        jLayeredPane3.setLayer(jNotes146, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes146);
        jNotes146.setBounds(260, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes147, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes147);
        jNotes147.setBounds(310, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes148, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes148);
        jNotes148.setBounds(360, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes149, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes149);
        jNotes149.setBounds(410, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes150, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes150);
        jNotes150.setBounds(460, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes151, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes151);
        jNotes151.setBounds(520, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes152, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes152);
        jNotes152.setBounds(570, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes153, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes153);
        jNotes153.setBounds(620, 50, 40, 40);
        jLayeredPane3.setLayer(jNotes154, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes154);
        jNotes154.setBounds(260, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes155, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes155);
        jNotes155.setBounds(310, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes156, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes156);
        jNotes156.setBounds(360, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes157, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes157);
        jNotes157.setBounds(410, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes158, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes158);
        jNotes158.setBounds(460, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes159, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes159);
        jNotes159.setBounds(520, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes160, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes160);
        jNotes160.setBounds(570, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes161, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes161);
        jNotes161.setBounds(620, 30, 40, 40);
        jLayeredPane3.setLayer(jNotes162, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes162);
        jNotes162.setBounds(260, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes163, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes163);
        jNotes163.setBounds(310, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes164, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes164);
        jNotes164.setBounds(360, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes165, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes165);
        jNotes165.setBounds(410, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes166, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes166);
        jNotes166.setBounds(460, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes167, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes167);
        jNotes167.setBounds(520, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes168, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes168);
        jNotes168.setBounds(570, 10, 40, 40);
        jLayeredPane3.setLayer(jNotes169, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane3.add(jNotes169);
        jNotes169.setBounds(620, 10, 40, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\musicBeta\\src\\Mypackage\\Images\\clefstaff.jpg")); // NOI18N
        //jLayeredPane3.setLayer(jLabel2, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.add(jLabel2);
        jLabel2.setBounds(-30, 30, 890, 330);

        jScrollPane1.setViewportView(jLayeredPane3);
        jLayeredPane3.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 270, 760, 440);

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        TitleFrame f = new TitleFrame();

        f.setVisible(true);

    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int g = -1;  //Loop Runs
        while (g < 0 )
        {
            savedFile = JOptionPane.showInputDialog("Please Enter File Name"); //Displays Input Dialogue
            if (savedFile.length() > 0) //Closes loop if file name entered
            {
                g++;
                JOptionPane.showMessageDialog(this,"File Saved");
                System.out.println(savedFile);
                musicBeta.saveFile();
            }
            else //Continues to run if no text entered
            {
                JOptionPane.showMessageDialog(this,"Please Enter File Name");
            }
        }


    }

    private void jTabs42ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs48ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs41ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs47ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs34ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs40ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs33ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs39ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs26ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs32ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs25ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs31ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs70ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs69ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs68ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs65ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs18ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs24ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs17ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs23ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs16ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs15ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTabs7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void generateButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String[] notesArray = new String[24];

        //Run for loop to add things to array?
        //Make array only 24 characters long
        //Format {Digit, Note, -)
        //Run format 8 times for a total of 24 characters

        //Declaring an ungodly amount of variable
        String tab1;
        tab1 = jTabs1.getText();
        String tab2;
        tab2 = jTabs2.getText();
        String tab3;
        tab3 = jTabs3.getText();
        String tab4;
        tab4 = jTabs4.getText();
        String tab5;
        tab5 = jTabs5.getText();
        String tab6;
        tab6 = jTabs6.getText();
        String tab7;
        tab7 = jTabs7.getText();
        String tab8;
        tab8 = jTabs8.getText();
        String tab9;
        tab9 = jTabs9.getText();
        String tab10;
        tab10 = jTabs10.getText();
        String tab11;
        tab11 = jTabs11.getText();
        String tab12;
        tab12 = jTabs12.getText();
        String tab13;
        tab13 = jTabs13.getText();
        String tab14;
        tab14 = jTabs14.getText();
        String tab15;
        tab15 = jTabs15.getText();
        String tab16;
        tab16 = jTabs16.getText();
        String tab17;
        tab17 = jTabs17.getText();
        String tab18;
        tab18 = jTabs18.getText();
        String tab19;
        tab19 = jTabs19.getText();
        String tab20;
        tab20 = jTabs20.getText();
        String tab21;
        tab21 = jTabs21.getText();
        String tab22;
        tab22 = jTabs22.getText();
        String tab23;
        tab23 = jTabs23.getText();
        String tab24;
        tab24 = jTabs24.getText();
        String tab25;
        tab25 = jTabs25.getText();
        String tab26;
        tab26 = jTabs26.getText();
        String tab27;
        tab27 = jTabs27.getText();
        String tab28;
        tab28 = jTabs28.getText();
        String tab29;
        tab29 = jTabs29.getText();
        String tab30;
        tab30 = jTabs30.getText();
        String tab31;
        tab31 = jTabs31.getText();
        String tab32;
        tab32 = jTabs32.getText();
        String tab33;
        tab33 = jTabs33.getText();
        String tab34;
        tab34 = jTabs34.getText();
        String tab35;
        tab35 = jTabs35.getText();
        String tab36;
        tab36 = jTabs36.getText();
        String tab37;
        tab37 = jTabs37.getText();
        String tab38;
        tab38 = jTabs38.getText();
        String tab39;
        tab39 = jTabs39.getText();
        String tab40;
        tab40 = jTabs40.getText();
        String tab41;
        tab41 = jTabs41.getText();

        String tab42;
        tab42 = jTabs42.getText();
        String tab43;
        tab43 = jTabs43.getText();
        String tab44;
        tab44 = jTabs44.getText();
        String tab45;
        tab45 = jTabs45.getText();
        String tab46;
        tab46 = jTabs46.getText();
        String tab47;
        tab47 = jTabs47.getText();
        String tab48;
        tab48 = jTabs48.getText();
        String dash = "—";
        //Declaring more variables
        String Enotes = "E";
        String Anotes = "A";
        String Dnotes = "D";
        String Gnotes = "G";
        String Bnotes = "B";
        String enotes = "e";
        //Creating string arrays based on note categories
        //Re-arrange string arrays to read the jTextfields from left to right
        //Set up if-statements that check != "-" and else statements that do the same
        //if conditions are true add the specific jTextfield and it"s corresponding string position to the array
        String [] C1 = {tab1,tab9,tab17,tab25,tab33,tab41};
        String [] C2 = {tab2,tab10,tab18,tab26,tab34,tab42};
        String [] C3 = {tab3,tab11,tab19,tab27,tab35,tab43};
        String [] C4 = {tab4,tab12,tab20,tab28,tab36,tab44};
        String [] C5 = {tab5,tab13,tab21,tab29,tab37,tab45};
        String [] C6 = {tab6,tab14,tab22,tab30,tab38,tab46};
        String [] C7 = {tab7,tab15,tab23,tab31,tab39,tab47};
        String [] C8 = {tab8,tab16,tab24,tab32,tab40,tab48};
        //Reading Column 1
        if(!(C1[0].equals(dash))){
            tabArray.add(C1[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);

        }
        else if (!(C1[1].equals(dash))){
            tabArray.add(C1[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C1[2].equals(dash))){
            tabArray.add(C1[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C1[3].equals(dash))){
            tabArray.add(C1[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C1[4].equals(dash))){
            tabArray.add(C1[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C1[5].equals(dash))){
            tabArray.add(C1[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Read Collumn 2
        if(!(C2[0].equals(dash))){
            tabArray.add(C2[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C2[1].equals(dash))){
            tabArray.add(C2[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C2[2].equals(dash))){
            tabArray.add(C2[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C2[3].equals(dash))){
            tabArray.add(C2[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C2[4].equals(dash))){
            tabArray.add(C2[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C2[5].equals(dash))){
            tabArray.add(C2[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Read Collumn 3
        if(!(C3[0].equals(dash))){
            tabArray.add(C3[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C3[1].equals(dash))){
            tabArray.add(C3[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C3[2].equals(dash))){
            tabArray.add(C3[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C3[3].equals(dash))){
            tabArray.add(C3[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C3[4].equals(dash))){
            tabArray.add(C3[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C3[5].equals(dash))){
            tabArray.add(C3[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Read Collumn 4
        if(!(C4[0].equals(dash))){
            tabArray.add(C4[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C4[1].equals(dash))){
            tabArray.add(C4[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C4[2].equals(dash))){
            tabArray.add(C4[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C4[3].equals(dash))){
            tabArray.add(C4[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C4[4].equals(dash))){
            tabArray.add(C4[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C4[5].equals(dash))){
            tabArray.add(C4[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Read Collumn 5
        if(!(C5[0].equals(dash))){
            tabArray.add(C5[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C5[1].equals(dash))){
            tabArray.add(C5[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C5[2].equals(dash))){
            tabArray.add(C5[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C5[3].equals(dash))){
            tabArray.add(C5[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C5[4].equals(dash))){
            tabArray.add(C5[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C5[5].equals(dash))){
            tabArray.add(C5[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Collumn 6
        if(!(C6[0].equals(dash))){
            tabArray.add(C6[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C6[1].equals(dash))){
            tabArray.add(C6[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C6[2].equals(dash))){
            tabArray.add(C6[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C6[3].equals(dash))){
            tabArray.add(C6[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C6[4].equals(dash))){
            tabArray.add(C6[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C6[5].equals(dash))){
            tabArray.add(C6[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Collumn 7
        if(!(C7[0].equals(dash))){
            tabArray.add(C7[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C7[1].equals(dash))){
            tabArray.add(C7[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C7[2].equals(dash))){
            tabArray.add(C7[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C7[3].equals(dash))){
            tabArray.add(C7[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C7[4].equals(dash))){
            tabArray.add(C7[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C7[5].equals(dash))){
            tabArray.add(C7[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }

        //Collumn 8
        if(!(C8[0].equals(dash))){
            tabArray.add(C8[0]);
            tabArray.add(Enotes);
            tabArray.add(dash);
        }
        else if (!(C8[1].equals(dash))){
            tabArray.add(C8[1]);
            tabArray.add(Anotes);
            tabArray.add(dash);
        }
        else if (!(C8[2].equals(dash))){
            tabArray.add(C8[2]);
            tabArray.add(Dnotes);
            tabArray.add(dash);
        }
        else if (!(C8[3].equals(dash))){
            tabArray.add(C8[3]);
            tabArray.add(Gnotes);
            tabArray.add(dash);
        }
        else if (!(C8[4].equals(dash))){
            tabArray.add(C8[4]);
            tabArray.add(Bnotes);
            tabArray.add(dash);
        }
        else if (!(C8[5].equals(dash))){
            tabArray.add(C8[5]);
            tabArray.add(enotes);
            tabArray.add(dash);
        }
        else{
            tabArray.add(dash);
        }
        System.out.println(tabArray);
        // What is this part?
        // System.out.println(createFile.createFile());

        Object[] object = tabArray.toArray();
        //Spaghetti Code begins here and my sanity ends here
        //Finished array String[] arrayLine = new String[16]; //Declaring a string holding all the values

        String[] arrayLine = (String[]) createFile.createFile().toArray(new String[createFile.createFile().size()]);

        //System.out.println(arrayLine.length); //check to see if conversion works
        String low = "C:\\musicBeta\\src\\Mypackage\\Images\\Blow.JPG"; //Declaration of image path
        String high = "C:\\musicBeta\\src\\Mypackage\\Images\\Chigh.JPG";
        if (arrayLine[0] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes1.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes1);
            validate();
        }
        if (arrayLine[0] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes9.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes9);
            validate();
        }
        if (arrayLine[0] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes17.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes17);
            validate();
        }
        if (arrayLine[0] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes25.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes25);
            validate();
        }
        if (arrayLine[0] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes33.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes33);
            validate();
        }
        if (arrayLine[0] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes41.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes41);
            validate();
        }
        if (arrayLine[0] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes49.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes49);
            validate();
        }
        if (arrayLine[0] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes1.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes1);
            System.out.println("Hi");
            validate();
        }
        if (arrayLine[0] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes65.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes65);
            validate();
        }
        if (arrayLine[0] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes73.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes73);
            validate();
        }
        if (arrayLine[0] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes81.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes81);
            validate();
        }
        if (arrayLine[0] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes89.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes89);
            validate();
        }
        if (arrayLine[0] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes96.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes96);
            validate();
        }
        if (arrayLine[0] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes105.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes105);
            validate();
        }
        if (arrayLine[0] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes113.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes113);
            validate();
        }
        if (arrayLine[0] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes121.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes121);
            validate();
        }
        if (arrayLine[0] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes129.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes129);
            validate();
        }
        if (arrayLine[0] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes137.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes137);
            validate();
        }
        if (arrayLine[0] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes145.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes145);
            validate();
        }
        if (arrayLine[0] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes153.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes153);
            validate();
        }
        if (arrayLine[0] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes161.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes161);
            validate();
        }
        //Reading Column 2
        if (arrayLine[1] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes2.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes2);
            validate();
        }
        if (arrayLine[1] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes10.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes10);
            validate();
        }
        if (arrayLine[1] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes18.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes18);
            validate();
        }
        if (arrayLine[1] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes26.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes26);
            validate();
        }
        if (arrayLine[1] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes34.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes34);
            validate();
        }
        if (arrayLine[1] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes42.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes42);
            validate();
        }
        if (arrayLine[1] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes50.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes50);
            validate();
        }
        if (arrayLine[1] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes58.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes58);
            validate();
        }
        if (arrayLine[1] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes66.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes66);
            validate();
        }
        if (arrayLine[1] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes74.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes74);
            validate();
        }
        if (arrayLine[1] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes82.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes82);
            validate();
        }
        if (arrayLine[1] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes90.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes90);
            validate();
        }
        if (arrayLine[1] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes98.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes98);
            validate();
        }
        if (arrayLine[1] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes106.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes106);
            validate();
        }
        if (arrayLine[1] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes114.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes114);
            validate();
        }
        if (arrayLine[1] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes122.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes122);
            validate();
        }
        if (arrayLine[1] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes130.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes130);
            validate();
        }
        if (arrayLine[1] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes138.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes138);
            validate();
        }
        if (arrayLine[1] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes146.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes146);
            validate();
        }
        if (arrayLine[1] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes154.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes154);
            validate();
        }
        if (arrayLine[1] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes162.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes162);
            validate();
        }
        //Read Column 3
        if (arrayLine[2] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes3.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes3);
            validate();
        }
        if (arrayLine[2] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes11.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes11);
            validate();
        }
        if (arrayLine[2] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes19.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes19);
            validate();
        }
        if (arrayLine[2] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes27.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes27);
            validate();
        }
        if (arrayLine[2] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes35.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes35);
            validate();
        }
        if (arrayLine[2] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes43.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes43);
            validate();
        }
        if (arrayLine[2] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes51.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes51);
            validate();
        }
        if (arrayLine[2] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes59.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes59);
            validate();
        }
        if (arrayLine[2] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes67.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes67);
            validate();
        }
        if (arrayLine[2] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes75.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes75);
            validate();
        }
        if (arrayLine[2] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes83.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes83);
            validate();
        }
        if (arrayLine[2] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes91.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes91);
            validate();
        }
        if (arrayLine[2] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes99.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes99);
            validate();
        }
        if (arrayLine[2] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes107.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes107);
            validate();
        }
        if (arrayLine[2] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes115.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes115);
            validate();
        }
        if (arrayLine[2] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes123.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes123);
            validate();
        }
        if (arrayLine[2] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes131.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes131);
            validate();
        }
        if (arrayLine[2] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes139.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes139);
            validate();
        }
        if (arrayLine[2] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes147.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes147);
            validate();
        }
        if (arrayLine[2] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes155.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane1.add(jNotes155);
            validate();
        }
        if (arrayLine[2] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes163.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes163);
            validate();
        }
        //Reading Column 4
        if (arrayLine[3] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes4.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes4);
            validate();
        }
        if (arrayLine[3] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes12.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes12);
            validate();
        }
        if (arrayLine[3] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes20.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes20);
            validate();
        }
        if (arrayLine[3] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes28.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes28);
            validate();
        }
        if (arrayLine[3] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes36.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes36);
            validate();
        }
        if (arrayLine[3] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes44.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes44);
            validate();
        }
        if (arrayLine[3] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes52.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes52);
            validate();
        }
        if (arrayLine[3] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes60.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes60);
            validate();
        }
        if (arrayLine[3] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes68.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes68);
            validate();
        }
        if (arrayLine[3] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes76.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes76);
            validate();
        }
        if (arrayLine[3] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes84.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes84);
            validate();
        }
        if (arrayLine[3] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes92.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes92);
            validate();
        }
        if (arrayLine[3] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes100.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes100);
            validate();
        }
        if (arrayLine[3] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes108.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes108);
            validate();
        }
        if (arrayLine[3] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes116.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes116);
            validate();
        }
        if (arrayLine[3] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes124.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes124);
            validate();
        }
        if (arrayLine[3] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes132.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes132);
            validate();
        }
        if (arrayLine[3] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes140.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes140);
            validate();
        }
        if (arrayLine[3] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes148.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes148);
            validate();
        }
        if (arrayLine[3] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes156.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes156);
            validate();
        }
        if (arrayLine[3] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes164.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes164);
            validate();
        }
        //Column 5
        if (arrayLine[4] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes5.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes5);
            validate();
        }
        if (arrayLine[4] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes13.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes13);
            validate();
        }
        if (arrayLine[4] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes21.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes21);
            validate();
        }
        if (arrayLine[4] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes29.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes29);
            validate();
        }
        if (arrayLine[4] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes37.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes37);
            validate();
        }
        if (arrayLine[4] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes45.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes45);
            validate();
        }
        if (arrayLine[4] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes53.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes53);
            validate();
        }
        if (arrayLine[4] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes61.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes61);
            validate();
        }
        if (arrayLine[4] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes69.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes69);
            validate();
        }
        if (arrayLine[4] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes77.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes77);
            validate();
        }
        if (arrayLine[4] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes85.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes85);
            validate();
        }
        if (arrayLine[4] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes93.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes93);
            validate();
        }
        if (arrayLine[4] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes101.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes101);
            validate();
        }
        if (arrayLine[4] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes109.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes109);
            validate();
        }
        if (arrayLine[4] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes117.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes117);
            validate();
        }
        if (arrayLine[4] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes125.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes125);
            validate();
        }
        if (arrayLine[4] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes133.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes133);
            validate();
        }
        if (arrayLine[4] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes141.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes141);
            validate();
        }
        if (arrayLine[4] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes149.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes149);
            validate();
        }
        if (arrayLine[4] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes157.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes157);
            validate();
        }
        if (arrayLine[4] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes165.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes165);
            validate();
        }
        //Reading Column 6
        if (arrayLine[5] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes6.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes6);
            validate();
        }
        if (arrayLine[5] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes14.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes14);
            validate();
        }
        if (arrayLine[5] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes22.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes22);
            validate();
        }
        if (arrayLine[5] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes30.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes30);
            validate();
        }
        if (arrayLine[5] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes38.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes38);
            validate();
        }
        if (arrayLine[5] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes46.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes46);
            validate();
        }
        if (arrayLine[5] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes54.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes54);
            validate();
        }
        if (arrayLine[5] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes62.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes62);
            validate();
        }
        if (arrayLine[5] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes70.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes70);
            validate();
        }
        if (arrayLine[5] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes78.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes78);
            validate();
        }
        if (arrayLine[5] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes86.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes86);
            validate();
        }
        if (arrayLine[5] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes94.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes94);
            validate();
        }
        if (arrayLine[5] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes102.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes102);
            validate();
        }
        if (arrayLine[5] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes110.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes110);
            validate();
        }
        if (arrayLine[5] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes118.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes118);
            validate();
        }
        if (arrayLine[5] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes126.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes126);
            validate();
        }
        if (arrayLine[5] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes134.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes134);
            validate();
        }
        if (arrayLine[5] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes142.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes142);
            validate();
        }
        if (arrayLine[5] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes150.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes150);
            validate();
        }
        if (arrayLine[5] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes158.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes158);
            validate();
        }
        if (arrayLine[5] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes166.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes166);
            validate();
        }
        //Reading Column 7
        if (arrayLine[6] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes7.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes7);
            validate();
        }
        if (arrayLine[6] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes15.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes15);
            validate();
        }
        if (arrayLine[6] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes23.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes23);
            validate();
        }
        if (arrayLine[6] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes31.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes31);
            validate();
        }
        if (arrayLine[6] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes39.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes39);
            validate();
        }
        if (arrayLine[6] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes47.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes47);
            validate();
        }
        if (arrayLine[6] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes55.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes55);
            validate();
        }
        if (arrayLine[6] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes63.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes63);
            validate();
        }
        if (arrayLine[6] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes71.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes71);
            validate();
        }
        if (arrayLine[6] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes79.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes79);
            validate();
        }
        if (arrayLine[6] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes87.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes87);
            validate();
        }
        if (arrayLine[6] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes95.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes95);
            validate();
        }
        if (arrayLine[6] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes103.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes103);
            validate();
        }
        if (arrayLine[6] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes111.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes111);
            validate();
        }
        if (arrayLine[6] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes119.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes119);
            validate();
        }
        if (arrayLine[6] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes127.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes127);
            validate();
        }
        if (arrayLine[6] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes135.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes135);
            validate();
        }
        if (arrayLine[6] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes143.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes143);
            validate();
        }
        if (arrayLine[6] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes151.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes151);
            validate();
        }
        if (arrayLine[6] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes159.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes159);
            validate();
        }
        if (arrayLine[6] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes167.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes167);
            validate();
        }
        //Reading Column 8
        if (arrayLine[7] == "Elow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes8.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes8);
            validate();
        }
        if (arrayLine[7] == "Flow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes16.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes16);
            validate();
        }
        if (arrayLine[7] == "Glow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes24.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes24);
            validate();
        }
        if (arrayLine[7] == "Alow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes32.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes32);
            validate();
        }
        if (arrayLine[7] == "Blow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes40.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes40);
            validate();
        }
        if (arrayLine[7] == "Clow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes48.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes48);
            validate();
        }
        if (arrayLine[7] == "Dlow"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes56.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes56);
            validate();
        }
        if (arrayLine[7] == "Emid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes64.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes64);
            validate();
        }
        if (arrayLine[7] == "Fmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes72.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes72);
            validate();
        }
        if (arrayLine[7] == "Gmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes80.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes80);
            validate();
        }
        if (arrayLine[7] == "Amid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes88.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes88);
            validate();
        }
        if (arrayLine[7] == "Bmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes96.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes96);
            validate();
        }
        if (arrayLine[7] == "Cmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes104.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes104);
            validate();
        }
        if (arrayLine[7] == "Dmid"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes112.setIcon(new javax.swing.ImageIcon(low));
            jLayeredPane3.add(jNotes112);
            validate();
        }
        if (arrayLine[7] == "ehigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes120.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes120);
            validate();
        }
        if (arrayLine[7] == "fhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes128.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes128);
            validate();
        }
        if (arrayLine[7] == "ghigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes136.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes136);
            validate();
        }
        if (arrayLine[7] == "ahigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes144.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes144);
            validate();
        }
        if (arrayLine[7] == "bhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes152.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes152);
            validate();
        }
        if (arrayLine[7] == "chigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes160.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes160);
            validate();
        }
        if (arrayLine[7] == "dhigh"){ //Checks if the array value is equal to a specific note, executes if true
            //Print the corresponding note on the corresponding value i.e, print quarter note image on the
            //Print the image on column 1 label, string E
            jNotes168.setIcon(new javax.swing.ImageIcon(high));
            jLayeredPane3.add(jNotes168);
            validate();
        }

    }

    private void jTabs21ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton generateButton1;
    private javax.swing.JLabel instructLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jImagelabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel jNotes1;
    private javax.swing.JLabel jNotes10;
    private javax.swing.JLabel jNotes100;
    private javax.swing.JLabel jNotes101;
    private javax.swing.JLabel jNotes102;
    private javax.swing.JLabel jNotes103;
    private javax.swing.JLabel jNotes104;
    private javax.swing.JLabel jNotes105;
    private javax.swing.JLabel jNotes106;
    private javax.swing.JLabel jNotes107;
    private javax.swing.JLabel jNotes108;
    private javax.swing.JLabel jNotes109;
    private javax.swing.JLabel jNotes11;
    private javax.swing.JLabel jNotes110;
    private javax.swing.JLabel jNotes111;
    private javax.swing.JLabel jNotes112;
    private javax.swing.JLabel jNotes113;
    private javax.swing.JLabel jNotes114;
    private javax.swing.JLabel jNotes115;
    private javax.swing.JLabel jNotes116;
    private javax.swing.JLabel jNotes117;
    private javax.swing.JLabel jNotes118;
    private javax.swing.JLabel jNotes119;
    private javax.swing.JLabel jNotes12;
    private javax.swing.JLabel jNotes120;
    private javax.swing.JLabel jNotes121;
    private javax.swing.JLabel jNotes122;
    private javax.swing.JLabel jNotes123;
    private javax.swing.JLabel jNotes124;
    private javax.swing.JLabel jNotes125;
    private javax.swing.JLabel jNotes126;
    private javax.swing.JLabel jNotes127;
    private javax.swing.JLabel jNotes128;
    private javax.swing.JLabel jNotes129;
    private javax.swing.JLabel jNotes13;
    private javax.swing.JLabel jNotes130;
    private javax.swing.JLabel jNotes131;
    private javax.swing.JLabel jNotes132;
    private javax.swing.JLabel jNotes133;
    private javax.swing.JLabel jNotes134;
    private javax.swing.JLabel jNotes135;
    private javax.swing.JLabel jNotes136;
    private javax.swing.JLabel jNotes137;
    private javax.swing.JLabel jNotes138;
    private javax.swing.JLabel jNotes139;
    private javax.swing.JLabel jNotes14;
    private javax.swing.JLabel jNotes140;
    private javax.swing.JLabel jNotes141;
    private javax.swing.JLabel jNotes142;
    private javax.swing.JLabel jNotes143;
    private javax.swing.JLabel jNotes144;
    private javax.swing.JLabel jNotes145;
    private javax.swing.JLabel jNotes146;
    private javax.swing.JLabel jNotes147;
    private javax.swing.JLabel jNotes148;
    private javax.swing.JLabel jNotes149;
    private javax.swing.JLabel jNotes15;
    private javax.swing.JLabel jNotes150;
    private javax.swing.JLabel jNotes151;
    private javax.swing.JLabel jNotes152;
    private javax.swing.JLabel jNotes153;
    private javax.swing.JLabel jNotes154;
    private javax.swing.JLabel jNotes155;
    private javax.swing.JLabel jNotes156;
    private javax.swing.JLabel jNotes157;
    private javax.swing.JLabel jNotes158;
    private javax.swing.JLabel jNotes159;
    private javax.swing.JLabel jNotes16;
    private javax.swing.JLabel jNotes160;
    private javax.swing.JLabel jNotes161;
    private javax.swing.JLabel jNotes162;
    private javax.swing.JLabel jNotes163;
    private javax.swing.JLabel jNotes164;
    private javax.swing.JLabel jNotes165;
    private javax.swing.JLabel jNotes166;
    private javax.swing.JLabel jNotes167;
    private javax.swing.JLabel jNotes168;
    private javax.swing.JLabel jNotes169;
    private javax.swing.JLabel jNotes17;
    private javax.swing.JLabel jNotes18;
    private javax.swing.JLabel jNotes19;
    private javax.swing.JLabel jNotes2;
    private javax.swing.JLabel jNotes20;
    private javax.swing.JLabel jNotes21;
    private javax.swing.JLabel jNotes22;
    private javax.swing.JLabel jNotes23;
    private javax.swing.JLabel jNotes24;
    private javax.swing.JLabel jNotes25;
    private javax.swing.JLabel jNotes26;
    private javax.swing.JLabel jNotes27;
    private javax.swing.JLabel jNotes28;
    private javax.swing.JLabel jNotes29;
    private javax.swing.JLabel jNotes3;
    private javax.swing.JLabel jNotes30;
    private javax.swing.JLabel jNotes31;
    private javax.swing.JLabel jNotes32;
    private javax.swing.JLabel jNotes33;
    private javax.swing.JLabel jNotes34;
    private javax.swing.JLabel jNotes35;
    private javax.swing.JLabel jNotes36;
    private javax.swing.JLabel jNotes37;
    private javax.swing.JLabel jNotes38;
    private javax.swing.JLabel jNotes39;
    private javax.swing.JLabel jNotes4;
    private javax.swing.JLabel jNotes40;
    private javax.swing.JLabel jNotes41;
    private javax.swing.JLabel jNotes42;
    private javax.swing.JLabel jNotes43;
    private javax.swing.JLabel jNotes44;
    private javax.swing.JLabel jNotes45;
    private javax.swing.JLabel jNotes46;
    private javax.swing.JLabel jNotes47;
    private javax.swing.JLabel jNotes48;
    private javax.swing.JLabel jNotes49;
    private javax.swing.JLabel jNotes5;
    private javax.swing.JLabel jNotes50;
    private javax.swing.JLabel jNotes51;
    private javax.swing.JLabel jNotes52;
    private javax.swing.JLabel jNotes53;
    private javax.swing.JLabel jNotes54;
    private javax.swing.JLabel jNotes55;
    private javax.swing.JLabel jNotes56;
    private javax.swing.JLabel jNotes57;
    private javax.swing.JLabel jNotes58;
    private javax.swing.JLabel jNotes59;
    private javax.swing.JLabel jNotes6;
    private javax.swing.JLabel jNotes60;
    private javax.swing.JLabel jNotes61;
    private javax.swing.JLabel jNotes62;
    private javax.swing.JLabel jNotes63;
    private javax.swing.JLabel jNotes64;
    private javax.swing.JLabel jNotes65;
    private javax.swing.JLabel jNotes66;
    private javax.swing.JLabel jNotes67;
    private javax.swing.JLabel jNotes68;
    private javax.swing.JLabel jNotes69;
    private javax.swing.JLabel jNotes7;
    private javax.swing.JLabel jNotes70;
    private javax.swing.JLabel jNotes71;
    private javax.swing.JLabel jNotes72;
    private javax.swing.JLabel jNotes73;
    private javax.swing.JLabel jNotes74;
    private javax.swing.JLabel jNotes75;
    private javax.swing.JLabel jNotes76;
    private javax.swing.JLabel jNotes77;
    private javax.swing.JLabel jNotes78;
    private javax.swing.JLabel jNotes79;
    private javax.swing.JLabel jNotes8;
    private javax.swing.JLabel jNotes80;
    private javax.swing.JLabel jNotes81;
    private javax.swing.JLabel jNotes82;
    private javax.swing.JLabel jNotes83;
    private javax.swing.JLabel jNotes84;
    private javax.swing.JLabel jNotes85;
    private javax.swing.JLabel jNotes86;
    private javax.swing.JLabel jNotes87;
    private javax.swing.JLabel jNotes88;
    private javax.swing.JLabel jNotes89;
    private javax.swing.JLabel jNotes9;
    private javax.swing.JLabel jNotes90;
    private javax.swing.JLabel jNotes91;
    private javax.swing.JLabel jNotes92;
    private javax.swing.JLabel jNotes93;
    private javax.swing.JLabel jNotes94;
    private javax.swing.JLabel jNotes95;
    private javax.swing.JLabel jNotes96;
    private javax.swing.JLabel jNotes98;
    private javax.swing.JLabel jNotes99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTabs1;
    private javax.swing.JTextField jTabs10;
    private javax.swing.JTextField jTabs11;
    private javax.swing.JTextField jTabs12;
    private javax.swing.JTextField jTabs13;
    private javax.swing.JTextField jTabs14;
    private javax.swing.JTextField jTabs15;
    private javax.swing.JTextField jTabs16;
    private javax.swing.JTextField jTabs17;
    private javax.swing.JTextField jTabs18;
    private javax.swing.JTextField jTabs19;
    private javax.swing.JTextField jTabs2;
    private javax.swing.JTextField jTabs20;
    private javax.swing.JTextField jTabs21;
    private javax.swing.JTextField jTabs22;
    private javax.swing.JTextField jTabs23;
    private javax.swing.JTextField jTabs24;
    private javax.swing.JTextField jTabs25;
    private javax.swing.JTextField jTabs26;
    private javax.swing.JTextField jTabs27;
    private javax.swing.JTextField jTabs28;
    private javax.swing.JTextField jTabs29;
    private javax.swing.JTextField jTabs3;
    private javax.swing.JTextField jTabs30;
    private javax.swing.JTextField jTabs31;
    private javax.swing.JTextField jTabs32;
    private javax.swing.JTextField jTabs33;
    private javax.swing.JTextField jTabs34;
    private javax.swing.JTextField jTabs35;
    private javax.swing.JTextField jTabs36;
    private javax.swing.JTextField jTabs37;
    private javax.swing.JTextField jTabs38;
    private javax.swing.JTextField jTabs39;
    private javax.swing.JTextField jTabs4;
    private javax.swing.JTextField jTabs40;
    private javax.swing.JTextField jTabs41;
    private javax.swing.JTextField jTabs42;
    private javax.swing.JTextField jTabs43;
    private javax.swing.JTextField jTabs44;
    private javax.swing.JTextField jTabs45;
    private javax.swing.JTextField jTabs46;
    private javax.swing.JTextField jTabs47;
    private javax.swing.JTextField jTabs48;
    private javax.swing.JTextField jTabs5;
    private javax.swing.JTextField jTabs6;
    private javax.swing.JTextField jTabs65;
    private javax.swing.JTextField jTabs66;
    private javax.swing.JTextField jTabs67;
    private javax.swing.JTextField jTabs68;
    private javax.swing.JTextField jTabs69;
    private javax.swing.JTextField jTabs7;
    private javax.swing.JTextField jTabs70;
    private javax.swing.JTextField jTabs71;
    private javax.swing.JTextField jTabs72;
    private javax.swing.JTextField jTabs8;
    private javax.swing.JTextField jTabs9;
    // End of variables declaration
}
