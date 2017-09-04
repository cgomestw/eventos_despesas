/*
 * Copyright 2017 Rede S.A.
 *************************************************************
 * Nome     : ManagerTest.java
 * Descrição: ManagerTest.java.
 * Autor    : Geisly Conca <gconca@thoughtworks.com>
 * Data     : 01/09/2017
 * Empresa  : Thoughtworks
 */
package org.dominio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * Class ManagerTest.
 */
public class ManagerTest {

    @Test
    public void showManagerInformation() throws Exception {
        Manager manager = new Manager("Maria Fernanda", "mfernanda@tw.com", "11912345678");

        assertThat(manager.toString(), equalTo("Manager{name='Maria Fernanda', " +
            "email='mfernanda@tw.com', mobilePhone='11912345678'}"));
    }

    @Test
    public void verifyIfEqualsIsCorrect() throws Exception {
        Manager manager1 = new Manager("Maria Fernanda", "mfernanda@tw.com", "11912345678");
        Manager manager2 = new Manager("Maria Fernanda", "mfernanda@tw.com", "11912345678");

        assertThat(manager1, equalTo(manager2));
    }
}
