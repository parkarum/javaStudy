package org.project.memberdto;

public class Ex1 {
public static void main(String[] args) {
	System.out.println("������ �迭 ����");
	int[][] score = {
			{100,66,77},
			{88,66,88},
			{80,46,97},
			{70,88,80},
			{100,90,88}
			
	};
	int kor = 0;
	int math = 0;
	int eng = 0;
	int sum =0;
	double avg = 0.0;
	int scoreLength = score.length;//�迭�� ����
	
	System.out.println("�߰���� ����ǥ");
	System.out.println("��ȣ ���� ���� ���� ���� ���");
	System.out.println("====================");
	
	for (int i = 0;i<scoreLength; i++) {
		System.out.print(" "+(i+0)+" ");
		kor +=score[i][0];//score�迭�� 0���� �հ� (����)
		math +=score[i][1];//score�迭�� 1���� �հ�(����)
		eng +=score[i][2];//score�迭�� 2���� �հ�(����)
	
	for (int j =0; j<score[i].length; j++) {
		System.out.print(score[i][j] + " ");
		sum += score[i][j];//����
	}
		avg = (double)sum/scoreLength;
		System.out.println(sum + " "+ avg);
	}
	
	System.out.println("======================");
	System.out.println("����"+kor + " " + math + " "+ eng);
}
}
