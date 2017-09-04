/*
 * Copyright 2017 Rede S.A.
 *************************************************************
 * Nome     : Event.java
 * Descrição: Event.java.
 * Autor    : Geisly Conca <gconca@thoughtworks.com>
 * Data     : 01/09/2017
 * Empresa  : Thoughtworks
 */
package org.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Class Event.
 */
public class Event {

    private String name;
    private Manager manager;
    private LocalDate date;
    private List<Expense> expenses;

    public Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
        expenses = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name) &&
            Objects.equals(manager, event.manager) &&
            Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manager, date);
    }

    @Override
    public String toString() {
        return "Event{" +
            "name='" + name + '\'' +
            ", manager='" + manager + '\'' +
            ", date=" + date +
            '}';
    }

    public void addExpense(Expense bill) {
        expenses.add(bill);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



}
