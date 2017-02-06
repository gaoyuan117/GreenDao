package com.jzbwlkj.greendao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.jzbwlkj.greendao.application.MyApplication;
import com.jzbwlkj.greendao.bean.Student;
import com.jzbwlkj.greendao.bean.StudentDao;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StudentDao studentDao;
    private Student student1, student2, student3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentDao = MyApplication.getDaoInstant().getStudentDao();
        student1 = new Student(null, "2013201331", "高原", "男");
        student2 = new Student(null, "2013201332", "哈高", "男");
        student3 = new Student(null, "2013201333", "嘿荷藕黑", "男");
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.bt_main_insert://增
                studentDao.insertOrReplace(student1);
                studentDao.insertOrReplace(student2);
                studentDao.insertOrReplace(student3);
                break;
            case R.id.bt_main_del://删
                studentDao.delete(student2);
                break;
            case R.id.bt_main_update://改
                student1.setName("123");
                studentDao.update(student1);
                break;
            case R.id.bt_main_query://查
                List<Student> list = studentDao.queryBuilder().where(StudentDao.Properties.Name.like("%" + "高" + "%")).list();
                Log.e("student", "数据 = " + list.size());
                for (int i = 0; i < list.size(); i++) {
                    Log.e("student", list.get(i).getName());
                }
                break;
        }
    }
}
