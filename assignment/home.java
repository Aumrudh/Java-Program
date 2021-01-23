
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**This program has login form . It has sign in and sign up.
 * @since 2020-04-08
 * @author Aumrudh Lal Kumar TJ
 */
public class home extends javax.swing.JFrame {
    public home() {
        setPreferredSize(new Dimension(550, 400)); 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        signup = new javax.swing.JButton();
        signin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(signup)
                .addGap(51, 51, 51)
                .addComponent(signin)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup)
                    .addComponent(signin))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        this.setVisible(false);
        new signup().setVisible(true);
    }                                      

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        this.setVisible(false);
        new signin().setVisible(true);
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                new home().setVisible(true);
            }
    // Variables declaration - do not modify                     
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    // End of variables declaration                   
}






class signin extends javax.swing.JFrame {

    /**
     * Creates new form signin
     */
    public signin() {
        setPreferredSize(new Dimension(450, 300)); 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        userlabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        usernametf = new javax.swing.JTextField();
        signin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userlabel.setText("Username");

        passlabel.setText("Password");

        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(passlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passfield, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(usernametf))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
            String user=usernametf.getText();
            String pass;
            pass = passfield.getText();
            if(user.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Username ","Alert",JOptionPane.WARNING_MESSAGE);
                }
             
             if(pass.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
             try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Jeyakumar28");
            Statement smt=conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT password FROM login Where username='"+user+"'");            
            if(rs.next()){
                if(pass.equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Password","Login Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                    JOptionPane.showMessageDialog(null,"Username not found","Login Error",JOptionPane.ERROR_MESSAGE);
                }
             }
            catch(Exception e1){
                System.out.print(e1);
            }
    }                                      
    public static void main(String args[]) {
                new signin().setVisible(true);
            }

    // Variables declaration - do not modify                     
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel passlabel;
    private javax.swing.JButton signin;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField usernametf;
    // End of variables declaration                   
}














class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        setPreferredSize(new Dimension(500,400));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        username = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namet = new javax.swing.JTextField();
        usert = new javax.swing.JTextField();
        passt = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        username.setText("Username");
        getContentPane().add(username);
        username.setBounds(69, 130, 118, 35);

        namel.setText("Name");
        getContentPane().add(namel);
        namel.setBounds(69, 74, 107, 38);

        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(69, 183, 94, 40);
        getContentPane().add(namet);
        namet.setBounds(181, 74, 120, 22);

        usert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertActionPerformed(evt);
            }
        });
        getContentPane().add(usert);
        usert.setBounds(180, 140, 120, 22);
        getContentPane().add(passt);
        passt.setBounds(181, 192, 120, 22);

        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup);
        signup.setBounds(329, 260, 90, 40);

        pack();
    }// </editor-fold>                        

    private void usertActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {                                       
            String name=namet.getText();
            String user=usert.getText();
            String pass = passt.getText();
            if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Username ","Alert",JOptionPane.WARNING_MESSAGE);
                }
             if(user.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
             if(pass.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Jeyakumar28");
                Statement smt=conn.createStatement();
                Statement smt1=conn.createStatement();
                ResultSet rs=smt.executeQuery("SELECT * FROM login");            
                if(rs.next()){
                    if(name.equals(rs.getString("name"))){
                        JOptionPane.showMessageDialog(null,"Name already exist ","Error",JOptionPane.ERROR_MESSAGE);
                    }   
                }                
                int tt=smt1.executeUpdate("Insert into login values('"+user+"','"+pass+"','"+name+"')");
                   if(tt==1){ 
                        JOptionPane.showMessageDialog(null,user+" Register successful");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Enter Password ","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                    namet.setText("");
                    usert.setText("");
                    passt.setText("");
                            
            }                                            
            catch(Exception e1){
                System.out.print(e1);
            }  
    }                                      

    public static void main(String args[]) {        
                new signup().setVisible(true);
            }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namel;
    private javax.swing.JTextField namet;
    private javax.swing.JPasswordField passt;
    private javax.swing.JButton signup;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usert;
    // End of variables declaration                   
}
