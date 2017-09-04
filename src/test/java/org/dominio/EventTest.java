package org.dominio;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIn.isIn;
import static org.hamcrest.core.IsEqual.equalTo;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Class org.dominio.EventTest
 */
public class EventTest {
    @Test
    public void showEventName() throws Exception {

        Event event = new Event("Meetup Spring", LocalDate.of(2017,9,1));
        Manager manager = new Manager("Maria Fernanda", "mfernanda@tw.com", "11912345678");

        event.setManager(manager);

        String expected = "Event{name='Meetup Spring', manager='Manager{name='Maria Fernanda', email='mfernanda@tw.com', mobilePhone='11912345678'}', date=2017-09-01}";
        assertThat(event.toString(), equalTo(expected));
    }

    @Test
    public void showManagerContactInfo() throws Exception {
        Event event = new Event("Meetup Spring", LocalDate.of(2017,9,1));
        Manager manager = new Manager("Maria Fernanda", "mfernanda@tw.com", "11912345678");
        event.setManager(manager);

        String expected = "Manager{name='Maria Fernanda', email='mfernanda@tw.com', mobilePhone='11912345678'}";        assertThat(event.getManager().toString(), equalTo(expected));
    }

    @Test
    public void addOneExpenseToEvent() {
        Event event = new Event("Meetup Spring", LocalDate.of(2017,9,1));

        Expense exp1 = new Expense("Mercado Dia", 46.25);
        Expense exp2 = new Expense("Mercado Dia", 46.25);
        event.addExpense(exp1);

        String expected = "Expense{provider='Mercado Dia', value=46.25}";
        assertThat(event.getExpenses().get(0).toString(), equalTo(expected));
        assertThat(event.getExpenses().get(0), equalTo(exp2));
    }

    @Test
    public void addTwoExpensesToEvent() {
        Event event = new Event("Meetup Spring", LocalDate.of(2017,9,1));

        Expense exp1 = new Expense("Mercado Dia", 46.25);
        Expense exp2 = new Expense("Mercado Claro", 15.40);
        event.addExpense(exp1);
        event.addExpense(exp2);

        assertThat(event.getExpenses().size(), equalTo(2));
        assertThat(exp1, isIn(event.getExpenses()));
        assertThat(exp2, isIn(event.getExpenses()));
    }

    @Test
    public void verifyIfEqualsIsCorect() throws Exception {
        Event event1 = new Event("Event name", LocalDate.of(2017, 9, 15));
        Event event2 = new Event("Event name", LocalDate.of(2017, 9, 15));

        assertThat(event1, equalTo(event2));
    }
}