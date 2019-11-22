/*
package com.onlineShop;

import com.onlineShop.dao.ClassesDao;
import com.onlineShop.dao.InstitutionDao;
import com.onlineShop.dao.StudentDao;
import com.onlineShop.dao.UserDao;
import com.onlineShop.entity.Classes;
import com.onlineShop.entity.Institution;
import com.onlineShop.entity.Student;
import com.onlineShop.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class UserTest {

    private static ApplicationContext applicationContext;

    static{
        try {
            applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testApplicationContext(){
        System.out.println("11111111111111111"+applicationContext);
    }
   */
/* @Test
    public void testRedisConnection(){
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.getLists();
        for (User user:list){
            System.out.println(user);
        }
        System.out.println(list.size());
    }*//*


*/
/*    @Test
    public void testStudentClass(){

        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        ClassesMapper classesMapper = session.getMapper(ClassesMapper.class);
        List<Classes> list = classesMapper.selectAllClassesByStudent(1);
        System.out.println(list);
    }*//*


    @Test
    public void testaddstudent(){

        Student student = new Student();
//        student.setName("1111");
//        student.setCardnumber("78945456456");
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        StudentDao dao = session.getMapper(StudentDao.class);
        dao.insert(student);
    }

    @Test
    public void testFindAllClass(){
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        ClassesDao dao = session.getMapper(ClassesDao.class);
        List<Classes> list=dao.findAllClassesByStudent(1);
        System.out.println(list);

    }

    @Test
    public void testRedisConnection(){
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.getLists();
        for (User user:list){
            System.out.println(user);
        }
        System.out.println(list.size());
    }
    @Test
    public void testfindallinstitution() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        InstitutionDao institutionDao = session.getMapper(InstitutionDao.class);
//        List<Institution> list = institutionDao.findAll();
//        for(Institution institution : list){
//            System.out.println(institution);
    //}
       Institution institution = new Institution();
//        institution.setName("suzhoudaxue");
//        institutionDao.addInstitution(institution);
//        institution.setId(2);
//        institution.setName("chenlinbo");
//        institutionDao.updateInstitution(institution);
//        Institution chenlinbo = institutionDao.findByName("chenlinbo");
//        System.out.println(chenlinbo);
//       institutionDao.deleteById(3);
    }
    @Test
    public void testFindByNameAndPassword(){
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
       UserDao userDao= session.getMapper(UserDao.class);
        User hello = userDao.selectByNameAndPassword("hello", "123456");
        System.out.println(hello);

    }

    */
/*    @Test
    public void testStudentClass(){

        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        ClassesMapper classesMapper = session.getMapper(ClassesMapper.class);
        List<Classes> list = classesMapper.selectAllClassesByStudent(1);
        System.out.println(list);
    }*//*







    @Test
    public void testUserlist() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userMapper = session.getMapper(UserDao.class);
        List<User> userList = userMapper.getLists();
        for(User user:userList){
            System.out.println(user);
        }

    }

    @Test
    public void testadduser(){
        User user=new User();
        user.setId(3);
        user.setName("heello");
        user.setUsername("nihao");
        user.setPassword("987456");
        user.setPhone("1836555");
        user.setEmail("11@qq.com");
        user.setCardnumber(159875);
        user.setSex("boy");
        user.setStartTime(new Date(2019-11-1));
        user.setEndTime(new Date(2019-11-11));
        user.setCreateTime(new Date(2019-11-1));
        user.setUsertype("2");
        user.setEducation("college");
        user.setIsdelete(1);
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.addUser(user);
    }

    @Test
    public void testupdate(){
        User user=new User();
        user.setId(2);
        user.setName("heha");
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.updateUserById(user);
    }

    @Test
    public void testUserdelete() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.deleteUserById(2);
    }

    @Test
    public void testFindBy() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        User user=userDao.findUserByName("hello");
        System.out.println(user);

    }

    @Test
    public void testlogin() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = studentDao.findUserByNameAndPassword("huyang","123456");
        System.out.println(student);

    }

    @Test
    public void testFindByInput() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.findUserByInput("he");
        System.out.println(list);

    }
*/
/*
    @Test
    public void testlistAdmin() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        UserDao userDao = session.getMapper(UserDao.class);
        List<Object> list = userDao.listTeacher();
        for (Object object : list) {
            System.out.println(list);
        }
    }*//*


 */
/*   @Test
    public void testgetStudentBy() {
        SqlSession session = (SqlSession) applicationContext.getBean("sqlSession");
        StudentDao studentDao = session.getMapper(StudentDao.class);
        List<Student> list = studentDao.getStudentsByClass(1);
        for (Object object : list) {
            System.out.println(list);
        }
    }
*//*

}
*/
