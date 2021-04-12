package com.tyss.assignment;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.assignment.dao.LoginDetails;
import com.tyss.assignment.dto.QuizQuestions;
import com.tyss.assignment.dto.Register;
import com.tyss.assignment.dto.Results;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iterate;
		do {
			System.out.println("welcome to Quiz world");
			System.out.println("enter 1 for Register");
			System.out.println("enter 2 for Login");
			int result = 0;
			int option = scanner.nextInt();
			ApplicationContext context = new ClassPathXmlApplicationContext("quiz.xml");
			LoginDetails loginDetails = (LoginDetails) context.getBean("loginDetails");
			if (option == 1) {
				Register register = (Register) context.getBean("register");
				System.out.println("Enter UserName");
				String username = scanner.next();
				register.setUsername(username);
				System.out.println("Enter Password");
				String password = scanner.next();
				register.setPassword(password);
				System.out.println("Enter ConfirmPassword");
				String confirmPassword = scanner.next();
				if (password.equals(confirmPassword)) {
					register.setConfirmpassword(confirmPassword);
					loginDetails.register(register);
					System.out.println("Sucessfully Registered");
				}else
				System.out.println("Confirm password is not matched");
			}
			if (option == 2) {
				Register login = (Register) context.getBean("register");
				System.out.println("Enter UserName");
				String username = scanner.next();
				System.out.println("Enter Password");
				String password = scanner.next();

				Register login2 = loginDetails.login(username, password);
				String password1 = login2.getPassword();
				if (password.equals(password1)) {
					System.out.println("Successfully Login");
					int iterate2;
					do {
						System.out.println("100----> JAVA");
						System.out.println("200----> HTML");
						System.out.println("300----> JS");
						int subject = scanner.nextInt();
						if (subject == 100) {
							QuizQuestions questions = (QuizQuestions) context.getBean("java");
						} else if (subject == 200) {
							QuizQuestions questions = (QuizQuestions) context.getBean("html");
						} else if (subject == 300) {
							QuizQuestions questions = (QuizQuestions) context.getBean("js");
						}
						QuizQuestions questions1 = loginDetails.questions(subject);
						System.out.println("Please answer above questions in YES/NO format....");
						System.out.println(questions1.getQuestion1());
						String answer1 = scanner.next();
						if (answer1.equalsIgnoreCase(questions1.getQuestion1answerString())) {
							result++;
						}
						System.out.println(questions1.getQuestion2());
						String answer2 = scanner.next();
						if (answer2.equalsIgnoreCase(questions1.getQuestion2answerString())) {
							result++;
						}
						System.out.println(questions1.getQuestion3());
						String answer3 = scanner.next();
						if (answer3.equalsIgnoreCase(questions1.getQuestion3answerString())) {
							result++;
						}
						System.out.println(questions1.getQuestion4());
						String answer4 = scanner.next();
						if (answer4.equalsIgnoreCase(questions1.getQuestion4answerString())) {
							result++;
						}
						System.out.println(questions1.getQuestion5());
						String answer5 = scanner.next();
						if (answer5.equalsIgnoreCase(questions1.getQuestion5answerString())) {
							result++;
						}
						Results results = (Results) context.getBean("results");
						results.setId(subject);
						Date date = new Date();
						results.setTime_Date(date);
						results.setMarks(result);
						loginDetails.results(results);
						Results results2 = loginDetails.getResults(date);
						System.out.println("Quiz Completed");
						System.out.println("Total marks obtained: " + results2.getMarks());
						System.out.println("Enter 1 for to write one more Quiz");
						System.out.println("Enter 2 for Exit");
						iterate2 = scanner.nextInt();
					} while (iterate2 == 1);
				}else
					System.out.println("not correct credentials");

			}
			System.out.println("Enter 1 for one more time");
			System.out.println("Enter 2 for exit");
			iterate = scanner.nextInt();
		} while (iterate == 1);
	}

}
