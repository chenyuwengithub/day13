package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.MajorMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Major;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.User;

@Service
@Transactional
public class StudentService {

	
	@Autowired
	MajorMapper majorMapper;
	@Autowired
	StudentMapper studentMapper;
	
	public List<Major> findMajor() {
		return majorMapper.selectAll();
	}
	public PageInfo<Student> findStudentPage(Student student, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Student> userList = studentMapper.findAll(student);
		PageInfo<Student> pageInfo = new PageInfo<Student>(userList);
		return pageInfo;
	}
	public Student existStudentWithSname(String sname) {
		List<Student> studentList = studentMapper.findStudentBySname(sname);
		return studentList.isEmpty()?null:studentList.get(0);
	}
	public void addStudent(Student student) {
		studentMapper.insert(student);
	}
	public void deleteStudent(int id) {
		studentMapper.deleteByPrimaryKey(id);
	}
	public void updateStudent(Student student) {
		studentMapper.updateByPrimaryKey(student);
	}
	public List<Student> findAll() {
		List<Student> userList = studentMapper.findAll(null);
		return userList;
	}
	public Integer findID(String maname) {
		return majorMapper.findID(maname);
	}
	
}
