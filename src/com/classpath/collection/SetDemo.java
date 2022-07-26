package com.classpath.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        /*
         * Set<String> names = Set.of("hari", "vinay", "siva", "Joseph", "Vikrant",
         * "Anupama", "Vikas"); Set<Integer> values= new TreeSet<>(); values.add(12);
         * values.add(17); values.add(13); values.add(14); values.add(14);
         * values.add(13); values.add(16); values.add(16);
         *
         * values.add(15);
         *
         *
         * System.out.println("size of values :: "+ values.size());
         * //System.out.println(names.size()); System.out.println(values);
         */
        /*
         * Comparator<User> idAscComparator = new Comparator<User>() {
         *
         * @Override public int compare(User user1, User user2) { return (int)
         * (user1.getId() - user2.getId()); }
         *
         * };
         */

        Comparator<User> idAscComparator = (user1, user2) -> (int) (user1.getId() - user2.getId());
        Comparator<User> idDescComparator = (user1, user2) -> (int) (user2.getId() - user1.getId());

        Comparator<User> nameAscComparator = (user1, user2) -> user1.getName().compareTo(user2.getName());

        Comparator<User> nameDescComparator = (user1, user2) -> user2.getName().compareTo(user1.getName());

        Set<User> users = new TreeSet<>(idAscComparator);
        users.add(new User(12, "Vinay", 34000));
        users.add(new User(13, "Harish", 35000));
        users.add(new User(14, "Vikram", 20000));
        System.out.println(users);
    }
}

class SortUserByIdComparatorAsc implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return (int) (user1.getId() - user2.getId());
    }
}

class SortUserByIdComparatorDesc implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return (int) (user2.getId() - user1.getId());
    }
}

class SortUserByNameComparatorAsc implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getName().compareTo(user2.getName());
    }
}

class SortUserByNameComparatorDesc implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user2.getName().compareTo(user1.getName());
    }
}

class User implements Comparable<User> {

    private long id;
    private String name;
    private double salary;

    public User(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(User user) {
        return Long.compare(this.id, user.id);
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        return id == other.id && Objects.equals(name, other.name)
                && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
    }

}
