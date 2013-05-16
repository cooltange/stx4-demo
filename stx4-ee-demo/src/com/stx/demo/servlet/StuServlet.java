package com.stx.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stx.demo.entity.Student;

public class StuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StuServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("here");
		List<Student> stus = new ArrayList<Student>();
		Student stu1 = new Student();
		stu1.setSname("p1");
		stu1.setSage(20);
		stus.add(stu1);
		Student stu2 = new Student();
		stu2.setSname("p2");
		stu2.setSage(30);
		stus.add(stu2);
		String s = "[";
		for (Student ss : stus) {
			s += "{\"username\":\""+ ss.getSname() +"\",\"age\":"+ ss.getSage() +"},";
		}
		s = s.substring(0, s.length()-1);
		s += "]";
//		String s = "[{\"username\":\"p1\",\"age\":20},{\"username\":\"p2\",\"age\":21}]";
		PrintWriter pw = response.getWriter();
		pw.write(s);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
