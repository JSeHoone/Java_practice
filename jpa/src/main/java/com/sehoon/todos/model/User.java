package com.sehoon.todos.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    // 유저 이름
    @Column(name = "user_name")
    private String name;

    // 유저 아이디
    @Column(name = "user_email")
    private String email;

    // 유저 패스워드
    @Column(name = "user_password")
    private String password;

    // 관계 설정
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JoinColumn(name = "todo_id")
    private List<Todo> todos = new ArrayList<>();

    // 생성자
    protected User() {
    }



    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter
    public long getId() {
        return id;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    // 메서드
    public void addTodo(Todo todo) {
        todos.add(todo);
        todo.setUser(this);
    }

}
