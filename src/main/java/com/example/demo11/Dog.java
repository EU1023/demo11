package com.example.demo11;

public class Dog {
	//�ŧi�ݩ�(�S��)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//�w�q��k(�欰)
	public void run() {
		System.out.println("���b�]!");
	}
	
	//��k���h��(overload)
	//��k�W�٤@�ˡA���O��k�����ѼƭӼƤ��@�ˡA�I�srun��k�ɥi�H��O�O�I�s�L�Ѽƪ��٬O���Ѽƪ���k
	//1
	public void run(String name) {
		System.out.println("���b�]!");
	}
	//2
	//��k�W�٤@�ˡA��k�����ѼƭӼƤ@�ˡA���O�ۦP��m���ѼƸ�ƫ��A���@��
	public void run(int age,String category) {
		System.out.println("���b�]!");
	}
	//3
	public void run(String category,int age) {
		System.out.println("���b�]!");
	}
	
	public void runing() {
		System.out.println(name+"���b�]!");
	}
	
	public void eat(String name) {
		//�L�X�F�Q���`��ܷR�Y�ܦ��D�`��
		//�ܼƦW���ݩʦW�@�˪��ܷ|�u���H{}�����ܼƦW�A�ҥH�ݭn�ϥ�this�A�άO�����ק��ܼƦW�����ݩʦW����
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);	
	}
}
