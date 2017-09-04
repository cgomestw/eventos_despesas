/*
 * Copyright 2017 Rede S.A.
 *************************************************************
 * Nome     : ExpenseTest.java
 * Descrição: ExpenseTest.java.
 * Autor    : Geisly Conca <gconca@thoughtworks.com>
 * Data     : 04/09/2017
 * Empresa  : Thoughtworks
 */
package org.dominio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * Class ExpenseTest.
 */
public class ExpenseTest {
    @Test
    public void showExpense() throws Exception {
        Expense expense = new Expense();
        expense.setProvider("Padaria XYZ");
        expense.setValue(50.00);
        assertThat(expense.toString(), equalTo("Expense{provider='Padaria XYZ', value=50.0}"));
    }

    @Test
    public void verifyIfEqualsIsCorrect() throws Exception {
        Expense expense1 = new Expense("Padaria XYZ", 50.00);
        Expense expense2 = new Expense("Padaria XYZ", 50.00);

        assertThat(expense1, equalTo(expense2));
    }
}
