package studentmanagementsystem.aps.edu.in.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentsDbConnection {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/students";
			String username = "root";
			String password = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("DB connected Successfully");

//			PreparedStatement p1 = connection.prepareStatement(
//					"create table studentTable(stdId int ,name varchar(25), email varchar(25), course varchar(30))");
			Scanner sc = new Scanner(System.in);

			System.out.println("----Choose any one choice---");
			System.out.println("1. insert student records");
			System.out.println("2. read students table");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: {

				System.out.println("----Enter number of Students records insertion----- ");
				int num = sc.nextInt();
				int i = 1;
				while (i <= num) {
					System.out.println("Enter " + i + " student record :");

					System.out.println("Enter Student ID: ");
					int id = sc.nextInt();
					System.out.println("Enter Student Name: ");
					String name = sc.next();
					System.out.println("Enter Student email: ");
					String email = sc.next();
					System.out.println("Enter Student course: ");
					String course = sc.next();
					PreparedStatement p1 = connection.prepareStatement("insert into studentTable values(?,?,?,?)");
					p1.setInt(1, id);
					p1.setString(2, name);
					p1.setString(3, email);
					p1.setString(4, course);
					p1.executeUpdate();
					System.out.println("record " + i + " inserted ");
					i++;

				}

				System.out.println("all records inserted");

			}

				break;
			case 2: {
				System.out.println("All Records Data Below");
				PreparedStatement p2 = connection.prepareStatement("select * from studenttable");
				ResultSet res = p2.executeQuery();
				while (res.next()) {
					System.out.println(
							res.getInt(1) + " " + res.getString(2) + " " + res.getNString(3) + " " + res.getNString(4));
				}
			}
				break;

			default:
				System.out.println("Enter valid option...!");
			}

			connection.close();
		} catch (Exception a) {
			System.out.println("failed to load driver" + a);
		}

	}
}
