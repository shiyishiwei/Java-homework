import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Second {
	static Set<Student>se=new TreeSet<Student>();
	public static void main(String[] args)throws java.io.IOException {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String id,name;
		int age;
		for(int i=0;i<n;i++) {
			System.out.println("���������ѧ��:");
			id=input.next();
			System.out.println("�������������:");
			name=input.next();
			System.out.println("�������������:");
			age=input.nextInt();
			se.add(new Student(id,name,age));
		}
		for(Student key:se) {
			System.out.println(key.To_String());
		}
		write();
	}
	public static void write()throws java.io.IOException {
		java.io.File file=new java.io.File("ѧ����Ϣ.txt");
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		output.println(se.size());
		for(Student key:se) {
			output.println(key.To_String());
		}
		output.close();
		}
}
