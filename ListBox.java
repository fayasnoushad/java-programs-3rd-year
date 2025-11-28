// Create an AWT application to add, remove items in a list box.

import java.awt.*;
import java.awt.event.*;

public class ListBox extends Frame implements ActionListener {

    List itemList;
    TextField inputField;
    Button addButton, removeButton;

    public ListBox() {
        setLayout(new FlowLayout());

        itemList = new List(8, true);  // multiple selection allowed
        inputField = new TextField(15);

        addButton = new Button("Add Item");
        removeButton = new Button("Remove Selected");

        add(itemList);
        add(inputField);
        add(addButton);
        add(removeButton);

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        setTitle("AWT List Box");
        setSize(300, 300);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String item = inputField.getText().trim();
            if (!item.isEmpty()) {
                itemList.add(item);
                inputField.setText("");
            }
        }

        if (e.getSource() == removeButton) {
            int[] selectedIndexes = itemList.getSelectedIndexes();
            // Remove from last to avoid index shift
            for (int i = selectedIndexes.length - 1; i >= 0; i--) {
                itemList.remove(selectedIndexes[i]);
            }
        }
    }

    public static void main(String[] args) {
        new ListBox();
    }
}
