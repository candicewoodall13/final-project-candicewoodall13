
import java.awt.Dialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candice
 */
public class LeagueStatsTracker extends javax.swing.JFrame {

    /**
     * Creates new form LeagueStatsTracker
     */
    public LeagueStatsTracker() {
        initComponents();
    }

        //initialize constants
        int win=2;
        int tie= 1;
        int loss= 0;
        int Canadiens=0;
        int Bruins=1;
        int Leafs=2;
        int Rangers=3;
        
        //initialize array of teams
        int[][] Standings = new int[][]
        {
        { Canadiens, 0, 0, 0, 0, 0},
        { Bruins, 0, 0, 0, 0, 0},
        { Leafs, 0, 0, 0, 0, 0},
        { Rangers, 0, 0, 0, 0, 0}
        };           
    
        //create a copy of Standings that we can use to sort and display
        int[][] DisplayStandings= Standings;
        
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblteam0 = new javax.swing.JLabel();
        lblteam1 = new javax.swing.JLabel();
        lblteam2 = new javax.swing.JLabel();
        lblteam3 = new javax.swing.JLabel();
        lblgp0 = new javax.swing.JLabel();
        lblgp1 = new javax.swing.JLabel();
        lblgp2 = new javax.swing.JLabel();
        lblgp3 = new javax.swing.JLabel();
        lblw0 = new javax.swing.JLabel();
        lblw1 = new javax.swing.JLabel();
        lblw2 = new javax.swing.JLabel();
        lblw3 = new javax.swing.JLabel();
        lbll0 = new javax.swing.JLabel();
        lbll1 = new javax.swing.JLabel();
        lbll2 = new javax.swing.JLabel();
        lbll3 = new javax.swing.JLabel();
        lblt0 = new javax.swing.JLabel();
        lblt1 = new javax.swing.JLabel();
        lblt2 = new javax.swing.JLabel();
        lblt3 = new javax.swing.JLabel();
        lblpts0 = new javax.swing.JLabel();
        lblpts1 = new javax.swing.JLabel();
        lblpts2 = new javax.swing.JLabel();
        lblpts3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Team 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 114, -1, -1));

        jLabel2.setText("Team 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 137, -1, -1));

        jLabel3.setText("Score:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 114, -1, -1));

        jLabel4.setText("Score:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 134, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 111, 33, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 131, 33, -1));

        jButton1.setText("Update Standings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 191, 185, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("    STANDINGS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 225, 97, 29));

        jButton2.setText("Clear Scores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 191, -1, -1));

        jLabel6.setText("1st Place");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 300, -1, -1));

        jLabel7.setText("2nd Place");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 348, -1, -1));

        jLabel8.setText("3rd Place");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 389, -1, -1));

        jLabel9.setText("4th Place");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 430, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Canadiens", "Bruins", "Leafs", "Rangers" }));
        jComboBox1.setName("cmbTeam1"); // NOI18N
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 111, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Canadiens", "Bruins", "Leafs", "Rangers" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 134, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Team");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 258, 34, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("GP");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 258, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("W");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 258, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("T");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 258, 16, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("L");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 258, 11, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Pts");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 258, -1, -1));

        lblteam0.setText("Canadiens");
        getContentPane().add(lblteam0, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 300, -1, -1));

        lblteam1.setText("Bruins");
        getContentPane().add(lblteam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 348, -1, -1));

        lblteam2.setText("Leafs");
        getContentPane().add(lblteam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 389, -1, -1));

        lblteam3.setText("Rangers");
        getContentPane().add(lblteam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 430, -1, -1));

        lblgp0.setText("0");
        getContentPane().add(lblgp0, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 15, -1));

        lblgp1.setText("0");
        getContentPane().add(lblgp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 348, 15, -1));

        lblgp2.setText("0");
        getContentPane().add(lblgp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 389, 16, -1));

        lblgp3.setText("0");
        getContentPane().add(lblgp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 20, -1));

        lblw0.setText("0");
        getContentPane().add(lblw0, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 300, 20, -1));

        lblw1.setText("0");
        getContentPane().add(lblw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 348, 20, -1));

        lblw2.setText("0");
        getContentPane().add(lblw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 389, 20, -1));

        lblw3.setText("0");
        getContentPane().add(lblw3, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 430, 20, -1));

        lbll0.setText("0");
        getContentPane().add(lbll0, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 300, 20, -1));

        lbll1.setText("0");
        getContentPane().add(lbll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 348, 20, -1));

        lbll2.setText("0");
        getContentPane().add(lbll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 389, 20, -1));

        lbll3.setText("0");
        getContentPane().add(lbll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 430, 20, -1));

        lblt0.setText("0");
        getContentPane().add(lblt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 300, 20, -1));

        lblt1.setText("0");
        getContentPane().add(lblt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 348, 19, -1));

        lblt2.setText("0");
        getContentPane().add(lblt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 389, 20, -1));

        lblt3.setText("0");
        getContentPane().add(lblt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 430, 20, -1));

        lblpts0.setText("0");
        getContentPane().add(lblpts0, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 20, -1));

        lblpts1.setText("0");
        getContentPane().add(lblpts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 348, 20, -1));

        lblpts2.setText("0");
        getContentPane().add(lblpts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 389, 20, -1));

        lblpts3.setText("0");
        getContentPane().add(lblpts3, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 430, 20, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nhl logo.jpeg"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 10, 120, 80));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel17.setText("League Stats Tracker");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, 256, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //UPDATE STANDINGS
        
        //initialize variables
        String team1result="";
        String team2result="";
        int team1=0;
        int team2=0;
        int score1=0;
        int score2=0;
        
        //get team values
        team1= this.jComboBox1.getSelectedIndex();
        team2= this.jComboBox2.getSelectedIndex();
        
         //convert string to int to get scores from input in textboxes
        score1= Integer.parseInt(this.jTextField3.getText());
        score2= Integer.parseInt(this.jTextField4.getText());
        //call getResult method to determine W/L or T for team
        team1result = getResult(score1, score2);
        team2result = getResult(score2, score1);
        
        
        //call UpdateStandings method for each team
        UpdateStandings(team1, team1result);
        UpdateStandings(team2, team2result);
        
        //make copy of updated standings to sort and display
        DisplayStandings= Standings.clone();
        
        //sort DisplayStandings
        //call sort method
        Sort();

        
        //Show DisplayStandings
        //call showstandings method
        ShowStandings();
        //
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        jTextField3.setText("");
        jTextField4.setText("");
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //METHODS
    
    //determines result (whether team got a W,L or T.)
    public String getResult(int s1, int s2){
        //create returning variable
        String result= "";
        
        if(s1<s2){
            result= "L";
        }
        if(s1==s2){
            result="T";
        }
        if(s1>s2){
            result= "W";
        }
        
        
        return result;
    }
    
    public void UpdateStandings(int teamnum, String result){
        
        //update standngs for passed in team
        
        //update games played
        Standings[teamnum][1]++;
        
        //based on result update appropriate column and pts
        if(result=="W"){
            Standings[teamnum][2]++;
            Standings[teamnum][5]= Standings[teamnum][5]+win;
        }
        if(result=="L"){
            Standings[teamnum][3]++;
            Standings[teamnum][5]= Standings[teamnum][5]+loss;
        }
        if(result=="T"){
            Standings[teamnum][4]++;
            Standings[teamnum][5]= Standings[teamnum][5]+tie;
        }
        
        
        
        
        
        
        return;
    }
    
    
    public void Swap(int row1, int row2){
        //create temporary array for swapping
        int[] temp;
        //swap all rows
        temp= DisplayStandings[row1];
        DisplayStandings[row1]= DisplayStandings[row2];
        DisplayStandings[row2]= temp;
                
        
        return;
    }
    
    
    public void Sort(){
        
        boolean sorted =true;
        
        do //keep sorting the array until no more swaps are needed
        {
            sorted=true;
            for(int i=0; i<=2; i++){
                
            
                if(DisplayStandings[i][5]<DisplayStandings[i+1][5]){
                    Swap(i, i+1);
                    sorted=false;
                }
            }
            
          
        }while(sorted==false);
        
        return;
    }
    
    public void ShowStandings(){
        
        //go through the displaystandings array and show values on GUI
        //can't use loop cause all controls have seperate names
        
        lblteam0.setText(GetTeamName(DisplayStandings[0][0]));
        lblteam1.setText(GetTeamName(DisplayStandings[1][0]));
        lblteam2.setText(GetTeamName(DisplayStandings[2][0]));
        lblteam3.setText(GetTeamName(DisplayStandings[3][0]));
 
        //convert int to string (GP)
        lblgp0.setText(Integer.toString(DisplayStandings[0][1]));
        lblgp1.setText(Integer.toString(DisplayStandings[1][1]));
        lblgp2.setText(Integer.toString(DisplayStandings[2][1]));
        lblgp3.setText(Integer.toString(DisplayStandings[3][1]));
        
        //convert int to string (W)
        lblw0.setText(Integer.toString(DisplayStandings[0][2]));
        lblw1.setText(Integer.toString(DisplayStandings[1][2]));
        lblw2.setText(Integer.toString(DisplayStandings[2][2]));
        lblw3.setText(Integer.toString(DisplayStandings[3][2]));
        
        //convert int to string (L)
        lbll0.setText(Integer.toString(DisplayStandings[0][3]));
        lbll1.setText(Integer.toString(DisplayStandings[1][3]));
        lbll2.setText(Integer.toString(DisplayStandings[2][3]));
        lbll3.setText(Integer.toString(DisplayStandings[3][3]));
        
        
        
        //convert int to string (T)
        lblt0.setText(Integer.toString(DisplayStandings[0][4]));
        lblt1.setText(Integer.toString(DisplayStandings[1][4]));
        lblt2.setText(Integer.toString(DisplayStandings[2][4]));
        lblt3.setText(Integer.toString(DisplayStandings[3][4]));
        
        //convert int to string (Pts)
        lblpts0.setText(Integer.toString(DisplayStandings[0][5]));
        lblpts1.setText(Integer.toString(DisplayStandings[1][5]));
        lblpts2.setText(Integer.toString(DisplayStandings[2][5]));
        lblpts3.setText(Integer.toString(DisplayStandings[3][5]));
        
        
        return;
    }
    
    //look up team name based on array numeric value
    public String GetTeamName(int team){
        String name = "";
        
        if(team==Canadiens){name="Canadiens";}
        if(team==Bruins){name="Bruins";}
        if(team==Leafs){name="Leafs";}
        if(team==Rangers){name="Rangers";}
        
        return name;
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
            java.util.logging.Logger.getLogger(LeagueStatsTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeagueStatsTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeagueStatsTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeagueStatsTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        
            
        
        
        
        
        
        
        
        
        
       

    
  

        
        
        
        
        
        
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeagueStatsTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblgp0;
    private javax.swing.JLabel lblgp1;
    private javax.swing.JLabel lblgp2;
    private javax.swing.JLabel lblgp3;
    private javax.swing.JLabel lbll0;
    private javax.swing.JLabel lbll1;
    private javax.swing.JLabel lbll2;
    private javax.swing.JLabel lbll3;
    private javax.swing.JLabel lblpts0;
    private javax.swing.JLabel lblpts1;
    private javax.swing.JLabel lblpts2;
    private javax.swing.JLabel lblpts3;
    private javax.swing.JLabel lblt0;
    private javax.swing.JLabel lblt1;
    private javax.swing.JLabel lblt2;
    private javax.swing.JLabel lblt3;
    private javax.swing.JLabel lblteam0;
    private javax.swing.JLabel lblteam1;
    private javax.swing.JLabel lblteam2;
    private javax.swing.JLabel lblteam3;
    private javax.swing.JLabel lblw0;
    private javax.swing.JLabel lblw1;
    private javax.swing.JLabel lblw2;
    private javax.swing.JLabel lblw3;
    // End of variables declaration//GEN-END:variables
}
