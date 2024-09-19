package session21;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;


public class StudentManagerGUI extends JFrame {
    private StudentManager manager;

    private JTextField nameField;
    private JComboBox<Grade> gradeComboBox;
    private JTextArea resultArea;

    public StudentManagerGUI() {
        manager = new StudentManager();

        //Gui nin setupu
        setTitle("Student Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // INput paneli
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Grade:"));
        gradeComboBox = new JComboBox<>(Grade.values());
        inputPanel.add(gradeComboBox);

        JButton addButton = new JButton("Add Student");
        inputPanel.add(addButton);

        JButton removeButton = new JButton("Remove by Name Contains");
        inputPanel.add(removeButton);

        add(inputPanel, BorderLayout.NORTH);

        //result yeri
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        // Control paneli
        JPanel controlPanel = new JPanel();
        JButton getByNameButton = new JButton("Get Student by Name");
        JButton getByGradeButton = new JButton("Get Students by Grade");
        JButton groupByGradeButton = new JButton("Group Students by Grade");

        controlPanel.add(getByNameButton);
        controlPanel.add(getByGradeButton);
        controlPanel.add(groupByGradeButton);
        add(controlPanel, BorderLayout.SOUTH);

        // Buttonlar
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                Grade grade = (Grade) gradeComboBox.getSelectedItem();
                if (!name.isEmpty() && grade != null) {
                    manager.addStudent(new Student(name, grade));
                    resultArea.setText("Student added: " + name + " (" + grade + ")");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = nameField.getText();
                if (!text.isEmpty()) {
                    manager.removeStudentsByNameContaining(text);
                    resultArea.setText("Students containing '" + text + "' removed.");
                }
            }
        });

        getByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                Student student = manager.getStudentByName(name);
                if (student != null) {
                    resultArea.setText("Found student: " + student);
                } else {
                    resultArea.setText("No student found with name: " + name);
                }
            }
        });

        getByGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grade grade = (Grade) gradeComboBox.getSelectedItem();
                List<Student> students = manager.getStudentsByGrade(grade);
                resultArea.setText("Students with grade " + grade + ":\n" + students);
            }
        });

        groupByGradeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<Grade, List<Student>> groupedByGrade = manager.groupStudentsByGrade();
                StringBuilder result = new StringBuilder("Students grouped by grade:\n");
                for (Map.Entry<Grade, List<Student>> entry : groupedByGrade.entrySet()) {
                    result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
                }
                resultArea.setText(result.toString());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentManagerGUI gui = new StudentManagerGUI();
            gui.setVisible(true);
        });
    }
}