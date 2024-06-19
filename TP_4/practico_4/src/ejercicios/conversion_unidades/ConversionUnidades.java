package ejercicios.conversion_unidades;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConversionUnidades extends JFrame{
    private JButton btnConvertir;
    private JTextArea ingresarUnidadesTextArea;
    private JComboBox<String> cbFirstOptions;
    private JComboBox<String> cbThen;
    private JPanel mainpanel;
    private JLabel aLabel;

    public ConversionUnidades() {
        setContentPane(mainpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Conversor de unidades");
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);

        createUIComponents();
        addListeners();
    }

    private void createUIComponents() {
        mainpanel = new JPanel();
        btnConvertir = new JButton();
        aLabel = new JLabel();
        ingresarUnidadesTextArea = new JTextArea();
        cbFirstOptions = new JComboBox<String>();
        cbThen = new JComboBox<String>();
        cbThen.setEnabled(false);
        ingresarUnidadesTextArea = new JTextArea();
        cbFirstOptions.addItem("Celsius");
        cbFirstOptions.addItem("Fahrenheit");
        cbFirstOptions.addItem("Kilometros");
        cbFirstOptions.addItem("Metros");
        cbFirstOptions.addItem("Pies");
        cbFirstOptions.addItem("Millas");
        cbFirstOptions.addItem("Gramos");
        cbFirstOptions.addItem("Kilogramos");
        cbFirstOptions.addItem("Libras");
    }

    private void addListeners() {
        cbFirstOptions.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Object item = e.getItem();
                    cbThen.removeAllItems();

                    if ("Fahrenheit".equals(item)) {
                        cbThen.addItem("Celsius");
                    }
                    else if ("Kilometros".equals(item)) {
                        cbThen.addItem("Metros");
                        cbThen.addItem("Pies");
                        cbThen.addItem("Millas");
                    }
                    else if ("Metros".equals(item)) {
                        cbThen.addItem("Kilometros");
                        cbThen.addItem("Pies");
                        cbThen.addItem("Millas");
                    }
                    else if ("Pies".equals(item)) {
                        cbThen.addItem("Metros");
                        cbThen.addItem("Kilometros");
                        cbThen.addItem("Millas");
                    }
                    else if ("Gramos".equals(item)) {
                        cbThen.addItem("Kilogramos");
                        cbThen.addItem("Libras");
                    }
                    else if ("Kilogramos".equals(item)) {
                        cbThen.addItem("Gramos");
                        cbThen.addItem("Libras");
                    }
                    else if ("Libras".equals(item)) {
                        cbThen.addItem("Gramos");
                        cbThen.addItem("Kilogramos");
                    }
                    cbThen.setEnabled(cbFirstOptions.getSelectedIndex() > 0);
                }
            }
        });
    }
}
