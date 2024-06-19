package ejercicios.ejercicio_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestorTarea extends JFrame{
    private JTextField tfTarea;
    private JPanel mainPanel;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnClear;
    private JPanel panelTarea;
    private JList LTareas;
    private DefaultListModel<String> listModel;

    public GestorTarea() {
        //createUIComponents();
        setTitle("Gestor de tareas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 760);
        setLocationRelativeTo(null);
        listModel = new DefaultListModel<>();
        LTareas.setModel(listModel);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = tfTarea.getText();
                if (!task.isEmpty()) {
                    listModel.addElement(task);
                    tfTarea.setText("");
                }
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indexSeleccionado = LTareas.getSelectedIndex();
                if (indexSeleccionado != -1) {
                    listModel.remove(indexSeleccionado);
                }
            }
        });
        setContentPane(mainPanel);
        setVisible(true);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.removeAllElements();
            }
        });
    }
}
