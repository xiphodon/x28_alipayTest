package com.example.x28_alipaytest;

import com.example.x28_alipaytest.PayInterface.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

public class PayService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return new PayBinder();
	}
	
	//�м��˶���
	class PayBinder extends Stub{

		@Override
		public void pay() throws RemoteException {
			// TODO Auto-generated method stub
			//���÷���� pay() ����
			PayService.this.pay();
		}
		
	}
	
	public void pay(){
		System.out.println("������л���...");
		System.out.println("�����û�������...");
		System.out.println("��������...");
		System.out.println("�ϴ�����...");
		System.out.println("֧�����~");
	}

}
