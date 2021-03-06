package com.onlineShop.service;

import com.onlineShop.entity.Classes;
import com.onlineShop.entity.Plan;
import com.onlineShop.entity.Profession;

import java.util.List;

public interface ClassService {

    List<Classes> findAllClassesByStudent(int studentId);//根据学生号查询班级

    Classes findClassById(Integer id);

    List<Classes> selectAllClasses();//查询所有班级

    List<Classes> selectClassesByNumName(String numName);//根据班级编号查询班级

    List<Classes> selectClassesByName(String name);//根据班级名查询班级

    List<Classes> selectClassesByInstitution(String instName);//根据机构查询班级

    List<Classes> selectClassesByBranch(String branchName);//根据分支查询班级

    List<Classes> selectClassesByProfession(String proName);//根据专业查询班级

    void insertClass(Classes classes);//增加班级

    void deleteClass(int id);//删除班级

    void updateClass(Classes classes);//更新班级

    List<Profession> showProfessionList();

    List<Plan> showPlanList();
}
