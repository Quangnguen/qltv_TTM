/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.screens;

/**
 *
 * @author admin
 */
public class phihv extends javax.swing.JPanel {

    /**
     * Creates new form MembershipFeePanel
     */
    public phihv() {
        initComponents();
    }

    /**
     * Khởi tạo các component của giao diện
     * Code này được viết thủ công
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        
        // Main container
        mainContainer = new javax.swing.JPanel();
        
        // Left panel - Gói hội viên
        packagesPanel = new javax.swing.JPanel();
        packagesTitle = new javax.swing.JLabel();
        
        // Package cards
        basicPackage = new javax.swing.JPanel();
        basicTitle = new javax.swing.JLabel();
        basicPrice = new javax.swing.JLabel();
        basicDuration = new javax.swing.JLabel();
        basicFeatures = new javax.swing.JTextArea();
        basicButton = new javax.swing.JButton();
        
        premiumPackage = new javax.swing.JPanel();
        premiumTitle = new javax.swing.JLabel();
        premiumPrice = new javax.swing.JLabel();
        premiumDuration = new javax.swing.JLabel();
        premiumFeatures = new javax.swing.JTextArea();
        premiumButton = new javax.swing.JButton();
        premiumBadge = new javax.swing.JLabel();
        
        vipPackage = new javax.swing.JPanel();
        vipTitle = new javax.swing.JLabel();
        vipPrice = new javax.swing.JLabel();
        vipDuration = new javax.swing.JLabel();
        vipFeatures = new javax.swing.JTextArea();
        vipButton = new javax.swing.JButton();
        vipBadge = new javax.swing.JLabel();
        
        // Right panel - Thông tin hội viên và thanh toán
        infoPanel = new javax.swing.JPanel();
        infoTitle = new javax.swing.JLabel();
        memberStatusLabel = new javax.swing.JLabel();
        memberStatusField = new javax.swing.JTextField();
        expiryDateLabel = new javax.swing.JLabel();
        expiryDateField = new javax.swing.JTextField();
        selectedPackageLabel = new javax.swing.JLabel();
        selectedPackageField = new javax.swing.JTextField();
        discountLabel = new javax.swing.JLabel();
        discountField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        paymentButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 250));
        setLayout(new java.awt.BorderLayout(0, 20));

        // Title
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 28));
        titleLabel.setForeground(new java.awt.Color(45, 45, 48));
        titleLabel.setText("Phí hội viên");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 10, 40));
        add(titleLabel, java.awt.BorderLayout.NORTH);

        mainContainer.setLayout(new java.awt.BorderLayout(25, 0));
        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 30, 40));
        mainContainer.setBackground(new java.awt.Color(245, 245, 250));

        // ============ LEFT PANEL - GÓI HỘI VIÊN ============
        packagesPanel.setLayout(new java.awt.BorderLayout(0, 25));
        packagesPanel.setBackground(new java.awt.Color(245, 245, 250));

        packagesTitle.setFont(new java.awt.Font("Segoe UI", 1, 20));
        packagesTitle.setForeground(new java.awt.Color(0, 120, 215));
        packagesTitle.setText("Chọn gói hội viên");
        packagesTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        packagesPanel.add(packagesTitle, java.awt.BorderLayout.NORTH);

        javax.swing.JPanel cardsPanel = new javax.swing.JPanel();
        cardsPanel.setLayout(new java.awt.GridLayout(1, 3, 25, 0));
        cardsPanel.setBackground(new java.awt.Color(245, 245, 250));

        // Basic Package
        basicPackage.setBackground(new java.awt.Color(255, 255, 255));
        basicPackage.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200), 2),
            javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        basicPackage.setLayout(new java.awt.BorderLayout(15, 15));

        basicTitle.setFont(new java.awt.Font("Segoe UI", 1, 22));
        basicTitle.setForeground(new java.awt.Color(60, 60, 60));
        basicTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basicTitle.setText("Gói Cơ bản");

        basicPrice.setFont(new java.awt.Font("Segoe UI", 1, 28));
        basicPrice.setForeground(new java.awt.Color(0, 120, 215));
        basicPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basicPrice.setText("100,000 đ");

        basicDuration.setFont(new java.awt.Font("Segoe UI", 0, 14));
        basicDuration.setForeground(new java.awt.Color(100, 100, 100));
        basicDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basicDuration.setText("/ 3 tháng");

        basicFeatures.setFont(new java.awt.Font("Segoe UI", 0, 13));
        basicFeatures.setEditable(false);
        basicFeatures.setLineWrap(true);
        basicFeatures.setWrapStyleWord(true);
        basicFeatures.setText("• Mượn tối đa 3 sách\n• Thời gian mượn 7 ngày\n• Hỗ trợ email\n• Giảm giá 5% khi mua sách");
        basicFeatures.setBackground(new java.awt.Color(250, 250, 250));
        basicFeatures.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        basicButton.setBackground(new java.awt.Color(0, 120, 215));
        basicButton.setForeground(new java.awt.Color(255, 255, 255));
        basicButton.setText("Chọn gói");
        basicButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        basicButton.setFocusPainted(false);
        basicButton.setPreferredSize(new java.awt.Dimension(0, 45));
        basicButton.addActionListener(e -> selectPackage("Cơ bản", 100000, 5));

        // Center panel for price, duration and features
        javax.swing.JPanel basicCenterPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 10));
        basicCenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        
        // Price panel
        javax.swing.JPanel basicPricePanel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        basicPricePanel.setBackground(new java.awt.Color(255, 255, 255));
        basicPricePanel.add(basicPrice, java.awt.BorderLayout.CENTER);
        basicPricePanel.add(basicDuration, java.awt.BorderLayout.SOUTH);
        
        basicCenterPanel.add(basicPricePanel, java.awt.BorderLayout.NORTH);
        basicCenterPanel.add(new javax.swing.JScrollPane(basicFeatures), java.awt.BorderLayout.CENTER);

        // Layout for basic package card
        basicPackage.add(basicTitle, java.awt.BorderLayout.NORTH);
        basicPackage.add(basicCenterPanel, java.awt.BorderLayout.CENTER);
        basicPackage.add(basicButton, java.awt.BorderLayout.SOUTH);

        // Premium Package (Nổi bật)
        premiumPackage.setBackground(new java.awt.Color(255, 248, 220));
        premiumPackage.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 200, 0), 3),
            javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        premiumPackage.setLayout(new java.awt.BorderLayout(15, 15));

        premiumBadge.setFont(new java.awt.Font("Segoe UI", 1, 12));
        premiumBadge.setForeground(new java.awt.Color(255, 255, 255));
        premiumBadge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premiumBadge.setBackground(new java.awt.Color(255, 140, 0));
        premiumBadge.setOpaque(true);
        premiumBadge.setText("KHUYẾN MÃI");
        premiumBadge.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));

        premiumTitle.setFont(new java.awt.Font("Segoe UI", 1, 22));
        premiumTitle.setForeground(new java.awt.Color(60, 60, 60));
        premiumTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premiumTitle.setText("Gói Cao cấp");

        premiumPrice.setFont(new java.awt.Font("Segoe UI", 1, 28));
        premiumPrice.setForeground(new java.awt.Color(255, 140, 0));
        premiumPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premiumPrice.setText("280,000 đ");

        javax.swing.JLabel premiumOldPrice = new javax.swing.JLabel("350,000 đ");
        premiumOldPrice.setFont(new java.awt.Font("Segoe UI", 0, 16));
        premiumOldPrice.setForeground(new java.awt.Color(150, 150, 150));
        premiumOldPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premiumOldPrice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        javax.swing.JPanel premiumPricePanel = new javax.swing.JPanel(new java.awt.BorderLayout(0, 5));
        premiumPricePanel.setBackground(new java.awt.Color(255, 248, 220));
        premiumPricePanel.add(premiumPrice, java.awt.BorderLayout.CENTER);
        premiumPricePanel.add(premiumOldPrice, java.awt.BorderLayout.SOUTH);

        premiumDuration.setFont(new java.awt.Font("Segoe UI", 0, 14));
        premiumDuration.setForeground(new java.awt.Color(100, 100, 100));
        premiumDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        premiumDuration.setText("/ 6 tháng (Ưu đãi 20%)");

        premiumFeatures.setFont(new java.awt.Font("Segoe UI", 0, 13));
        premiumFeatures.setEditable(false);
        premiumFeatures.setLineWrap(true);
        premiumFeatures.setWrapStyleWord(true);
        premiumFeatures.setText("• Mượn tối đa 5 sách\n• Thời gian mượn 14 ngày\n• Hỗ trợ 24/7\n• Giảm giá 10% khi mua sách\n• Đặt chỗ sách online");
        premiumFeatures.setBackground(new java.awt.Color(255, 248, 220));
        premiumFeatures.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        premiumButton.setBackground(new java.awt.Color(255, 140, 0));
        premiumButton.setForeground(new java.awt.Color(255, 255, 255));
        premiumButton.setText("Chọn gói");
        premiumButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        premiumButton.setFocusPainted(false);
        premiumButton.setPreferredSize(new java.awt.Dimension(0, 45));
        premiumButton.addActionListener(e -> selectPackage("Cao cấp", 280000, 20));

        // Top panel for badge and title
        javax.swing.JPanel premiumTopPanel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        premiumTopPanel.setBackground(new java.awt.Color(255, 248, 220));
        premiumTopPanel.add(premiumBadge, java.awt.BorderLayout.NORTH);
        premiumTopPanel.add(premiumTitle, java.awt.BorderLayout.CENTER);
        
        // Center panel for price, duration and features
        javax.swing.JPanel premiumCenterPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 10));
        premiumCenterPanel.setBackground(new java.awt.Color(255, 248, 220));
        
        // Price panel
        javax.swing.JPanel premiumPriceFullPanel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        premiumPriceFullPanel.setBackground(new java.awt.Color(255, 248, 220));
        premiumPriceFullPanel.add(premiumPricePanel, java.awt.BorderLayout.CENTER);
        premiumPriceFullPanel.add(premiumDuration, java.awt.BorderLayout.SOUTH);
        
        premiumCenterPanel.add(premiumPriceFullPanel, java.awt.BorderLayout.NORTH);
        premiumCenterPanel.add(new javax.swing.JScrollPane(premiumFeatures), java.awt.BorderLayout.CENTER);

        premiumPackage.add(premiumTopPanel, java.awt.BorderLayout.NORTH);
        premiumPackage.add(premiumCenterPanel, java.awt.BorderLayout.CENTER);
        premiumPackage.add(premiumButton, java.awt.BorderLayout.SOUTH);

        // VIP Package
        vipPackage.setBackground(new java.awt.Color(255, 255, 255));
        vipPackage.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 0, 180), 2),
            javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        vipPackage.setLayout(new java.awt.BorderLayout(15, 15));

        vipBadge.setFont(new java.awt.Font("Segoe UI", 1, 12));
        vipBadge.setForeground(new java.awt.Color(255, 255, 255));
        vipBadge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vipBadge.setBackground(new java.awt.Color(180, 0, 180));
        vipBadge.setOpaque(true);
        vipBadge.setText("VIP");
        vipBadge.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));

        vipTitle.setFont(new java.awt.Font("Segoe UI", 1, 22));
        vipTitle.setForeground(new java.awt.Color(60, 60, 60));
        vipTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vipTitle.setText("Gói VIP");

        vipPrice.setFont(new java.awt.Font("Segoe UI", 1, 28));
        vipPrice.setForeground(new java.awt.Color(180, 0, 180));
        vipPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vipPrice.setText("500,000 đ");

        vipDuration.setFont(new java.awt.Font("Segoe UI", 0, 14));
        vipDuration.setForeground(new java.awt.Color(100, 100, 100));
        vipDuration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vipDuration.setText("/ 12 tháng (Ưu đãi 30%)");

        vipFeatures.setFont(new java.awt.Font("Segoe UI", 0, 13));
        vipFeatures.setEditable(false);
        vipFeatures.setLineWrap(true);
        vipFeatures.setWrapStyleWord(true);
        vipFeatures.setText("• Mượn không giới hạn sách\n• Thời gian mượn 30 ngày\n• Hỗ trợ 24/7 ưu tiên\n• Giảm giá 15% khi mua sách\n• Đặt chỗ sách online\n• Tham gia sự kiện đặc biệt");
        vipFeatures.setBackground(new java.awt.Color(250, 250, 250));
        vipFeatures.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        vipButton.setBackground(new java.awt.Color(180, 0, 180));
        vipButton.setForeground(new java.awt.Color(255, 255, 255));
        vipButton.setText("Chọn gói");
        vipButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        vipButton.setFocusPainted(false);
        vipButton.setPreferredSize(new java.awt.Dimension(0, 45));
        vipButton.addActionListener(e -> selectPackage("VIP", 500000, 30));

        // Top panel for badge and title
        javax.swing.JPanel vipTopPanel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        vipTopPanel.setBackground(new java.awt.Color(255, 255, 255));
        vipTopPanel.add(vipBadge, java.awt.BorderLayout.NORTH);
        vipTopPanel.add(vipTitle, java.awt.BorderLayout.CENTER);
        
        // Center panel for price, duration and features
        javax.swing.JPanel vipCenterPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 10));
        vipCenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        
        // Price panel
        javax.swing.JPanel vipPricePanel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));
        vipPricePanel.setBackground(new java.awt.Color(255, 255, 255));
        vipPricePanel.add(vipPrice, java.awt.BorderLayout.CENTER);
        vipPricePanel.add(vipDuration, java.awt.BorderLayout.SOUTH);
        
        vipCenterPanel.add(vipPricePanel, java.awt.BorderLayout.NORTH);
        vipCenterPanel.add(new javax.swing.JScrollPane(vipFeatures), java.awt.BorderLayout.CENTER);

        vipPackage.add(vipTopPanel, java.awt.BorderLayout.NORTH);
        vipPackage.add(vipCenterPanel, java.awt.BorderLayout.CENTER);
        vipPackage.add(vipButton, java.awt.BorderLayout.SOUTH);

        cardsPanel.add(basicPackage);
        cardsPanel.add(premiumPackage);
        cardsPanel.add(vipPackage);

        packagesPanel.add(cardsPanel, java.awt.BorderLayout.CENTER);

        // ============ RIGHT PANEL - THÔNG TIN ============
        infoPanel.setBackground(new java.awt.Color(255, 255, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hội viên",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(60, 60, 60)),
            javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25)));
        infoPanel.setLayout(new java.awt.BorderLayout(0, 20));
        infoPanel.setPreferredSize(new java.awt.Dimension(380, 0));
        infoPanel.setMinimumSize(new java.awt.Dimension(350, 0));
        infoPanel.setMaximumSize(new java.awt.Dimension(450, Integer.MAX_VALUE));

        infoTitle.setFont(new java.awt.Font("Segoe UI", 1, 18));
        infoTitle.setForeground(new java.awt.Color(0, 120, 215));
        infoTitle.setText("Thông tin thanh toán");

        javax.swing.JPanel infoFormPanel = new javax.swing.JPanel();
        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(infoFormPanel);
        infoFormPanel.setLayout(formLayout);
        infoFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedPackageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberStatusField)
                    .addComponent(expiryDateField)
                    .addComponent(selectedPackageField)
                    .addComponent(discountField)
                    .addComponent(totalField))
                .addContainerGap())
        );

        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberStatusLabel)
                    .addComponent(memberStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryDateLabel)
                    .addComponent(expiryDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedPackageLabel)
                    .addComponent(selectedPackageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountLabel)
                    .addComponent(discountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        // Labels
        memberStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        memberStatusLabel.setText("Trạng thái:");
        expiryDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        expiryDateLabel.setText("Hết hạn:");
        selectedPackageLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        selectedPackageLabel.setText("Gói đã chọn:");
        discountLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        discountLabel.setText("Giảm giá:");
        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        totalLabel.setText("Tổng tiền:");

        // Fields
        memberStatusField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        memberStatusField.setText("Chưa có hội viên");
        memberStatusField.setEditable(false);
        expiryDateField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        expiryDateField.setText("--");
        expiryDateField.setEditable(false);
        selectedPackageField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        selectedPackageField.setEditable(false);
        discountField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        discountField.setText("0%");
        discountField.setEditable(false);
        totalField.setFont(new java.awt.Font("Segoe UI", 1, 16));
        totalField.setText("0 đ");
        totalField.setEditable(false);
        totalField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        paymentButton.setBackground(new java.awt.Color(0, 120, 215));
        paymentButton.setForeground(new java.awt.Color(255, 255, 255));
        paymentButton.setText("💳 Thanh toán");
        paymentButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        paymentButton.setFocusPainted(false);
        paymentButton.setPreferredSize(new java.awt.Dimension(0, 45));
        paymentButton.addActionListener(e -> processPayment());

        infoPanel.add(infoTitle, java.awt.BorderLayout.NORTH);
        infoPanel.add(infoFormPanel, java.awt.BorderLayout.CENTER);
        infoPanel.add(paymentButton, java.awt.BorderLayout.SOUTH);

        mainContainer.add(packagesPanel, java.awt.BorderLayout.CENTER);
        mainContainer.add(infoPanel, java.awt.BorderLayout.EAST);

        add(mainContainer, java.awt.BorderLayout.CENTER);
    }

    private void selectPackage(String packageName, int price, int discount) {
        selectedPackageField.setText(packageName);
        discountField.setText(discount + "%");
        totalField.setText(String.format("%,d đ", price));
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Đã chọn gói: " + packageName + "\nGiá: " + String.format("%,d đ", price) + "\nGiảm giá: " + discount + "%",
            "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void processPayment() {
        String selectedPackage = selectedPackageField.getText();
        if (selectedPackage.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn gói hội viên!", "Thông báo", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Chuyển đến màn hình thanh toán...", "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel packagesPanel;
    private javax.swing.JLabel packagesTitle;
    private javax.swing.JPanel basicPackage;
    private javax.swing.JLabel basicTitle;
    private javax.swing.JLabel basicPrice;
    private javax.swing.JLabel basicDuration;
    private javax.swing.JTextArea basicFeatures;
    private javax.swing.JButton basicButton;
    private javax.swing.JPanel premiumPackage;
    private javax.swing.JLabel premiumTitle;
    private javax.swing.JLabel premiumPrice;
    private javax.swing.JLabel premiumDuration;
    private javax.swing.JTextArea premiumFeatures;
    private javax.swing.JButton premiumButton;
    private javax.swing.JLabel premiumBadge;
    private javax.swing.JPanel vipPackage;
    private javax.swing.JLabel vipTitle;
    private javax.swing.JLabel vipPrice;
    private javax.swing.JLabel vipDuration;
    private javax.swing.JTextArea vipFeatures;
    private javax.swing.JButton vipButton;
    private javax.swing.JLabel vipBadge;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel infoTitle;
    private javax.swing.JLabel memberStatusLabel;
    private javax.swing.JTextField memberStatusField;
    private javax.swing.JLabel expiryDateLabel;
    private javax.swing.JTextField expiryDateField;
    private javax.swing.JLabel selectedPackageLabel;
    private javax.swing.JTextField selectedPackageField;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discountField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JButton paymentButton;
}

