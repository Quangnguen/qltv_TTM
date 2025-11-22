/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.screens;

/**
 *
 * @author admin
 */
public class lichsu extends javax.swing.JPanel {

    /**
     * Creates new form lichsu
     */
    public lichsu() {
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
        
        // Filter panel
        filterPanel = new javax.swing.JPanel();
        filterTitle = new javax.swing.JLabel();
        transactionTypeLabel = new javax.swing.JLabel();
        transactionTypeCombo = new javax.swing.JComboBox<>();
        dateFromLabel = new javax.swing.JLabel();
        dateFromField = new javax.swing.JTextField();
        dateToLabel = new javax.swing.JLabel();
        dateToField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        
        // Tabbed pane for different history types
        historyTabbedPane = new javax.swing.JTabbedPane();
        
        // Borrow/Return history
        borrowHistoryPanel = new javax.swing.JPanel();
        borrowHistoryTable = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        
        // Payment history
        paymentHistoryPanel = new javax.swing.JPanel();
        paymentHistoryTable = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        
        // Top up history
        topUpHistoryPanel = new javax.swing.JPanel();
        topUpHistoryTable = new javax.swing.JScrollPane();
        topUpTable = new javax.swing.JTable();
        
        // Summary panel
        summaryPanel = new javax.swing.JPanel();
        summaryTitle = new javax.swing.JLabel();
        totalBorrowsLabel = new javax.swing.JLabel();
        totalBorrowsField = new javax.swing.JTextField();
        totalPaymentsLabel = new javax.swing.JLabel();
        totalPaymentsField = new javax.swing.JTextField();
        totalTopUpsLabel = new javax.swing.JLabel();
        totalTopUpsField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(245, 245, 250));
        setLayout(new java.awt.BorderLayout(0, 20));

        // Title
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 28));
        titleLabel.setForeground(new java.awt.Color(45, 45, 48));
        titleLabel.setText("Lịch sử giao dịch");
        titleLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 40, 10, 40));
        add(titleLabel, java.awt.BorderLayout.NORTH);

        mainContainer.setLayout(new java.awt.BorderLayout(0, 20));
        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 30, 40));
        mainContainer.setBackground(new java.awt.Color(245, 245, 250));

        // ============ FILTER PANEL ============
        filterPanel.setBackground(new java.awt.Color(255, 255, 255));
        filterPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createTitledBorder(null, "Bộ lọc",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(60, 60, 60)),
            javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        filterPanel.setLayout(new java.awt.BorderLayout(0, 10));

        javax.swing.JPanel filterFormPanel = new javax.swing.JPanel();
        filterFormPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 15, 5));
        filterFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        transactionTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        transactionTypeLabel.setText("Loại giao dịch:");
        transactionTypeCombo.setFont(new java.awt.Font("Segoe UI", 0, 13));
        transactionTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "Tất cả", "Mượn/Trả sách", "Mua sách", "Mua VPP", "Nạp tiền", "Phí hội viên"
        }));

        dateFromLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        dateFromLabel.setText("Từ ngày:");
        dateFromField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        dateFromField.setColumns(12);
        dateFromField.setText("01/01/2024");

        dateToLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        dateToLabel.setText("Đến ngày:");
        dateToField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        dateToField.setColumns(12);
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");
        dateToField.setText(dateFormat.format(new java.util.Date()));

        searchButton.setBackground(new java.awt.Color(0, 120, 215));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("🔍 Tìm kiếm");
        searchButton.setFocusPainted(false);
        searchButton.addActionListener(e -> searchHistory());

        refreshButton.setBackground(new java.awt.Color(100, 100, 100));
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("🔄 Làm mới");
        refreshButton.setFocusPainted(false);
        refreshButton.addActionListener(e -> refreshHistory());

        filterFormPanel.add(transactionTypeLabel);
        filterFormPanel.add(transactionTypeCombo);
        filterFormPanel.add(dateFromLabel);
        filterFormPanel.add(dateFromField);
        filterFormPanel.add(dateToLabel);
        filterFormPanel.add(dateToField);
        filterFormPanel.add(searchButton);
        filterFormPanel.add(refreshButton);

        filterPanel.add(filterFormPanel, java.awt.BorderLayout.CENTER);

        // ============ HISTORY TABBED PANE ============
        
        // Borrow/Return History
        borrowHistoryPanel.setLayout(new java.awt.BorderLayout());
        borrowHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));

        String[] borrowColumns = {"Mã giao dịch", "Loại", "Mã sách", "Tên sách", "Ngày mượn", "Ngày trả", "Trạng thái"};
        Object[][] borrowData = {
            {"BR001", "Mượn", "BK001", "Lập trình Java", "01/01/2024", "15/01/2024", "Đã trả"},
            {"BR002", "Mượn", "BK002", "Cơ sở dữ liệu", "10/01/2024", "25/01/2024", "Đang mượn"},
            {"BR003", "Trả", "BK001", "Lập trình Java", "15/01/2024", "15/01/2024", "Hoàn thành"}
        };
        borrowTable = new javax.swing.JTable(borrowData, borrowColumns);
        borrowTable.setFont(new java.awt.Font("Segoe UI", 0, 12));
        borrowTable.setRowHeight(25);
        borrowHistoryTable.setViewportView(borrowTable);
        borrowHistoryPanel.add(borrowHistoryTable, java.awt.BorderLayout.CENTER);

        // Payment History
        paymentHistoryPanel.setLayout(new java.awt.BorderLayout());
        paymentHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));

        String[] paymentColumns = {"Mã giao dịch", "Loại", "Sản phẩm", "Số lượng", "Tổng tiền", "Ngày thanh toán", "Trạng thái"};
        Object[][] paymentData = {
            {"PAY001", "Mua sách", "Lập trình Java nâng cao", "2", "300,000 đ", "05/01/2024", "Hoàn thành"},
            {"PAY002", "Mua VPP", "Bút bi xanh, Vở học sinh", "5", "85,000 đ", "08/01/2024", "Hoàn thành"},
            {"PAY003", "Phí hội viên", "Gói Cao cấp", "1", "280,000 đ", "12/01/2024", "Hoàn thành"}
        };
        paymentTable = new javax.swing.JTable(paymentData, paymentColumns);
        paymentTable.setFont(new java.awt.Font("Segoe UI", 0, 12));
        paymentTable.setRowHeight(25);
        paymentHistoryTable.setViewportView(paymentTable);
        paymentHistoryPanel.add(paymentHistoryTable, java.awt.BorderLayout.CENTER);

        // Top Up History
        topUpHistoryPanel.setLayout(new java.awt.BorderLayout());
        topUpHistoryPanel.setBackground(new java.awt.Color(255, 255, 255));

        String[] topUpColumns = {"Mã giao dịch", "Số tiền", "Phương thức", "Ngày nạp", "Ghi chú", "Trạng thái"};
        Object[][] topUpData = {
            {"TU001", "500,000 đ", "Thẻ ngân hàng", "03/01/2024", "Nạp tiền lần đầu", "Hoàn thành"},
            {"TU002", "1,000,000 đ", "Chuyển khoản", "10/01/2024", "Nạp tiền tháng 1", "Hoàn thành"},
            {"TU003", "200,000 đ", "Tiền mặt", "15/01/2024", "Nạp tiền lẻ", "Hoàn thành"}
        };
        topUpTable = new javax.swing.JTable(topUpData, topUpColumns);
        topUpTable.setFont(new java.awt.Font("Segoe UI", 0, 12));
        topUpTable.setRowHeight(25);
        topUpHistoryTable.setViewportView(topUpTable);
        topUpHistoryPanel.add(topUpHistoryTable, java.awt.BorderLayout.CENTER);

        historyTabbedPane.addTab("Mượn/Trả sách", borrowHistoryPanel);
        historyTabbedPane.addTab("Thanh toán", paymentHistoryPanel);
        historyTabbedPane.addTab("Nạp tiền", topUpHistoryPanel);

        // ============ SUMMARY PANEL ============
        summaryPanel.setBackground(new java.awt.Color(255, 255, 255));
        summaryPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createTitledBorder(null, "Tổng kết",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(60, 60, 60)),
            javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        summaryPanel.setLayout(new java.awt.BorderLayout(0, 10));

        summaryTitle.setFont(new java.awt.Font("Segoe UI", 1, 14));
        summaryTitle.setText("Thống kê giao dịch");

        javax.swing.JPanel summaryFormPanel = new javax.swing.JPanel();
        javax.swing.GroupLayout summaryLayout = new javax.swing.GroupLayout(summaryFormPanel);
        summaryFormPanel.setLayout(summaryLayout);
        summaryFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        summaryLayout.setHorizontalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBorrowsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPaymentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalTopUpsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalBorrowsField)
                    .addComponent(totalPaymentsField)
                    .addComponent(totalTopUpsField))
                .addContainerGap())
        );

        summaryLayout.setVerticalGroup(
            summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalBorrowsLabel)
                    .addComponent(totalBorrowsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPaymentsLabel)
                    .addComponent(totalPaymentsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(summaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTopUpsLabel)
                    .addComponent(totalTopUpsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        totalBorrowsLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        totalBorrowsLabel.setText("Tổng số lượt mượn:");
        totalPaymentsLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        totalPaymentsLabel.setText("Tổng số thanh toán:");
        totalTopUpsLabel.setFont(new java.awt.Font("Segoe UI", 1, 13));
        totalTopUpsLabel.setText("Tổng số nạp tiền:");

        totalBorrowsField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        totalBorrowsField.setText("15");
        totalBorrowsField.setEditable(false);
        totalPaymentsField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        totalPaymentsField.setText("3");
        totalPaymentsField.setEditable(false);
        totalTopUpsField.setFont(new java.awt.Font("Segoe UI", 0, 13));
        totalTopUpsField.setText("3");
        totalTopUpsField.setEditable(false);

        summaryPanel.add(summaryTitle, java.awt.BorderLayout.NORTH);
        summaryPanel.add(summaryFormPanel, java.awt.BorderLayout.CENTER);

        mainContainer.add(filterPanel, java.awt.BorderLayout.NORTH);
        mainContainer.add(historyTabbedPane, java.awt.BorderLayout.CENTER);
        mainContainer.add(summaryPanel, java.awt.BorderLayout.SOUTH);

        add(mainContainer, java.awt.BorderLayout.CENTER);
    }

    private void searchHistory() {
        String type = (String) transactionTypeCombo.getSelectedItem();
        String fromDate = dateFromField.getText();
        String toDate = dateToField.getText();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Đang tìm kiếm lịch sử:\nLoại: " + type + "\nTừ ngày: " + fromDate + "\nĐến ngày: " + toDate,
            "Thông báo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void refreshHistory() {
        javax.swing.JOptionPane.showMessageDialog(this, "Đang làm mới danh sách lịch sử...", "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel filterPanel;
    private javax.swing.JLabel filterTitle;
    private javax.swing.JLabel transactionTypeLabel;
    private javax.swing.JComboBox<String> transactionTypeCombo;
    private javax.swing.JLabel dateFromLabel;
    private javax.swing.JTextField dateFromField;
    private javax.swing.JLabel dateToLabel;
    private javax.swing.JTextField dateToField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTabbedPane historyTabbedPane;
    private javax.swing.JPanel borrowHistoryPanel;
    private javax.swing.JScrollPane borrowHistoryTable;
    private javax.swing.JTable borrowTable;
    private javax.swing.JPanel paymentHistoryPanel;
    private javax.swing.JScrollPane paymentHistoryTable;
    private javax.swing.JTable paymentTable;
    private javax.swing.JPanel topUpHistoryPanel;
    private javax.swing.JScrollPane topUpHistoryTable;
    private javax.swing.JTable topUpTable;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JLabel summaryTitle;
    private javax.swing.JLabel totalBorrowsLabel;
    private javax.swing.JTextField totalBorrowsField;
    private javax.swing.JLabel totalPaymentsLabel;
    private javax.swing.JTextField totalPaymentsField;
    private javax.swing.JLabel totalTopUpsLabel;
    private javax.swing.JTextField totalTopUpsField;
}
