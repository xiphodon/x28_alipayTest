package com.example.x28_alipaytest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
//
//	
//	Զ�̷���  aidl  ʹ�÷���
//	1.��Զ�̷���ķ�����ȡ��һ�������Ľӿ�xxx.java�ļ�
//	2.�ѽӿ�xxx.java�ļ��ĺ�׺��Ϊxxx.aidl
//	3.��gen�ļ������Զ����ɵ�ͬ��xxx.java�ļ��У���һ����̬������Stub�����Ѿ��̳���Binder�࣬
//	      ��ʵ����xxx.java�ӿڣ����������µ��м���
//	4.��aidl�ļ����Ƶ������ߵ���Ŀ�У�ע�⣺aidl�ļ������ڰ���������Ҫ�ͱ����÷�����Ŀ��aidl�İ���һ��
//	5.�ڵ�������Ŀ�У�ǿת�м��˶���ʱ��ֱ��ʹ��Stub.asInterface(Service)����
//	
//	
//	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
