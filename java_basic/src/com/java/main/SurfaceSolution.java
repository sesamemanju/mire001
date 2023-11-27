package com.java.main;

import java.util.Scanner;

import com.java.dto.CircleVO;
import com.java.dto.RectangularVO;
import com.java.dto.TriangleVO;

public class SurfaceSolution {

	private TriangleVO triangle;
	private RectangularVO rectangular;
	private CircleVO circle;
	private int menu;


	public void input() {
		Scanner scann = new Scanner(System.in);
		System.out.println("1.�ﰢ��   2.�簢��    3.��");
		System.out.println("������ �����Ͻÿ�.");
		menu = scann.nextInt();
		scann.nextLine();

		switch (menu) {
		case 1: // �ﰢ��
			triangle = new TriangleVO();
			System.out.print("�غ� : ");
			triangle.baseLine = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			triangle.height = scann.nextInt();
			scann.nextLine();
			break;
		case 2: // �簢��
			rectangular = new RectangularVO();
			System.out.print("���� : ");
			rectangular.garo = scann.nextInt();
			scann.nextLine();
			System.out.print("���� : ");
			rectangular.sero = scann.nextInt();
			scann.nextLine();
			break;
		case 3: // ��
			circle = new CircleVO();
			System.out.print("������ : ");
			circle.radius = scann.nextInt();
			scann.nextLine();
			break;
		default:
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");

		}
	}

	public void process() {
		switch (menu) {
		case 1:
		case 2:
		case 3:
			break;
		default:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); // ��������. (����õ)
		}
	}

	public void output() {
		switch (menu) {
		case 1:
			System.out.println("�ﰢ�� ���� : " + triangle.surface());
			break;
		case 2:
			System.out.println("�簢�� ���� : " + rectangular.surface());
			break;
		case 3:
			System.out.println("�� ���� : " + circle.surface());
			break;
		}
		
		System.out.println("����(Q) Ȥ�� ����Ͻ÷��� �ƹ�Ű�� ��������.");
		String menu = new Scanner(System.in).nextLine();
		if(menu.toUpperCase().equals("Q")) {
			System.exit(0);
		}
	}
}