package com.example.demo11;

// ���O�n��@�����ϥΪ�����r�O implements
public class MyInterfaceImpl implements Myinterface {

	// ���O�����n���s�w�q "�Ҧ�" �w�q�b����������k

	// �w�]��k���j��@�w�n���s�w�q
	@Override
	public void fly() {

	}

	@Override
	public void flying() {

	}

	@Override
	public void flying(String name) {

		Myinterface.super.flying(name);
	}

}
