import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author students
 */
public class MorseToEnglish extends javax.swing.JFrame {

    /**
     * Creates new form MorseToEnglish
     */
    
     Synthesizer synthesizer=null;
    public MorseToEnglish() {
        initComponents();
        morseTextArea1.setText("");
        try{
         // set property as Kevin Dictionary
            System.setProperty("freetts.voices",
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory"); 
                 
            // Register Engine
            Central.registerEngineCentral
                ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
 
            // Create a Synthesizer
             synthesizer =                                         
                Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));     
     
            // Allocate synthesizer
            synthesizer.allocate();        
             
            // Resume Synthesizer
            synthesizer.resume();  
        }
        catch(Exception e)
        {
            System.out.println("Something wrong in Speech Part");
        }
                
                
             
    }
    
    public MorseToEnglish(String s) {
        initComponents();
        morseTextArea1.setText(s);
           try{
         // set property as Kevin Dictionary
            System.setProperty("freetts.voices",
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory"); 
                 
            // Register Engine
            Central.registerEngineCentral
                ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
 
            // Create a Synthesizer
           synthesizer =                                         
                Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));     
     
            // Allocate synthesizer
            synthesizer.allocate();        
             
            // Resume Synthesizer
            synthesizer.resume();  
        }
        catch(Exception e)
        {
            System.out.println("Something wrong in Speech Part");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        englishTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        morseTextArea1 = new javax.swing.JTextArea();
        ConvertMorse = new javax.swing.JButton();
        Speak = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        morseTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Enter Morse Code");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 162, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" English Meaning IS Here");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 20, 223, 25);

        englishTextArea.setColumns(20);
        englishTextArea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        englishTextArea.setRows(5);
        jScrollPane2.setViewportView(englishTextArea);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(310, 60, 223, 283);

        morseTextArea1.setColumns(20);
        morseTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        morseTextArea1.setRows(5);
        jScrollPane3.setViewportView(morseTextArea1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(30, 60, 223, 283);

        ConvertMorse.setBackground(new java.awt.Color(255, 255, 0));
        ConvertMorse.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        ConvertMorse.setForeground(new java.awt.Color(255, 102, 51));
        ConvertMorse.setText("Convert");
        ConvertMorse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertMorseActionPerformed(evt);
            }
        });
        jPanel1.add(ConvertMorse);
        ConvertMorse.setBounds(240, 370, 90, 33);

        Speak.setBackground(new java.awt.Color(255, 255, 0));
        Speak.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Speak.setForeground(new java.awt.Color(255, 102, 51));
        Speak.setText("speak");
        Speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakActionPerformed(evt);
            }
        });
        jPanel1.add(Speak);
        Speak.setBounds(410, 370, 67, 33);

        morseTextArea2.setColumns(20);
        morseTextArea2.setRows(5);
        jScrollPane4.setViewportView(morseTextArea2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(30, 60, 223, 283);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 370, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConvertMorseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertMorseActionPerformed
        // TODO add your handling code here:

        String morse = (String) morseTextArea1.getText();
       

        Scanner sc = new Scanner(System.in);
        String A[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
        String M[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "|"};

        HashMap<String, String> h = new HashMap<>();
        for (int i = 0; i < M.length; i++) {
            h.put(M[i], A[i]);
        }
        String s[] = morse.split(" ");
        StringBuffer br = new StringBuffer("");
        for (String item : s) {
            
            br.append(h.get(item));
        }
        if(br.toString().contains("null")) JOptionPane.showMessageDialog(null, "You had entered wrong string ! ");
            else
        englishTextArea.setText(br.toString());

    }//GEN-LAST:event_ConvertMorseActionPerformed

    private void SpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakActionPerformed
        // TODO add your handling code here:
        //my Speak Button Enter Speech Sysntesizer here
        String voice=(String)englishTextArea.getText();
   try
        {
           
            // speaks the given text until queue is empty.
            synthesizer.speakPlainText(voice, null);         
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
             
            // Deallocate the Synthesizer.
           // synthesizer.deallocate();                                 
        } 
 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        

    }//GEN-LAST:event_SpeakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    image img1 = new image();

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
            java.util.logging.Logger.getLogger(MorseToEnglish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MorseToEnglish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MorseToEnglish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MorseToEnglish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MorseToEnglish().setVisible(true);
              
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConvertMorse;
    private javax.swing.JButton Speak;
    private javax.swing.JTextArea englishTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextArea morseTextArea1;
    private javax.swing.JTextArea morseTextArea2;
    // End of variables declaration//GEN-END:variables
}
