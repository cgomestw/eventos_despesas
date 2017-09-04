/*
 * Copyright 2017 Rede S.A.
 *************************************************************
 * Nome     : Manager.java
 * Descrição: Manager.java.
 * Autor    : Geisly Conca <gconca@thoughtworks.com>
 * Data     : 01/09/2017
 * Empresa  : Thoughtworks
 */
package org.dominio;

import java.util.Objects;

/**
 * Class Manager.
 */
public class Manager {
    private String name;
    private String email;
    private String mobilePhone;

    public Manager(String name, String email, String mobilePhone) {
        this.name = name;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(name, manager.name) &&
            Objects.equals(email, manager.email) &&
            Objects.equals(mobilePhone, manager.mobilePhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, mobilePhone);
    }

    @Override
    public String toString() {
        return "Manager{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", mobilePhone='" + mobilePhone + '\'' +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
