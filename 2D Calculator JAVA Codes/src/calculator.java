/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhuka
 */
public class calculator extends javax.swing.JFrame {
    double answer;
    
    int circleClick;
    int triangleClick;
    int squareClick;
    int rectangleClick;
    int polygonClick;

    /**
     * Creates new form calculator
     */
    public calculator() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        radioCircle = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        circleRadiusText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        radioTriangle = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        triangleBaseText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        triangleHeightText1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        trianglesideAText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        trianglesideBText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        trianglesideCText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        radioSquare = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        squareBaseText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rectangleLengthText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rectangleBreadthText = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        radioPolygon = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        sidePolygonText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sidePolygonNumberText = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnPerimeter = new javax.swing.JButton();
        btnArea = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 24, 14));
        setForeground(java.awt.Color.black);

        display.setEditable(false);
        display.setBackground(new java.awt.Color(51, 47, 42));
        display.setColumns(20);
        display.setForeground(java.awt.Color.white);
        display.setRows(2);
        display.setTabSize(2);
        display.setAutoscrolls(false);
        jScrollPane1.setViewportView(display);

        jPanel7.setBackground(new java.awt.Color(36, 23, 9));

        jPanel1.setBackground(new java.awt.Color(135, 229, 150));

        radioCircle.setBackground(new java.awt.Color(135, 229, 150));
        buttonGroup1.add(radioCircle);
        radioCircle.setText("Circle");
        radioCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCircleActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Radius:");

        circleRadiusText.setText("type here");
        circleRadiusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleRadiusTextActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(239, 24, 24));
        jLabel12.setText("*can enter in any unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(radioCircle)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circleRadiusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCircle)
                    .addComponent(jLabel1)
                    .addComponent(circleRadiusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(236, 196, 102));

        radioTriangle.setBackground(new java.awt.Color(236, 196, 102));
        buttonGroup1.add(radioTriangle);
        radioTriangle.setText("Triangle");
        radioTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTriangleActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Base:");

        triangleBaseText.setText("type here");
        triangleBaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleBaseTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Height:");

        triangleHeightText1.setText("type here");
        triangleHeightText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleHeightText1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Side A:");

        trianglesideAText.setText("type here");
        trianglesideAText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglesideATextActionPerformed(evt);
            }
        });

        jLabel5.setText("Side B:");

        trianglesideBText.setText("type here");
        trianglesideBText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglesideBTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Side C:");

        trianglesideCText.setText("type here");
        trianglesideCText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglesideCTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radioTriangle)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(triangleBaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trianglesideAText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(triangleHeightText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trianglesideBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addComponent(trianglesideCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTriangle)
                    .addComponent(jLabel2)
                    .addComponent(triangleBaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(triangleHeightText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(trianglesideAText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(trianglesideBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(trianglesideCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(117, 179, 236));

        radioSquare.setBackground(new java.awt.Color(117, 179, 236));
        buttonGroup1.add(radioSquare);
        radioSquare.setText("Square");
        radioSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSquareActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter Base:");

        squareBaseText.setText("type here");
        squareBaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareBaseTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(radioSquare)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(squareBaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSquare)
                    .addComponent(jLabel7)
                    .addComponent(squareBaseText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(206, 180, 242));

        jRadioButton1.setBackground(new java.awt.Color(206, 180, 242));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Rectangle");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter length:");

        rectangleLengthText.setText("type here");
        rectangleLengthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleLengthTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Enter breadth:");

        rectangleBreadthText.setText("type here");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rectangleLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(rectangleBreadthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8)
                    .addComponent(rectangleLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(rectangleBreadthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(234, 174, 205));

        radioPolygon.setBackground(new java.awt.Color(234, 174, 205));
        buttonGroup1.add(radioPolygon);
        radioPolygon.setText("Polygon");
        radioPolygon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPolygonActionPerformed(evt);
            }
        });

        jLabel10.setText("Enter side:");

        sidePolygonText.setText("type here");
        sidePolygonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidePolygonTextActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(239, 24, 24));
        jLabel11.setText("*for regular polygons only!");

        jLabel13.setText("No. of sides:");

        sidePolygonNumberText.setText("type here");
        sidePolygonNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidePolygonNumberTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(radioPolygon)
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(sidePolygonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(57, 57, 57)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(sidePolygonNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPolygon)
                    .addComponent(jLabel10)
                    .addComponent(sidePolygonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(sidePolygonNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(50, 31, 12));

        btnPerimeter.setForeground(new java.awt.Color(80, 40, 40));
        btnPerimeter.setText("Calculate Perimeter");
        btnPerimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimeterActionPerformed(evt);
            }
        });

        btnArea.setText("Calculate Area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerimeter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void circleRadiusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleRadiusTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_circleRadiusTextActionPerformed

    private void radioTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTriangleActionPerformed
        // TODO add your handling code here:
       triangleClick = 1;
    }//GEN-LAST:event_radioTriangleActionPerformed

    private void triangleBaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleBaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triangleBaseTextActionPerformed

    private void triangleHeightText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleHeightText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triangleHeightText1ActionPerformed

    private void trianglesideATextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglesideATextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trianglesideATextActionPerformed

    private void trianglesideBTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglesideBTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trianglesideBTextActionPerformed

    private void trianglesideCTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglesideCTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trianglesideCTextActionPerformed

    private void radioSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSquareActionPerformed
        // TODO add your handling code here:
        squareClick=1;
    }//GEN-LAST:event_radioSquareActionPerformed

    private void squareBaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareBaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_squareBaseTextActionPerformed

    private void sidePolygonNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidePolygonNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidePolygonNumberTextActionPerformed

    private void radioCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCircleActionPerformed
        // TODO add your handling code here:
        circleClick = 1;
        
    }//GEN-LAST:event_radioCircleActionPerformed

    private void btnPerimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimeterActionPerformed
        // TODO add your handling code here:
        if (circleClick > 0) {
            double r = Double.parseDouble(String.valueOf(circleRadiusText.getText()));
            answer = 2 * 3.14159 * r;
            display.setText(String.valueOf(answer));
        }
        
        if (triangleClick > 0) {
            double a = Double.parseDouble(String.valueOf(trianglesideAText.getText()));
            double b = Double.parseDouble(String.valueOf(trianglesideBText.getText()));
            double c = Double.parseDouble(String.valueOf(trianglesideCText.getText()));
            answer = a+b+c;
            display.setText(String.valueOf(answer));
        }
        
        if (squareClick > 0) {
            double s = Double.parseDouble(String.valueOf(squareBaseText.getText()));
            answer = 4 * s;
            display.setText(String.valueOf(answer));
        }
        
        if (rectangleClick > 0) {
            double l = Double.parseDouble(String.valueOf(rectangleLengthText.getText()));
            double b = Double.parseDouble(String.valueOf(rectangleBreadthText.getText()));
            answer = l+l+b+b;
            display.setText(String.valueOf(answer));
        }
        
        if (polygonClick > 0) {
            double s = Double.parseDouble(String.valueOf(sidePolygonText.getText()));
            double n = Double.parseDouble(String.valueOf(sidePolygonNumberText.getText()));
            answer = (s*n);
            display.setText(String.valueOf(answer));
        }
        
    }//GEN-LAST:event_btnPerimeterActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        rectangleClick=1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void radioPolygonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPolygonActionPerformed
        // TODO add your handling code here:
        polygonClick=1;
    }//GEN-LAST:event_radioPolygonActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        // TODO add your handling code here:
        if (circleClick > 0) {
            double r = Double.parseDouble(String.valueOf(circleRadiusText.getText()));
            answer = 3.14159 * r * r;
            display.setText(String.valueOf(answer));
        }
        
        if (triangleClick>0){
            double b = Double.parseDouble(String.valueOf(triangleBaseText.getText()));
            double h = Double.parseDouble(String.valueOf(triangleHeightText1.getText()));
            answer = 0.5*b*h;
            display.setText(String.valueOf(answer));
        }
        
        if (squareClick > 0) {
            double s = Double.parseDouble(String.valueOf(squareBaseText.getText()));
            answer = s * s;
            display.setText(String.valueOf(answer));
        }  
        
        if (rectangleClick > 0) {
            double l = Double.parseDouble(String.valueOf(rectangleLengthText.getText()));
            double b = Double.parseDouble(String.valueOf(rectangleBreadthText.getText()));
            answer = l*b;
            display.setText(String.valueOf(answer));
        } 
        
        if (polygonClick > 0) {
            double s = Double.parseDouble(String.valueOf(sidePolygonText.getText()));
            double n = Double.parseDouble(String.valueOf(sidePolygonNumberText.getText()));
            double x = Math.tan(Math.toRadians(180/n));
            answer = (s*s*n)/(4*x);
            display.setText(String.valueOf(answer));
        }
    }//GEN-LAST:event_btnAreaActionPerformed

    private void rectangleLengthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleLengthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rectangleLengthTextActionPerformed

    private void sidePolygonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidePolygonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidePolygonTextActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnPerimeter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField circleRadiusText;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioCircle;
    private javax.swing.JRadioButton radioPolygon;
    private javax.swing.JRadioButton radioSquare;
    private javax.swing.JRadioButton radioTriangle;
    private javax.swing.JTextField rectangleBreadthText;
    private javax.swing.JTextField rectangleLengthText;
    private javax.swing.JTextField sidePolygonNumberText;
    private javax.swing.JTextField sidePolygonText;
    private javax.swing.JTextField squareBaseText;
    private javax.swing.JTextField triangleBaseText;
    private javax.swing.JTextField triangleHeightText1;
    private javax.swing.JTextField trianglesideAText;
    private javax.swing.JTextField trianglesideBText;
    private javax.swing.JTextField trianglesideCText;
    // End of variables declaration//GEN-END:variables
}
