package com.sehoon.todos;

import com.sehoon.todos.model.Todo;
import com.sehoon.todos.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-config");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 유저 생성(로그인)
            User user = new User("name", "aaa@naver.com", "!234");

            // 내 투두 생성
            Todo todo1 = new Todo("오늘의 할일1");
            Todo todo2 = new Todo("오늘의 할일2");
            Todo todo3 = new Todo("오늘의 할일3");
            user.addTodo(todo1);
            user.addTodo(todo2);
            user.addTodo(todo3);

            em.persist(user);

            // user의 투두 찾기
            User userA = em.find(User.class, user.getId());
            List<Todo> todos = userA.getTodos();

            for (Todo todo : todos) {
                System.out.println(todo);
            }


        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
