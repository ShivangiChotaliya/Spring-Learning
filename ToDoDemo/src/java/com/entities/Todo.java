/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entities;

/**
 *
 * @author Shivangi
 */
public class Todo {
    private String todoTitle;
    private String todoContent;
    private String todoDate;

    public Todo(){
    super();
    };
    public Todo(String todoTitle, String todoContent, String todoDate) {
        super();
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    @Override
    public String toString() {
        return this.getTodoTitle() + ":" +this.todoContent ;
    }
    
    
    
}
