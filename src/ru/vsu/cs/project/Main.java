package ru.vsu.cs.project;

import ru.vsu.cs.project.classes.Faculty;
import ru.vsu.cs.project.classes.Institute;
import ru.vsu.cs.project.classes.ResearchAssociate;

public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("Факультет информационных технологий и систем");
        Institute tii = new Institute("Технологии и защита информации", "297");
        Institute is = new Institute("Информационные технологии и прикладная математика", "387");
        Institute cr = new Institute("Центр технологий и цифровых решений", "311п");
        Institute isk = new Institute("Информационные системы и кибербезопасность", "312п");
        Institute piit = new Institute("Промышленная и информационная технология", "380");
        fkn.setInstitutes(new Institute[]{tii, is, cr, isk, piit});

        ResearchAssociate emp1 = new ResearchAssociate(1234, "Сергей Иванов",
                "информационная безопасность");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Анна Смирнова",
                "моделирование и системный анализ");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Петр Кузнецов",
                "искусственный интеллект");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Елена Трофимова",
                "распознавание образов и компьютерное зрение");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Валентин Карманов",
                "технологии обработки данных и Big Data");

        tii.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4, emp5});

        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");

        ResearchAssociate[] toizi_employees = tii.getEmployees();
        System.out.println("Сотрудники кафедры " + tii.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }
    }
}
