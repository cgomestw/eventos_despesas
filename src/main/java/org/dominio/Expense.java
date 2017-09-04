/*
 * Copyright 2017 Rede S.A.
 *************************************************************
 * Nome     : Expense.java
 * Descrição: Expense.java.
 * Autor    : Geisly Conca <gconca@thoughtworks.com>
 * Data     : 04/09/2017
 * Empresa  : Thoughtworks
 */
package org.dominio;

import java.util.Objects;

/**
 * Class Expense.
 */
public class Expense {

    private String provider;
    private double value;

    public Expense() {}

    public Expense(String provider, double value) {
        this.provider = provider;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Expense{" +
            "provider='" + provider + '\'' +
            ", value=" + value +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Double.compare(expense.value, value) == 0 &&
            Objects.equals(provider, expense.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, value);
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
