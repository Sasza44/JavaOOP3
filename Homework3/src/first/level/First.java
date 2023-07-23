package first.level;

public class First {

	public static void main(String[] args) {
		Student tipikin = new Student(); // створення студента
		tipikin.setName("Oleksandr");
		tipikin.setLastName("Tipikin");
		tipikin.setId(7217);
		tipikin.setGender(Gender.MAN);
		
		Student nikolaev = new Student();
		nikolaev.setName("Ivan");
		nikolaev.setLastName("Nikolaev");
		nikolaev.setId(7227);
		nikolaev.setGender(Gender.MAN);
		
		Student melnikov = new Student();
		melnikov.setName("Evgen");
		melnikov.setLastName("Melnikov");
		melnikov.setId(7226);
		melnikov.setGender(Gender.MAN);
		
		Group em72 = new Group(); // створення групи (у якій я навчався в КПІ)
		em72.setGroupName("EM-72");
		
		em72.addStudent(tipikin); // додавання студента в групу
		em72.addStudent(melnikov);
		System.out.println(em72.searchStudentByLastName("Tipikin")); // пошук студента в групі
		em72.addStudent(nikolaev);
		System.out.println(em72);
 	}
}