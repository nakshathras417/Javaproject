JTextField amountField;
    JTextField sourceField;

    public Income() {
        setTitle("Income");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel title = new JLabel("ADD INCOME");

        JLabel amount = new JLabel("Amount:");
        JLabel source = new JLabel("Source:");

        amountField = new JTextField(20);
        sourceField = new JTextField(20);

        JButton addButton = new JButton("Add Income");

        add(title);
        add(amount);
        add(amountField);
        add(source);
        add(sourceField);
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (amountField.getText().isEmpty()
                        || sourceField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(
                        Income.this,
                        "Please enter all details."
                    );

                } else {

                    JOptionPane.showMessageDialog(
                        Income.this,
                        "Income added successfully!"
                    );
                }
            }
        });

        setVisible(true);
    }
public static void main(String[] args) {
        new Income();
    }
}
