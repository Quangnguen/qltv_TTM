/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.screens;

/**
 *
 * @author admin
 */
public class vpp extends javax.swing.JPanel {

    /**
     * Creates new form OfficeSuppliesPanel
     */
    public vpp() {
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
        
        // Left panel - Danh sách văn phòng phẩm
        productsPanel = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        productsTable = new javax.swing.JScrollPane();
        productsTableScroll = new javax.swing.JTable();
        
        // Right panel - Chi tiết và giỏ hàng
        detailsPanel = new javax.swing.JPanel();
        
        // Product details
        productDetailsPanel = new javax.swing.JPanel();
        productDetailsTitle = new javax.swing.JLabel();
        productIdLabel = new javax.swing.JLabel();
        productIdField = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        productNameField = new javax.swing.JTextField();
        productTypeLabel = new javax.swing.JLabel();
        productTypeField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        stockLabel = new javax.swing.JLabel();
        stockField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addToCartButton = new javax.swing.JButton();
        
        // Cart panel
        cartPanel = new javax.swing.JPanel();
        cartTitle = new javax.swing.JLabel();
        cartTable = new javax.swing.JScrollPane();
        cartTableScroll = new javax.swing.JTable();
        totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        checkoutButton = new javax.swing.JButton();
        clearCartButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 250));
        setLayout(new java.awt.BorderLayout(0, 20));

        // Title
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 28));
        titleLabel.setForeground(new java.awt.Color(45, 45, 48));
        titleLabel.setText("Mua đồ dùng văn phòng phẩm");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 10, 40));
        add(titleLabel, java.awt.BorderLayout.NORTH);

        mainContainer.setLayout(new java.awt.BorderLayout(20, 0));
        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 30, 40));
        mainContainer.setBackground(new java.awt.Color(245, 245, 250));

        // ============ LEFT PANEL - DANH SÁCH VPP ============
        productsPanel.setBackground(new java.awt.Color(255, 255, 255));
        productsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách văn phòng phẩm",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(60, 60, 60)));
        productsPanel.setLayout(new java.awt.BorderLayout(0, 10));
        productsPanel.setPreferredSize(new java.awt.Dimension(600, 0));
        productsPanel.setMinimumSize(new java.awt.Dimension(500, 0));
        productsPanel.setMaximumSize(new java.awt.Dimension(700, Integer.MAX_VALUE));

        // Filter panel
        javax.swing.JPanel filterPanel = new javax.swing.JPanel();
        filterPanel.setLayout(new java.awt.BorderLayout(10, 10));
        filterPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        filterPanel.setBackground(new java.awt.Color(255, 255, 255));

        categoryLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        categoryLabel.setText("Danh mục:");
        categoryCombo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Tất cả", "Bút viết", "Giấy", "Tập vở", "Bìa kẹp", "Dụng cụ văn phòng"}));
        categoryCombo.addActionListener(e -> filterByCategory());

        searchLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        searchLabel.setText("Tìm kiếm:");
        searchField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        searchField.setColumns(15);
        searchButton.setBackground(new java.awt.Color(0, 120, 215));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("🔍 Tìm");
        searchButton.setFocusPainted(false);
        searchButton.addActionListener(e -> searchProducts());

        javax.swing.JPanel categoryPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        categoryPanel.setBackground(new java.awt.Color(255, 255, 255));
        categoryPanel.add(categoryLabel, java.awt.BorderLayout.WEST);
        categoryPanel.add(categoryCombo, java.awt.BorderLayout.CENTER);

        javax.swing.JPanel searchPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.add(searchLabel, java.awt.BorderLayout.WEST);
        searchPanel.add(searchField, java.awt.BorderLayout.CENTER);
        searchPanel.add(searchButton, java.awt.BorderLayout.EAST);

        javax.swing.JPanel filterTopPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        filterTopPanel.setBackground(new java.awt.Color(255, 255, 255));
        filterTopPanel.add(categoryPanel, java.awt.BorderLayout.CENTER);
        filterTopPanel.add(searchPanel, java.awt.BorderLayout.EAST);

        filterPanel.add(filterTopPanel, java.awt.BorderLayout.CENTER);

        // Products table
        String[] columns = {"Mã SP", "Tên sản phẩm", "Loại", "Giá", "Tồn kho"};
        Object[][] data = {
            {"VPP001", "Bút bi xanh", "Bút viết", "5,000 đ", "50"},
            {"VPP002", "Bút bi đỏ", "Bút viết", "5,000 đ", "45"},
            {"VPP003", "Vở học sinh 96 trang", "Tập vở", "15,000 đ", "100"},
            {"VPP004", "Giấy A4 Double A", "Giấy", "80,000 đ", "30"},
            {"VPP005", "Bìa kẹp nhựa A4", "Bìa kẹp", "25,000 đ", "60"},
            {"VPP006", "Kéo văn phòng", "Dụng cụ", "35,000 đ", "25"},
            {"VPP007", "Bút chì 2B", "Bút viết", "3,000 đ", "80"},
            {"VPP008", "Tẩy gôm", "Bút viết", "2,000 đ", "90"}
        };
        productsTableScroll = new javax.swing.JTable(data, columns);
        productsTableScroll.setFont(new java.awt.Font("Segoe UI", 0, 12));
        productsTableScroll.setRowHeight(25);
        productsTableScroll.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productsTableScroll.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = productsTableScroll.getSelectedRow();
            if (selectedRow >= 0) {
                productIdField.setText(productsTableScroll.getValueAt(selectedRow, 0).toString());
                productNameField.setText(productsTableScroll.getValueAt(selectedRow, 1).toString());
                productTypeField.setText(productsTableScroll.getValueAt(selectedRow, 2).toString());
                priceField.setText(productsTableScroll.getValueAt(selectedRow, 3).toString());
                stockField.setText(productsTableScroll.getValueAt(selectedRow, 4).toString());
            }
        });
        productsTable.setViewportView(productsTableScroll);

        productsPanel.add(filterPanel, java.awt.BorderLayout.NORTH);
        productsPanel.add(productsTable, java.awt.BorderLayout.CENTER);

        // ============ RIGHT PANEL ============
        detailsPanel.setLayout(new java.awt.BorderLayout(0, 15));
        detailsPanel.setBackground(new java.awt.Color(245, 245, 250));

        // Product details panel
        productDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        productDetailsPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(60, 60, 60)),
            javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        
        javax.swing.GroupLayout detailsLayout = new javax.swing.GroupLayout(productDetailsPanel);
        productDetailsPanel.setLayout(detailsLayout);
        
        detailsLayout.setHorizontalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productIdField)
                    .addComponent(productNameField)
                    .addComponent(productTypeField)
                    .addComponent(priceField)
                    .addComponent(stockField)
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
        detailsLayout.setVerticalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productIdLabel)
                    .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNameLabel)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productTypeLabel)
                    .addComponent(productTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockLabel)
                    .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToCartButton))
                .addContainerGap())
        );

        // Labels
        productIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        productIdLabel.setText("Mã SP:");
        productNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        productNameLabel.setText("Tên SP:");
        productTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        productTypeLabel.setText("Loại:");
        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        priceLabel.setText("Giá:");
        stockLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        stockLabel.setText("Tồn kho:");
        quantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        quantityLabel.setText("Số lượng:");

        // Fields
        productIdField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        productIdField.setEditable(false);
        productNameField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        productNameField.setEditable(false);
        productTypeField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        productTypeField.setEditable(false);
        priceField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        priceField.setEditable(false);
        stockField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        stockField.setEditable(false);
        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));

        addToCartButton.setBackground(new java.awt.Color(50, 150, 50));
        addToCartButton.setForeground(new java.awt.Color(255, 255, 255));
        addToCartButton.setText("🛒 Thêm vào giỏ");
        addToCartButton.setFocusPainted(false);
        addToCartButton.addActionListener(e -> addToCart());

        // Cart panel
        cartPanel.setBackground(new java.awt.Color(255, 255, 255));
        cartPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(60, 60, 60)),
            javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        cartPanel.setLayout(new java.awt.BorderLayout(0, 10));

        String[] cartColumns = {"Mã SP", "Tên sản phẩm", "Số lượng", "Đơn giá", "Thành tiền"};
        Object[][] cartData = {};
        cartTableScroll = new javax.swing.JTable(cartData, cartColumns);
        cartTableScroll.setFont(new java.awt.Font("Segoe UI", 0, 12));
        cartTableScroll.setRowHeight(25);
        cartTable.setViewportView(cartTableScroll);

        javax.swing.JPanel cartBottomPanel = new javax.swing.JPanel();
        cartBottomPanel.setLayout(new java.awt.BorderLayout(10, 0));
        cartBottomPanel.setBackground(new java.awt.Color(255, 255, 255));

        totalLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        totalLabel.setText("Tổng tiền:");
        totalField.setFont(new java.awt.Font("Segoe UI", 1, 16));
        totalField.setText("0 đ");
        totalField.setEditable(false);
        totalField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        checkoutButton.setBackground(new java.awt.Color(0, 120, 215));
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("💳 Thanh toán");
        checkoutButton.setFocusPainted(false);
        checkoutButton.setPreferredSize(new java.awt.Dimension(150, 40));
        checkoutButton.addActionListener(e -> checkout());

        clearCartButton.setBackground(new java.awt.Color(200, 50, 50));
        clearCartButton.setForeground(new java.awt.Color(255, 255, 255));
        clearCartButton.setText("🗑️ Xóa giỏ");
        clearCartButton.setFocusPainted(false);
        clearCartButton.setPreferredSize(new java.awt.Dimension(120, 40));
        clearCartButton.addActionListener(e -> clearCart());

        javax.swing.JPanel totalPanel = new javax.swing.JPanel(new java.awt.BorderLayout(10, 0));
        totalPanel.setBackground(new java.awt.Color(255, 255, 255));
        totalPanel.add(totalLabel, java.awt.BorderLayout.WEST);
        totalPanel.add(totalField, java.awt.BorderLayout.CENTER);

        javax.swing.JPanel buttonPanel = new javax.swing.JPanel();
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 0));
        buttonPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonPanel.add(clearCartButton);
        buttonPanel.add(checkoutButton);

        cartBottomPanel.add(totalPanel, java.awt.BorderLayout.CENTER);
        cartBottomPanel.add(buttonPanel, java.awt.BorderLayout.EAST);

        cartPanel.add(cartTable, java.awt.BorderLayout.CENTER);
        cartPanel.add(cartBottomPanel, java.awt.BorderLayout.SOUTH);

        detailsPanel.add(productDetailsPanel, java.awt.BorderLayout.NORTH);
        detailsPanel.add(cartPanel, java.awt.BorderLayout.CENTER);

        mainContainer.add(productsPanel, java.awt.BorderLayout.WEST);
        mainContainer.add(detailsPanel, java.awt.BorderLayout.CENTER);

        add(mainContainer, java.awt.BorderLayout.CENTER);
    }

    private void filterByCategory() {
        String category = (String) categoryCombo.getSelectedItem();
        javax.swing.JOptionPane.showMessageDialog(this, "Lọc theo danh mục: " + category, "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void searchProducts() {
        String keyword = searchField.getText().trim();
        if (keyword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Thông báo", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        javax.swing.JOptionPane.showMessageDialog(this, "Đang tìm kiếm: " + keyword, "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void addToCart() {
        String productId = productIdField.getText().trim();
        if (productId.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm!", "Thông báo", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int quantity = (Integer) quantitySpinner.getValue();
        javax.swing.JOptionPane.showMessageDialog(this, "Đã thêm " + quantity + " sản phẩm vào giỏ hàng!", "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void checkout() {
        javax.swing.JOptionPane.showMessageDialog(this, "Chuyển đến màn hình thanh toán...", "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearCart() {
        int option = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Bạn có chắc chắn muốn xóa toàn bộ giỏ hàng?", "Xác nhận",
            javax.swing.JOptionPane.YES_NO_OPTION);
        if (option == javax.swing.JOptionPane.YES_OPTION) {
            javax.swing.JOptionPane.showMessageDialog(this, "Đã xóa giỏ hàng!", "Thông báo", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane productsTable;
    private javax.swing.JTable productsTableScroll;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JPanel productDetailsPanel;
    private javax.swing.JLabel productDetailsTitle;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JTextField productIdField;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField productNameField;
    private javax.swing.JLabel productTypeLabel;
    private javax.swing.JTextField productTypeField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JTextField stockField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton addToCartButton;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JLabel cartTitle;
    private javax.swing.JScrollPane cartTable;
    private javax.swing.JTable cartTableScroll;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton clearCartButton;
}

