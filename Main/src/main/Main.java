package main;
import java.util.*;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
        Scanner cin = new Scanner(System.in);
        FactoryMember mf = new FactoryMember();
        System.out.println("Plz , enter your numType");
        int numType = cin.nextInt();
        AbstractFactory af = FactoryMember.getFactory(numType);
        System.out.println("Plz , enter your type");
        String type = cin.next();
        Staff st = af.getStaff(type);
        st.GetSalary();
        st.GetYearsOfWork();
    }

    public interface Staff {
        void GetSalary();

        void GetYearsOfWork();
    }

    public static class TeachingAssistant implements Staff {

        @Override
        public void GetSalary() {
            System.out.println("Salary is 6000 pounds");
        }

        @Override
        public void GetYearsOfWork() {
            System.out.println("3 years of work");
        }
    }

    public static class Doctor implements Staff {

        @Override
        public void GetSalary() {
            System.out.println("Salary is 15000 pounds");
        }

        @Override
        public void GetYearsOfWork() {
            System.out.println("9 years of work");
        }
    }


    public static abstract class AbstractFactory {
        abstract Staff getStaff(String StaffName);
    }

    public static class CS extends AbstractFactory {

        @Override
        Staff getStaff(String StaffName) {
            String name = StaffName.toLowerCase();
            switch (name) {
                case "technicalassistant":
                    return new Main.TeachingAssistant();
                case "doctor":
                    return new Main.Doctor();
                default:
                    return null;
            }
        }
    }

    public static class IS extends AbstractFactory {

        @Override
        Staff getStaff(String StaffName) {
            String name = StaffName.toLowerCase();
            switch (name) {
                case "technicalassistant":
                    return new Main.TeachingAssistant();
                case "doctor":
                    return new Main.Doctor();
                default:
                    return null;
            }
        }
    }

    public static class IT extends AbstractFactory {

        @Override
        Staff getStaff(String StaffName) {
            String name = StaffName.toLowerCase();
            switch (name) {
                case "technicalassistant":
                    return new Main.TeachingAssistant();
                case "doctor":
                    return new Main.Doctor();
                default:
                    return null;
            }
        }
    }

    public static class FactoryMember {
        public static AbstractFactory getFactory(int curType) {
            if (curType == 1)
                return new CS();
            else if (curType == 2)
                return new IS();
            else if (curType == 3)
                return new IT();
            else
                return null;
        }
    }
}