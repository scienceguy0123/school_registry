package school_registry;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchoolRegistry {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolRegistry window = new SchoolRegistry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SchoolRegistry() {
		initialize();
	}
	
	private String[] header = {"Name", "Age", "Gender", "Grade", "Salary", "Type"};
	private DefaultTableModel dtm = new DefaultTableModel(null, header);
	private JTextField teacherName;
	private JTextField teacherAge;
	private JTextField teacherSalary;
	private JTextField studentName;
	private JTextField studentAge;
	private JTextField studentGrade;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTable table = new JTable(dtm);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		
		JLabel TeacherLabel = new JLabel("Teacher Information");
		TeacherLabel.setForeground(Color.BLUE);
		TeacherLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("Name");
		
		teacherName = new JTextField();
		teacherName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		
		teacherAge = new JTextField();
		teacherAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Salary");
		
		teacherSalary = new JTextField();
		teacherSalary.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Gender");
		
		JRadioButton teacherMale = new JRadioButton("Male");
		
		JRadioButton teacherFemale = new JRadioButton("Female");
		
		JButton teacherButton = new JButton("Add");
		teacherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(teacherMale.isSelected()) {
					addTeacher("Male");
				}else if(teacherFemale.isSelected()) {
					addTeacher("Female");
				}
			}
		});
		
		JLabel studentLabel = new JLabel("Student Information");
		studentLabel.setForeground(Color.BLUE);
		studentLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		
		studentName = new JTextField();
		studentName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Age");
		
		studentAge = new JTextField();
		studentAge.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Grade");
		
		studentGrade = new JTextField();
		studentGrade.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Gender");
		
		JRadioButton studentMale = new JRadioButton("Male");
		
		JRadioButton studentFemale = new JRadioButton("Female");
		
		JButton studentButton = new JButton("Add");
		studentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(studentMale.isSelected()) {
					addStudent("Male");
				}
				
				else if (studentFemale.isSelected()){
					addStudent("Female");
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addComponent(TeacherLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(teacherMale)
								.addComponent(teacherFemale)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(studentLabel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(studentFemale, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(studentMale, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(44)
							.addComponent(studentButton, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addComponent(teacherButton)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(TeacherLabel)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(teacherName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(teacherAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(teacherSalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1)
						.addComponent(teacherMale, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(teacherFemale, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(teacherButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(studentLabel, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1_1)
						.addComponent(studentAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_2)
						.addComponent(studentGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1_1)
						.addComponent(studentMale, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(studentFemale, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(studentButton)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
	}
	
	public void addTeacher (String gender) {
		Teacher teacher = new Teacher();
		teacher.setName(teacherName.getText());
		teacher.setAge(Integer.parseInt(teacherAge.getText()));
		teacher.setSalary(Integer.parseInt(teacherSalary.getText()));
		teacher.setGender(gender);
		
		dtm.addRow(new Object[] {
				teacher.getName(),
				teacher.getAge(),
				teacher.getGender(),
				"N/A",
				teacher.getSalary(),
				teacher.myType()
		});
	}
	
	public void addStudent (String gender) {
		Student student = new Student();
		student.setName(studentName.getText());
		student.setAge(Integer.parseInt(studentAge.getText()));
		student.setGrade(Integer.parseInt(studentGrade.getText()));
		student.setGender(gender);
		
		dtm.addRow(new Object[] {
				student.getName(),
				student.getAge(),
				student.getGender(),
				student.getGrade(),
				"N/A",
				student.myType()
		});
	}
}
